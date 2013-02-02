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

import JavaTreeParser;

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

modifierList returns [Set modifiers]
    @init {
        $modifiers = new HashSet<String>();
    }
    :   ^(MODIFIER_LIST (modifier {$modifiers.add($modifier.text);})*)
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
