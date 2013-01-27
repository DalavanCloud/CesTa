// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g 2013-01-27 17:37:37

package org.cesta.parsers.java;
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
 *  This tree parser replaces possibly vulnerable if constructions
 *  to semantically equivalent switch constructions.
 */
public class IfSwitchReplacementParser extends AbstractTreeParser {
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
    public IfSwitchReplacementParser_JavaTreeParser gJavaTreeParser;
    // delegators


        public IfSwitchReplacementParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IfSwitchReplacementParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[348+1];
             
            gJavaTreeParser = new IfSwitchReplacementParser_JavaTreeParser(input, state, this);         
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("IfSwitchReplacementParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return IfSwitchReplacementParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g"; }


        class StatementReturn {
            public Boolean isVoid = false;
            public Boolean always = false;
        }


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:32:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final IfSwitchReplacementParser.javaSource_return javaSource() throws RecognitionException {
        IfSwitchReplacementParser.javaSource_return retval = new IfSwitchReplacementParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        IfSwitchReplacementParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:33:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:34:2: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource134); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource136);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:34:31: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource138);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:34:51: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource141);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:34:70: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource144);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource147);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:37:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final IfSwitchReplacementParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        IfSwitchReplacementParser.typeDeclaration_return retval = new IfSwitchReplacementParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:38:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:38:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration172);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:39:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration183); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration185);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration187); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:39:40: ( genericTypeParameterList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration189);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:39:66: ( extendsClause )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXTENDS_CLAUSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: extendsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration207); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration209);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration211); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:35: ( implementsClause )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IMPLEMENTS_CLAUSE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: implementsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:41:9: ^( AT modifierList IDENT annotationTopLevelScope )
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

    protected static class classDeclaration_scope {
        String ident;
    }
    protected Stack classDeclaration_stack = new Stack();

    public static class classDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:44:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
    public final IfSwitchReplacementParser.classDeclaration_return classDeclaration() throws RecognitionException {
        classDeclaration_stack.push(new classDeclaration_scope());
        IfSwitchReplacementParser.classDeclaration_return retval = new IfSwitchReplacementParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        CommonTree IDENT2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:46:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:47:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration269); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration271);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration273); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((classDeclaration_scope)classDeclaration_stack.peek()).ident = (IDENT2!=null?IDENT2.getText():null);
            }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:47:78: ( genericTypeParameterList )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration277);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:47:104: ( extendsClause )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EXTENDS_CLAUSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration280);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:47:119: ( implementsClause )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IMPLEMENTS_CLAUSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration283);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration286);
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
            if ( state.backtracking>0 ) { memoize(input, 291, classDeclaration_StartIndex); }
            classDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:50:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final IfSwitchReplacementParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        IfSwitchReplacementParser.classTopLevelScope_return retval = new IfSwitchReplacementParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:51:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:52:2: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope311); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:52:26: ( classScopeDeclarations )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==AT||LA11_0==CLASS||LA11_0==ENUM||LA11_0==INTERFACE||(LA11_0>=CLASS_INSTANCE_INITIALIZER && LA11_0<=CLASS_STATIC_INITIALIZER)||LA11_0==CONSTRUCTOR_DECL||LA11_0==FUNCTION_METHOD_DECL||LA11_0==VAR_DECLARATION||LA11_0==VOID_METHOD_DECL) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope313);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope317);
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
            if ( state.backtracking>0 ) { memoize(input, 292, classTopLevelScope_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:55:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | constructorDeclaration | methodDeclarations | typeDeclaration );
    public final IfSwitchReplacementParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        IfSwitchReplacementParser.classScopeDeclarations_return retval = new IfSwitchReplacementParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:56:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | constructorDeclaration | methodDeclarations | typeDeclaration )
            int alt12=6;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt12=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt12=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt12=3;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt12=4;
                }
                break;
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt12=5;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt12=6;
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:56:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations338); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations340);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:57:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations352); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations354);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:58:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations366); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations368);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations370);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations372);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:59:9: constructorDeclaration
                    {
                    pushFollow(FOLLOW_constructorDeclaration_in_classScopeDeclarations383);
                    constructorDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:60:9: methodDeclarations
                    {
                    pushFollow(FOLLOW_methodDeclarations_in_classScopeDeclarations393);
                    methodDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:61:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations403);
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
            if ( state.backtracking>0 ) { memoize(input, 293, classScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    protected static class constructorDeclaration_scope {
        Boolean dummy;
    }
    protected Stack constructorDeclaration_stack = new Stack();

    public static class constructorDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructorDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:64:1: constructorDeclaration : ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ;
    public final IfSwitchReplacementParser.constructorDeclaration_return constructorDeclaration() throws RecognitionException {
        constructorDeclaration_stack.push(new constructorDeclaration_scope());
        IfSwitchReplacementParser.constructorDeclaration_return retval = new IfSwitchReplacementParser.constructorDeclaration_return();
        retval.start = input.LT(1);
        int constructorDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:66:5: ( ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:67:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
            {
            match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_constructorDeclaration437); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_constructorDeclaration439);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:67:41: ( genericTypeParameterList )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_constructorDeclaration441);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_constructorDeclaration444);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:67:87: ( throwsClause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==THROWS_CLAUSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_constructorDeclaration446);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_constructorDeclaration449);
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
            if ( state.backtracking>0 ) { memoize(input, 294, constructorDeclaration_StartIndex); }
            constructorDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "constructorDeclaration"

    protected static class methodDeclarations_scope {
        String ident;
        String type;
    }
    protected Stack methodDeclarations_stack = new Stack();

    public static class methodDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodDeclarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:70:1: methodDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) );
    public final IfSwitchReplacementParser.methodDeclarations_return methodDeclarations() throws RecognitionException {
        methodDeclarations_stack.push(new methodDeclarations_scope());
        IfSwitchReplacementParser.methodDeclarations_return retval = new IfSwitchReplacementParser.methodDeclarations_return();
        retval.start = input.LT(1);
        int methodDeclarations_StartIndex = input.index();
        CommonTree IDENT3=null;
        CommonTree IDENT4=null;
        IfSwitchReplacementParser_JavaTreeParser.type_return t = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:75:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FUNCTION_METHOD_DECL) ) {
                alt22=1;
            }
            else if ( (LA22_0==VOID_METHOD_DECL) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:76:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodDeclarations484); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodDeclarations486);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:76:45: ( genericTypeParameterList )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodDeclarations488);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodDeclarations493);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).type =(t!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(t.start),
                        input.getTreeAdaptor().getTokenStopIndex(t.start))):null);
                    }
                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_methodDeclarations497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).ident =(IDENT3!=null?IDENT3.getText():null);
                    }
                    pushFollow(FOLLOW_formalParameterList_in_methodDeclarations501);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:76:183: ( arrayDeclaratorList )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ARRAY_DECLARATOR_LIST) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodDeclarations503);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:76:204: ( throwsClause )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==THROWS_CLAUSE) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodDeclarations506);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:76:218: ( block )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==BLOCK_SCOPE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclarations509);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:77:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodDeclarations522); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodDeclarations524);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:77:41: ( genericTypeParameterList )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodDeclarations526);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).type ="void";
                    }
                    IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_methodDeclarations531); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).ident =(IDENT4!=null?IDENT4.getText():null);
                    }
                    pushFollow(FOLLOW_formalParameterList_in_methodDeclarations535);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:77:171: ( throwsClause )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==THROWS_CLAUSE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodDeclarations537);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:77:185: ( block )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==BLOCK_SCOPE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclarations540);
                            block();

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
            if ( state.backtracking>0 ) { memoize(input, 295, methodDeclarations_StartIndex); }
            methodDeclarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "methodDeclarations"

    public static class block_return extends TreeRuleReturnScope {
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:82:1: block returns [StatementReturn r] : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final IfSwitchReplacementParser.block_return block() throws RecognitionException {
        IfSwitchReplacementParser.block_return retval = new IfSwitchReplacementParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        IfSwitchReplacementParser.blockStatement_return blockStatement5 = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:84:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:84:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block577); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:85:13: ( blockStatement )*
                loop23:
                do {
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==AT||LA23_0==SEMI||LA23_0==ASSERT||LA23_0==BREAK||(LA23_0>=CLASS && LA23_0<=CONTINUE)||LA23_0==DO||LA23_0==ENUM||(LA23_0>=FOR && LA23_0<=IF)||LA23_0==INTERFACE||LA23_0==RETURN||(LA23_0>=SWITCH && LA23_0<=SYNCHRONIZED)||LA23_0==THROW||LA23_0==TRY||LA23_0==WHILE||LA23_0==BLOCK_SCOPE||LA23_0==EXPR||LA23_0==FOR_EACH||LA23_0==LABELED_STATEMENT||LA23_0==VAR_DECLARATION) ) {
                        alt23=1;
                    }


                    switch (alt23) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:85:14: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block592);
                	    blockStatement5=blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      retval.r.always = retval.r.always || ((blockStatement5!=null?(input.getTokenStream().toString(
                	        input.getTreeAdaptor().getTokenStartIndex(blockStatement5.start),
                	        input.getTreeAdaptor().getTokenStopIndex(blockStatement5.start))):null)!=null && (blockStatement5!=null?blockStatement5.r:null).always);
                	    }

                	    }
                	    break;

                	default :
                	    break loop23;
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
            if ( state.backtracking>0 ) { memoize(input, 296, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends TreeRuleReturnScope {
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:90:1: blockStatement returns [StatementReturn r] : ( localVariableDeclaration | typeDeclaration | s= statement );
    public final IfSwitchReplacementParser.blockStatement_return blockStatement() throws RecognitionException {
        IfSwitchReplacementParser.blockStatement_return retval = new IfSwitchReplacementParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        IfSwitchReplacementParser.statement_return s = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:92:5: ( localVariableDeclaration | typeDeclaration | s= statement )
            int alt24=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt24=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt24=2;
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
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:92:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement662);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:93:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement672);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:94:9: s= statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement684);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always = (s!=null?s.r:null).always;
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
            if ( state.backtracking>0 ) { memoize(input, 297, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class statement_return extends TreeRuleReturnScope {
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:98:1: statement returns [StatementReturn r] : (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI );
    public final IfSwitchReplacementParser.statement_return statement() throws RecognitionException {
        IfSwitchReplacementParser.statement_return retval = new IfSwitchReplacementParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        IfSwitchReplacementParser.block_return b = null;

        IfSwitchReplacementParser.statement_return s = null;

        IfSwitchReplacementParser.block_return b1 = null;

        IfSwitchReplacementParser.block_return b2 = null;

        IfSwitchReplacementParser.ifSwitchTransformation_return ifSwitchTransformation6 = null;

        IfSwitchReplacementParser_JavaTreeParser.expression_return expression7 = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:100:5: (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI )
            int alt31=17;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:100:9: b= block
                    {
                    pushFollow(FOLLOW_block_in_statement733);
                    b=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(b!=null?b.r:null).always;
                    }

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:101:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement746); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement748);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:101:29: ( expression )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==EXPR) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement750);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:102:9: ifSwitchTransformation
                    {
                    pushFollow(FOLLOW_ifSwitchTransformation_in_statement762);
                    ifSwitchTransformation6=ifSwitchTransformation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always = (ifSwitchTransformation6!=null?ifSwitchTransformation6.r:null).always;
                    }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:103:9: ^( FOR forInit forCondition forUpdater s= statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement775); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement777);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement779);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement781);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement785);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(s!=null?s.r:null).always;
                    }

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:104:9: ^( FOR_EACH localModifierList type IDENT expression s= statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement799); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement801);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement803);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement805); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement807);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement811);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(s!=null?s.r:null).always;
                    }

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:105:9: ^( WHILE parenthesizedExpression s= statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement825); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement827);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement831);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(s!=null?s.r:null).always;
                    }

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:106:9: ^( DO s= statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement845); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement849);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement851);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:107:9: ^( TRY b1= block ( catches )? (b2= block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement863); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement867);
                    b1=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:107:24: ( catches )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CATCH_CLAUSE_LIST) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement869);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:107:35: (b2= block )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==BLOCK_SCOPE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: b2= block
                            {
                            pushFollow(FOLLOW_block_in_statement874);
                            b2=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(b1!=null?b1.r:null).always && ((b2!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(b2.start),
                        input.getTreeAdaptor().getTokenStopIndex(b2.start))):null)!=null && (b2!=null?b2.r:null).always);
                    }

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:108:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement889); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement891);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement893);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:109:9: ^( SYNCHRONIZED parenthesizedExpression b= block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement905); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement907);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement911);
                    b=block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(b!=null?b.r:null).always;
                    }

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:110:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement925); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:110:18: ( expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==EXPR) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement927);
                                expression7=expression();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }
                    if ( state.backtracking==0 ) {

                                  retval.r.always = true;
                                  retval.r.isVoid=(expression7!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(expression7.start),
                        input.getTreeAdaptor().getTokenStopIndex(expression7.start))):null)==null;
                              
                    }

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:115:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement950); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement952);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                  retval.r.always = true;
                              
                    }

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:119:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement974); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:119:17: ( IDENT )?
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==IDENT) ) {
                            alt29=1;
                        }
                        switch (alt29) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement976); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:120:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement989); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:120:20: ( IDENT )?
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==IDENT) ) {
                            alt30=1;
                        }
                        switch (alt30) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement991); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:9: ^( LABELED_STATEMENT IDENT s= statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement1004); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement1006); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement1010);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(s!=null?s.r:null).always;
                    }

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:122:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement1023);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:123:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement1033); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 298, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    protected static class ifSwitchTransformation_scope {
        boolean enabled;
    }
    protected Stack ifSwitchTransformation_stack = new Stack();

    public static class ifSwitchTransformation_return extends TreeRuleReturnScope {
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifSwitchTransformation"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:126:1: ifSwitchTransformation returns [StatementReturn r] : ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? ) ;
    public final IfSwitchReplacementParser.ifSwitchTransformation_return ifSwitchTransformation() throws RecognitionException {
        ifSwitchTransformation_stack.push(new ifSwitchTransformation_scope());
        IfSwitchReplacementParser.ifSwitchTransformation_return retval = new IfSwitchReplacementParser.ifSwitchTransformation_return();
        retval.start = input.LT(1);
        int ifSwitchTransformation_StartIndex = input.index();
        IfSwitchReplacementParser.statement_return ifTrue = null;

        IfSwitchReplacementParser.statement_return ifFalse = null;

        IfSwitchReplacementParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression8 = null;



                    retval.r =new StatementReturn();
                    ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled = true;

                    // if we are in method, check access
                    if (!methodDeclarations_stack.isEmpty()){
                        ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled =
                            ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled &&
                            ((methodDeclarations_scope)methodDeclarations_stack.peek()).ident.matches(getParamS("includeMethods")) &&
                            !((methodDeclarations_scope)methodDeclarations_stack.peek()).ident.matches(getParamS("excludeMethods"));
                    }
                    // if we are in class and constructor, check access
                    if (!constructorDeclaration_stack.isEmpty() && !classDeclaration_stack.isEmpty()){
                        ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled =
                            ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled &&
                            ((classDeclaration_scope)classDeclaration_stack.peek()).ident.matches(getParamS("includeMethods")) &&
                            !((classDeclaration_scope)classDeclaration_stack.peek()).ident.matches(getParamS("excludeMethods"));
                    }

                    initRewrite();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 299) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:157:9: ( ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:160:3: ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? )
            {
            match(input,IF,FOLLOW_IF_in_ifSwitchTransformation1110); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_parenthesizedExpression_in_ifSwitchTransformation1115);
            parenthesizedExpression8=parenthesizedExpression();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_statement_in_ifSwitchTransformation1143);
            ifTrue=statement();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:162:32: (ifFalse= statement )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SEMI||LA32_0==ASSERT||LA32_0==BREAK||LA32_0==CONTINUE||LA32_0==DO||(LA32_0>=FOR && LA32_0<=IF)||LA32_0==RETURN||(LA32_0>=SWITCH && LA32_0<=SYNCHRONIZED)||LA32_0==THROW||LA32_0==TRY||LA32_0==WHILE||LA32_0==BLOCK_SCOPE||LA32_0==EXPR||LA32_0==FOR_EACH||LA32_0==LABELED_STATEMENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: ifFalse= statement
                    {
                    pushFollow(FOLLOW_statement_in_ifSwitchTransformation1171);
                    ifFalse=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled = ((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled && !((ifFalse!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(ifFalse.start),
                input.getTreeAdaptor().getTokenStopIndex(ifFalse.start))):null)==null); 
            }

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                                  // does whole if always return something?
                                  retval.r.always = (ifTrue!=null?ifTrue.r:null).always && ((ifFalse!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(ifFalse.start),
                input.getTreeAdaptor().getTokenStopIndex(ifFalse.start))):null)!=null && (ifFalse!=null?ifFalse.r:null).always);
                                  
                                  if (((ifSwitchTransformation_scope)ifSwitchTransformation_stack.peek()).enabled) {

                                      STAttrMap paramMap = new STAttrMap().
                                          put("expr", (parenthesizedExpression8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(parenthesizedExpression8.start),
                input.getTreeAdaptor().getTokenStopIndex(parenthesizedExpression8.start))):null)).
                                          put("ifTrue", (ifTrue!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(ifTrue.start),
                input.getTreeAdaptor().getTokenStopIndex(ifTrue.start))):null)).
                                          put("ifFalse", (ifFalse!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(ifFalse.start),
                input.getTreeAdaptor().getTokenStopIndex(ifFalse.start))):null)).
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
                                      if (!methodDeclarations_stack.isEmpty())
                                          paramMap.put("sampleReturn", ANTLRJavaHelper.getTypeDefaultValue(((methodDeclarations_scope)methodDeclarations_stack.peek()).type));
                                      paramMap.
                                          put("return", retval.r).
                                          put("ifTrueReturn", (ifTrue!=null?ifTrue.r:null)).
                                          put("ifFalseReturn", (ifFalse!=null?ifFalse.r:null));

                                      performRewrite(paramMap);
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
            if ( state.backtracking>0 ) { memoize(input, 299, ifSwitchTransformation_StartIndex); }
            ifSwitchTransformation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "ifSwitchTransformation"

    public static class classAdditionalCode_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classAdditionalCode"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:199:1: classAdditionalCode[CommonTree tree] : ;
    public final IfSwitchReplacementParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        IfSwitchReplacementParser.classAdditionalCode_return retval = new IfSwitchReplacementParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 300) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:203:2: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:204:3: 
            {
            if ( state.backtracking==0 ) {
              if (getRewritesCount()>0){	// at least one rewrite was performed
              			getLogger().finer("Adding additional code to class");
              			
              			StringTemplate st = getTemplateLib().getInstanceOf("classAdditionalCode");
              			tokens.insertBefore(tree.getTokenStopIndex(), st);
              		}
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 300, classAdditionalCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classAdditionalCode"

    public static class additionalImports_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additionalImports"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:211:1: additionalImports[CommonTree tree] : ;
    public final IfSwitchReplacementParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        IfSwitchReplacementParser.additionalImports_return retval = new IfSwitchReplacementParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 301) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:215:2: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:216:3: 
            {
            if ( state.backtracking==0 ) {
              if (getRewritesCount()>0){	// at least one rewrite was performed
              			getLogger().finer("Adding additional imports");
              			StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
              			tokens.insertBefore(tree.getTokenStartIndex(), st);
              		}
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 301, additionalImports_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalImports"

    // Delegated rules
    public IfSwitchReplacementParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException { return gJavaTreeParser.importDeclaration(); }
    public IfSwitchReplacementParser_JavaTreeParser.variableInitializer_return variableInitializer() throws RecognitionException { return gJavaTreeParser.variableInitializer(); }
    public IfSwitchReplacementParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }
    public IfSwitchReplacementParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }
    public IfSwitchReplacementParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException { return gJavaTreeParser.parenthesizedExpression(); }
    public IfSwitchReplacementParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }
    public IfSwitchReplacementParser_JavaTreeParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException { return gJavaTreeParser.interfaceScopeDeclarations(); }
    public IfSwitchReplacementParser_JavaTreeParser.modifier_return modifier() throws RecognitionException { return gJavaTreeParser.modifier(); }
    public IfSwitchReplacementParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }
    public IfSwitchReplacementParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException { return gJavaTreeParser.formalParameterVarargDecl(); }
    public IfSwitchReplacementParser_JavaTreeParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException { return gJavaTreeParser.localVariableDeclaration(); }
    public IfSwitchReplacementParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }
    public IfSwitchReplacementParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }
    public IfSwitchReplacementParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }
    public IfSwitchReplacementParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }
    public IfSwitchReplacementParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }
    public IfSwitchReplacementParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }
    public IfSwitchReplacementParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException { return gJavaTreeParser.arrayDeclaratorList(); }
    public IfSwitchReplacementParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }
    public IfSwitchReplacementParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }
    public IfSwitchReplacementParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }
    public IfSwitchReplacementParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }
    public IfSwitchReplacementParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }
    public IfSwitchReplacementParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }
    public IfSwitchReplacementParser_JavaTreeParser.primaryExpression_return primaryExpression() throws RecognitionException { return gJavaTreeParser.primaryExpression(); }
    public IfSwitchReplacementParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }
    public IfSwitchReplacementParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }
    public IfSwitchReplacementParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException { return gJavaTreeParser.variableDeclaratorList(); }
    public IfSwitchReplacementParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }
    public IfSwitchReplacementParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }
    public IfSwitchReplacementParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }
    public IfSwitchReplacementParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }
    public IfSwitchReplacementParser_JavaTreeParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException { return gJavaTreeParser.variableDeclaratorId(); }
    public IfSwitchReplacementParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }
    public IfSwitchReplacementParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }
    public IfSwitchReplacementParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }
    public IfSwitchReplacementParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }
    public IfSwitchReplacementParser_JavaTreeParser.expr_return expr() throws RecognitionException { return gJavaTreeParser.expr(); }
    public IfSwitchReplacementParser_JavaTreeParser.variableDeclarator_return variableDeclarator() throws RecognitionException { return gJavaTreeParser.variableDeclarator(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }
    public IfSwitchReplacementParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException { return gJavaTreeParser.localModifier(); }
    public IfSwitchReplacementParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }
    public IfSwitchReplacementParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }
    public IfSwitchReplacementParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }
    public IfSwitchReplacementParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }
    public IfSwitchReplacementParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException { return gJavaTreeParser.modifierList(); }
    public IfSwitchReplacementParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }
    public IfSwitchReplacementParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }
    public IfSwitchReplacementParser_JavaTreeParser.arguments_return arguments() throws RecognitionException { return gJavaTreeParser.arguments(); }
    public IfSwitchReplacementParser_JavaTreeParser.expression_return expression() throws RecognitionException { return gJavaTreeParser.expression(); }
    public IfSwitchReplacementParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }
    public IfSwitchReplacementParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }
    public IfSwitchReplacementParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException { return gJavaTreeParser.formalParameterStandardDecl(); }
    public IfSwitchReplacementParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }
    public IfSwitchReplacementParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }
    public IfSwitchReplacementParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\22\uffff";
    static final String DFA31_eofS =
        "\22\uffff";
    static final String DFA31_minS =
        "\1\54\21\uffff";
    static final String DFA31_maxS =
        "\1\u008d\21\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21";
    static final String DFA31_specialS =
        "\22\uffff}>";
    static final String[] DFA31_transitionS = {
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "98:1: statement returns [StatementReturn r] : (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource136 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource138 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource141 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource144 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDeclaration_in_typeDeclaration172 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_CLASS_in_classDeclaration269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration273 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration277 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration280 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration283 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope313 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constructorDeclaration_in_classScopeDeclarations383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclarations_in_classScopeDeclarations393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_constructorDeclaration437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_constructorDeclaration439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_constructorDeclaration441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_constructorDeclaration444 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_constructorDeclaration446 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_constructorDeclaration449 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodDeclarations484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodDeclarations486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodDeclarations488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodDeclarations493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclarations497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_methodDeclarations501 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodDeclarations503 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodDeclarations506 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_methodDeclarations509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodDeclarations522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodDeclarations524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodDeclarations526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclarations531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_methodDeclarations535 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodDeclarations537 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_methodDeclarations540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block592 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement748 = new BitSet(new long[]{0x0000000000000008L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_statement750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifSwitchTransformation_in_statement762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement781 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement805 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_statement807 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement827 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement867 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_catches_in_statement869 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement874 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement889 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement893 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement907 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement950 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement952 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement991 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement1004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement1006 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement1010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifSwitchTransformation1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_ifSwitchTransformation1115 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_ifSwitchTransformation1143 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_ifSwitchTransformation1171 = new BitSet(new long[]{0x0000000000000008L});

}