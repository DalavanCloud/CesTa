/**
 * This tree rewrite parser provides protection against error induction.
 * Each variable with supported type (currently byte, boolean) is transformed
 * into bigger type containing integrity information, which is updated on each
 * modification and checked on each read access.
 **/
tree grammar IntegrityVariablesParser;

options {
    superClass = AbstractTreeParser;
    backtrack = true; 
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
}

import JavaTreeParser;

scope Variables {
    Map<String, Variable> variableTypes;
    String type;
}

@treeparser::header {
package org.cesta.parsers.java;

// import java.util.Map;
// import java.util.HashMap;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
}

@treeparser::members {	
    public class Variable {
        private String name;
        private String type;

        public Variable(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String toString() {
            return type + " " + name;
        }

        public String getType() {
            return type;
        }

        public boolean shouldBeTransformed() {
            // TODO: more considerations
            return (type != null) && isSupportedType();
        }

        public boolean isSupportedType() {
            return type.equals("boolean") || type.equals("byte");
        }
    }

    // TODO: remove
    public boolean isSupportedType(String type) {
            return type.equals("boolean") || type.equals("byte");
    }

    public Variable getVariable(String id) {
        for (int i = $Variables.size() - 1; i >= 0; i--) {
            if ($Variables[i]::variableTypes.containsKey(id)) {
                return $Variables[i]::variableTypes.get(id);
            }
        }
        return null;
    }

    public boolean replaceType(CommonTree tree, String type) {
        // TODO: check variables instead of a type only
        if (!isSupportedType(type)) {
            return false;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("resistantType_" + type);
        replaceTree(st.toString(), tree);
        return true;
    }

    public void setAssign(String left, String right, String sign, Variable var, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("unwrapAssign_" + var.getType());
        st.setAttribute("left", left);
        st.setAttribute("right", right);
        st.setAttribute("sign", sign);
        replaceTree(st.toString(), tree);
    }

    public void setResistantType(String expression, Variable var, CommonTree tree) {
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("set_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    public void getResistantType(String expression, Variable var, CommonTree tree) {
        if (var == null) { // the identifier is not a variable
            return;
        }
        if (!var.shouldBeTransformed()) {
            return;
        }
        StringTemplate st = getTemplateLib().getInstanceOf("get_" + var.getType());
        st.setAttribute("value", expression);
        replaceTree(st.toString(), tree);
    }

    public void replaceTree(String str, CommonTree tree) {
        tokens.replace(tree.getTokenStartIndex(), tree.getTokenStopIndex(), str);
    }
}

// Starting point for parsing a Java file. Adds additional imports.
javaSource
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration* additionalImports[(CommonTree)$typeDeclaration.start])
    ;

// Creates classDeclaration as a special node    
typeDeclaration
    :   classDeclaration // new node
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
    ;

// Adds additional code    
classTopLevelScope
    :   ^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations*) classAdditionalCode[(CommonTree)retval.start]
    ;

// Creates methodScopeDeclarations and globalVariableDeclaration as special nodes    
classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   methodScopeDeclarations // new node
    |   globalVariableDeclaration // new node
    |   typeDeclaration
    ;

// Creates globalVariableDeclaration as a special node    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
    |   globalVariableDeclaration // new node
    |   typeDeclaration
    ;


// STATEMENTS / BLOCKS

/**
 * Adds additional imports
 */
additionalImports[CommonTree tree]
    :
        {
            if (tree != null) {
                getLogger().finer("Adding additional imports");
                StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                tokens.insertBefore(tree.getTokenStartIndex(), st);
            }
        }
    ;

/**
 * Adds get & set methods
 */
classAdditionalCode[CommonTree tree]
    :
        {
            StringTemplate st;

            st = getTemplateLib().getInstanceOf("declareBooleanSetter");
            st.setAttribute("trueValue", "0x55");
            st.setAttribute("falseValue", "0xAA");
            tokens.insertAfter(tree.getTokenStartIndex(), st);

            st = getTemplateLib().getInstanceOf("declareBooleanGetter");
            st.setAttribute("trueValue", "0x55");
            st.setAttribute("falseValue", "0xAA");
            tokens.insertAfter(tree.getTokenStartIndex(), st);

            st = getTemplateLib().getInstanceOf("declareByteSetter");
            st.setAttribute("mask", "0x55");
            tokens.insertAfter(tree.getTokenStartIndex(), st);

            st = getTemplateLib().getInstanceOf("declareByteGetter");
            st.setAttribute("mask", "0x55");
            tokens.insertAfter(tree.getTokenStartIndex(), st);

            // TODO: protection of a type short
        }
    ;

/**
 * Whole class
 */
classDeclaration
	scope Variables;
	@init {	
                // initializes a scope for class attributes
                $Variables::variableTypes = new HashMap<String, Variable>();
	}
	:
		^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
	;

/**
 * Method declarations
 */
methodScopeDeclarations
        scope Variables;
	@init {
                // initializes a scope for local variables in a method
                $Variables::variableTypes = new HashMap<String, Variable>();
	}
	:
		^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
	|	^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
	|	^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
	;
/**
 * Block of code
 */
block
	scope Variables;
	@init {
		// initializes a scope for local variables in a block of code
                $Variables::variableTypes = new HashMap<String, Variable>();
	}
        :   ^(BLOCK_SCOPE blockStatement*)
        ;

/**
 * Global variables
 */
globalVariableDeclaration
        scope Variables;
	:
		^(VAR_DECLARATION 
			modifierList 
			type {
                                 $Variables::type=$type.text;
                                 // TODO: replace only if all variables should be replaced
                                 // TODO: split the declaration if some variables should be replaced and some not
                                 replaceType((CommonTree) $type.start, $type.text);
                             }
			variableDeclaratorList
		)
	;

/**
 *	Local variables
 */
localVariableDeclaration
        scope Variables;
	:
		^(VAR_DECLARATION 
			localModifierList 
			type {
                                  $Variables::type=$type.text;
                                  replaceType((CommonTree) $type.start, $type.text);
                             }
			variableDeclaratorList
		)		
	;

variableDeclarator
    scope {
        String id;
        String type;
    }
    :   ^(VAR_DECLARATOR i=variableDeclaratorId {$variableDeclarator::id=$i.id; $variableDeclarator::type=$i.type;} variableInitializer?)
    ;

/**
 * Variable identifier in declaration
 */
variableDeclaratorId returns [String id, String type]
    scope Variables;
    :
            ^(IDENT {
                        Variable var = new Variable($IDENT.text, $Variables[-1]::type);
                        $Variables[-2]::variableTypes.put($IDENT.text, var);
                        $id=$IDENT.text;
                        $type=$Variables[-1]::type;
                    }
                    arrayDeclaratorList?
            )
    ;

variableInitializer
    :   arrayInitializer
    |   e=expression {
                           //System.out.println("id " + $variableDeclarator::id);
                           Variable var = new Variable($variableDeclarator::id, $variableDeclarator::type);
                           setResistantType($e.text, var, (CommonTree) $e.start);
                       }
    ;

/**
 * Expression where we need to add a setter
 */
assignExpression
    :
	^(ASSIGN variable=leftExpr value=expr)
			{ setResistantType($value.text, getVariable($variable.text), (CommonTree) $value.start); }
    |   ^(a=PLUS_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "+", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=MINUS_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "-", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=STAR_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "*", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=DIV_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "/", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=AND_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "&", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=OR_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "|", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=XOR_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "^", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=MOD_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "\%", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=BIT_SHIFT_RIGHT_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "<<<", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=SHIFT_RIGHT_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, ">>", getVariable($variable.text), (CommonTree) $a); }
    |   ^(a=SHIFT_LEFT_ASSIGN variable=leftExpr value=expr)
			{ setAssign($variable.text, $value.text, "<<", getVariable($variable.text), (CommonTree) $a); }
    |   ^(PRE_INC variable=leftExpr)
                        {  }
    |   ^(PRE_DEC variable=leftExpr)
                        {  }
    |   ^(POST_INC variable=leftExpr)
                        {  }
    |   ^(POST_DEC variable=leftExpr)
                        {  }
    ;

expr
    :   assignExpression // new node instead of more assign expressions
    |	^(QUESTION expr expr expr)
    |   ^(LOGICAL_OR expr expr)
    |   ^(LOGICAL_AND expr expr)
    |   ^(OR expr expr)
    |   ^(XOR expr expr)
    |   ^(AND expr expr)
    |   ^(EQUAL expr expr)
    |   ^(NOT_EQUAL expr expr)
    |   ^(INSTANCEOF expr type)
    |   ^(LESS_OR_EQUAL expr expr)
    |   ^(GREATER_OR_EQUAL expr expr)
    |   ^(BIT_SHIFT_RIGHT expr expr)
    |   ^(SHIFT_RIGHT expr expr)
    |   ^(GREATER_THAN expr expr)
    |   ^(SHIFT_LEFT expr expr)
    |   ^(LESS_THAN expr expr)
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    |   ^(STAR expr expr)
    |   ^(DIV expr expr)
    |   ^(MOD expr expr)
    |   ^(UNARY_PLUS expr)
    |   ^(UNARY_MINUS expr)
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   primaryExpression
    ;

primaryExpression
    :   ^(  DOT
            (   primaryExpression
                (   IDENT
                |   THIS
                |   SUPER
                |   innerNewExpression
                |   CLASS
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression
    |   id=IDENT {
                     getResistantType($id.text, getVariable($id.text), (CommonTree) id);
                 }
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? arguments)
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS
    |   arrayTypeDeclarator
    |   SUPER
    ;

/*
 * Expressions on the left side not to be transformed
 */
leftExpr
    : id=IDENT {
                  //System.out.println("leftExpr " + $id.text);
               }
    | ^(LEFT_EXPR expr)
    ;
