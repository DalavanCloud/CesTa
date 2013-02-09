// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g 2013-02-09 12:52:49

package org.cesta.parsers.java;

// import java.util.Map;
// import java.util.HashMap;
import org.cesta.util.antlr.java.ANTLRJavaHelper;


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
 * This tree rewrite parser provides protection against error induction.
 * Each variable with supported type (currently byte, boolean) is transformed
 * into bigger type containing integrity information, which is updated on each
 * modification and checked on each read access.
 **/
public class IntegrityVariablesParser extends AbstractTreeParser {
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
    public IntegrityVariablesParser_JavaTreeParser gJavaTreeParser;
    // delegators

    protected static class Variables_scope {
        Map<String, Variable> variableTypes;
        String type;
    }
    protected Stack Variables_stack = new Stack();


        public IntegrityVariablesParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IntegrityVariablesParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[331+1];
             
            gJavaTreeParser = new IntegrityVariablesParser_JavaTreeParser(input, state, this);         
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("IntegrityVariablesParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return IntegrityVariablesParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g"; }

    	
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


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:51:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final IntegrityVariablesParser.javaSource_return javaSource() throws RecognitionException {
        IntegrityVariablesParser.javaSource_return retval = new IntegrityVariablesParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        IntegrityVariablesParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource136); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource138);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource140);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource143);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource146);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource149);
            additionalImports((CommonTree)(typeDeclaration1!=null?((CommonTree)typeDeclaration1.start):null));

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
            if ( state.backtracking>0 ) { memoize(input, 289, javaSource_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "javaSource"

    public static class typeDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:56:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final IntegrityVariablesParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        IntegrityVariablesParser.typeDeclaration_return retval = new IntegrityVariablesParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt7=1;
                }
                break;
            case INTERFACE:
                {
                alt7=2;
                }
                break;
            case ENUM:
                {
                alt7=3;
                }
                break;
            case AT:
                {
                alt7=4;
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration171);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:58:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration183); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration185);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration187); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:58:40: ( genericTypeParameterList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration189);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:58:66: ( extendsClause )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXTENDS_CLAUSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration192);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration195);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:59:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration207); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration209);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration211); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:59:35: ( implementsClause )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IMPLEMENTS_CLAUSE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration213);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration216);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:60:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration228); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration230);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration232); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration234);
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
            if ( state.backtracking>0 ) { memoize(input, 290, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final IntegrityVariablesParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.classTopLevelScope_return retval = new IntegrityVariablesParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:65:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:65:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope256); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:65:33: ( classScopeDeclarations )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==AT||LA8_0==CLASS||LA8_0==ENUM||LA8_0==INTERFACE||(LA8_0>=CLASS_INSTANCE_INITIALIZER && LA8_0<=CLASS_STATIC_INITIALIZER)||LA8_0==CONSTRUCTOR_DECL||LA8_0==FUNCTION_METHOD_DECL||LA8_0==VAR_DECLARATION||LA8_0==VOID_METHOD_DECL) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope258);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop8;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope262);
            classAdditionalCode((CommonTree)retval.start);

            state._fsp--;
            if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 291, classTopLevelScope_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:69:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration );
    public final IntegrityVariablesParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.classScopeDeclarations_return retval = new IntegrityVariablesParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration )
            int alt9=5;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt9=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt9=2;
                }
                break;
            case CONSTRUCTOR_DECL:
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt9=3;
                }
                break;
            case VAR_DECLARATION:
                {
                alt9=4;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations284); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations286);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:71:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations298); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations300);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:72:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations311);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:73:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_classScopeDeclarations322);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:74:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations333);
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
            if ( state.backtracking>0 ) { memoize(input, 292, classScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    public static class interfaceScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceScopeDeclarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:78:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration );
    public final IntegrityVariablesParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.interfaceScopeDeclarations_return retval = new IntegrityVariablesParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration )
            int alt15=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt15=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt15=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt15=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations354); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations356);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:45: ( genericTypeParameterList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations358);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations361);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations363); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations365);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:102: ( arrayDeclaratorList )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ARRAY_DECLARATOR_LIST) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations367);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:123: ( throwsClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==THROWS_CLAUSE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations370);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:80:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations383); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations385);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:80:41: ( genericTypeParameterList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations387);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations390); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations392);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:80:93: ( throwsClause )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THROWS_CLAUSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations394);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations484);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations495);
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
            if ( state.backtracking>0 ) { memoize(input, 293, interfaceScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceScopeDeclarations"

    public static class additionalImports_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additionalImports"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:91:1: additionalImports[CommonTree tree] : ;
    public final IntegrityVariablesParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.additionalImports_return retval = new IntegrityVariablesParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:95:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:96:9: 
            {
            if ( state.backtracking==0 ) {

                          if (tree != null) {
                              getLogger().finer("Adding additional imports");
                              StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                              tokens.insertBefore(tree.getTokenStartIndex(), st);
                          }
                      
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 294, additionalImports_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalImports"

    public static class classAdditionalCode_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classAdditionalCode"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:105:1: classAdditionalCode[CommonTree tree] : ;
    public final IntegrityVariablesParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.classAdditionalCode_return retval = new IntegrityVariablesParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:109:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:110:9: 
            {
            if ( state.backtracking==0 ) {

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

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 295, classAdditionalCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classAdditionalCode"

    public static class classDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:136:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
    public final IntegrityVariablesParser.classDeclaration_return classDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.classDeclaration_return retval = new IntegrityVariablesParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        	
                        // initializes a scope for class attributes
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:145:2: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:3: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration585); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration587);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENT,FOLLOW_IDENT_in_classDeclaration589); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:30: ( genericTypeParameterList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration591);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:56: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EXTENDS_CLAUSE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration594);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:71: ( implementsClause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTS_CLAUSE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration597);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration600);
            classTopLevelScope();

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
            if ( state.backtracking>0 ) { memoize(input, 296, classDeclaration_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class methodScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodScopeDeclarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:149:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) );
    public final IntegrityVariablesParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.methodScopeDeclarations_return retval = new IntegrityVariablesParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);
        int methodScopeDeclarations_StartIndex = input.index();

                        // initializes a scope for local variables in a method
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:158:2: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt28=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt28=2;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:3: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations636); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations638);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:39: ( genericTypeParameterList )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations640);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodScopeDeclarations643);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations645); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations647);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:96: ( arrayDeclaratorList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ARRAY_DECLARATOR_LIST) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations649);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:117: ( throwsClause )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THROWS_CLAUSE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations652);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:131: ( block )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==BLOCK_SCOPE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations655);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:4: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations663); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations665);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:36: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations667);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations670); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations672);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:88: ( throwsClause )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THROWS_CLAUSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations674);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:102: ( block )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==BLOCK_SCOPE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations677);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:161:4: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations685); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations687);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:161:36: ( genericTypeParameterList )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations689);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations692);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:161:82: ( throwsClause )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==THROWS_CLAUSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations694);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_methodScopeDeclarations697);
                    block();

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
            if ( state.backtracking>0 ) { memoize(input, 297, methodScopeDeclarations_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "methodScopeDeclarations"

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:163:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final IntegrityVariablesParser.block_return block() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.block_return retval = new IntegrityVariablesParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();

        		// initializes a scope for local variables in a block of code
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:172:9: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:172:13: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block732); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:172:27: ( blockStatement )*
                loop29:
                do {
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT||LA29_0==SEMI||LA29_0==ASSERT||LA29_0==BREAK||(LA29_0>=CLASS && LA29_0<=CONTINUE)||LA29_0==DO||LA29_0==ENUM||(LA29_0>=FOR && LA29_0<=IF)||LA29_0==INTERFACE||LA29_0==RETURN||(LA29_0>=SWITCH && LA29_0<=SYNCHRONIZED)||LA29_0==THROW||LA29_0==TRY||LA29_0==WHILE||LA29_0==BLOCK_SCOPE||LA29_0==EXPR||LA29_0==FOR_EACH||LA29_0==LABELED_STATEMENT||LA29_0==VAR_DECLARATION) ) {
                        alt29=1;
                    }


                    switch (alt29) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block734);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop29;
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
            if ( state.backtracking>0 ) { memoize(input, 298, block_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "block"

    public static class globalVariableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalVariableDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:175:1: globalVariableDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final IntegrityVariablesParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.globalVariableDeclaration_return retval = new IntegrityVariablesParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);
        int globalVariableDeclaration_StartIndex = input.index();
        IntegrityVariablesParser_JavaTreeParser.type_return type2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 299) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:180:2: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:3: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration772); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_globalVariableDeclaration778);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_globalVariableDeclaration784);
            type2=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((Variables_scope)Variables_stack.peek()).type =(type2!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type2.start),
                input.getTreeAdaptor().getTokenStopIndex(type2.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_globalVariableDeclaration791);
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
            if ( state.backtracking>0 ) { memoize(input, 299, globalVariableDeclaration_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"

    public static class localVariableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:188:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final IntegrityVariablesParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.localVariableDeclaration_return retval = new IntegrityVariablesParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        IntegrityVariablesParser_JavaTreeParser.type_return type3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 300) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:193:2: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:194:3: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration824); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration830);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration836);
            type3=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((Variables_scope)Variables_stack.peek()).type =(type3!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type3.start),
                input.getTreeAdaptor().getTokenStopIndex(type3.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration843);
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
            if ( state.backtracking>0 ) { memoize(input, 300, localVariableDeclaration_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorId"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:201:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final IntegrityVariablesParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.variableDeclaratorId_return retval = new IntegrityVariablesParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        CommonTree IDENT4=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 301) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:206:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:207:13: ^( IDENT ( arrayDeclaratorList )? )
            {
            IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId887); if (state.failed) return retval;

            if ( state.backtracking==0 ) {

                                      Variable var = new Variable((IDENT4!=null?IDENT4.getText():null), ((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-1-1)).type);
                                      ((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-2-1)).variableTypes.put((IDENT4!=null?IDENT4.getText():null), var);
                                      System.out.println("-2 stack " + ((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-2-1)).variableTypes);
                                  
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:212:21: ( arrayDeclaratorList )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ARRAY_DECLARATOR_LIST) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId911);
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
            if ( state.backtracking>0 ) { memoize(input, 301, variableDeclaratorId_StartIndex); }
            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    // Delegated rules
    public IntegrityVariablesParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }
    public IntegrityVariablesParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }
    public IntegrityVariablesParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }
    public IntegrityVariablesParser_JavaTreeParser.expr_return expr() throws RecognitionException { return gJavaTreeParser.expr(); }
    public IntegrityVariablesParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException { return gJavaTreeParser.localModifier(); }
    public IntegrityVariablesParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }
    public IntegrityVariablesParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException { return gJavaTreeParser.modifierList(); }
    public IntegrityVariablesParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }
    public IntegrityVariablesParser_JavaTreeParser.primaryExpression_return primaryExpression() throws RecognitionException { return gJavaTreeParser.primaryExpression(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }
    public IntegrityVariablesParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException { return gJavaTreeParser.blockStatement(); }
    public IntegrityVariablesParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }
    public IntegrityVariablesParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException { return gJavaTreeParser.variableDeclaratorList(); }
    public IntegrityVariablesParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }
    public IntegrityVariablesParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }
    public IntegrityVariablesParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }
    public IntegrityVariablesParser_JavaTreeParser.variableDeclarator_return variableDeclarator() throws RecognitionException { return gJavaTreeParser.variableDeclarator(); }
    public IntegrityVariablesParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException { return gJavaTreeParser.importDeclaration(); }
    public IntegrityVariablesParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }
    public IntegrityVariablesParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }
    public IntegrityVariablesParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException { return gJavaTreeParser.parenthesizedExpression(); }
    public IntegrityVariablesParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }
    public IntegrityVariablesParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }
    public IntegrityVariablesParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }
    public IntegrityVariablesParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }
    public IntegrityVariablesParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }
    public IntegrityVariablesParser_JavaTreeParser.arguments_return arguments() throws RecognitionException { return gJavaTreeParser.arguments(); }
    public IntegrityVariablesParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }
    public IntegrityVariablesParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }
    public IntegrityVariablesParser_JavaTreeParser.variableInitializer_return variableInitializer() throws RecognitionException { return gJavaTreeParser.variableInitializer(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }
    public IntegrityVariablesParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }
    public IntegrityVariablesParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }
    public IntegrityVariablesParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }
    public IntegrityVariablesParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }
    public IntegrityVariablesParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }
    public IntegrityVariablesParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }
    public IntegrityVariablesParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException { return gJavaTreeParser.formalParameterVarargDecl(); }
    public IntegrityVariablesParser_JavaTreeParser.modifier_return modifier() throws RecognitionException { return gJavaTreeParser.modifier(); }
    public IntegrityVariablesParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }
    public IntegrityVariablesParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }
    public IntegrityVariablesParser_JavaTreeParser.statement_return statement() throws RecognitionException { return gJavaTreeParser.statement(); }
    public IntegrityVariablesParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }
    public IntegrityVariablesParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }
    public IntegrityVariablesParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }
    public IntegrityVariablesParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }
    public IntegrityVariablesParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException { return gJavaTreeParser.arrayDeclaratorList(); }
    public IntegrityVariablesParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }
    public IntegrityVariablesParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }
    public IntegrityVariablesParser_JavaTreeParser.expression_return expression() throws RecognitionException { return gJavaTreeParser.expression(); }
    public IntegrityVariablesParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }
    public IntegrityVariablesParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }
    public IntegrityVariablesParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }
    public IntegrityVariablesParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }
    public IntegrityVariablesParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }
    public IntegrityVariablesParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException { return gJavaTreeParser.formalParameterStandardDecl(); }
    public IntegrityVariablesParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }


 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource138 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource140 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource143 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource146 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDeclaration_in_typeDeclaration171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration211 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration213 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration216 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration232 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope258 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodScopeDeclarations_in_classScopeDeclarations311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_classScopeDeclarations322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations365 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations367 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations383 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations392 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration589 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration591 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration594 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration597 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations647 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations649 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations652 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations672 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations674 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations692 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations694 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block734 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_globalVariableDeclaration778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_globalVariableDeclaration784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_globalVariableDeclaration791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId911 = new BitSet(new long[]{0x0000000000000008L});

}