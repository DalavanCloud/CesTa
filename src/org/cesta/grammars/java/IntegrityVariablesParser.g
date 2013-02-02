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

@treeparser::header {
package org.cesta.parsers.java;

import org.cesta.util.antlr.java.ANTLRJavaHelper;
}

@treeparser::members {	
    
}

// Starting point for parsing a Java file.
javaSource
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration* additionalImports[(CommonTree)$typeDeclaration.start])
    ;
    
typeDeclaration
    :   classDeclaration
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
    ;
    
classTopLevelScope
    :   ^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations*) classAdditionalCode[(CommonTree)retval.start]
    ;
    
classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   methodScopeDeclarations
    |   globalVariableDeclaration
    |   typeDeclaration
    ;
    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
    |   globalVariableDeclaration
    |   typeDeclaration
    ;

// STATEMENTS / BLOCKS



/**
 * Adds additional imports
 */
additionalImports[CommonTree tree]
    :
        {
            if (tree!=null){
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

            // TODO: static variables
            // TODO: protection of a type short
        }
    ;

/**
 *	Whole class
 */
classDeclaration
	scope {
		Map<String, String> globalVariablesTypes;
                Map<String, String> localVariablesTypes;
	}
	@init {	
		$classDeclaration::globalVariablesTypes = new HashMap<String, String>();
                $classDeclaration::localVariablesTypes = new HashMap<String, String>();
	}
	:
		^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
	;

methodScopeDeclarations
        scope {
		Map<String, String> localVariablesTypes;
	}
	@init {
                $methodScopeDeclarations::localVariablesTypes = new HashMap<String, String>();
	}
	:
		^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
	|	^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
	|	^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
	;

/**
 *	Global variables
 */
globalVariableDeclaration
	:
		^(VAR_DECLARATION 
			modifierList 
			type
			variableDeclaratorList
		)
	;
