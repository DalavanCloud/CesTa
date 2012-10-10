/**
 * Validate state transformation adds code, that will automatically
 * check state of applet during its lifetime according to defined graph
 * via DOT grammar.
 **/

tree grammar ValidateStateTransitionsParser;

options {
    superClass = AbstractTreeParser;
    backtrack = true;
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
}

@treeparser::header {
package org.cesta.parsers.java;

import org.cesta.util.LinearEncoder;
import org.cesta.parsers.dot.DotTree;
import org.cesta.trans.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Vector;
import java.util.Iterator;
}

@treeparser::members {
        /**
         *  Model for state transitions, parsed from DOT file.
         *  Has to be set from transformation.
         */
        protected DotTree.Graph graph = null;

        public DotTree.Graph getGraph(){
            if (graph==null) throw new IllegalArgumentException("Graph of states wasn't set");
            return graph;
        }
        public void setGraph(DotTree.Graph graph){
            this.graph = graph;
        }

        /**
         *  Model for states
         */
        public class State {
            public String name;     // state name (including prefix)
            public short id = -1;   // constant value
            public State(String name){
                this.name = name;
            }
            @Override
            public boolean equals(Object obj){
                if (!(obj instanceof State)) return false;
                State s = (State)obj;
                return (s.name!=null && s.name.equals(name));
            }
            @Override
            public int hashCode() {
                int hash = 3;
                hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
                return hash;
            }
        }
        /**
         * Map of all known states (from code or from DOT grammar)
         */
	public Map<String, State> knownStates = new TreeMap<String, State>();

        /**
         *  Model for functions
         */
        public class Function {
            public String name;     // function name (without brackets)
            public Set<State> entryStates = new HashSet<State>();
            public short id = -1;   // constant value
            public boolean alwaysAllowed = false;

            public Function(String name){
                setName(name);
                alwaysAllowed = this.name.matches(getParamS("allowedFunctions"));
            }
            public void setName(String name){
                if (name == null) name = "unknown_function";
                // remove quotes if needed
                if (name.length()>=2 && name.charAt(0)=='"' && name.charAt(name.length()-1)=='"')
                    name = name.substring(1,name.length()-1);
                // remove brackets ()
                if (name.length()>=2 && name.substring(name.length()-2,name.length()).equals("()"))
                    name = name.substring(0,name.length()-2);
                this.name = name;
            }
            @Override
            public boolean equals(Object obj){
                if (!(obj instanceof Function)) return false;
                Function f = (Function)obj;
                return (f.name!=null && f.name.equals(name));
            }
            @Override
            public int hashCode() {
                int hash = 3;
                hash = 41 * hash + (this.name != null ? this.name.hashCode() : 0);
                return hash;
            }
        }
        /**
         * List of known functions (from code or from DOT grammar)
         */
        public Map<String, Function> knownFunctions = new TreeMap<String, Function>();

        public boolean foundStateSetter = false;
        public boolean hasErrors(){
            boolean errors = false;
            if (!foundStateSetter){
                getLogger().severe("Function for setting new state with name '"+getParamS("stateSetter")+"' was not found");
                errors = true;
            }
            return errors;
        }
        /**
         *  Loads functions from graph.
         *  Functions not specified in the graph are not controlled.
         */
        public void initKnownFunctions(){
            DotTree.Graph g = getGraph();

            for (DotTree.Edge e:g.edges){
                Function f = new Function(e.attributes.get("label"));
                if (knownFunctions.containsKey(f.name)) f = knownFunctions.get(f.name);
                else {
                    knownFunctions.put(f.name, f);
                }

                // compute available entry states
                for (DotTree.NodePair p:e.getNodePairs()){
                    f.entryStates.add(new State(p.x.id));
                }
            }
            for (String name:knownFunctions.keySet()){
                if (name.matches(getParamS("ignoredFunctions")))
                    knownFunctions.remove(name);
            }

        }
        /**
         *  Called, when new function is detected in code.
         */
        public void functionDetected(String name, CommonTree block){

            if (name.equals(getParamS("stateSetter"))){
                foundStateSetter=true;
                StringTemplate st = getTemplateLib().getInstanceOf("setStateFunc");
                tokens.insertAfter(
                    input.getTreeAdaptor().getTokenStartIndex(block),
                    st.toString()
                );
            } else if (name.equals(getParamS("stateGetter"))) {
                // getter is without modification
            } else {
                // verify this function
                if (!name.matches(getParamS("ignoredFunctions"))){

                    if (!knownFunctions.containsKey(name)) {
                        knownFunctions.put(name, new Function(name));
                    }
                    Function f = knownFunctions.get(name);

                    StringTemplate st = getTemplateLib().getInstanceOf("VerifyAllowedFunction");
                    st.setAttribute("function", f);
                    st.setAttribute("stateGetter", getParamS("stateGetter"));
                    tokens.insertAfter(
                        input.getTreeAdaptor().getTokenStartIndex(block),
                        st.toString()
                    );
                }
            }
        }
}

// Starting point for parsing a Java file.
javaSource
    :
        {
            initKnownFunctions();
        }
        ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration*)
    ;

packageDeclaration
    :   ^(PACKAGE qualifiedIdentifier)
    ;

importDeclaration
    :   ^(IMPORT STATIC? qualifiedIdentifier DOTSTAR?)
    ;

typeDeclaration
    :   ^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
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
    :   ^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations* additionalCode[(CommonTree)retval.start])
    ;

classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   functionMethodDeclaration
    |   voidMethodDeclaration
    |   classVarDeclaration
    |   ^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
    |   typeDeclaration
    ;
functionMethodDeclaration
    :
        ^(
            FUNCTION_METHOD_DECL
                modifierList
                genericTypeParameterList?
                type
                IDENT
                formalParameterList
                arrayDeclaratorList?
                throwsClause?
                block?
            {
                functionDetected($IDENT.text, (CommonTree)$block.start);
            }
        )
    ;
voidMethodDeclaration
    :
        ^(
            VOID_METHOD_DECL
                modifierList
                genericTypeParameterList?
                IDENT
                formalParameterList
                throwsClause?
                block?
            {
                functionDetected($IDENT.text, (CommonTree)$block.start);
            }
        )
    ;


/**
 *  Declaration of class global variables
 */
classVarDeclaration
    @init {
        initRewrite();
    }
    @after {
        cleanupRewrite();
    }
    :
        ^(VAR_DECLARATION modifierList type variableDeclaratorList)
        {
            // we could also check modifiers and type, but right know the state variable
            // is detected known only by it's name
            // $modifierList.modifiers

            if ($variableDeclaratorList.onlyStates){

                // no rule is specified, rewrite will delete original tokens
                performRewrite(new STAttrMap().put("name", "removeVariableDeclaratorList"));
            }
        }
    ;

interfaceTopLevelScope
    :   ^(INTERFACE_TOP_LEVEL_SCOPE interfaceScopeDeclarations*)
    ;

interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;

/**
 *  @returns onlyStates true if this list contains only states and should be filtered out
 */
variableDeclaratorList returns [boolean onlyStates]
    @init {
        $onlyStates = true;
    }
    :   ^(VAR_DECLARATOR_LIST
            (
                variableDeclarator
                {$onlyStates=$onlyStates && $variableDeclarator.isState;}
            )+
        )
    ;
/**
 *  @returns isState true if this declarator declares state variable (according to ID), otherwise false
 */
variableDeclarator returns [boolean isState]
    :   ^(VAR_DECLARATOR
            variableDeclaratorId
            {
                $isState = $variableDeclaratorId.text.matches(getParamS("stateConstants"));
                if ($isState){
                    getLogger().fine("Detected state variable "+$variableDeclaratorId.text);
                    knownStates.put($variableDeclaratorId.text, new State($variableDeclaratorId.text));
                    // original declaration is deleted
                    tokens.delete(
                        input.getTreeAdaptor().getTokenStartIndex($variableDeclarator.start),
                        input.getTreeAdaptor().getTokenStopIndex($variableDeclarator.start)
                    );
                }
            }
            variableInitializer?
        )
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

modifierList returns [Set modifiers]
    @init {
        $modifiers = new HashSet<String>();
    }
    :   ^(MODIFIER_LIST (modifier {$modifiers.add($modifier.text);})*)
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

block
    :   ^(BLOCK_SCOPE blockStatement*)
    ;

blockStatement
    :   localVariableDeclaration
    |   typeDeclaration
    |   statement
    ;

localVariableDeclaration
    :   ^(VAR_DECLARATION localModifierList type variableDeclaratorList)
    ;


statement
    :   block
    |   ^(ASSERT expression expression?)
    |   ^(IF parenthesizedExpression statement statement?)
    |   ^(FOR forInit forCondition forUpdater statement)
    |   ^(FOR_EACH localModifierList type IDENT expression statement)
    |   ^(WHILE parenthesizedExpression statement)
    |   ^(DO statement parenthesizedExpression)
    |   ^(TRY block catches? block?)  // The second optional block is the optional finally block.
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression block)
    |   ^(RETURN expression?)
    |   ^(THROW expression)
    |   ^(BREAK IDENT?)
    |   ^(CONTINUE IDENT?)
    |   ^(LABELED_STATEMENT IDENT statement)
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

additionalCode[CommonTree tree]
    :
        {
            LinearEncoder encoder;
            short i;
            StringTemplate st;
            DotTree.Graph g = getGraph();
            Set<DotTree.Node> nodes = g.getNodes();
            for (DotTree.Node n:nodes){
                knownStates.put(n.id, new State(n.id));
            }

            getLogger().fine("Declaring "+knownStates.size()+" states");
            // size() + 1, because we don't want to use last codeword (0xFFFF)
            encoder = new LinearEncoder(knownStates.size()+1);


            // compute new ids for states
            i=1;    // from 1 because we don't want to use 0x0000 either
            for (State s:knownStates.values()){
                s.id = (short)encoder.encode(i);
                i++;
            }

            st = getTemplateLib().getInstanceOf("declareStateConstants");
            st.setAttribute("states", knownStates.values());
            tokens.insertAfter(tree.getTokenStartIndex(), st.toString());

            getLogger().fine("Declaring "+knownFunctions.size()+" function constants");
            encoder = new LinearEncoder(knownFunctions.size()+1);
            i=1;
            for (Function f:knownFunctions.values()){
                f.id = (short)encoder.encode(i);
                i++;
            }

            st = getTemplateLib().getInstanceOf("declareFunctionConstants");
            st.setAttribute("functions", knownFunctions.values());
            tokens.insertAfter(tree.getTokenStartIndex(), st.toString());

            st = getTemplateLib().getInstanceOf("DeclareVerifyAllowedFunction");
            st.setAttribute("functions", knownFunctions.values());
            st.setAttribute("stateGetter", getParamS("stateGetter"));
            tokens.insertBefore(tree.getTokenStopIndex(), st.toString());

            st = getTemplateLib().getInstanceOf("DeclareVerifyAllowedTransition");
            st.setAttribute("stateMap", getGraph().getTransitionMap());
            tokens.insertBefore(tree.getTokenStopIndex(), st.toString());

        }
    ;