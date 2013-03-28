/**
 * This tree parser checks Java Card transactions,
 * whether they contain some insecure constructions.
 */
tree grammar CheckTransactionsParser;

options {
    backtrack = true; 
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
    superClass = AbstractTreeParser;
}

import JavaTreeParser;

@treeparser::header {
package org.cesta.parsers.java.generated;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.LinkedList;
import java.util.regex.PatternSyntaxException;
import org.cesta.parsers.java.AbstractTreeParser;
}

@treeparser::members {	
    /**
     *  Class for modeling variables
     */
    public class Variable implements Comparable {
        String name;
        Object tree;
        public Variable(String name, Object tree){
            this.name = name;
            this.tree = tree;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == null || getClass() != obj.getClass())
                return false;
            final Variable other = (Variable) obj;
            if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
                return false;
            }
            if (this.tree != other.tree && (this.tree == null || !this.tree.equals(other.tree))) {
                return false;
            }
            return true;
        }
        @Override
        public int hashCode() {
            int hash = 7;
            hash = 17 * hash + (this.name != null ? this.name.hashCode() : 0);
            hash = 17 * hash + (this.tree != null ? this.tree.hashCode() : 0);
            return hash;
        }
        @Override
        public int compareTo(Object obj) {
            if (obj == null || getClass() != obj.getClass()) return -1;
            if (name == null) return 1;
            Variable v = (Variable) obj;
            if (v.name == null) return -1;
            return name.compareTo(v.name);
        }
        @Override
        public String toString() {
            if (name!=null) return name;
            else return "Variable";
        }
    }
    /**
     *  Class for modeling transactions
     */
    public class Transaction {
        Set<Variable> modifiedVariables = new TreeSet<Variable>();
        Set<Variable> nonAtomicVariables = new TreeSet<Variable>();
        Object startTree, endTree;
        void start(Object tree){
            // end previous transaction
            if (isActive() && foundEnd()){
                process();
            }
            // write down only first start of transaction
            if (!isActive()) startTree = tree;
        }
        void end(Object tree){
            // write down last end of transaction
            if (isActive()) endTree = tree;
        }
        boolean isActive(){
            return (startTree!=null);
        }
        boolean foundEnd(){
            return (endTree!=null);
        }
        void process(){
            if (startTree!=null && endTree!=null){

                tokens.insertBefore(
                    input.getTreeAdaptor().getTokenStartIndex(startTree),
                    getTemplateLib().getInstanceOf("detectedStartOfTransaction")
                );
                tokens.insertAfter(
                    input.getTreeAdaptor().getTokenStopIndex(endTree),
                    getTemplateLib().getInstanceOf("detectedEndOfTransaction")
                );

                // check whether some variables are not modified and also
                // accessed via non atomic method
                Set<Variable> warnVariables = new TreeSet<Variable>();
                warnVariables.addAll(modifiedVariables);
                warnVariables.retainAll(nonAtomicVariables);
                // test range according to tokens
                for (Variable v:warnVariables){
                    if (input.getTreeAdaptor().getTokenStartIndex(v.tree)<input.getTreeAdaptor().getTokenStartIndex(startTree) ||
                            input.getTreeAdaptor().getTokenStartIndex(v.tree)>input.getTreeAdaptor().getTokenStartIndex(endTree)){
                        warnVariables.remove(v);
                    }
                }

                if (warnVariables.size()>0){
                    StringTemplate st = getTemplateLib().getInstanceOf("warningNonAtomic");

                    List<Variable> l = new LinkedList<Variable>();
                    l.addAll(warnVariables);
                    st.setAttribute("variables", l);

                    tokens.insertBefore(
                        input.getTreeAdaptor().getTokenStartIndex(startTree),
                        st
                    );

                    getLogger().warning("Transaction contains possibly insecure methods (variables "+l+")");
                }

                // reset transaction
                startTree = null;
                endTree = null;
                modifiedVariables.clear();
                nonAtomicVariables.clear();
            }
        }
    }
    /**
     *  Tries to resolve method name according to current imports
     *  and returns Set of possible names for this method.
     *
     *@param name name of method (e.g. JCSystem.beginTransaction)
     */
     Set<String> getMethodPossibleNames(String name){
        // TODO: this whole method needs revision and rewrite,
        // possibly also added cache mechanism
        Set<String> possibleNames = new TreeSet<String>();
        possibleNames.add(name);
        if ($javaSource.size()>0) for (String i:$javaSource::imports){
            if (i.matches(".+\\.\\*")) {
                possibleNames.add(i.replace("*", name));
            } else {
                String importParts[] = i.split("\\.");
                String nameParts[] = name.split("\\.");

                // last part of import matches with first part of name (class name)
                if (importParts.length>0 && nameParts.length>0 &&
                    importParts[importParts.length-1].equals(nameParts[0])) {

                    StringBuffer possibleName = new StringBuffer();
                    for (int j=0;j<importParts.length-1;j++) {
                        if (possibleName.length()>0) possibleName.append(".");
                        possibleName.append(importParts[j]);
                    }
                    for (int j=0;j<nameParts.length;j++) {
                        if (possibleName.length()>0) possibleName.append(".");
                        possibleName.append(nameParts[j]);
                    }
                    possibleNames.add(possibleName.toString());
                }
            }
        }
        return possibleNames;
      }
    /**
     *  Tries to determine whether given method matches full class name
     *
     *@param name name of method (e.g. JCSystem.beginTransaction)
     *@param qualifiedName full name of method (e.g. javacard.framework.Util.JCSystem.beginTransaction)
     */
    boolean methodNameEquals(String name, String qualifiedName){
       return getMethodPossibleNames(name).contains(qualifiedName);
    }
    /**
     *  Tries to determine whether given method matches given pattern for full qualified name
     *
     *@param name name of method (e.g. JCSystem.beginTransaction)
     *@param regexp pattern for full qualified name
     */
    boolean methodNameMatches(String name, String regexp){
       for (String n:getMethodPossibleNames(name)){
            try {
                if (n.matches(regexp)) return true;
            } catch (PatternSyntaxException ex){
                getLogger().warning("Given regular expression is invalid: \""+regexp+"\"");
            }
       }
       return false;
    }
}

// Starting point for parsing a Java file.
javaSource
    scope {
        Set<String> imports;
    }
    @init {
        $javaSource::imports = new TreeSet<String>();
    }
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration*)
    ;
    
importDeclaration
    :   ^(IMPORT STATIC? qualifiedIdentifier DOTSTAR?)
        {
            $javaSource::imports.add($qualifiedIdentifier.text+($DOTSTAR.text!=null?$DOTSTAR.text:""));
        }
    ;
    
classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   methodScopeDeclarations
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;

// EXPRESSIONS
    
expression returns [Variable variable]
    :   ^(EXPR expr) { $variable = $expr.variable; }
    ;

modifyVariableExpression returns [Variable variable]
    :
        (
                ^(ASSIGN var=expr expr)
            |   ^(PLUS_ASSIGN var=expr expr)
            |   ^(MINUS_ASSIGN var=expr expr)
            |   ^(STAR_ASSIGN var=expr expr)
            |   ^(DIV_ASSIGN var=expr expr)
            |   ^(AND_ASSIGN var=expr expr)
            |   ^(OR_ASSIGN var=expr expr)
            |   ^(XOR_ASSIGN var=expr expr)
            |   ^(MOD_ASSIGN var=expr expr)
            |   ^(BIT_SHIFT_RIGHT_ASSIGN var=expr expr)
            |   ^(SHIFT_RIGHT_ASSIGN var=expr expr)
            |   ^(SHIFT_LEFT_ASSIGN var=expr expr)
            |   ^(PRE_INC var=expr)
            |   ^(PRE_DEC var=expr)
            |   ^(POST_INC var=expr)
            |   ^(POST_DEC var=expr)
        )
        {
            $variable = $var.variable;
            if (!$methodScopeDeclarations.isEmpty())
                $methodScopeDeclarations::transaction.modifiedVariables.add(
                    $variable
                );
        }
    ;

expr returns [Variable variable]
    :
        modifyVariableExpression {$variable=$modifyVariableExpression.variable; }
    
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
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   pe=primaryExpression {$variable=new Variable($pe.ident, $pe.start); }
    ;
    
primaryExpression returns [String ident]
    :   ^(  DOT
            (   p=primaryExpression {$ident = ($p.ident==null?"":($p.ident+"."));}
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
    |   IDENT { $ident = $IDENT.text; }
    |   methodCall
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS pe=primaryExpression expression) { $ident = $pe.ident; }
    |   literal
    |   newExpression
    |   THIS { $ident = "this"; }
    |   arrayTypeDeclarator
    |   SUPER { $ident = "super"; }
    ;

arguments returns [List<Variable> variables]
    @init {
        $variables = new LinkedList<Variable>();
    }
    :   ^(ARGUMENT_LIST 
            (expression
                {
                    $variables.add($expression.variable);
                }
            )*)
    ;

methodScopeDeclarations
        scope {
		Transaction transaction;
                Object methodStart;
	}
	@init {
		$methodScopeDeclarations::transaction = new Transaction();
                $methodScopeDeclarations::methodStart = retval.start;
	}
	:
        (
                ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
            |	^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
            |	^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
        )
        {
            if ($methodScopeDeclarations::transaction.isActive() && !$methodScopeDeclarations::transaction.foundEnd()){
                $methodScopeDeclarations::transaction.end($methodScopeDeclarations::methodStart);
            }
            $methodScopeDeclarations::transaction.process();
        }
	;
/**
 *  Every method call
 *
 *  It handles detection of transactions and writes down
 *  arguments of non atomic method calls
 */
methodCall
    :
    ^(METHOD_CALL p=primaryExpression genericTypeArgumentList? arguments)
    {
        // we are calling method from outer method
        if (!$methodScopeDeclarations.isEmpty()){
            Transaction t = $methodScopeDeclarations::transaction;

            if (methodNameMatches($p.text, getParamS("startMethods", ""))){
                // method is new starting transaction
                t.start(retval.start);
            } else if (methodNameMatches($p.text, getParamS("endMethods", ""))) {
                // method is ending transaction
                
                if (!t.isActive()){
                    // if no transaction is active but end was found, 
                    // use start of method
                    t.start($methodScopeDeclarations::methodStart);
                }

                t.end(retval.start);
            } else {
                // TODO: optimalization
                // check whether given method is atomic or not
                String[] param = getParamS("nonatomicMethods", "").split(",");
                for (String m:param){
                    String parts[] = m.trim().split(":");
                    if (parts.length==0) continue;

                    int argumentNumber = 0;
                    try {
                        if (parts.length>1) argumentNumber = Integer.valueOf(parts[1]);
                    } catch (NumberFormatException ex){
                    }
                    if (methodNameMatches($p.text, parts[0].trim()) && $arguments.variables.size()>=argumentNumber+1){
                        t.nonAtomicVariables.add($arguments.variables.get(argumentNumber));
                    }
                }
            }
        }
    }
    ;
