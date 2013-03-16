// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g 2013-02-02 20:06:04

package org.cesta.parsers.java.generated;

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
import org.cesta.parsers.java.AbstractTreeParser;
/**
 * Validate state transformation adds code, that will automatically
 * check state of applet during its lifetime according to defined graph
 * via DOT grammar.
 **/
public class ValidateStateTransitionsParser extends AbstractTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ASSIGN", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "COLON", "COMMA", "DEC", "DIV", "DIV_ASSIGN", "DOT", "DOTSTAR", "ELLIPSIS", "EQUAL", "GREATER_OR_EQUAL", "GREATER_THAN", "INC", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "MINUS", "MINUS_ASSIGN", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "OR", "OR_ASSIGN", "PLUS", "PLUS_ASSIGN", "QUESTION", "RBRACK", "RCURLY", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "STAR", "STAR_ASSIGN", "XOR", "XOR_ASSIGN", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INTERFACE", "IMPORT", "INT", "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "BLOCK_SCOPE", "CAST_EXPR", "CATCH_CLAUSE_LIST", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "CONSTRUCTOR_DECL", "ENUM_TOP_LEVEL_SCOPE", "EXPR", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "INTERFACE_TOP_LEVEL_SCOPE", "IMPLEMENTS_CLAUSE", "LABELED_STATEMENT", "LOCAL_MODIFIER_LIST", "JAVA_SOURCE", "METHOD_CALL", "MODIFIER_LIST", "PARENTESIZED_EXPR", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUALIFIED_TYPE_IDENT", "STATIC_ARRAY_CREATOR", "SUPER_CONSTRUCTOR_CALL", "SWITCH_BLOCK_LABEL_LIST", "THIS_CONSTRUCTOR_CALL", "THROWS_CLAUSE", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID_METHOD_DECL", "IDENT", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "JAVA_ID_START", "JAVA_ID_PART", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288", "289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324", "325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335"
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
    public ValidateStateTransitionsParser_JavaTreeParser gJavaTreeParser;
    // delegators


        public ValidateStateTransitionsParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ValidateStateTransitionsParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[314+1];
             
            gJavaTreeParser = new ValidateStateTransitionsParser_JavaTreeParser(input, state, this);         
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
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g"; }


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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:189:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
    public final ValidateStateTransitionsParser.javaSource_return javaSource() throws RecognitionException {
        ValidateStateTransitionsParser.javaSource_return retval = new ValidateStateTransitionsParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:190:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:191:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            {
            if ( state.backtracking==0 ) {

                          initKnownFunctions();
                      
            }
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource145); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource147);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:194:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource149);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:194:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource152);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:194:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource155);
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
            if ( state.backtracking>0 ) { memoize(input, 289, javaSource_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "javaSource"

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:197:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] ) ;
    public final ValidateStateTransitionsParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        ValidateStateTransitionsParser.classTopLevelScope_return retval = new ValidateStateTransitionsParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:198:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:198:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* additionalCode[(CommonTree)retval.start] )
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope177); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:198:33: ( classScopeDeclarations )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==AT||LA4_0==CLASS||LA4_0==ENUM||LA4_0==INTERFACE||(LA4_0>=CLASS_INSTANCE_INITIALIZER && LA4_0<=CLASS_STATIC_INITIALIZER)||LA4_0==CONSTRUCTOR_DECL||LA4_0==FUNCTION_METHOD_DECL||LA4_0==VAR_DECLARATION||LA4_0==VOID_METHOD_DECL) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope179);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop4;
                    }
                } while (true);

                pushFollow(FOLLOW_additionalCode_in_classTopLevelScope182);
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
            if ( state.backtracking>0 ) { memoize(input, 290, classTopLevelScope_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:201:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | functionMethodDeclaration | voidMethodDeclaration | classVarDeclaration | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final ValidateStateTransitionsParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        ValidateStateTransitionsParser.classScopeDeclarations_return retval = new ValidateStateTransitionsParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:202:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | functionMethodDeclaration | voidMethodDeclaration | classVarDeclaration | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
            int alt7=7;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt7=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt7=2;
                }
                break;
            case FUNCTION_METHOD_DECL:
                {
                alt7=3;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt7=4;
                }
                break;
            case VAR_DECLARATION:
                {
                alt7=5;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt7=6;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:202:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations204); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations206);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:203:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations218); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations220);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:204:9: functionMethodDeclaration
                    {
                    pushFollow(FOLLOW_functionMethodDeclaration_in_classScopeDeclarations231);
                    functionMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:205:9: voidMethodDeclaration
                    {
                    pushFollow(FOLLOW_voidMethodDeclaration_in_classScopeDeclarations241);
                    voidMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:206:9: classVarDeclaration
                    {
                    pushFollow(FOLLOW_classVarDeclaration_in_classScopeDeclarations251);
                    classVarDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:207:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations262); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations264);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:207:41: ( genericTypeParameterList )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations266);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations269);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:207:87: ( throwsClause )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==THROWS_CLAUSE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations271);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classScopeDeclarations274);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:208:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations285);
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
            if ( state.backtracking>0 ) { memoize(input, 291, classScopeDeclarations_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:210:1: functionMethodDeclaration : ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) ;
    public final ValidateStateTransitionsParser.functionMethodDeclaration_return functionMethodDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.functionMethodDeclaration_return retval = new ValidateStateTransitionsParser.functionMethodDeclaration_return();
        retval.start = input.LT(1);
        int functionMethodDeclaration_StartIndex = input.index();
        CommonTree IDENT1=null;
        ValidateStateTransitionsParser_JavaTreeParser.block_return block2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:211:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:212:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
            {
            match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_functionMethodDeclaration323); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_functionMethodDeclaration341);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:215:17: ( genericTypeParameterList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_functionMethodDeclaration359);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_type_in_functionMethodDeclaration378);
            type();

            state._fsp--;
            if (state.failed) return retval;
            IDENT1=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_functionMethodDeclaration396); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterList_in_functionMethodDeclaration414);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:219:17: ( arrayDeclaratorList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ARRAY_DECLARATOR_LIST) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_functionMethodDeclaration432);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:220:17: ( throwsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==THROWS_CLAUSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_functionMethodDeclaration451);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:221:17: ( block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BLOCK_SCOPE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_functionMethodDeclaration470);
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
            if ( state.backtracking>0 ) { memoize(input, 292, functionMethodDeclaration_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:227:1: voidMethodDeclaration : ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) ;
    public final ValidateStateTransitionsParser.voidMethodDeclaration_return voidMethodDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.voidMethodDeclaration_return retval = new ValidateStateTransitionsParser.voidMethodDeclaration_return();
        retval.start = input.LT(1);
        int voidMethodDeclaration_StartIndex = input.index();
        CommonTree IDENT3=null;
        ValidateStateTransitionsParser_JavaTreeParser.block_return block4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:228:5: ( ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:229:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
            {
            match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_voidMethodDeclaration533); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_voidMethodDeclaration551);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:232:17: ( genericTypeParameterList )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_voidMethodDeclaration569);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_voidMethodDeclaration588); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterList_in_voidMethodDeclaration606);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:235:17: ( throwsClause )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==THROWS_CLAUSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_voidMethodDeclaration624);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:236:17: ( block )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BLOCK_SCOPE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: block
                    {
                    pushFollow(FOLLOW_block_in_voidMethodDeclaration643);
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
            if ( state.backtracking>0 ) { memoize(input, 293, voidMethodDeclaration_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:244:1: classVarDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final ValidateStateTransitionsParser.classVarDeclaration_return classVarDeclaration() throws RecognitionException {
        ValidateStateTransitionsParser.classVarDeclaration_return retval = new ValidateStateTransitionsParser.classVarDeclaration_return();
        retval.start = input.LT(1);
        int classVarDeclaration_StartIndex = input.index();
        ValidateStateTransitionsParser.modifierList_return modifierList5 = null;

        ValidateStateTransitionsParser.variableDeclaratorList_return variableDeclaratorList6 = null;



                initRewrite();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:254:5: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:255:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classVarDeclaration715); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classVarDeclaration717);
            modifierList5=modifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_classVarDeclaration719);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_classVarDeclaration721);
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
            if ( state.backtracking>0 ) { memoize(input, 294, classVarDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classVarDeclaration"

    public static class variableDeclaratorList_return extends TreeRuleReturnScope {
        public boolean onlyStates;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorList"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:269:1: variableDeclaratorList returns [boolean onlyStates] : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final ValidateStateTransitionsParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        ValidateStateTransitionsParser.variableDeclaratorList_return retval = new ValidateStateTransitionsParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        ValidateStateTransitionsParser.variableDeclarator_return variableDeclarator7 = null;



                retval.onlyStates = true;
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:276:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:276:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList767); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:277:13: ( variableDeclarator )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==VAR_DECLARATOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:278:17: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList799);
            	    variableDeclarator7=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.onlyStates =retval.onlyStates && (variableDeclarator7!=null?variableDeclarator7.isState:false);
            	    }

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
            if ( state.backtracking>0 ) { memoize(input, 295, variableDeclaratorList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:283:1: variableDeclarator returns [boolean isState] : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final ValidateStateTransitionsParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        ValidateStateTransitionsParser.variableDeclarator_return retval = new ValidateStateTransitionsParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        ValidateStateTransitionsParser_JavaTreeParser.variableDeclaratorId_return variableDeclaratorId8 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:287:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:287:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator867); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator881);
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
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:301:13: ( variableInitializer )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ARRAY_INITIALIZER||LA16_0==EXPR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator909);
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
            if ( state.backtracking>0 ) { memoize(input, 296, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class modifierList_return extends TreeRuleReturnScope {
        public Set modifiers;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifierList"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:305:1: modifierList returns [Set modifiers] : ^( MODIFIER_LIST ( modifier )* ) ;
    public final ValidateStateTransitionsParser.modifierList_return modifierList() throws RecognitionException {
        ValidateStateTransitionsParser.modifierList_return retval = new ValidateStateTransitionsParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        ValidateStateTransitionsParser_JavaTreeParser.modifier_return modifier9 = null;



                retval.modifiers = new HashSet<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:309:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:309:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList953); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:309:25: ( modifier )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==AT||LA17_0==ABSTRACT||LA17_0==FINAL||LA17_0==NATIVE||(LA17_0>=PRIVATE && LA17_0<=PUBLIC)||(LA17_0>=STATIC && LA17_0<=STRICTFP)||LA17_0==SYNCHRONIZED||LA17_0==TRANSIENT||LA17_0==VOLATILE) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:309:26: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList956);
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
                	    break loop17;
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
            if ( state.backtracking>0 ) { memoize(input, 297, modifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifierList"

    public static class additionalCode_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additionalCode"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:314:1: additionalCode[CommonTree tree] : ;
    public final ValidateStateTransitionsParser.additionalCode_return additionalCode(CommonTree tree) throws RecognitionException {
        ValidateStateTransitionsParser.additionalCode_return retval = new ValidateStateTransitionsParser.additionalCode_return();
        retval.start = input.LT(1);
        int additionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:315:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ValidateStateTransitionsParser.g:316:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 298, additionalCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalCode"

    // Delegated rules
    public ValidateStateTransitionsParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }
    public ValidateStateTransitionsParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }
    public ValidateStateTransitionsParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }
    public ValidateStateTransitionsParser_JavaTreeParser.statement_return statement() throws RecognitionException { return gJavaTreeParser.statement(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }
    public ValidateStateTransitionsParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException { return gJavaTreeParser.importDeclaration(); }
    public ValidateStateTransitionsParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }
    public ValidateStateTransitionsParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }
    public ValidateStateTransitionsParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }
    public ValidateStateTransitionsParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }
    public ValidateStateTransitionsParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException { return gJavaTreeParser.blockStatement(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }
    public ValidateStateTransitionsParser_JavaTreeParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException { return gJavaTreeParser.interfaceScopeDeclarations(); }
    public ValidateStateTransitionsParser_JavaTreeParser.block_return block() throws RecognitionException { return gJavaTreeParser.block(); }
    public ValidateStateTransitionsParser_JavaTreeParser.expression_return expression() throws RecognitionException { return gJavaTreeParser.expression(); }
    public ValidateStateTransitionsParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }
    public ValidateStateTransitionsParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }
    public ValidateStateTransitionsParser_JavaTreeParser.arguments_return arguments() throws RecognitionException { return gJavaTreeParser.arguments(); }
    public ValidateStateTransitionsParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException { return gJavaTreeParser.arrayDeclaratorList(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }
    public ValidateStateTransitionsParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }
    public ValidateStateTransitionsParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException { return gJavaTreeParser.parenthesizedExpression(); }
    public ValidateStateTransitionsParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException { return gJavaTreeParser.formalParameterVarargDecl(); }
    public ValidateStateTransitionsParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }
    public ValidateStateTransitionsParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }
    public ValidateStateTransitionsParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }
    public ValidateStateTransitionsParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }
    public ValidateStateTransitionsParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }
    public ValidateStateTransitionsParser_JavaTreeParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException { return gJavaTreeParser.localVariableDeclaration(); }
    public ValidateStateTransitionsParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }
    public ValidateStateTransitionsParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }
    public ValidateStateTransitionsParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }
    public ValidateStateTransitionsParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException { return gJavaTreeParser.formalParameterStandardDecl(); }
    public ValidateStateTransitionsParser_JavaTreeParser.modifier_return modifier() throws RecognitionException { return gJavaTreeParser.modifier(); }
    public ValidateStateTransitionsParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }
    public ValidateStateTransitionsParser_JavaTreeParser.expr_return expr() throws RecognitionException { return gJavaTreeParser.expr(); }
    public ValidateStateTransitionsParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }
    public ValidateStateTransitionsParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }
    public ValidateStateTransitionsParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }
    public ValidateStateTransitionsParser_JavaTreeParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException { return gJavaTreeParser.variableDeclaratorId(); }
    public ValidateStateTransitionsParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }
    public ValidateStateTransitionsParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }
    public ValidateStateTransitionsParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }
    public ValidateStateTransitionsParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }
    public ValidateStateTransitionsParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }
    public ValidateStateTransitionsParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }
    public ValidateStateTransitionsParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }
    public ValidateStateTransitionsParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }
    public ValidateStateTransitionsParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }
    public ValidateStateTransitionsParser_JavaTreeParser.primaryExpression_return primaryExpression() throws RecognitionException { return gJavaTreeParser.primaryExpression(); }
    public ValidateStateTransitionsParser_JavaTreeParser.typeDeclaration_return typeDeclaration() throws RecognitionException { return gJavaTreeParser.typeDeclaration(); }
    public ValidateStateTransitionsParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }
    public ValidateStateTransitionsParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException { return gJavaTreeParser.localModifier(); }
    public ValidateStateTransitionsParser_JavaTreeParser.variableInitializer_return variableInitializer() throws RecognitionException { return gJavaTreeParser.variableInitializer(); }
    public ValidateStateTransitionsParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }
    public ValidateStateTransitionsParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }
    public ValidateStateTransitionsParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }
    public ValidateStateTransitionsParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }
    public ValidateStateTransitionsParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }


 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource147 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource149 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource152 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource155 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope179 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_additionalCode_in_classTopLevelScope182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_functionMethodDeclaration_in_classScopeDeclarations231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidMethodDeclaration_in_classScopeDeclarations241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classVarDeclaration_in_classScopeDeclarations251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations269 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations271 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_functionMethodDeclaration323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_functionMethodDeclaration341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_functionMethodDeclaration359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_functionMethodDeclaration378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_functionMethodDeclaration396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_functionMethodDeclaration414 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_functionMethodDeclaration432 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_functionMethodDeclaration451 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_functionMethodDeclaration470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_voidMethodDeclaration533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_voidMethodDeclaration551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_voidMethodDeclaration569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_voidMethodDeclaration588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_voidMethodDeclaration606 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_voidMethodDeclaration624 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_voidMethodDeclaration643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classVarDeclaration715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classVarDeclaration717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_classVarDeclaration719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classVarDeclaration721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList799 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator881 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator909 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList953 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList956 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});

}