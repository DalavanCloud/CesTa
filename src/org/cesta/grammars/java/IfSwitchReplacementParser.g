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

import JavaTreeParser;

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
