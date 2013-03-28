/**
 *  This tree parser makes sure, that all blocks with <break> or <continue> statements have
 *  a unique label. Those blocks could cause troubles to other transformations, like IF_SWITCH,
 *  because <break> or <continue> originally from cycle or another switch may end up as a part
 *  of newly generated switch.
 **/
 
tree grammar IdentifyBlocksParser;

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
package org.cesta.parsers.java.generated;

import org.cesta.parsers.java.AbstractTreeParser;
}

@treeparser::members {
}

// Starting point for parsing a Java file.
javaSource
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration*)
    ;
  
statement
    :   block
    |   ^(ASSERT expression expression?)
	|   ^(IF parenthesizedExpression statement statement?)
    |   ^(TRY block catches? block?)  // The second optional block is the optional finally block.
    |   ^(SYNCHRONIZED parenthesizedExpression block)
    |   ^(RETURN expression?)
    |   ^(THROW expression)
    |   breakContinueStatement
    |	breakableStatement
    |   expression
    |   SEMI // Empty statement.
    ;


/** 
 *	Checks whether is identify needed or not (IDENT is not set) and rewrites the statement
 */
breakContinueStatement
	:
            ^(BREAK IDENT?) {if ($IDENT == null) $breakableStatement::mustIdentify = true; } ->
			breakContinueStatement(statement={$BREAK.text},ident={$IDENT.text},id={getCurrentRewriteParams().id},enabled={$breakableStatement::mustIdentify})
	|   ^(CONTINUE IDENT?)  {if ($IDENT == null) $breakableStatement::mustIdentify = true; } -> 
			breakContinueStatement(statement={$CONTINUE.text},ident={$IDENT.text},id={getCurrentRewriteParams().id},enabled={$breakableStatement::mustIdentify})
	;

/**
 *	Calls transformation
 */
breakableStatement 
	scope {
		boolean mustIdentify;
	}
	@init {
		
	}
	@after {
                
	}
	:
            { 
                initRewrite();
                $breakableStatement::mustIdentify = false;
                //getLogger().info("before "+getCurrentRewriteParams().id+"/"+rewriteID+": "+getCurrentRewriteParams().tree.toStringTree());
            }
            (
			^(LABELED_STATEMENT IDENT statement) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
		|	^(SWITCH parenthesizedExpression switchBlockLabels) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
		|	^(FOR forInit forCondition forUpdater statement) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
		|	^(FOR_EACH localModifierList type IDENT expression statement) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
		|	^(WHILE parenthesizedExpression statement) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
		|	^(DO statement parenthesizedExpression) 
				{ performRewrite(new STAttrMap().put("enabled", $breakableStatement::mustIdentify).put("rule", "IDENTIFY_BLOCKS")); }
            )
            { 
                //getLogger().info("after "+getCurrentRewriteParams().id+"/"+rewriteID+": "+getCurrentRewriteParams().tree.toStringTree());
                cleanupRewrite();
                
            }

	;
