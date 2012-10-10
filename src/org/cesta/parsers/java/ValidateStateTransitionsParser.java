// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g 2010-05-25 16:14:29

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
/**
 * Validate state transformation adds code, that will automatically
 * check state of applet during its lifetime according to defined graph
 * via DOT grammar.
 **/
public class ValidateStateTransitionsParser extends AbstractTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ASSIGN", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "COLON", "COMMA", "DEC", "DIV", "DIV_ASSIGN", "DOT", "DOTSTAR", "ELLIPSIS", "EQUAL", "GREATER_OR_EQUAL", "GREATER_THAN", "INC", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "MINUS", "MINUS_ASSIGN", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "OR", "OR_ASSIGN", "PLUS", "PLUS_ASSIGN", "QUESTION", "RBRACK", "RCURLY", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "STAR", "STAR_ASSIGN", "XOR", "XOR_ASSIGN", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INTERFACE", "IMPORT", "INT", "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "BLOCK_SCOPE", "CAST_EXPR", "CATCH_CLAUSE_LIST", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "CONSTRUCTOR_DECL", "ENUM_TOP_LEVEL_SCOPE", "EXPR", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "INTERFACE_TOP_LEVEL_SCOPE", "IMPLEMENTS_CLAUSE", "LABELED_STATEMENT", "LOCAL_MODIFIER_LIST", "JAVA_SOURCE", "METHOD_CALL", "MODIFIER_LIST", "PARENTESIZED_EXPR", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUALIFIED_TYPE_IDENT", "STATIC_ARRAY_CREATOR", "SUPER_CONSTRUCTOR_CALL", "SWITCH_BLOCK_LABEL_LIST", "THIS_CONSTRUCTOR_CALL", "THROWS_CLAUSE", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID_METHOD_DECL", "IDENT", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "JAVA_ID_START", "JAVA_ID_PART", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT"
    };
    public static final int PACKAGE=84;
    public static final int EXPONENT=173;
    public static final int STAR=49;
    public static final int WHILE=103;
    public static final int MOD=32;
    public static final int MOD_ASSIGN=33;
    public static final int CASE=58;
    public static final int CHAR=60;
    public static final int NEW=82;
    public static final int DO=64;
    public static final int GENERIC_TYPE_PARAM_LIST=138;
    public static final int CLASS_INSTANCE_INITIALIZER=121;
    public static final int ARRAY_ELEMENT_ACCESS=115;
    public static final int FOR_CONDITION=129;
    public static final int NOT=34;
    public static final int VAR_DECLARATION=160;
    public static final int ANNOTATION_METHOD_DECL=109;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=14;
    public static final int BREAK=56;
    public static final int LOGICAL_AND=26;
    public static final int BIT_SHIFT_RIGHT_ASSIGN=9;
    public static final int UNARY_PLUS=159;
    public static final int TYPE=157;
    public static final int FINAL=70;
    public static final int INC=21;
    public static final int RPAREN=43;
    public static final int IMPORT=78;
    public static final int STRING_LITERAL=170;
    public static final int FOR_UPDATE=132;
    public static final int FLOATING_POINT_LITERAL=168;
    public static final int CAST_EXPR=118;
    public static final int NOT_EQUAL=35;
    public static final int VOID_METHOD_DECL=163;
    public static final int RETURN=88;
    public static final int THIS=95;
    public static final int DOUBLE=65;
    public static final int VOID=101;
    public static final int ENUM_TOP_LEVEL_SCOPE=125;
    public static final int SUPER=92;
    public static final int COMMENT=182;
    public static final int ANNOTATION_INIT_KEY_LIST=107;
    public static final int JAVA_ID_START=178;
    public static final int FLOAT_TYPE_SUFFIX=174;
    public static final int PRE_DEC=149;
    public static final int RBRACK=41;
    public static final int IMPLEMENTS_CLAUSE=140;
    public static final int SWITCH_BLOCK_LABEL_LIST=154;
    public static final int LINE_COMMENT=183;
    public static final int PRIVATE=85;
    public static final int STATIC=90;
    public static final int BLOCK_SCOPE=117;
    public static final int ANNOTATION_INIT_DEFAULT_KEY=106;
    public static final int SWITCH=93;
    public static final int NULL=83;
    public static final int VAR_DECLARATOR=161;
    public static final int MINUS_ASSIGN=31;
    public static final int ELSE=66;
    public static final int STRICTFP=91;
    public static final int CHARACTER_LITERAL=169;
    public static final int PRE_INC=150;
    public static final int ANNOTATION_LIST=108;
    public static final int ELLIPSIS=17;
    public static final int NATIVE=81;
    public static final int OCTAL_ESCAPE=177;
    public static final int UNARY_MINUS=158;
    public static final int THROWS=97;
    public static final int LCURLY=23;
    public static final int INT=79;
    public static final int FORMAL_PARAM_VARARG_DECL=135;
    public static final int METHOD_CALL=144;
    public static final int ASSERT=54;
    public static final int TRY=100;
    public static final int INTERFACE_TOP_LEVEL_SCOPE=139;
    public static final int SHIFT_LEFT=45;
    public static final int WS=180;
    public static final int SHIFT_RIGHT=47;
    public static final int FORMAL_PARAM_STD_DECL=134;
    public static final int LOCAL_MODIFIER_LIST=142;
    public static final int OR=36;
    public static final int LESS_THAN=25;
    public static final int SHIFT_RIGHT_ASSIGN=48;
    public static final int EXTENDS_BOUND_LIST=127;
    public static final int JAVA_SOURCE=143;
    public static final int CATCH=59;
    public static final int FALSE=69;
    public static final int INTEGER_TYPE_SUFFIX=172;
    public static final int DECIMAL_LITERAL=167;
    public static final int THROW=96;
    public static final int FOR_INIT=131;
    public static final int PROTECTED=86;
    public static final int DEC=12;
    public static final int CLASS=61;
    public static final int LBRACK=22;
    public static final int BIT_SHIFT_RIGHT=8;
    public static final int THROWS_CLAUSE=156;
    public static final int GREATER_OR_EQUAL=19;
    public static final int FOR=73;
    public static final int LOGICAL_NOT=27;
    public static final int THIS_CONSTRUCTOR_CALL=155;
    public static final int FLOAT=72;
    public static final int ABSTRACT=53;
    public static final int AND=4;
    public static final int POST_DEC=147;
    public static final int AND_ASSIGN=5;
    public static final int ANNOTATION_SCOPE=110;
    public static final int MODIFIER_LIST=145;
    public static final int STATIC_ARRAY_CREATOR=152;
    public static final int LPAREN=29;
    public static final int IF=74;
    public static final int AT=7;
    public static final int CONSTRUCTOR_DECL=124;
    public static final int ESCAPE_SEQUENCE=175;
    public static final int LABELED_STATEMENT=141;
    public static final int UNICODE_ESCAPE=176;
    public static final int BOOLEAN=55;
    public static final int SYNCHRONIZED=94;
    public static final int EXPR=126;
    public static final int CLASS_TOP_LEVEL_SCOPE=123;
    public static final int IMPLEMENTS=75;
    public static final int CONTINUE=62;
    public static final int COMMA=11;
    public static final int TRANSIENT=98;
    public static final int XOR_ASSIGN=52;
    public static final int EQUAL=18;
    public static final int LOGICAL_OR=28;
    public static final int ARGUMENT_LIST=112;
    public static final int QUALIFIED_TYPE_IDENT=151;
    public static final int IDENT=164;
    public static final int PLUS=38;
    public static final int ANNOTATION_INIT_BLOCK=105;
    public static final int HEX_LITERAL=165;
    public static final int DOT=15;
    public static final int SHIFT_LEFT_ASSIGN=46;
    public static final int FORMAL_PARAM_LIST=133;
    public static final int GENERIC_TYPE_ARG_LIST=137;
    public static final int DOTSTAR=16;
    public static final int ANNOTATION_TOP_LEVEL_SCOPE=111;
    public static final int BYTE=57;
    public static final int XOR=51;
    public static final int JAVA_ID_PART=179;
    public static final int GREATER_THAN=20;
    public static final int VOLATILE=102;
    public static final int PARENTESIZED_EXPR=146;
    public static final int LESS_OR_EQUAL=24;
    public static final int ARRAY_DECLARATOR_LIST=114;
    public static final int CLASS_STATIC_INITIALIZER=122;
    public static final int DEFAULT=63;
    public static final int OCTAL_LITERAL=166;
    public static final int HEX_DIGIT=171;
    public static final int SHORT=89;
    public static final int INSTANCEOF=76;
    public static final int MINUS=30;
    public static final int SEMI=44;
    public static final int TRUE=99;
    public static final int EXTENDS_CLAUSE=128;
    public static final int STAR_ASSIGN=50;
    public static final int VAR_DECLARATOR_LIST=162;
    public static final int COLON=10;
    public static final int ARRAY_DECLARATOR=113;
    public static final int OR_ASSIGN=37;
    public static final int ENUM=67;
    public static final int QUESTION=40;
    public static final int NEWLINE=181;
    public static final int FINALLY=71;
    public static final int RCURLY=42;
    public static final int ASSIGN=6;
    public static final int PLUS_ASSIGN=39;
    public static final int ANNOTATION_INIT_ARRAY_ELEMENT=104;
    public static final int FUNCTION_METHOD_DECL=136;
    public static final int INTERFACE=77;
    public static final int DIV=13;
    public static final int POST_INC=148;
    public static final int LONG=80;
    public static final int CLASS_CONSTRUCTOR_CALL=120;
    public static final int PUBLIC=87;
    public static final int EXTENDS=68;
    public static final int FOR_EACH=130;
    public static final int ARRAY_INITIALIZER=116;
    public static final int CATCH_CLAUSE_LIST=119;
    public static final int SUPER_CONSTRUCTOR_CALL=153;

    // delegates
    // delegators


        public ValidateStateTransitionsParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ValidateStateTransitionsParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[292+1];
             
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ValidateStateTransitionsParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return ValidateStateTransitionsParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g"; }


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


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:187:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
    public final ValidateStateTransitionsParser.javaSource_return javaSource() throws RecognitionException {
        ValidateStateTransitionsParser.javaSource_return retval = new ValidateStateTransitionsParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:188:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:189:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            {
            if ( state.backtracking==0 ) {

                          initKnownFunctions();
                      
            }
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource139); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource141);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:192:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource143);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:192:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource146);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:192:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource149);
            	    typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, javaSource_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "javaSource"

    public static class packageDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "packageDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:195:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final ValidateStateTransitionsParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.packageDeclaration_return retval = new ValidateStateTransitionsParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:196:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:196:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration171); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration173);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "packageDeclaration"

    public static class importDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "importDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:199:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final ValidateStateTransitionsParser.importDeclaration_return importDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.importDeclaration_return retval = new ValidateStateTransitionsParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:200:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:200:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration194); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:200:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration196); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration199);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:200:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration201); if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"

    public static class typeDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:203:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final ValidateStateTransitionsParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.typeDeclaration_return retval = new ValidateStateTransitionsParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt12=1;
                }
                break;
            case INTERFACE:
                {
                alt12=2;
                }
                break;
            case ENUM:
                {
                alt12=3;
                }
                break;
            case AT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration223); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration225);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration227); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:36: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration229);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:62: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration232);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:77: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration235);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration238);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:205:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration250); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration252);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration254); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:205:40: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration256);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:205:66: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration259);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration262);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:206:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration274); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration276);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration278); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:206:35: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration280);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration283);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:207:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration295); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration297);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration299); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration301);
                    annotationTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class extendsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extendsClause"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:210:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final ValidateStateTransitionsParser.extendsClause_return extendsClause() throws RecognitionException {
        ValidateStateTransitionsParser.extendsClause_return retval = new ValidateStateTransitionsParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:212:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:212:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause338); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:212:26: ( type )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TYPE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause340);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, extendsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "extendsClause"

    public static class implementsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "implementsClause"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:215:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final ValidateStateTransitionsParser.implementsClause_return implementsClause() throws RecognitionException {
        ValidateStateTransitionsParser.implementsClause_return retval = new ValidateStateTransitionsParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:216:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:216:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause362); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:216:29: ( type )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TYPE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause364);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, implementsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "implementsClause"

    public static class genericTypeParameterList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeParameterList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:219:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final ValidateStateTransitionsParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        ValidateStateTransitionsParser.genericTypeParameterList_return retval = new ValidateStateTransitionsParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:220:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:220:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList386); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:220:35: ( genericTypeParameter )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList388);
            	    genericTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, genericTypeParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameterList"

    public static class genericTypeParameter_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeParameter"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:223:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final ValidateStateTransitionsParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        ValidateStateTransitionsParser.genericTypeParameter_return retval = new ValidateStateTransitionsParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:224:5: ( ^( IDENT ( bound )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:224:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter410); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:224:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter412);
                        bound();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameter"

    public static class bound_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bound"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:227:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final ValidateStateTransitionsParser.bound_return bound() throws RecognitionException {
        ValidateStateTransitionsParser.bound_return retval = new ValidateStateTransitionsParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:228:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:228:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound434); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:228:30: ( type )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TYPE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound436);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, bound_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bound"

    public static class enumTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumTopLevelScope"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:231:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final ValidateStateTransitionsParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        ValidateStateTransitionsParser.enumTopLevelScope_return retval = new ValidateStateTransitionsParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:232:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:232:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope458); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:232:32: ( enumConstant )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope460);
            	    enumConstant();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:232:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope463);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, enumTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumTopLevelScope"

    public static class enumConstant_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumConstant"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:235:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final ValidateStateTransitionsParser.enumConstant_return enumConstant() throws RecognitionException {
        ValidateStateTransitionsParser.enumConstant_return retval = new ValidateStateTransitionsParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:236:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:236:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant485); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant487);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:236:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant489);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:236:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant492);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, enumConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumConstant"

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:240:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] ) ;
    public final ValidateStateTransitionsParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        ValidateStateTransitionsParser.classTopLevelScope_return retval = new ValidateStateTransitionsParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:241:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:241:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] )
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope515); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:241:33: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope517);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);

                pushFollow(FOLLOW_additionalCode_in_classTopLevelScope520);
                additionalCode((CommonTree)retval.start);

                state._fsp--;
                if (state.failed) return retval;

                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, classTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classTopLevelScope"

    public static class classScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classScopeDeclarations"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:244:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | functionMethodDeclaration | voidMethodDeclaration | classVarDeclaration | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final ValidateStateTransitionsParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        ValidateStateTransitionsParser.classScopeDeclarations_return retval = new ValidateStateTransitionsParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:245:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | functionMethodDeclaration | voidMethodDeclaration | classVarDeclaration | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
            int alt25=7;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt25=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt25=2;
                }
                break;
            case FUNCTION_METHOD_DECL:
                {
                alt25=3;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt25=4;
                }
                break;
            case VAR_DECLARATION:
                {
                alt25=5;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt25=6;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt25=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:245:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations542); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations544);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:246:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations556); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations558);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:247:9: functionMethodDeclaration
                    {
                    pushFollow(FOLLOW_functionMethodDeclaration_in_classScopeDeclarations569);
                    functionMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:248:9: voidMethodDeclaration
                    {
                    pushFollow(FOLLOW_voidMethodDeclaration_in_classScopeDeclarations579);
                    voidMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:249:9: classVarDeclaration
                    {
                    pushFollow(FOLLOW_classVarDeclaration_in_classScopeDeclarations589);
                    classVarDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:250:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations600); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations602);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:250:41: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations604);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations607);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:250:87: ( throwsClause )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THROWS_CLAUSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations609);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classScopeDeclarations612);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:251:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations623);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, classScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    public static class functionMethodDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "functionMethodDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:253:1: functionMethodDeclaration : ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) ;
    public final ValidateStateTransitionsParser.functionMethodDeclaration_return functionMethodDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.functionMethodDeclaration_return retval = new ValidateStateTransitionsParser.functionMethodDeclaration_return();
        retval.start = input.LT(1);
        int functionMethodDeclaration_StartIndex = input.index();
        CommonTree IDENT1=null;
        ValidateStateTransitionsParser.block_return block2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:254:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:255:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
            {
            match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_functionMethodDeclaration661); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_functionMethodDeclaration679);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:258:17: ( genericTypeParameterList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_functionMethodDeclaration697);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_functionMethodDeclaration716);
            type();

            state._fsp--;
            if (state.failed) return retval;
            IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_functionMethodDeclaration734); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterList_in_functionMethodDeclaration752);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:262:17: ( arrayDeclaratorList )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ARRAY_DECLARATOR_LIST) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_functionMethodDeclaration770);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:263:17: ( throwsClause )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==THROWS_CLAUSE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_functionMethodDeclaration789);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:264:17: ( block )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==BLOCK_SCOPE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_functionMethodDeclaration808);
                    block2=block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                              functionDetected((IDENT1!=null?IDENT1.getText():null), (CommonTree)(block2!=null?((CommonTree)block2.start):null));
                          
            }

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, functionMethodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionMethodDeclaration"

    public static class voidMethodDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "voidMethodDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:270:1: voidMethodDeclaration : ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) ;
    public final ValidateStateTransitionsParser.voidMethodDeclaration_return voidMethodDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.voidMethodDeclaration_return retval = new ValidateStateTransitionsParser.voidMethodDeclaration_return();
        retval.start = input.LT(1);
        int voidMethodDeclaration_StartIndex = input.index();
        CommonTree IDENT3=null;
        ValidateStateTransitionsParser.block_return block4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:271:5: ( ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:272:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
            {
            match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_voidMethodDeclaration871); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_voidMethodDeclaration889);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:275:17: ( genericTypeParameterList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_voidMethodDeclaration907);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_voidMethodDeclaration926); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterList_in_voidMethodDeclaration944);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:278:17: ( throwsClause )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==THROWS_CLAUSE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_voidMethodDeclaration962);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:279:17: ( block )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BLOCK_SCOPE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_voidMethodDeclaration981);
                    block4=block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                              functionDetected((IDENT3!=null?IDENT3.getText():null), (CommonTree)(block4!=null?((CommonTree)block4.start):null));
                          
            }

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, voidMethodDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "voidMethodDeclaration"

    public static class classVarDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classVarDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:287:1: classVarDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final ValidateStateTransitionsParser.classVarDeclaration_return classVarDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.classVarDeclaration_return retval = new ValidateStateTransitionsParser.classVarDeclaration_return();
        retval.start = input.LT(1);
        int classVarDeclaration_StartIndex = input.index();
        ValidateStateTransitionsParser.modifierList_return modifierList5 = null;

        ValidateStateTransitionsParser.variableDeclaratorList_return variableDeclaratorList6 = null;



                initRewrite();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:297:5: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:298:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classVarDeclaration1053); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classVarDeclaration1055);
            modifierList5=modifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_classVarDeclaration1057);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_classVarDeclaration1059);
            variableDeclaratorList6=variableDeclaratorList();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          // we could also check modifiers and type, but right know the state variable
                          // is detected known only by it's name
                          // (modifierList5!=null?modifierList5.modifiers:null)

                          if ((variableDeclaratorList6!=null?variableDeclaratorList6.onlyStates:false)){

                              // no rule is specified, rewrite will delete original tokens
                              performRewrite(new STAttrMap().put("name", "removeVariableDeclaratorList"));
                          }
                      
            }

            }

            if ( state.backtracking==0 ) {

                      cleanupRewrite();
                  
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, classVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classVarDeclaration"

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:312:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final ValidateStateTransitionsParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        ValidateStateTransitionsParser.interfaceTopLevelScope_return retval = new ValidateStateTransitionsParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:313:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:313:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope1090); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:313:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==INTERFACE||LA33_0==FUNCTION_METHOD_DECL||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope1092);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, interfaceTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceTopLevelScope"

    public static class interfaceScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceScopeDeclarations"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:316:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final ValidateStateTransitionsParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        ValidateStateTransitionsParser.interfaceScopeDeclarations_return retval = new ValidateStateTransitionsParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:317:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt39=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt39=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt39=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt39=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:317:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations1114); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1116);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:317:45: ( genericTypeParameterList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1118);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations1121);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations1123); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations1125);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:317:102: ( arrayDeclaratorList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations1127);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:317:123: ( throwsClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THROWS_CLAUSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations1130);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:318:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations1143); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1145);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:318:41: ( genericTypeParameterList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1147);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations1150); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations1152);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:318:93: ( throwsClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THROWS_CLAUSE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations1154);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:322:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1245); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1247);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations1249);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1251);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:323:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1262);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, interfaceScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceScopeDeclarations"

    public static class variableDeclaratorList_return extends TreeRuleReturnScope {
        public boolean onlyStates;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:326:1: variableDeclaratorList returns [boolean onlyStates] : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final ValidateStateTransitionsParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        ValidateStateTransitionsParser.variableDeclaratorList_return retval = new ValidateStateTransitionsParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        ValidateStateTransitionsParser.variableDeclarator_return variableDeclarator7 = null;



                retval.onlyStates = true;
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:333:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:333:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1297); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:334:13: ( variableDeclarator )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==VAR_DECLARATOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:335:17: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList1329);
            	    variableDeclarator7=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.onlyStates =retval.onlyStates && (variableDeclarator7!=null?variableDeclarator7.isState:false);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, variableDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorList"

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public boolean isState;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:340:1: variableDeclarator returns [boolean isState] : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final ValidateStateTransitionsParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        ValidateStateTransitionsParser.variableDeclarator_return retval = new ValidateStateTransitionsParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        ValidateStateTransitionsParser.variableDeclaratorId_return variableDeclaratorId8 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:344:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:344:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator1397); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1411);
            variableDeclaratorId8=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                              retval.isState = (variableDeclaratorId8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId8.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId8.start))):null).matches(getParamS("stateConstants"));
                              if (retval.isState){
                                  getLogger().fine("Detected state variable "+(variableDeclaratorId8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId8.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId8.start))):null));
                                  knownStates.put((variableDeclaratorId8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId8.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId8.start))):null), new State((variableDeclaratorId8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId8.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId8.start))):null)));
                                  // original declaration is deleted
                                  tokens.delete(
                                      input.getTreeAdaptor().getTokenStartIndex(((CommonTree)retval.start)),
                                      input.getTreeAdaptor().getTokenStopIndex(((CommonTree)retval.start))
                                  );
                              }
                          
            }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:358:13: ( variableInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1439);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorId"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:362:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final ValidateStateTransitionsParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        ValidateStateTransitionsParser.variableDeclaratorId_return retval = new ValidateStateTransitionsParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:363:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:363:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId1470); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:363:17: ( arrayDeclaratorList )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1472);
                        arrayDeclaratorList();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, variableDeclaratorId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableInitializer"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:366:1: variableInitializer : ( arrayInitializer | expression );
    public final ValidateStateTransitionsParser.variableInitializer_return variableInitializer() throws RecognitionException {
        ValidateStateTransitionsParser.variableInitializer_return retval = new ValidateStateTransitionsParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:367:5: ( arrayInitializer | expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAY_INITIALIZER) ) {
                alt43=1;
            }
            else if ( (LA43_0==EXPR) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:367:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1493);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:368:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1503);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, variableInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclarator"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:371:1: arrayDeclarator : LBRACK RBRACK ;
    public final ValidateStateTransitionsParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        ValidateStateTransitionsParser.arrayDeclarator_return retval = new ValidateStateTransitionsParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:372:5: ( LBRACK RBRACK )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:372:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1522); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1524); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, arrayDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclarator"

    public static class arrayDeclaratorList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclaratorList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:375:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final ValidateStateTransitionsParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        ValidateStateTransitionsParser.arrayDeclaratorList_return retval = new ValidateStateTransitionsParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:376:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:376:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1544); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:376:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1546); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, arrayDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaratorList"

    public static class arrayInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayInitializer"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:379:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final ValidateStateTransitionsParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        ValidateStateTransitionsParser.arrayInitializer_return retval = new ValidateStateTransitionsParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:380:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:380:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1568); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:380:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1570);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, arrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class throwsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "throwsClause"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:383:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final ValidateStateTransitionsParser.throwsClause_return throwsClause() throws RecognitionException {
        ValidateStateTransitionsParser.throwsClause_return retval = new ValidateStateTransitionsParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:384:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:384:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1592); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:384:25: ( qualifiedIdentifier )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==DOT||LA46_0==IDENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1594);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, throwsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "throwsClause"

    public static class modifierList_return extends TreeRuleReturnScope {
        public Set modifiers;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifierList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:387:1: modifierList returns [Set modifiers] : ^( MODIFIER_LIST ( modifier )* ) ;
    public final ValidateStateTransitionsParser.modifierList_return modifierList() throws RecognitionException {
        ValidateStateTransitionsParser.modifierList_return retval = new ValidateStateTransitionsParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        ValidateStateTransitionsParser.modifier_return modifier9 = null;



                retval.modifiers = new HashSet<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:391:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:391:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1629); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:391:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AT||LA47_0==ABSTRACT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0>=PRIVATE && LA47_0<=PUBLIC)||(LA47_0>=STATIC && LA47_0<=STRICTFP)||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:391:26: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1632);
                	    modifier9=modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      retval.modifiers.add((modifier9!=null?(input.getTokenStream().toString(
                	        input.getTreeAdaptor().getTokenStartIndex(modifier9.start),
                	        input.getTreeAdaptor().getTokenStopIndex(modifier9.start))):null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, modifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifierList"

    public static class modifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifier"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:394:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final ValidateStateTransitionsParser.modifier_return modifier() throws RecognitionException {
        ValidateStateTransitionsParser.modifier_return retval = new ValidateStateTransitionsParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:395:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt48=11;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:395:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1656); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:396:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1666); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:397:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1676); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:398:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1686); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:399:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1696); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:400:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1706); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:401:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1716); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:402:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1726); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:403:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1736); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:404:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1746); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:405:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1756);
                    localModifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class localModifierList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localModifierList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:408:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final ValidateStateTransitionsParser.localModifierList_return localModifierList() throws RecognitionException {
        ValidateStateTransitionsParser.localModifierList_return retval = new ValidateStateTransitionsParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:409:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:409:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1776); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:409:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1778);
                	    localModifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop49;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, localModifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifierList"

    public static class localModifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localModifier"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:412:1: localModifier : ( FINAL | annotation );
    public final ValidateStateTransitionsParser.localModifier_return localModifier() throws RecognitionException {
        ValidateStateTransitionsParser.localModifier_return retval = new ValidateStateTransitionsParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:413:5: ( FINAL | annotation )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FINAL) ) {
                alt50=1;
            }
            else if ( (LA50_0==AT) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:413:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1799); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:414:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1809);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, localModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifier"

    public static class type_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:417:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final ValidateStateTransitionsParser.type_return type() throws RecognitionException {
        ValidateStateTransitionsParser.type_return retval = new ValidateStateTransitionsParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1829); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:16: ( primitiveType | qualifiedTypeIdent )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==BOOLEAN||LA51_0==BYTE||LA51_0==CHAR||LA51_0==DOUBLE||LA51_0==FLOAT||(LA51_0>=INT && LA51_0<=LONG)||LA51_0==SHORT) ) {
                alt51=1;
            }
            else if ( (LA51_0==QUALIFIED_TYPE_IDENT) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1832);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1836);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:418:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1839);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class qualifiedTypeIdent_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedTypeIdent"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:421:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final ValidateStateTransitionsParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        ValidateStateTransitionsParser.qualifiedTypeIdent_return retval = new ValidateStateTransitionsParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:422:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:422:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1861); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:422:32: ( typeIdent )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==IDENT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1863);
            	    typeIdent();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, qualifiedTypeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedTypeIdent"

    public static class typeIdent_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeIdent"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:425:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final ValidateStateTransitionsParser.typeIdent_return typeIdent() throws RecognitionException {
        ValidateStateTransitionsParser.typeIdent_return retval = new ValidateStateTransitionsParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:426:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:426:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1885); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:426:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1887);
                        genericTypeArgumentList();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, typeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeIdent"

    public static class primitiveType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primitiveType"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:429:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final ValidateStateTransitionsParser.primitiveType_return primitiveType() throws RecognitionException {
        ValidateStateTransitionsParser.primitiveType_return retval = new ValidateStateTransitionsParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:430:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:
            {
            if ( input.LA(1)==BOOLEAN||input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||(input.LA(1)>=INT && input.LA(1)<=LONG)||input.LA(1)==SHORT ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class genericTypeArgumentList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeArgumentList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:440:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final ValidateStateTransitionsParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        ValidateStateTransitionsParser.genericTypeArgumentList_return retval = new ValidateStateTransitionsParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:441:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:441:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1998); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:441:33: ( genericTypeArgument )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==QUESTION||LA55_0==TYPE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList2000);
            	    genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, genericTypeArgumentList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgumentList"

    public static class genericTypeArgument_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeArgument"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:444:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final ValidateStateTransitionsParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        ValidateStateTransitionsParser.genericTypeArgument_return retval = new ValidateStateTransitionsParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:445:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==TYPE) ) {
                alt57=1;
            }
            else if ( (LA57_0==QUESTION) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:445:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument2021);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:446:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument2032); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:446:20: ( genericWildcardBoundType )?
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==EXTENDS||LA56_0==SUPER) ) {
                            alt56=1;
                        }
                        switch (alt56) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument2034);
                                genericWildcardBoundType();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, genericTypeArgument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgument"

    public static class genericWildcardBoundType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericWildcardBoundType"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:449:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final ValidateStateTransitionsParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        ValidateStateTransitionsParser.genericWildcardBoundType_return retval = new ValidateStateTransitionsParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:450:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EXTENDS) ) {
                alt58=1;
            }
            else if ( (LA58_0==SUPER) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:450:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType2056); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType2058);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:451:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType2070); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType2072);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, genericWildcardBoundType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericWildcardBoundType"

    public static class formalParameterList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:454:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final ValidateStateTransitionsParser.formalParameterList_return formalParameterList() throws RecognitionException {
        ValidateStateTransitionsParser.formalParameterList_return retval = new ValidateStateTransitionsParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:455:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:455:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList2093); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:455:29: ( formalParameterStandardDecl )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==FORMAL_PARAM_STD_DECL) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList2095);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:455:58: ( formalParameterVarargDecl )?
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt60=1;
                }
                switch (alt60) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList2098);
                        formalParameterVarargDecl();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, formalParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class formalParameterStandardDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterStandardDecl"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:458:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final ValidateStateTransitionsParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        ValidateStateTransitionsParser.formalParameterStandardDecl_return retval = new ValidateStateTransitionsParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:459:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:459:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl2120); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl2122);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl2124);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl2126);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, formalParameterStandardDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterStandardDecl"

    public static class formalParameterVarargDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterVarargDecl"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:462:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final ValidateStateTransitionsParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        ValidateStateTransitionsParser.formalParameterVarargDecl_return retval = new ValidateStateTransitionsParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:463:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:463:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2147); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl2149);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl2151);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2153);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, formalParameterVarargDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterVarargDecl"

    public static class qualifiedIdentifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedIdentifier"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:466:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final ValidateStateTransitionsParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        ValidateStateTransitionsParser.qualifiedIdentifier_return retval = new ValidateStateTransitionsParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:467:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENT) ) {
                alt61=1;
            }
            else if ( (LA61_0==DOT) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:467:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2173); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:468:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier2184); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2186);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2188); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, qualifiedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class annotationList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:473:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final ValidateStateTransitionsParser.annotationList_return annotationList() throws RecognitionException {
        ValidateStateTransitionsParser.annotationList_return retval = new ValidateStateTransitionsParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:474:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:474:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList2211); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:474:27: ( annotation )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList2213);
                	    annotation();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop62;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, annotationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationList"

    public static class annotation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotation"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:477:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final ValidateStateTransitionsParser.annotation_return annotation() throws RecognitionException {
        ValidateStateTransitionsParser.annotation_return retval = new ValidateStateTransitionsParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:478:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:478:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation2235); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation2237);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:478:34: ( annotationInit )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ANNOTATION_INIT_BLOCK) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation2239);
                    annotationInit();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, annotation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class annotationInit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInit"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:481:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final ValidateStateTransitionsParser.annotationInit_return annotationInit() throws RecognitionException {
        ValidateStateTransitionsParser.annotationInit_return retval = new ValidateStateTransitionsParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:482:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:482:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2261); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit2263);
            annotationInitializers();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, annotationInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInit"

    public static class annotationInitializers_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInitializers"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:485:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final ValidateStateTransitionsParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        ValidateStateTransitionsParser.annotationInitializers_return retval = new ValidateStateTransitionsParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:486:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt65=1;
            }
            else if ( (LA65_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:486:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2284); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:486:36: ( annotationInitializer )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==IDENT) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers2286);
                    	    annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:487:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2299); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers2301);
                    annotationElementValue();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, annotationInitializers_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializers"

    public static class annotationInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInitializer"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:490:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final ValidateStateTransitionsParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        ValidateStateTransitionsParser.annotationInitializer_return retval = new ValidateStateTransitionsParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:491:5: ( ^( IDENT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:491:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer2322); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer2324);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, annotationInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializer"

    public static class annotationElementValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationElementValue"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:494:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final ValidateStateTransitionsParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        ValidateStateTransitionsParser.annotationElementValue_return retval = new ValidateStateTransitionsParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:495:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt67=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt67=1;
                }
                break;
            case AT:
                {
                alt67=2;
                }
                break;
            case EXPR:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:495:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2345); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:495:41: ( annotationElementValue )*
                        loop66:
                        do {
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==AT||LA66_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA66_0==EXPR) ) {
                                alt66=1;
                            }


                            switch (alt66) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue2347);
                        	    annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop66;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:496:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2359);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:497:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue2369);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, annotationElementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationElementValue"

    public static class annotationTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationTopLevelScope"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:500:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final ValidateStateTransitionsParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        ValidateStateTransitionsParser.annotationTopLevelScope_return retval = new ValidateStateTransitionsParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:501:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:501:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2389); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:501:38: ( annotationScopeDeclarations )*
                loop68:
                do {
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AT||LA68_0==CLASS||LA68_0==ENUM||LA68_0==INTERFACE||LA68_0==ANNOTATION_METHOD_DECL||LA68_0==VAR_DECLARATION) ) {
                        alt68=1;
                    }


                    switch (alt68) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2391);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop68;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, annotationTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTopLevelScope"

    public static class annotationScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationScopeDeclarations"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:504:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final ValidateStateTransitionsParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        ValidateStateTransitionsParser.annotationScopeDeclarations_return retval = new ValidateStateTransitionsParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:505:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt70=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt70=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt70=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:505:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2413); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2415);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2417);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2419); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:505:58: ( annotationDefaultValue )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DEFAULT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2421);
                            annotationDefaultValue();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:506:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2434); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2436);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2438);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2440);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:507:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2451);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, annotationScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationScopeDeclarations"

    public static class annotationDefaultValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationDefaultValue"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:510:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final ValidateStateTransitionsParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        ValidateStateTransitionsParser.annotationDefaultValue_return retval = new ValidateStateTransitionsParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:511:5: ( ^( DEFAULT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:511:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2471); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2473);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, annotationDefaultValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationDefaultValue"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:516:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final ValidateStateTransitionsParser.block_return block() throws RecognitionException {
        ValidateStateTransitionsParser.block_return retval = new ValidateStateTransitionsParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:517:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:517:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2496); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:517:23: ( blockStatement )*
                loop71:
                do {
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==AT||LA71_0==SEMI||LA71_0==ASSERT||LA71_0==BREAK||(LA71_0>=CLASS && LA71_0<=CONTINUE)||LA71_0==DO||LA71_0==ENUM||(LA71_0>=FOR && LA71_0<=IF)||LA71_0==INTERFACE||LA71_0==RETURN||(LA71_0>=SWITCH && LA71_0<=SYNCHRONIZED)||LA71_0==THROW||LA71_0==TRY||LA71_0==WHILE||LA71_0==BLOCK_SCOPE||LA71_0==EXPR||LA71_0==FOR_EACH||LA71_0==LABELED_STATEMENT||LA71_0==VAR_DECLARATION) ) {
                        alt71=1;
                    }


                    switch (alt71) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2498);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop71;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:520:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final ValidateStateTransitionsParser.blockStatement_return blockStatement() throws RecognitionException {
        ValidateStateTransitionsParser.blockStatement_return retval = new ValidateStateTransitionsParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:521:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt72=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt72=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt72=2;
                }
                break;
            case SEMI:
            case ASSERT:
            case BREAK:
            case CONTINUE:
            case DO:
            case FOR:
            case IF:
            case RETURN:
            case SWITCH:
            case SYNCHRONIZED:
            case THROW:
            case TRY:
            case WHILE:
            case BLOCK_SCOPE:
            case EXPR:
            case FOR_EACH:
            case LABELED_STATEMENT:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:521:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2519);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:522:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2529);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:523:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2539);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableDeclaration"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:526:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final ValidateStateTransitionsParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.localVariableDeclaration_return retval = new ValidateStateTransitionsParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:527:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:527:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2559); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2561);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2563);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2565);
            variableDeclaratorList();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, localVariableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:531:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final ValidateStateTransitionsParser.statement_return statement() throws RecognitionException {
        ValidateStateTransitionsParser.statement_return retval = new ValidateStateTransitionsParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:532:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt80=17;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:532:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2586);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:533:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2597); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2599);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:533:29: ( expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==EXPR) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2601);
                            expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:534:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2614); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2616);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2618);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:534:48: ( statement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==SEMI||LA74_0==ASSERT||LA74_0==BREAK||LA74_0==CONTINUE||LA74_0==DO||(LA74_0>=FOR && LA74_0<=IF)||LA74_0==RETURN||(LA74_0>=SWITCH && LA74_0<=SYNCHRONIZED)||LA74_0==THROW||LA74_0==TRY||LA74_0==WHILE||LA74_0==BLOCK_SCOPE||LA74_0==EXPR||LA74_0==FOR_EACH||LA74_0==LABELED_STATEMENT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2620);
                            statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:535:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2633); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2635);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2637);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2639);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2641);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:536:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2653); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2655);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2657);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2659); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2661);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2663);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:537:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2675); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2677);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2679);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:538:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2691); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2693);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2695);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:539:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2707); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2709);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:539:21: ( catches )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2711);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:539:30: ( block )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BLOCK_SCOPE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement2714);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:540:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2729); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2731);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2733);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:541:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2745); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2747);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2749);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:542:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2761); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:542:18: ( expression )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==EXPR) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2763);
                                expression();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:543:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2776); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2778);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:544:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2790); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:544:17: ( IDENT )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==IDENT) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2792); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:545:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2805); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:545:20: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2807); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:546:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2820); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2822); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2824);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:547:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2835);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:548:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2845); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class catches_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catches"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:551:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final ValidateStateTransitionsParser.catches_return catches() throws RecognitionException {
        ValidateStateTransitionsParser.catches_return retval = new ValidateStateTransitionsParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:552:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:552:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2866); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:552:29: ( catchClause )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==CATCH) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2868);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, catches_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catches"

    public static class catchClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catchClause"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:555:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final ValidateStateTransitionsParser.catchClause_return catchClause() throws RecognitionException {
        ValidateStateTransitionsParser.catchClause_return retval = new ValidateStateTransitionsParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:556:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:556:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2890); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2892);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2894);
            block();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, catchClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class switchBlockLabels_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchBlockLabels"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:559:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final ValidateStateTransitionsParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        ValidateStateTransitionsParser.switchBlockLabels_return retval = new ValidateStateTransitionsParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2915); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:35: ( switchCaseLabel )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CASE) ) {
                        int LA82_2 = input.LA(2);

                        if ( (synpred125_ValidateStateTransitionsParser()) ) {
                            alt82=1;
                        }


                    }


                    switch (alt82) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2917);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:52: ( switchDefaultLabel )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DEFAULT) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2920);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:72: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2923);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, switchBlockLabels_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchBlockLabels"

    public static class switchCaseLabel_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchCaseLabel"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:563:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final ValidateStateTransitionsParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        ValidateStateTransitionsParser.switchCaseLabel_return retval = new ValidateStateTransitionsParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:564:5: ( ^( CASE expression ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:564:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2945); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2947);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:564:27: ( blockStatement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT||LA85_0==SEMI||LA85_0==ASSERT||LA85_0==BREAK||(LA85_0>=CLASS && LA85_0<=CONTINUE)||LA85_0==DO||LA85_0==ENUM||(LA85_0>=FOR && LA85_0<=IF)||LA85_0==INTERFACE||LA85_0==RETURN||(LA85_0>=SWITCH && LA85_0<=SYNCHRONIZED)||LA85_0==THROW||LA85_0==TRY||LA85_0==WHILE||LA85_0==BLOCK_SCOPE||LA85_0==EXPR||LA85_0==FOR_EACH||LA85_0==LABELED_STATEMENT||LA85_0==VAR_DECLARATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2949);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, switchCaseLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchCaseLabel"

    public static class switchDefaultLabel_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchDefaultLabel"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:567:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final ValidateStateTransitionsParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        ValidateStateTransitionsParser.switchDefaultLabel_return retval = new ValidateStateTransitionsParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:568:5: ( ^( DEFAULT ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:568:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2971); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:568:19: ( blockStatement )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2973);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop86;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, switchDefaultLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchDefaultLabel"

    public static class forInit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forInit"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:571:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final ValidateStateTransitionsParser.forInit_return forInit() throws RecognitionException {
        ValidateStateTransitionsParser.forInit_return retval = new ValidateStateTransitionsParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2995); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:20: ( localVariableDeclaration | ( expression )* )?
                int alt88=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt88=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt88=2;
                        }
                        break;
                    case UP:
                        {
                        int LA88_3 = input.LA(2);

                        if ( (synpred132_ValidateStateTransitionsParser()) ) {
                            alt88=2;
                        }
                        }
                        break;
                }

                switch (alt88) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2998);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:48: ( expression )*
                        {
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:48: ( expression )*
                        loop87:
                        do {
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==EXPR) ) {
                                alt87=1;
                            }


                            switch (alt87) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit3002);
                        	    expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop87;
                            }
                        } while (true);


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forCondition"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:575:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final ValidateStateTransitionsParser.forCondition_return forCondition() throws RecognitionException {
        ValidateStateTransitionsParser.forCondition_return retval = new ValidateStateTransitionsParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:576:5: ( ^( FOR_CONDITION ( expression )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:576:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition3026); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:576:25: ( expression )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==EXPR) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition3028);
                        expression();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, forCondition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdater_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forUpdater"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:579:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final ValidateStateTransitionsParser.forUpdater_return forUpdater() throws RecognitionException {
        ValidateStateTransitionsParser.forUpdater_return retval = new ValidateStateTransitionsParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:580:5: ( ^( FOR_UPDATE ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:580:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater3050); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:580:22: ( expression )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EXPR) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater3052);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, forUpdater_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdater"

    public static class parenthesizedExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parenthesizedExpression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:585:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final ValidateStateTransitionsParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        ValidateStateTransitionsParser.parenthesizedExpression_return retval = new ValidateStateTransitionsParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:586:5: ( ^( PARENTESIZED_EXPR expression ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:586:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3076); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression3078);
            expression();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, parenthesizedExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenthesizedExpression"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:589:1: expression : ^( EXPR expr ) ;
    public final ValidateStateTransitionsParser.expression_return expression() throws RecognitionException {
        ValidateStateTransitionsParser.expression_return retval = new ValidateStateTransitionsParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:590:5: ( ^( EXPR expr ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:590:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression3099); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression3101);
            expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:593:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final ValidateStateTransitionsParser.expr_return expr() throws RecognitionException {
        ValidateStateTransitionsParser.expr_return retval = new ValidateStateTransitionsParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:594:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt91=43;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:594:9: ^( ASSIGN expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr3122); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3124);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3126);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:595:9: ^( PLUS_ASSIGN expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr3138); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3140);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3142);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:596:9: ^( MINUS_ASSIGN expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr3154); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3156);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3158);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:597:9: ^( STAR_ASSIGN expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr3170); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3172);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3174);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:598:9: ^( DIV_ASSIGN expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr3186); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3188);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3190);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:599:9: ^( AND_ASSIGN expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr3202); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3204);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3206);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:600:9: ^( OR_ASSIGN expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr3218); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3220);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3222);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:601:9: ^( XOR_ASSIGN expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr3234); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3236);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3238);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:602:9: ^( MOD_ASSIGN expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr3250); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3252);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3254);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:603:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3266); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3268);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3270);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:604:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3282); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3284);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3286);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:605:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3298); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3300);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3302);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:606:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3314); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3316);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3318);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3320);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:607:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3332); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3334);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3336);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:608:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3348); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3350);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3352);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:609:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3364); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3366);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3368);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:610:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3380); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3382);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3384);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:611:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3396); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3398);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3400);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:612:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3412); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3414);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3416);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:613:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3428); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3430);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3432);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:614:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3444); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3446);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3448);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:615:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3460); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3462);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3464);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:616:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3476); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3478);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3480);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:617:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3492); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3494);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3496);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:618:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3508); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3510);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3512);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:619:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3524); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3526);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3528);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:620:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3540); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3542);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3544);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:621:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3556); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3558);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3560);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 29 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:622:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3572); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3574);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3576);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 30 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:623:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3588); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3590);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3592);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 31 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:624:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3604); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3606);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3608);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 32 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:625:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3620); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3622);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3624);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 33 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:626:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3636); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3638);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3640);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 34 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:627:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3652); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3654);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 35 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:628:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3666); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3668);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 36 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:629:9: ^( PRE_INC expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3680); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3682);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 37 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:630:9: ^( PRE_DEC expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3694); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3696);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 38 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:631:9: ^( POST_INC expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr3708); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3710);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 39 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:632:9: ^( POST_DEC expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3722); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3724);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 40 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:633:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3736); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3738);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 41 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:634:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3750); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3752);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 42 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:635:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3764); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3766);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3768);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 43 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:636:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3779);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class primaryExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:639:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final ValidateStateTransitionsParser.primaryExpression_return primaryExpression() throws RecognitionException {
        ValidateStateTransitionsParser.primaryExpression_return retval = new ValidateStateTransitionsParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:640:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt95=11;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:640:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3801); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:641:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt93=3;
                    switch ( input.LA(1) ) {
                    case DOT:
                    case FALSE:
                    case NULL:
                    case SUPER:
                    case THIS:
                    case TRUE:
                    case ARRAY_DECLARATOR:
                    case ARRAY_ELEMENT_ACCESS:
                    case CLASS_CONSTRUCTOR_CALL:
                    case METHOD_CALL:
                    case PARENTESIZED_EXPR:
                    case STATIC_ARRAY_CREATOR:
                    case SUPER_CONSTRUCTOR_CALL:
                    case THIS_CONSTRUCTOR_CALL:
                    case IDENT:
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case DECIMAL_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case CHARACTER_LITERAL:
                    case STRING_LITERAL:
                        {
                        alt93=1;
                        }
                        break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                        {
                        alt93=2;
                        }
                        break;
                    case VOID:
                        {
                        alt93=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:641:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3819);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:642:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt92=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt92=1;
                                }
                                break;
                            case THIS:
                                {
                                alt92=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt92=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt92=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt92=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 92, 0, input);

                                throw nvae;
                            }

                            switch (alt92) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:642:21: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3841); if (state.failed) return retval;

                                    }
                                    break;
                                case 2 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:643:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3863); if (state.failed) return retval;

                                    }
                                    break;
                                case 3 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:644:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3885); if (state.failed) return retval;

                                    }
                                    break;
                                case 4 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:645:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3907);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:646:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3929); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:648:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression3965);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3967); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:649:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression3985); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3987); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:652:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression4021);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:653:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4031); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:654:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression4042); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4044);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:654:41: ( genericTypeArgumentList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression4046);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_primaryExpression4049);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:655:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression4060);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:656:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4071); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4073);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression4075);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:657:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4086);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:658:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression4096);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:659:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression4106); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:660:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4116);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:661:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4126); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class explicitConstructorCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "explicitConstructorCall"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:664:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final ValidateStateTransitionsParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        ValidateStateTransitionsParser.explicitConstructorCall_return retval = new ValidateStateTransitionsParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:665:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==THIS_CONSTRUCTOR_CALL) ) {
                alt99=1;
            }
            else if ( (LA99_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:665:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4146); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:665:33: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4148);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4151);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:666:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4163); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:666:34: ( primaryExpression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DOT||LA97_0==FALSE||LA97_0==NULL||LA97_0==SUPER||LA97_0==THIS||LA97_0==TRUE||LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==METHOD_CALL||LA97_0==PARENTESIZED_EXPR||(LA97_0>=STATIC_ARRAY_CREATOR && LA97_0<=SUPER_CONSTRUCTOR_CALL)||LA97_0==THIS_CONSTRUCTOR_CALL||(LA97_0>=IDENT && LA97_0<=STRING_LITERAL)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4165);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:666:53: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4168);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4171);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, explicitConstructorCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorCall"

    public static class arrayTypeDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayTypeDeclarator"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:669:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final ValidateStateTransitionsParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        ValidateStateTransitionsParser.arrayTypeDeclarator_return retval = new ValidateStateTransitionsParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4192); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt100=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt100=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt100=2;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4195);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4199);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:670:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4203);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, arrayTypeDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayTypeDeclarator"

    public static class newExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newExpression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:673:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final ValidateStateTransitionsParser.newExpression_return newExpression() throws RecognitionException {
        ValidateStateTransitionsParser.newExpression_return retval = new ValidateStateTransitionsParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:674:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==STATIC_ARRAY_CREATOR) ) {
                alt105=1;
            }
            else if ( (LA105_0==CLASS_CONSTRUCTOR_CALL) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:674:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4227); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:675:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==BOOLEAN||LA102_0==BYTE||LA102_0==CHAR||LA102_0==DOUBLE||LA102_0==FLOAT||(LA102_0>=INT && LA102_0<=LONG)||LA102_0==SHORT) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==GENERIC_TYPE_ARG_LIST||LA102_0==QUALIFIED_TYPE_IDENT) ) {
                        alt102=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:675:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression4245);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4247);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:676:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:676:17: ( genericTypeArgumentList )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4265);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4268);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4270);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:679:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4305); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:679:34: ( genericTypeArgumentList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4307);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4310);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4312);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:679:88: ( classTopLevelScope )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4314);
                            classTopLevelScope();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, newExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class innerNewExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "innerNewExpression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:682:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final ValidateStateTransitionsParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        ValidateStateTransitionsParser.innerNewExpression_return retval = new ValidateStateTransitionsParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:683:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:683:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4337); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:683:34: ( genericTypeArgumentList )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4339);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4342); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4344);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:683:75: ( classTopLevelScope )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4346);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, innerNewExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "innerNewExpression"

    public static class newArrayConstruction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newArrayConstruction"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:686:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final ValidateStateTransitionsParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        ValidateStateTransitionsParser.newArrayConstruction_return retval = new ValidateStateTransitionsParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:687:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ARRAY_DECLARATOR_LIST) ) {
                alt110=1;
            }
            else if ( (LA110_0==EXPR) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:687:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4367);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4369);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:688:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:688:9: ( expression )+
                    int cnt108=0;
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==EXPR) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4379);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt108 >= 1 ) break loop108;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(108, input);
                                throw eee;
                        }
                        cnt108++;
                    } while (true);

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:688:21: ( arrayDeclaratorList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4382);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, newArrayConstruction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newArrayConstruction"

    public static class arguments_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:691:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final ValidateStateTransitionsParser.arguments_return arguments() throws RecognitionException {
        ValidateStateTransitionsParser.arguments_return retval = new ValidateStateTransitionsParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:692:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:692:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4403); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:692:25: ( expression )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==EXPR) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4405);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop111;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:695:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final ValidateStateTransitionsParser.literal_return literal() throws RecognitionException {
        ValidateStateTransitionsParser.literal_return retval = new ValidateStateTransitionsParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:696:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:
            {
            if ( input.LA(1)==FALSE||input.LA(1)==NULL||input.LA(1)==TRUE||(input.LA(1)>=HEX_LITERAL && input.LA(1)<=STRING_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class additionalCode_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additionalCode"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:707:1: additionalCode[CommonTree tree] : ;
    public final ValidateStateTransitionsParser.additionalCode_return additionalCode(CommonTree tree) throws RecognitionException {
        ValidateStateTransitionsParser.additionalCode_return retval = new ValidateStateTransitionsParser.additionalCode_return();
        retval.start = input.LT(1);
        int additionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:708:5: ()
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:709:9: 
            {
            if ( state.backtracking==0 ) {

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

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, additionalCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalCode"

    // $ANTLR start synpred125_ValidateStateTransitionsParser
    public final void synpred125_ValidateStateTransitionsParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:35: ( switchCaseLabel )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:560:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred125_ValidateStateTransitionsParser2917);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_ValidateStateTransitionsParser

    // $ANTLR start synpred132_ValidateStateTransitionsParser
    public final void synpred132_ValidateStateTransitionsParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:48: ( ( expression )* )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:48: ( expression )*
        {
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:572:48: ( expression )*
        loop135:
        do {
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EXPR) ) {
                alt135=1;
            }


            switch (alt135) {
        	case 1 :
        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred132_ValidateStateTransitionsParser3002);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop135;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred132_ValidateStateTransitionsParser

    // Delegated rules

    public final boolean synpred125_ValidateStateTransitionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_ValidateStateTransitionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_ValidateStateTransitionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_ValidateStateTransitionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA48 dfa48 = new DFA48(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA48_eotS =
        "\14\uffff";
    static final String DFA48_eofS =
        "\14\uffff";
    static final String DFA48_minS =
        "\1\7\13\uffff";
    static final String DFA48_maxS =
        "\1\146\13\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA48_specialS =
        "\14\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\13\55\uffff\1\5\20\uffff\1\13\12\uffff\1\6\3\uffff\1\3\1"+
            "\2\1\1\2\uffff\1\4\1\12\2\uffff\1\7\3\uffff\1\10\3\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "394:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
        }
    }
    static final String DFA80_eotS =
        "\22\uffff";
    static final String DFA80_eofS =
        "\22\uffff";
    static final String DFA80_minS =
        "\1\54\21\uffff";
    static final String DFA80_maxS =
        "\1\u008d\21\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21";
    static final String DFA80_specialS =
        "\22\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\21\11\uffff\1\2\1\uffff\1\15\5\uffff\1\16\1\uffff\1\7\10"+
            "\uffff\1\4\1\3\15\uffff\1\13\4\uffff\1\11\1\12\1\uffff\1\14"+
            "\3\uffff\1\10\2\uffff\1\6\15\uffff\1\1\10\uffff\1\20\3\uffff"+
            "\1\5\12\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "531:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
        }
    }
    static final String DFA91_eotS =
        "\54\uffff";
    static final String DFA91_eofS =
        "\54\uffff";
    static final String DFA91_minS =
        "\1\4\53\uffff";
    static final String DFA91_maxS =
        "\1\u00aa\53\uffff";
    static final String DFA91_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53";
    static final String DFA91_specialS =
        "\54\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\22\1\6\1\1\1\uffff\1\30\1\12\3\uffff\1\40\1\5\1\53\2\uffff"+
            "\1\23\1\27\1\32\3\uffff\1\26\1\34\1\17\1\51\1\16\1\uffff\1\36"+
            "\1\3\1\41\1\11\1\50\1\24\1\20\1\7\1\35\1\2\1\15\4\uffff\1\33"+
            "\1\14\1\31\1\13\1\37\1\4\1\21\1\10\20\uffff\1\53\6\uffff\1\25"+
            "\6\uffff\1\53\10\uffff\1\53\2\uffff\1\53\3\uffff\1\53\15\uffff"+
            "\1\53\1\uffff\1\53\2\uffff\1\52\1\uffff\1\53\27\uffff\1\53\1"+
            "\uffff\1\53\1\47\1\46\1\45\1\44\1\uffff\2\53\1\uffff\1\53\2"+
            "\uffff\1\43\1\42\4\uffff\7\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "593:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );";
        }
    }
    static final String DFA95_eotS =
        "\14\uffff";
    static final String DFA95_eofS =
        "\14\uffff";
    static final String DFA95_minS =
        "\1\17\13\uffff";
    static final String DFA95_maxS =
        "\1\u00aa\13\uffff";
    static final String DFA95_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA95_specialS =
        "\14\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\65\uffff\1\7\15\uffff\1\7\10\uffff\1\13\2\uffff\1\11\3"+
            "\uffff\1\7\15\uffff\1\12\1\uffff\1\6\4\uffff\1\10\27\uffff\1"+
            "\4\1\uffff\1\2\5\uffff\1\10\1\5\1\uffff\1\5\10\uffff\1\3\6\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "639:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource141 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource143 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource146 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource149 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration196 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration199 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration227 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration229 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration232 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration235 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration278 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration280 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration299 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause340 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause364 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList388 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound436 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope460 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant487 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant489 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope517 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_additionalCode_in_classTopLevelScope520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionMethodDeclaration_in_classScopeDeclarations569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidMethodDeclaration_in_classScopeDeclarations579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classVarDeclaration_in_classScopeDeclarations589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations607 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations609 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_functionMethodDeclaration661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_functionMethodDeclaration679 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_functionMethodDeclaration697 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_functionMethodDeclaration716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_functionMethodDeclaration734 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_functionMethodDeclaration752 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_functionMethodDeclaration770 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_functionMethodDeclaration789 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_functionMethodDeclaration808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_voidMethodDeclaration871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_voidMethodDeclaration889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_voidMethodDeclaration907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_voidMethodDeclaration926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_voidMethodDeclaration944 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_voidMethodDeclaration962 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_voidMethodDeclaration981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classVarDeclaration1053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classVarDeclaration1055 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classVarDeclaration1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classVarDeclaration1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope1092 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1116 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1118 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations1125 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations1127 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations1143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations1152 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations1154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1247 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList1329 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1411 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId1470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1522 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1546 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1570 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1594 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1632 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1778 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1832 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1836 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1863 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList2000 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument2032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument2034 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType2056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType2058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType2070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType2072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList2093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList2095 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList2098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl2120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl2122 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl2126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl2149 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier2184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList2211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList2213 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation2235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation2237 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation2239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit2263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers2286 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers2301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer2322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer2324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue2347 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2391 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2415 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2419 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2436 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2498 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2561 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2599 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2616 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2618 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2639 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2655 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2659 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2661 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2677 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2709 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_catches_in_statement2711 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement2714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2747 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement2749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2822 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2866 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2868 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2892 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_catchClause2894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2917 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2920 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2923 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2947 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2949 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2973 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit3002 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition3026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition3028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater3050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater3052 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression3078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression3099 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression3101 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr3122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3124 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr3138 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3140 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr3154 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3156 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr3170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3172 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr3186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3188 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr3202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3204 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr3218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3220 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr3234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3236 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr3250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3252 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3268 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3284 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3300 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr3314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3316 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3318 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3334 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3350 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3352 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3364 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3366 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3368 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3382 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3398 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3414 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3416 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3428 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3430 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3446 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3462 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3478 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3494 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3510 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3526 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3540 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3542 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3558 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3574 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3590 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3606 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3622 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3638 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3654 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr3680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr3694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr3708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr3722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3766 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3819 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression3965 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression3985 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3987 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression4042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4044 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression4046 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression4049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4073 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4148 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4165 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4168 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4245 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4268 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4310 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4312 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4342 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4344 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4367 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4379 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4403 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4405 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_ValidateStateTransitionsParser2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred132_ValidateStateTransitionsParser3002 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}