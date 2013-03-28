/**
 * This tree rewrite parser provides protection against error induction.
 * Each variable with supported type (currently byte, boolean) is transformed
 * into bigger type containing integrity information, which is updated on each
 * modification and checked on each read access.
 **/
tree grammar IntegrityVariablesParser;

options {
    superClass = IntegrityVariablesMembers;
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
package org.cesta.parsers.java.generated;

// import java.util.Map;
// import java.util.HashMap;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
import org.cesta.parsers.java.IntegrityVariablesMembers;
}

@treeparser::members {	
    public Variable getVariable(String id) {
        if (id.contains(".")) {
            // TODO: make difference between global and local variable
            String[] parts = id.split("\\.");
            id = parts[parts.length - 1];
        }
        for (int i = $Variables.size() - 1; i >= 0; i--) {
            if ($Variables[i]::variableTypes == null) {
                System.out.println("variable '" + id + "': types " + i + " null");
                continue;
            }
            if ($Variables[i]::variableTypes.containsKey(id)) {
                return $Variables[i]::variableTypes.get(id);
            }
        }
        return null;
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

// Adds additional imports
additionalImports[CommonTree tree]
    :
        {
            addImports(tree);
        }
    ;

// Adds get & set methods
classAdditionalCode[CommonTree tree]
    :
        {
            addCode(tree);
        }
    ;

// Whole class
classDeclaration
	scope Variables;
	@init {	
                // initializes a scope for class attributes
                $Variables::variableTypes = new HashMap<String, Variable>();
	}
	:
		^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
	;

// Method declarations
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
// Block of code
block
	scope Variables;
	@init {
		// initializes a scope for local variables in a block of code
                $Variables::variableTypes = new HashMap<String, Variable>();
	}
        :   ^(BLOCK_SCOPE blockStatement*)
        ;

// Global variables
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

// Local variables
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

// Sends the variable identifier and type to the initializer
variableDeclarator
    scope {
        String id;
        String type;
    }
    :   ^(VAR_DECLARATOR i=variableDeclaratorId {$variableDeclarator::id=$i.id; $variableDeclarator::type=$i.type;} variableInitializer?)
    ;

// Variable identifier in declaration
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

// Initial value of the declared variable
variableInitializer
    :   arrayInitializer
    |   e=expression {
                         Variable var = new Variable($variableDeclarator::id, $variableDeclarator::type);
                         setResistantType($e.text, var, (CommonTree) $e.start);
                     }
    ;

// Expression where we need to add a setter
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
                        { setPreIncDec(getVariable($variable.text), "+", (CommonTree) $PRE_INC); }
    |   ^(PRE_DEC variable=leftExpr)
                        { setPreIncDec(getVariable($variable.text), "-", (CommonTree) $PRE_DEC); }
    |   ^(POST_INC variable=leftExpr)
                        { setPostIncDec(getVariable($variable.text), "+", (CommonTree) $POST_INC); }
    |   ^(POST_DEC variable=leftExpr)
                        { setPostIncDec(getVariable($variable.text), "-", (CommonTree) $POST_DEC); }
    ;

// Adds resistant getters
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
    |   e=primaryExpression {
                                if ($e.ident != null) {
                                    getResistantType($e.ident, getVariable($e.ident), (CommonTree) $e.start);
                                }
                            }
    ;

// Finds the variable identifier
primaryExpression returns [String ident]
    :   ^(  DOT
            (   p=primaryExpression {
                                        $ident = (($p.ident == null) ? "" : ($p.ident + "."));
                                    }
                (   IDENT { $ident += $IDENT.text; }
                |   THIS { $ident += "this"; }
                |   SUPER { $ident += "super"; }
                |   innerNewExpression
                |   CLASS
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression
    |   IDENT {
                  $ident = $IDENT.text;
              }
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? arguments)
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS { $ident = "this"; }
    |   arrayTypeDeclarator
    |   THIS { $ident = "super"; }
    ;

// Expressions on the left side not to be transformed
leftExpr
    :   ^(ASSIGN expr expr)
    |   ^(PLUS_ASSIGN expr expr)
    |   ^(MINUS_ASSIGN expr expr)
    |   ^(STAR_ASSIGN expr expr)
    |   ^(DIV_ASSIGN expr expr)
    |   ^(AND_ASSIGN expr expr)
    |   ^(OR_ASSIGN expr expr)
    |   ^(XOR_ASSIGN expr expr)
    |   ^(MOD_ASSIGN expr expr)
    |   ^(BIT_SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_LEFT_ASSIGN expr expr)
    |   ^(QUESTION expr expr expr)
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
    |   ^(PRE_INC expr)
    |   ^(PRE_DEC expr)
    |   ^(POST_INC expr)
    |   ^(POST_DEC expr)
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   primaryExpression
    ;
