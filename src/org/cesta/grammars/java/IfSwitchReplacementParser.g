/**
 *  This tree parser replaces possibly vulnerable if constructions
 *  to semantically equivalent switch constructions.
 */
tree grammar IfSwitchReplacementParser;

options {
    superClass = AbstractTreeParser;
    backtrack = true;
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
    output = template;  // result is template
    rewrite = true;     // rewrites are performed (TokenRewriteStream is used)
}

@treeparser::header {
package org.cesta.parsers.java;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
}

@treeparser::members {
    class StatementReturn {
        public Boolean isVoid = false;
        public Boolean always = false;
    }
}

// Starting point for parsing a Java file.
javaSource
    :
	^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration* additionalImports[(CommonTree)$typeDeclaration.start])
    ;

packageDeclaration
    :   ^(PACKAGE qualifiedIdentifier)  
    ;
    
importDeclaration
    :   ^(IMPORT STATIC? qualifiedIdentifier DOTSTAR?) 
    ;
    
typeDeclaration
    :   classDeclaration
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
    ;

classDeclaration
    scope { String ident; }
    :
        ^(CLASS modifierList IDENT {$classDeclaration::ident = $IDENT.text;} genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
    ;

extendsClause // actually 'type' for classes and 'type+' for interfaces, but this has 
              // been resolved by the parser grammar.
    :   ^(EXTENDS_CLAUSE type+)
    ;   
    
implementsClause
    :   ^(IMPLEMENTS_CLAUSE type+)
    ;
        
genericTypeParameterList
    :   ^(GENERIC_TYPE_PARAM_LIST genericTypeParameter+)
    ;

genericTypeParameter
    :   ^(IDENT bound?)
    ;
        
bound
    :   ^(EXTENDS_BOUND_LIST type+)
    ;

enumTopLevelScope
    :   ^(ENUM_TOP_LEVEL_SCOPE enumConstant+ classTopLevelScope?)
    ;
    
enumConstant
    :   ^(IDENT annotationList arguments? classTopLevelScope?)
    ;
    
    
classTopLevelScope
    :
	^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations*) classAdditionalCode[(CommonTree)retval.start]
    ;

classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   constructorDeclaration
    |   methodDeclarations
    |   typeDeclaration
    ;

constructorDeclaration
    scope { Boolean dummy; }
    :
        ^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
    ;

methodDeclarations
    scope {
        String ident;
        String type;
    }
    :
        ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? t=type {$methodDeclarations::type=$t.text;} IDENT {$methodDeclarations::ident=$IDENT.text;} formalParameterList arrayDeclaratorList? throwsClause? block?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? {$methodDeclarations::type="void";} IDENT {$methodDeclarations::ident=$IDENT.text;} formalParameterList throwsClause? block?)
    ;
    
interfaceTopLevelScope
    :   ^(INTERFACE_TOP_LEVEL_SCOPE interfaceScopeDeclarations*)
    ;
    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;

variableDeclaratorList
    :   ^(VAR_DECLARATOR_LIST variableDeclarator+)
    ;

variableDeclarator
    :   ^(VAR_DECLARATOR variableDeclaratorId variableInitializer?)
    ;
    
variableDeclaratorId
    :   ^(IDENT arrayDeclaratorList?)
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayDeclarator
    :   LBRACK RBRACK
    ;

arrayDeclaratorList
    :   ^(ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR*)  
    ;
    
arrayInitializer
    :   ^(ARRAY_INITIALIZER variableInitializer*)
    ;

throwsClause
    :   ^(THROWS_CLAUSE qualifiedIdentifier+)
    ;

modifierList
    :   ^(MODIFIER_LIST modifier*)
    ;

modifier
    :   PUBLIC
    |   PROTECTED
    |   PRIVATE
    |   STATIC
    |   ABSTRACT
    |   NATIVE
    |   SYNCHRONIZED
    |   TRANSIENT
    |   VOLATILE
    |   STRICTFP
    |   localModifier
    ;

localModifierList
    :   ^(LOCAL_MODIFIER_LIST localModifier*)
    ;

localModifier
    :   FINAL
    |   annotation
    ;

type
    :   ^(TYPE (primitiveType | qualifiedTypeIdent) arrayDeclaratorList?)
    ;

qualifiedTypeIdent
    :   ^(QUALIFIED_TYPE_IDENT typeIdent+) 
    ;

typeIdent
    :   ^(IDENT genericTypeArgumentList?)
    ;

primitiveType
    :   BOOLEAN
    |   CHAR
    |   BYTE
    |   SHORT
    |   INT
    |   LONG
    |   FLOAT
    |   DOUBLE
    ;

genericTypeArgumentList
    :   ^(GENERIC_TYPE_ARG_LIST genericTypeArgument+)
    ;
    
genericTypeArgument
    :   type
    |   ^(QUESTION genericWildcardBoundType?)
    ;

genericWildcardBoundType                                                                                                                      
    :   ^(EXTENDS type)
    |   ^(SUPER type)
    ;

formalParameterList
    :   ^(FORMAL_PARAM_LIST formalParameterStandardDecl* formalParameterVarargDecl?) 
    ;
    
formalParameterStandardDecl
    :   ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId)
    ;
    
formalParameterVarargDecl
    :   ^(FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId)
    ;
    
qualifiedIdentifier
    :   IDENT
    |   ^(DOT qualifiedIdentifier IDENT)
    ;
    
// ANNOTATIONS

annotationList
    :   ^(ANNOTATION_LIST annotation*)
    ;

annotation
    :   ^(AT qualifiedIdentifier annotationInit?)
    ;
    
annotationInit
    :   ^(ANNOTATION_INIT_BLOCK annotationInitializers)
    ;

annotationInitializers
    :   ^(ANNOTATION_INIT_KEY_LIST annotationInitializer+)
    |   ^(ANNOTATION_INIT_DEFAULT_KEY annotationElementValue)
    ;
    
annotationInitializer
    :   ^(IDENT annotationElementValue)
    ;
    
annotationElementValue
    :   ^(ANNOTATION_INIT_ARRAY_ELEMENT annotationElementValue*)
    |   annotation
    |   expression
    ;
    
annotationTopLevelScope
    :   ^(ANNOTATION_TOP_LEVEL_SCOPE annotationScopeDeclarations*)
    ;
    
annotationScopeDeclarations
    :   ^(ANNOTATION_METHOD_DECL modifierList type IDENT annotationDefaultValue?)
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;
    
annotationDefaultValue
    :   ^(DEFAULT annotationElementValue)
    ;

// STATEMENTS / BLOCKS

block returns [StatementReturn r]
    @init {$r=new StatementReturn();}
    :   ^(BLOCK_SCOPE
            (blockStatement
                {$r.always = $r.always || ($blockStatement.text!=null && $blockStatement.r.always);}
            )*)
    ;
    
blockStatement returns [StatementReturn r]
    @init {$r=new StatementReturn();}
    :   localVariableDeclaration
    |   typeDeclaration
    |   s=statement {$r.always = $s.r.always;}
    ;
    
localVariableDeclaration
    :   ^(VAR_DECLARATION localModifierList type variableDeclaratorList)
    ;
    
        
statement returns [StatementReturn r]
    @init {$r=new StatementReturn();}
    :   b=block {$r.always=$b.r.always;}
    |   ^(ASSERT expression expression?)
    |   ifSwitchTransformation {$r.always = $ifSwitchTransformation.r.always;}
    |   ^(FOR forInit forCondition forUpdater s=statement) {$r.always=$s.r.always;}
    |   ^(FOR_EACH localModifierList type IDENT expression s=statement) {$r.always=$s.r.always;}
    |   ^(WHILE parenthesizedExpression s=statement) {$r.always=$s.r.always;}
    |   ^(DO s=statement parenthesizedExpression)
    |   ^(TRY b1=block catches? b2=block?) {$r.always=$b1.r.always && ($b2.text!=null && $b2.r.always);}
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression b=block) {$r.always=$b.r.always;}
    |   ^(RETURN expression?)
        {
            $r.always = true;
            $r.isVoid=$expression.text==null;
        }
    |   ^(THROW expression)
        {
            $r.always = true;
        }
    |   ^(BREAK IDENT?)
    |   ^(CONTINUE IDENT?)
    |   ^(LABELED_STATEMENT IDENT s=statement) {$r.always=$s.r.always;}
    |   expression
    |   SEMI // Empty statement.
    ;

catches
    :   ^(CATCH_CLAUSE_LIST catchClause+)
    ;
    
catchClause
    :   ^(CATCH formalParameterStandardDecl block)
    ;

switchBlockLabels
    :   ^(SWITCH_BLOCK_LABEL_LIST switchCaseLabel* switchDefaultLabel? switchCaseLabel*)
    ;
        
switchCaseLabel
    :   ^(CASE expression blockStatement*)
    ;
    
switchDefaultLabel
    :   ^(DEFAULT blockStatement*)
    ;
    
forInit
    :   ^(FOR_INIT (localVariableDeclaration | expression*)?)
    ;
    
forCondition
    :   ^(FOR_CONDITION expression?)
    ;
    
forUpdater
    :   ^(FOR_UPDATE expression*)
    ;
    
// EXPRESSIONS

parenthesizedExpression
    :   ^(PARENTESIZED_EXPR expression)
    ;
    
expression
    :   ^(EXPR expr)
    ;

expr
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
    |   IDENT
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? arguments)
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS
    |   arrayTypeDeclarator
    |   SUPER
    ;
    
explicitConstructorCall
    :   ^(THIS_CONSTRUCTOR_CALL genericTypeArgumentList? arguments)
    |   ^(SUPER_CONSTRUCTOR_CALL primaryExpression? genericTypeArgumentList? arguments)
    ;

arrayTypeDeclarator
    :   ^(ARRAY_DECLARATOR (arrayTypeDeclarator | qualifiedIdentifier | primitiveType))
    ;

newExpression
    :   ^(  STATIC_ARRAY_CREATOR
            (   primitiveType newArrayConstruction
            |   genericTypeArgumentList? qualifiedTypeIdent newArrayConstruction
            )
        )
    |   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? qualifiedTypeIdent arguments classTopLevelScope?)
    ;

innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'
    :   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? IDENT arguments classTopLevelScope?)
    ;
    
newArrayConstruction
    :   arrayDeclaratorList arrayInitializer
    |   expression+ arrayDeclaratorList?
    ;

arguments
    :   ^(ARGUMENT_LIST expression*)
    ;

literal 
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |   FLOATING_POINT_LITERAL
    |   CHARACTER_LITERAL
    |   STRING_LITERAL
    |   TRUE
    |   FALSE
    |   NULL
    ;
	
/**
 *	Core of the transformation
 */
ifSwitchTransformation returns [StatementReturn r]
        scope {
            boolean enabled;
        }
	@init {
            $r=new StatementReturn();
            $ifSwitchTransformation::enabled = true;

            // if we are in method, check access
            if (!$methodDeclarations.isEmpty()){
                $ifSwitchTransformation::enabled =
                    $ifSwitchTransformation::enabled &&
                    $methodDeclarations::ident.matches(getParamS("includeMethods")) &&
                    !$methodDeclarations::ident.matches(getParamS("excludeMethods"));
            }
            // if we are in class and constructor, check access
            if (!$constructorDeclaration.isEmpty() && !$classDeclaration.isEmpty()){
                $ifSwitchTransformation::enabled =
                    $ifSwitchTransformation::enabled &&
                    $classDeclaration::ident.matches(getParamS("includeMethods")) &&
                    !$classDeclaration::ident.matches(getParamS("excludeMethods"));
            }

            initRewrite();
	}
        @after {
            cleanupRewrite();
        }
        :
            

		^(IF    parenthesizedExpression
                        ifTrue=statement
                        ifFalse=statement?
                        { $ifSwitchTransformation::enabled = $ifSwitchTransformation::enabled && !($ifFalse.text==null); }
                )
		{
                    // does whole if always return something?
                    $r.always = $ifTrue.r.always && ($ifFalse.text!=null && $ifFalse.r.always);
                    
                    if ($ifSwitchTransformation::enabled) {

                        STAttrMap paramMap = new STAttrMap().
                            put("expr", $parenthesizedExpression.text).
                            put("ifTrue", $ifTrue.text).
                            put("ifFalse", $ifFalse.text).
                            put("rule", "IF_SWITCH");
                        
                        /*  optimalization for methods, that return value
                            in case of simple method like
                                public boolean test(){
                                    if (something) return true;
                                    return false;
                                }
                            transformed method would not compile
                            (break would not be reachable and method would not
                            always return something)
                        */
                        if (!$methodDeclarations.isEmpty())
                            paramMap.put("sampleReturn", ANTLRJavaHelper.getTypeDefaultValue($methodDeclarations::type));
                        paramMap.
                            put("return", $r).
                            put("ifTrueReturn", $ifTrue.r).
                            put("ifFalseReturn", $ifFalse.r);

                        performRewrite(paramMap);
                    }
		}
	;

/**
 *	Will add declarations for helper arrays + get & set methods
 */
classAdditionalCode[CommonTree tree]
	:
		{if (getRewritesCount()>0){	// at least one rewrite was performed
			getLogger().finer("Adding additional code to class");
			
			StringTemplate st = getTemplateLib().getInstanceOf("classAdditionalCode");
			tokens.insertBefore(tree.getTokenStopIndex(), st);
		}}
	;
/**
 *	Will add additional imports
 */
additionalImports[CommonTree tree]
	:
		{if (getRewritesCount()>0){	// at least one rewrite was performed
			getLogger().finer("Adding additional imports");
			StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
			tokens.insertBefore(tree.getTokenStartIndex(), st);
		}}
	;