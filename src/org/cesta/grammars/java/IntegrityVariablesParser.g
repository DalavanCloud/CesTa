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

            // TODO: static variables?
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
			type {$Variables::type=$type.text;}
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
			type {$Variables::type=$type.text;}
			variableDeclaratorList
		)		
	;

/**
 * Variable identifier in declaration
 */
variableDeclaratorId
    scope Variables;
    :
            ^(IDENT {
                        Variable var = new Variable($IDENT.text, $Variables[-1]::type);
                        $Variables[-2]::variableTypes.put($IDENT.text, var);
                        System.out.println("-2 stack " + $Variables[-2]::variableTypes);
                    }
                    arrayDeclaratorList?
            )
    ;
