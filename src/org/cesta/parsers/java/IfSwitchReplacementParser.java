// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g 2010-05-27 21:43:59

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


        public IfSwitchReplacementParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IfSwitchReplacementParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[294+1];
             
             
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
    public String getGrammarFileName() { return "D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g"; }


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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:30:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final IfSwitchReplacementParser.javaSource_return javaSource() throws RecognitionException {
        IfSwitchReplacementParser.javaSource_return retval = new IfSwitchReplacementParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        IfSwitchReplacementParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:31:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:32:2: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource128); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource130);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:32:31: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource132);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:32:51: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource135);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:32:70: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource138);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource141);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:35:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final IfSwitchReplacementParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        IfSwitchReplacementParser.packageDeclaration_return retval = new IfSwitchReplacementParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:36:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:36:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration163); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration165);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:39:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final IfSwitchReplacementParser.importDeclaration_return importDeclaration() throws RecognitionException {
        IfSwitchReplacementParser.importDeclaration_return retval = new IfSwitchReplacementParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration192); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration194); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration197);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:40:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration199); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:43:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final IfSwitchReplacementParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        IfSwitchReplacementParser.typeDeclaration_return retval = new IfSwitchReplacementParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:44:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt9=1;
                }
                break;
            case INTERFACE:
                {
                alt9=2;
                }
                break;
            case ENUM:
                {
                alt9=3;
                }
                break;
            case AT:
                {
                alt9=4;
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:44:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration225);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:45:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration236); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration238);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration240); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:45:40: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration242);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:45:66: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration245);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration248);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:46:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration260); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration262);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration264); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:46:35: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration266);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration269);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:47:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration281); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration283);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration285); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration287);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:50:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
    public final IfSwitchReplacementParser.classDeclaration_return classDeclaration() throws RecognitionException {
        classDeclaration_stack.push(new classDeclaration_scope());
        IfSwitchReplacementParser.classDeclaration_return retval = new IfSwitchReplacementParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();
        CommonTree IDENT2=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:52:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:53:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration322); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration324);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classDeclaration326); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((classDeclaration_scope)classDeclaration_stack.peek()).ident = (IDENT2!=null?IDENT2.getText():null);
            }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:53:78: ( genericTypeParameterList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration330);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:53:104: ( extendsClause )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EXTENDS_CLAUSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration333);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:53:119: ( implementsClause )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IMPLEMENTS_CLAUSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration336);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration339);
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
            if ( state.backtracking>0 ) { memoize(input, 5, classDeclaration_StartIndex); }
            classDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    public static class extendsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extendsClause"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:56:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final IfSwitchReplacementParser.extendsClause_return extendsClause() throws RecognitionException {
        IfSwitchReplacementParser.extendsClause_return retval = new IfSwitchReplacementParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:58:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:58:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause376); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:58:26: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause378);
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
            if ( state.backtracking>0 ) { memoize(input, 6, extendsClause_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:61:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final IfSwitchReplacementParser.implementsClause_return implementsClause() throws RecognitionException {
        IfSwitchReplacementParser.implementsClause_return retval = new IfSwitchReplacementParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:62:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:62:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause407); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:62:29: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause409);
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
            if ( state.backtracking>0 ) { memoize(input, 7, implementsClause_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:65:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final IfSwitchReplacementParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        IfSwitchReplacementParser.genericTypeParameterList_return retval = new IfSwitchReplacementParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:66:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:66:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList439); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:66:35: ( genericTypeParameter )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList441);
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
            if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameterList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:69:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final IfSwitchReplacementParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        IfSwitchReplacementParser.genericTypeParameter_return retval = new IfSwitchReplacementParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:70:5: ( ^( IDENT ( bound )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:70:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter463); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:70:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter465);
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
            if ( state.backtracking>0 ) { memoize(input, 9, genericTypeParameter_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:73:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final IfSwitchReplacementParser.bound_return bound() throws RecognitionException {
        IfSwitchReplacementParser.bound_return retval = new IfSwitchReplacementParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:74:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:74:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound495); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:74:30: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound497);
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
            if ( state.backtracking>0 ) { memoize(input, 10, bound_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:77:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final IfSwitchReplacementParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        IfSwitchReplacementParser.enumTopLevelScope_return retval = new IfSwitchReplacementParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:78:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:78:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope519); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:78:32: ( enumConstant )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope521);
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

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:78:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope524);
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
            if ( state.backtracking>0 ) { memoize(input, 11, enumTopLevelScope_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:81:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final IfSwitchReplacementParser.enumConstant_return enumConstant() throws RecognitionException {
        IfSwitchReplacementParser.enumConstant_return retval = new IfSwitchReplacementParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:82:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:82:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant550); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant552);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:82:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant554);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:82:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant557);
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
            if ( state.backtracking>0 ) { memoize(input, 12, enumConstant_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:86:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final IfSwitchReplacementParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        IfSwitchReplacementParser.classTopLevelScope_return retval = new IfSwitchReplacementParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:87:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:88:2: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope587); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:88:26: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope589);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope593);
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
            if ( state.backtracking>0 ) { memoize(input, 13, classTopLevelScope_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:91:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | constructorDeclaration | methodDeclarations | typeDeclaration );
    public final IfSwitchReplacementParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        IfSwitchReplacementParser.classScopeDeclarations_return retval = new IfSwitchReplacementParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:92:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | constructorDeclaration | methodDeclarations | typeDeclaration )
            int alt23=6;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt23=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt23=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt23=3;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt23=4;
                }
                break;
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt23=5;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt23=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:92:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations614); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations616);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:93:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations628); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations630);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:94:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations642); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations644);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations646);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations648);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:95:9: constructorDeclaration
                    {
                    pushFollow(FOLLOW_constructorDeclaration_in_classScopeDeclarations659);
                    constructorDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:96:9: methodDeclarations
                    {
                    pushFollow(FOLLOW_methodDeclarations_in_classScopeDeclarations669);
                    methodDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:97:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations679);
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
            if ( state.backtracking>0 ) { memoize(input, 14, classScopeDeclarations_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:100:1: constructorDeclaration : ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ;
    public final IfSwitchReplacementParser.constructorDeclaration_return constructorDeclaration() throws RecognitionException {
        constructorDeclaration_stack.push(new constructorDeclaration_scope());
        IfSwitchReplacementParser.constructorDeclaration_return retval = new IfSwitchReplacementParser.constructorDeclaration_return();
        retval.start = input.LT(1);
        int constructorDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:102:5: ( ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:103:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
            {
            match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_constructorDeclaration713); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_constructorDeclaration715);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:103:41: ( genericTypeParameterList )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_constructorDeclaration717);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_constructorDeclaration720);
            formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:103:87: ( throwsClause )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==THROWS_CLAUSE) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_constructorDeclaration722);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_constructorDeclaration725);
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
            if ( state.backtracking>0 ) { memoize(input, 15, constructorDeclaration_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:106:1: methodDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) );
    public final IfSwitchReplacementParser.methodDeclarations_return methodDeclarations() throws RecognitionException {
        methodDeclarations_stack.push(new methodDeclarations_scope());
        IfSwitchReplacementParser.methodDeclarations_return retval = new IfSwitchReplacementParser.methodDeclarations_return();
        retval.start = input.LT(1);
        int methodDeclarations_StartIndex = input.index();
        CommonTree IDENT3=null;
        CommonTree IDENT4=null;
        IfSwitchReplacementParser.type_return t = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:111:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==FUNCTION_METHOD_DECL) ) {
                alt33=1;
            }
            else if ( (LA33_0==VOID_METHOD_DECL) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:112:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? t= type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodDeclarations760); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodDeclarations762);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:112:45: ( genericTypeParameterList )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodDeclarations764);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodDeclarations769);
                    t=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).type =(t!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(t.start),
                        input.getTreeAdaptor().getTokenStopIndex(t.start))):null);
                    }
                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_methodDeclarations773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).ident =(IDENT3!=null?IDENT3.getText():null);
                    }
                    pushFollow(FOLLOW_formalParameterList_in_methodDeclarations777);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:112:183: ( arrayDeclaratorList )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ARRAY_DECLARATOR_LIST) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodDeclarations779);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:112:204: ( throwsClause )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THROWS_CLAUSE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodDeclarations782);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:112:218: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BLOCK_SCOPE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclarations785);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:113:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodDeclarations798); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodDeclarations800);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:113:41: ( genericTypeParameterList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodDeclarations802);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).type ="void";
                    }
                    IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_methodDeclarations807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((methodDeclarations_scope)methodDeclarations_stack.peek()).ident =(IDENT4!=null?IDENT4.getText():null);
                    }
                    pushFollow(FOLLOW_formalParameterList_in_methodDeclarations811);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:113:171: ( throwsClause )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==THROWS_CLAUSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodDeclarations813);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:113:185: ( block )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==BLOCK_SCOPE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodDeclarations816);
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
            if ( state.backtracking>0 ) { memoize(input, 16, methodDeclarations_StartIndex); }
            methodDeclarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "methodDeclarations"

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:116:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final IfSwitchReplacementParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        IfSwitchReplacementParser.interfaceTopLevelScope_return retval = new IfSwitchReplacementParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:117:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:117:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope842); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:117:37: ( interfaceScopeDeclarations )*
                loop34:
                do {
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==AT||LA34_0==CLASS||LA34_0==ENUM||LA34_0==INTERFACE||LA34_0==FUNCTION_METHOD_DECL||LA34_0==VAR_DECLARATION||LA34_0==VOID_METHOD_DECL) ) {
                        alt34=1;
                    }


                    switch (alt34) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope844);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop34;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:120:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final IfSwitchReplacementParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        IfSwitchReplacementParser.interfaceScopeDeclarations_return retval = new IfSwitchReplacementParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt40=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt40=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt40=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt40=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations870); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations872);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:45: ( genericTypeParameterList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations874);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations877);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations879); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations881);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:102: ( arrayDeclaratorList )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ARRAY_DECLARATOR_LIST) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations883);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:121:123: ( throwsClause )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THROWS_CLAUSE) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations886);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:122:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations899); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations901);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:122:41: ( genericTypeParameterList )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations903);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations906); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations908);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:122:93: ( throwsClause )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==THROWS_CLAUSE) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations910);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:123:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations923); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations925);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations927);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations929);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:124:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations940);
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:127:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final IfSwitchReplacementParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        IfSwitchReplacementParser.variableDeclaratorList_return retval = new IfSwitchReplacementParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:128:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:128:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList960); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:128:31: ( variableDeclarator )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==VAR_DECLARATOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList962);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:131:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final IfSwitchReplacementParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        IfSwitchReplacementParser.variableDeclarator_return retval = new IfSwitchReplacementParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:132:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:132:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator984); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator986);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:132:47: ( variableInitializer )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ARRAY_INITIALIZER||LA42_0==EXPR) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator988);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:135:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final IfSwitchReplacementParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        IfSwitchReplacementParser.variableDeclaratorId_return retval = new IfSwitchReplacementParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:136:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:136:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId1014); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:136:17: ( arrayDeclaratorList )?
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ARRAY_DECLARATOR_LIST) ) {
                    alt43=1;
                }
                switch (alt43) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1016);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:139:1: variableInitializer : ( arrayInitializer | expression );
    public final IfSwitchReplacementParser.variableInitializer_return variableInitializer() throws RecognitionException {
        IfSwitchReplacementParser.variableInitializer_return retval = new IfSwitchReplacementParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:140:5: ( arrayInitializer | expression )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ARRAY_INITIALIZER) ) {
                alt44=1;
            }
            else if ( (LA44_0==EXPR) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:140:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1037);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:141:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1047);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:144:1: arrayDeclarator : LBRACK RBRACK ;
    public final IfSwitchReplacementParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        IfSwitchReplacementParser.arrayDeclarator_return retval = new IfSwitchReplacementParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:145:5: ( LBRACK RBRACK )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:145:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1066); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1068); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:148:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final IfSwitchReplacementParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        IfSwitchReplacementParser.arrayDeclaratorList_return retval = new IfSwitchReplacementParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:149:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:149:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1088); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:149:33: ( ARRAY_DECLARATOR )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_DECLARATOR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1090); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:152:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final IfSwitchReplacementParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        IfSwitchReplacementParser.arrayInitializer_return retval = new IfSwitchReplacementParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:153:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:153:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1118); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:153:29: ( variableInitializer )*
                loop46:
                do {
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==ARRAY_INITIALIZER||LA46_0==EXPR) ) {
                        alt46=1;
                    }


                    switch (alt46) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1120);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop46;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:156:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final IfSwitchReplacementParser.throwsClause_return throwsClause() throws RecognitionException {
        IfSwitchReplacementParser.throwsClause_return retval = new IfSwitchReplacementParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:157:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:157:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1142); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:157:25: ( qualifiedIdentifier )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==DOT||LA47_0==IDENT) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1144);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifierList"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:160:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final IfSwitchReplacementParser.modifierList_return modifierList() throws RecognitionException {
        IfSwitchReplacementParser.modifierList_return retval = new IfSwitchReplacementParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:161:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:161:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1166); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:161:25: ( modifier )*
                loop48:
                do {
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==AT||LA48_0==ABSTRACT||LA48_0==FINAL||LA48_0==NATIVE||(LA48_0>=PRIVATE && LA48_0<=PUBLIC)||(LA48_0>=STATIC && LA48_0<=STRICTFP)||LA48_0==SYNCHRONIZED||LA48_0==TRANSIENT||LA48_0==VOLATILE) ) {
                        alt48=1;
                    }


                    switch (alt48) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1168);
                	    modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop48;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:164:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final IfSwitchReplacementParser.modifier_return modifier() throws RecognitionException {
        IfSwitchReplacementParser.modifier_return retval = new IfSwitchReplacementParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:165:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt49=11;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:165:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1189); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:166:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1199); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:167:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1209); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:168:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1219); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:169:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1229); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:170:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1239); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:171:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1249); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:172:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1259); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:173:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1269); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:174:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1279); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:175:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1289);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:178:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final IfSwitchReplacementParser.localModifierList_return localModifierList() throws RecognitionException {
        IfSwitchReplacementParser.localModifierList_return retval = new IfSwitchReplacementParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:179:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:179:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1309); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:179:31: ( localModifier )*
                loop50:
                do {
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==AT||LA50_0==FINAL) ) {
                        alt50=1;
                    }


                    switch (alt50) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1311);
                	    localModifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop50;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:182:1: localModifier : ( FINAL | annotation );
    public final IfSwitchReplacementParser.localModifier_return localModifier() throws RecognitionException {
        IfSwitchReplacementParser.localModifier_return retval = new IfSwitchReplacementParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:183:5: ( FINAL | annotation )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==FINAL) ) {
                alt51=1;
            }
            else if ( (LA51_0==AT) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:183:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1332); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:184:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1342);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:187:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final IfSwitchReplacementParser.type_return type() throws RecognitionException {
        IfSwitchReplacementParser.type_return retval = new IfSwitchReplacementParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1362); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:16: ( primitiveType | qualifiedTypeIdent )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==BOOLEAN||LA52_0==BYTE||LA52_0==CHAR||LA52_0==DOUBLE||LA52_0==FLOAT||(LA52_0>=INT && LA52_0<=LONG)||LA52_0==SHORT) ) {
                alt52=1;
            }
            else if ( (LA52_0==QUALIFIED_TYPE_IDENT) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1365);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1369);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:188:53: ( arrayDeclaratorList )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ARRAY_DECLARATOR_LIST) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1372);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:191:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final IfSwitchReplacementParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        IfSwitchReplacementParser.qualifiedTypeIdent_return retval = new IfSwitchReplacementParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:192:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:192:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1394); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:192:32: ( typeIdent )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==IDENT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1396);
            	    typeIdent();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:195:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final IfSwitchReplacementParser.typeIdent_return typeIdent() throws RecognitionException {
        IfSwitchReplacementParser.typeIdent_return retval = new IfSwitchReplacementParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:196:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:196:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1419); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:196:17: ( genericTypeArgumentList )?
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt55=1;
                }
                switch (alt55) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1421);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:199:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final IfSwitchReplacementParser.primitiveType_return primitiveType() throws RecognitionException {
        IfSwitchReplacementParser.primitiveType_return retval = new IfSwitchReplacementParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:200:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:210:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final IfSwitchReplacementParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        IfSwitchReplacementParser.genericTypeArgumentList_return retval = new IfSwitchReplacementParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:211:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:211:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1532); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:211:33: ( genericTypeArgument )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==QUESTION||LA56_0==TYPE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1534);
            	    genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:214:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final IfSwitchReplacementParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        IfSwitchReplacementParser.genericTypeArgument_return retval = new IfSwitchReplacementParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:215:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TYPE) ) {
                alt58=1;
            }
            else if ( (LA58_0==QUESTION) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:215:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1559);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:216:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1570); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:216:20: ( genericWildcardBoundType )?
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==EXTENDS||LA57_0==SUPER) ) {
                            alt57=1;
                        }
                        switch (alt57) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1572);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:219:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final IfSwitchReplacementParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        IfSwitchReplacementParser.genericWildcardBoundType_return retval = new IfSwitchReplacementParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:220:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXTENDS) ) {
                alt59=1;
            }
            else if ( (LA59_0==SUPER) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:220:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1712); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1714);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:221:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1726); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1728);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:224:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final IfSwitchReplacementParser.formalParameterList_return formalParameterList() throws RecognitionException {
        IfSwitchReplacementParser.formalParameterList_return retval = new IfSwitchReplacementParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:225:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:225:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1749); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:225:29: ( formalParameterStandardDecl )*
                loop60:
                do {
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==FORMAL_PARAM_STD_DECL) ) {
                        alt60=1;
                    }


                    switch (alt60) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1751);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop60;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:225:58: ( formalParameterVarargDecl )?
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt61=1;
                }
                switch (alt61) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1754);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:228:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final IfSwitchReplacementParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        IfSwitchReplacementParser.formalParameterStandardDecl_return retval = new IfSwitchReplacementParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:229:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:229:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1781); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1783);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1785);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1787);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:232:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final IfSwitchReplacementParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        IfSwitchReplacementParser.formalParameterVarargDecl_return retval = new IfSwitchReplacementParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:233:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:233:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1812); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1814);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1816);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1818);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:236:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final IfSwitchReplacementParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        IfSwitchReplacementParser.qualifiedIdentifier_return retval = new IfSwitchReplacementParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:237:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            else if ( (LA62_0==DOT) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:237:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1842); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:238:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1853); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1855);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1857); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:243:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final IfSwitchReplacementParser.annotationList_return annotationList() throws RecognitionException {
        IfSwitchReplacementParser.annotationList_return retval = new IfSwitchReplacementParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:244:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:244:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1884); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:244:27: ( annotation )*
                loop63:
                do {
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==AT) ) {
                        alt63=1;
                    }


                    switch (alt63) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1886);
                	    annotation();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop63;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:247:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final IfSwitchReplacementParser.annotation_return annotation() throws RecognitionException {
        IfSwitchReplacementParser.annotation_return retval = new IfSwitchReplacementParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:248:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:248:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation1908); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1910);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:248:34: ( annotationInit )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ANNOTATION_INIT_BLOCK) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation1912);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:251:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final IfSwitchReplacementParser.annotationInit_return annotationInit() throws RecognitionException {
        IfSwitchReplacementParser.annotationInit_return retval = new IfSwitchReplacementParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:252:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:252:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1938); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit1940);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:255:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final IfSwitchReplacementParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        IfSwitchReplacementParser.annotationInitializers_return retval = new IfSwitchReplacementParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:256:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt66=1;
            }
            else if ( (LA66_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:256:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1961); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:256:36: ( annotationInitializer )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==IDENT) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1963);
                    	    annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:257:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1976); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1978);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:260:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final IfSwitchReplacementParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        IfSwitchReplacementParser.annotationInitializer_return retval = new IfSwitchReplacementParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:261:5: ( ^( IDENT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:261:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer2003); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer2005);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:264:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final IfSwitchReplacementParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        IfSwitchReplacementParser.annotationElementValue_return retval = new IfSwitchReplacementParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:265:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt68=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt68=1;
                }
                break;
            case AT:
                {
                alt68=2;
                }
                break;
            case EXPR:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:265:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2030); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:265:41: ( annotationElementValue )*
                        loop67:
                        do {
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==AT||LA67_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA67_0==EXPR) ) {
                                alt67=1;
                            }


                            switch (alt67) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue2032);
                        	    annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop67;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:266:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2044);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:267:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue2054);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:270:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final IfSwitchReplacementParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        IfSwitchReplacementParser.annotationTopLevelScope_return retval = new IfSwitchReplacementParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:271:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:271:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2078); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:271:38: ( annotationScopeDeclarations )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==AT||LA69_0==CLASS||LA69_0==ENUM||LA69_0==INTERFACE||LA69_0==ANNOTATION_METHOD_DECL||LA69_0==VAR_DECLARATION) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2080);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop69;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:274:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final IfSwitchReplacementParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        IfSwitchReplacementParser.annotationScopeDeclarations_return retval = new IfSwitchReplacementParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:275:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt71=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt71=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt71=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:275:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2106); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2108);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2110);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2112); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:275:58: ( annotationDefaultValue )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DEFAULT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2114);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:276:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2127); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2129);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2131);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2133);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:277:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2144);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:280:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final IfSwitchReplacementParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        IfSwitchReplacementParser.annotationDefaultValue_return retval = new IfSwitchReplacementParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:281:5: ( ^( DEFAULT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:281:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2168); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2170);
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
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:286:1: block returns [StatementReturn r] : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final IfSwitchReplacementParser.block_return block() throws RecognitionException {
        IfSwitchReplacementParser.block_return retval = new IfSwitchReplacementParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        IfSwitchReplacementParser.blockStatement_return blockStatement5 = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:288:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:288:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2206); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:289:13: ( blockStatement )*
                loop72:
                do {
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==AT||LA72_0==SEMI||LA72_0==ASSERT||LA72_0==BREAK||(LA72_0>=CLASS && LA72_0<=CONTINUE)||LA72_0==DO||LA72_0==ENUM||(LA72_0>=FOR && LA72_0<=IF)||LA72_0==INTERFACE||LA72_0==RETURN||(LA72_0>=SWITCH && LA72_0<=SYNCHRONIZED)||LA72_0==THROW||LA72_0==TRY||LA72_0==WHILE||LA72_0==BLOCK_SCOPE||LA72_0==EXPR||LA72_0==FOR_EACH||LA72_0==LABELED_STATEMENT||LA72_0==VAR_DECLARATION) ) {
                        alt72=1;
                    }


                    switch (alt72) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:289:14: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2221);
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
                	    break loop72;
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
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:294:1: blockStatement returns [StatementReturn r] : ( localVariableDeclaration | typeDeclaration | s= statement );
    public final IfSwitchReplacementParser.blockStatement_return blockStatement() throws RecognitionException {
        IfSwitchReplacementParser.blockStatement_return retval = new IfSwitchReplacementParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        IfSwitchReplacementParser.statement_return s = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:296:5: ( localVariableDeclaration | typeDeclaration | s= statement )
            int alt73=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt73=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt73=2;
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
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:296:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2291);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:297:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2301);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:298:9: s= statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2313);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:301:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final IfSwitchReplacementParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        IfSwitchReplacementParser.localVariableDeclaration_return retval = new IfSwitchReplacementParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:302:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:302:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2339); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2341);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2343);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2345);
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
        public StatementReturn r;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:306:1: statement returns [StatementReturn r] : (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI );
    public final IfSwitchReplacementParser.statement_return statement() throws RecognitionException {
        IfSwitchReplacementParser.statement_return retval = new IfSwitchReplacementParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        IfSwitchReplacementParser.block_return b = null;

        IfSwitchReplacementParser.statement_return s = null;

        IfSwitchReplacementParser.block_return b1 = null;

        IfSwitchReplacementParser.block_return b2 = null;

        IfSwitchReplacementParser.ifSwitchTransformation_return ifSwitchTransformation6 = null;

        IfSwitchReplacementParser.expression_return expression7 = null;


        retval.r =new StatementReturn();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:308:5: (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI )
            int alt80=17;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:308:9: b= block
                    {
                    pushFollow(FOLLOW_block_in_statement2393);
                    b=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always=(b!=null?b.r:null).always;
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:309:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2406); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2408);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:309:29: ( expression )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==EXPR) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2410);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:310:9: ifSwitchTransformation
                    {
                    pushFollow(FOLLOW_ifSwitchTransformation_in_statement2422);
                    ifSwitchTransformation6=ifSwitchTransformation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.r.always = (ifSwitchTransformation6!=null?ifSwitchTransformation6.r:null).always;
                    }

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:311:9: ^( FOR forInit forCondition forUpdater s= statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2435); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2437);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2439);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2441);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2445);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:312:9: ^( FOR_EACH localModifierList type IDENT expression s= statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2459); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2461);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2463);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2465); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2467);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2471);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:313:9: ^( WHILE parenthesizedExpression s= statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2485); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2487);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2491);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:314:9: ^( DO s= statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2505); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2509);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2511);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:315:9: ^( TRY b1= block ( catches )? (b2= block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2523); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2527);
                    b1=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:315:24: ( catches )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2529);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:315:35: (b2= block )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BLOCK_SCOPE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: b2= block
                            {
                            pushFollow(FOLLOW_block_in_statement2534);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:316:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2549); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2551);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2553);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:317:9: ^( SYNCHRONIZED parenthesizedExpression b= block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2565); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2567);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2571);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:318:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2585); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:318:18: ( expression )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==EXPR) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2587);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:323:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2610); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2612);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:327:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2634); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:327:17: ( IDENT )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==IDENT) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2636); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:328:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2649); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:328:20: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2651); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:329:9: ^( LABELED_STATEMENT IDENT s= statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2664); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2666); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2670);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:330:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2683);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:331:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2693); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:334:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final IfSwitchReplacementParser.catches_return catches() throws RecognitionException {
        IfSwitchReplacementParser.catches_return retval = new IfSwitchReplacementParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:335:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:335:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2714); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:335:29: ( catchClause )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2716);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:338:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final IfSwitchReplacementParser.catchClause_return catchClause() throws RecognitionException {
        IfSwitchReplacementParser.catchClause_return retval = new IfSwitchReplacementParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:339:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:339:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2742); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2744);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2746);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:342:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final IfSwitchReplacementParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        IfSwitchReplacementParser.switchBlockLabels_return retval = new IfSwitchReplacementParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2767); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:35: ( switchCaseLabel )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CASE) ) {
                        int LA82_2 = input.LA(2);

                        if ( (synpred124_IfSwitchReplacementParser()) ) {
                            alt82=1;
                        }


                    }


                    switch (alt82) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2769);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:52: ( switchDefaultLabel )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DEFAULT) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2772);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:72: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2775);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:346:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final IfSwitchReplacementParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        IfSwitchReplacementParser.switchCaseLabel_return retval = new IfSwitchReplacementParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:347:5: ( ^( CASE expression ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:347:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2805); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2807);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:347:27: ( blockStatement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT||LA85_0==SEMI||LA85_0==ASSERT||LA85_0==BREAK||(LA85_0>=CLASS && LA85_0<=CONTINUE)||LA85_0==DO||LA85_0==ENUM||(LA85_0>=FOR && LA85_0<=IF)||LA85_0==INTERFACE||LA85_0==RETURN||(LA85_0>=SWITCH && LA85_0<=SYNCHRONIZED)||LA85_0==THROW||LA85_0==TRY||LA85_0==WHILE||LA85_0==BLOCK_SCOPE||LA85_0==EXPR||LA85_0==FOR_EACH||LA85_0==LABELED_STATEMENT||LA85_0==VAR_DECLARATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2809);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:350:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final IfSwitchReplacementParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        IfSwitchReplacementParser.switchDefaultLabel_return retval = new IfSwitchReplacementParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:351:5: ( ^( DEFAULT ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:351:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2835); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:351:19: ( blockStatement )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2837);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:354:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final IfSwitchReplacementParser.forInit_return forInit() throws RecognitionException {
        IfSwitchReplacementParser.forInit_return retval = new IfSwitchReplacementParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2863); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:20: ( localVariableDeclaration | ( expression )* )?
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

                        if ( (synpred131_IfSwitchReplacementParser()) ) {
                            alt88=2;
                        }
                        }
                        break;
                }

                switch (alt88) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2866);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:48: ( expression )*
                        {
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:48: ( expression )*
                        loop87:
                        do {
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==EXPR) ) {
                                alt87=1;
                            }


                            switch (alt87) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2870);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:358:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final IfSwitchReplacementParser.forCondition_return forCondition() throws RecognitionException {
        IfSwitchReplacementParser.forCondition_return retval = new IfSwitchReplacementParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:359:5: ( ^( FOR_CONDITION ( expression )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:359:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2898); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:359:25: ( expression )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==EXPR) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2900);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:362:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final IfSwitchReplacementParser.forUpdater_return forUpdater() throws RecognitionException {
        IfSwitchReplacementParser.forUpdater_return retval = new IfSwitchReplacementParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:363:5: ( ^( FOR_UPDATE ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:363:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2926); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:363:22: ( expression )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EXPR) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2928);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:368:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final IfSwitchReplacementParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        IfSwitchReplacementParser.parenthesizedExpression_return retval = new IfSwitchReplacementParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:369:5: ( ^( PARENTESIZED_EXPR expression ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:369:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2956); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression2958);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:372:1: expression : ^( EXPR expr ) ;
    public final IfSwitchReplacementParser.expression_return expression() throws RecognitionException {
        IfSwitchReplacementParser.expression_return retval = new IfSwitchReplacementParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:373:5: ( ^( EXPR expr ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:373:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression2983); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression2985);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:376:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final IfSwitchReplacementParser.expr_return expr() throws RecognitionException {
        IfSwitchReplacementParser.expr_return retval = new IfSwitchReplacementParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:377:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt91=43;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:377:9: ^( ASSIGN expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr3006); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3008);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3010);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:378:9: ^( PLUS_ASSIGN expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr3022); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3024);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3026);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:379:9: ^( MINUS_ASSIGN expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr3038); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3040);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3042);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:380:9: ^( STAR_ASSIGN expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr3054); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3056);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3058);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:381:9: ^( DIV_ASSIGN expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr3070); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3072);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3074);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:382:9: ^( AND_ASSIGN expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr3086); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3088);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3090);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:383:9: ^( OR_ASSIGN expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr3102); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3104);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3106);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:384:9: ^( XOR_ASSIGN expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr3118); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3120);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3122);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:385:9: ^( MOD_ASSIGN expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr3134); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3136);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3138);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:386:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3150); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3152);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3154);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:387:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3166); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3168);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3170);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:388:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3182); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3184);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3186);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:389:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3198); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3200);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3202);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3204);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:390:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3216); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3218);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3220);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:391:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3232); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3234);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3236);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:392:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3248); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3250);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3252);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:393:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3264); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3266);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3268);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:394:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3280); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3282);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3284);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:395:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3296); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3298);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3300);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:396:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3312); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3314);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3316);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:397:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3328); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3330);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3332);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:398:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3344); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3346);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3348);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:399:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3360); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3362);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3364);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:400:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3376); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3378);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3380);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:401:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3392); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3394);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3396);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:402:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3408); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3410);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3412);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:403:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3424); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3426);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3428);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:404:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3440); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3442);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3444);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 29 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:405:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3456); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3458);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3460);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 30 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:406:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3472); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3474);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3476);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 31 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:407:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3488); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3490);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3492);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 32 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:408:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3504); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3506);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3508);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 33 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:409:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3520); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3522);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3524);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 34 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:410:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3536); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3538);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 35 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:411:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3550); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3552);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 36 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:412:9: ^( PRE_INC expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3564); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3566);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 37 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:413:9: ^( PRE_DEC expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3578); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3580);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 38 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:414:9: ^( POST_INC expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr3592); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3594);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 39 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:415:9: ^( POST_DEC expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3606); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3608);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 40 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:416:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3620); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3622);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 41 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:417:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3634); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3636);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 42 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:418:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3648); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3650);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3652);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 43 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:419:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3663);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:422:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final IfSwitchReplacementParser.primaryExpression_return primaryExpression() throws RecognitionException {
        IfSwitchReplacementParser.primaryExpression_return retval = new IfSwitchReplacementParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:423:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt95=11;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:423:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3689); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:424:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
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
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:424:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3707);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:425:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
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
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:425:21: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3729); if (state.failed) return retval;

                                    }
                                    break;
                                case 2 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:426:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3751); if (state.failed) return retval;

                                    }
                                    break;
                                case 3 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:427:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3773); if (state.failed) return retval;

                                    }
                                    break;
                                case 4 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:428:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3795);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:429:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3817); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:431:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression3853);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3855); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:432:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression3873); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3875); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:435:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression3909);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:436:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3919); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:437:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3930); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3932);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:437:41: ( genericTypeArgumentList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression3934);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_primaryExpression3937);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:438:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression3948);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:439:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3959); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3961);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression3963);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:440:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3974);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:441:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression3984);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:442:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3994); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:443:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4004);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:444:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4014); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:447:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final IfSwitchReplacementParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        IfSwitchReplacementParser.explicitConstructorCall_return retval = new IfSwitchReplacementParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:448:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:448:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4038); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:448:33: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4040);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4043);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:449:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4055); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:449:34: ( primaryExpression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DOT||LA97_0==FALSE||LA97_0==NULL||LA97_0==SUPER||LA97_0==THIS||LA97_0==TRUE||LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==METHOD_CALL||LA97_0==PARENTESIZED_EXPR||(LA97_0>=STATIC_ARRAY_CREATOR && LA97_0<=SUPER_CONSTRUCTOR_CALL)||LA97_0==THIS_CONSTRUCTOR_CALL||(LA97_0>=IDENT && LA97_0<=STRING_LITERAL)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4057);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:449:53: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4060);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4063);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:452:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final IfSwitchReplacementParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        IfSwitchReplacementParser.arrayTypeDeclarator_return retval = new IfSwitchReplacementParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4084); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4087);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4091);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:453:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4095);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:456:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final IfSwitchReplacementParser.newExpression_return newExpression() throws RecognitionException {
        IfSwitchReplacementParser.newExpression_return retval = new IfSwitchReplacementParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:457:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:457:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4119); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:458:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
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
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:458:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression4137);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4139);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:459:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:459:17: ( genericTypeArgumentList )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4157);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4160);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4162);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:462:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4197); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:462:34: ( genericTypeArgumentList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4199);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4202);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4204);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:462:88: ( classTopLevelScope )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4206);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:465:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final IfSwitchReplacementParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        IfSwitchReplacementParser.innerNewExpression_return retval = new IfSwitchReplacementParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:466:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:466:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4229); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:466:34: ( genericTypeArgumentList )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4231);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4234); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4236);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:466:75: ( classTopLevelScope )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4238);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:469:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final IfSwitchReplacementParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        IfSwitchReplacementParser.newArrayConstruction_return retval = new IfSwitchReplacementParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:470:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:470:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4263);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4265);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:471:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:471:9: ( expression )+
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
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4275);
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

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:471:21: ( arrayDeclaratorList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4278);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:474:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final IfSwitchReplacementParser.arguments_return arguments() throws RecognitionException {
        IfSwitchReplacementParser.arguments_return retval = new IfSwitchReplacementParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:475:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:475:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4299); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:475:25: ( expression )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==EXPR) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4301);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:478:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final IfSwitchReplacementParser.literal_return literal() throws RecognitionException {
        IfSwitchReplacementParser.literal_return retval = new IfSwitchReplacementParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:479:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:490:1: ifSwitchTransformation returns [StatementReturn r] : ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? ) ;
    public final IfSwitchReplacementParser.ifSwitchTransformation_return ifSwitchTransformation() throws RecognitionException {
        ifSwitchTransformation_stack.push(new ifSwitchTransformation_scope());
        IfSwitchReplacementParser.ifSwitchTransformation_return retval = new IfSwitchReplacementParser.ifSwitchTransformation_return();
        retval.start = input.LT(1);
        int ifSwitchTransformation_StartIndex = input.index();
        IfSwitchReplacementParser.statement_return ifTrue = null;

        IfSwitchReplacementParser.statement_return ifFalse = null;

        IfSwitchReplacementParser.parenthesizedExpression_return parenthesizedExpression8 = null;



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
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:521:9: ( ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:524:3: ^( IF parenthesizedExpression ifTrue= statement (ifFalse= statement )? )
            {
            match(input,IF,FOLLOW_IF_in_ifSwitchTransformation4479); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_parenthesizedExpression_in_ifSwitchTransformation4484);
            parenthesizedExpression8=parenthesizedExpression();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_statement_in_ifSwitchTransformation4512);
            ifTrue=statement();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:526:32: (ifFalse= statement )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==SEMI||LA112_0==ASSERT||LA112_0==BREAK||LA112_0==CONTINUE||LA112_0==DO||(LA112_0>=FOR && LA112_0<=IF)||LA112_0==RETURN||(LA112_0>=SWITCH && LA112_0<=SYNCHRONIZED)||LA112_0==THROW||LA112_0==TRY||LA112_0==WHILE||LA112_0==BLOCK_SCOPE||LA112_0==EXPR||LA112_0==FOR_EACH||LA112_0==LABELED_STATEMENT) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: ifFalse= statement
                    {
                    pushFollow(FOLLOW_statement_in_ifSwitchTransformation4540);
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
            if ( state.backtracking>0 ) { memoize(input, 74, ifSwitchTransformation_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:563:1: classAdditionalCode[CommonTree tree] : ;
    public final IfSwitchReplacementParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        IfSwitchReplacementParser.classAdditionalCode_return retval = new IfSwitchReplacementParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:567:2: ()
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:568:3: 
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
            if ( state.backtracking>0 ) { memoize(input, 75, classAdditionalCode_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:575:1: additionalImports[CommonTree tree] : ;
    public final IfSwitchReplacementParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        IfSwitchReplacementParser.additionalImports_return retval = new IfSwitchReplacementParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:579:2: ()
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:580:3: 
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
            if ( state.backtracking>0 ) { memoize(input, 76, additionalImports_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalImports"

    // $ANTLR start synpred124_IfSwitchReplacementParser
    public final void synpred124_IfSwitchReplacementParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:35: ( switchCaseLabel )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:343:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred124_IfSwitchReplacementParser2769);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred124_IfSwitchReplacementParser

    // $ANTLR start synpred131_IfSwitchReplacementParser
    public final void synpred131_IfSwitchReplacementParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:48: ( ( expression )* )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:48: ( expression )*
        {
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:355:48: ( expression )*
        loop134:
        do {
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==EXPR) ) {
                alt134=1;
            }


            switch (alt134) {
        	case 1 :
        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\IfSwitchReplacementParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred131_IfSwitchReplacementParser2870);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop134;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred131_IfSwitchReplacementParser

    // Delegated rules

    public final boolean synpred124_IfSwitchReplacementParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred124_IfSwitchReplacementParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_IfSwitchReplacementParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_IfSwitchReplacementParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA49_eotS =
        "\14\uffff";
    static final String DFA49_eofS =
        "\14\uffff";
    static final String DFA49_minS =
        "\1\7\13\uffff";
    static final String DFA49_maxS =
        "\1\146\13\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA49_specialS =
        "\14\uffff}>";
    static final String[] DFA49_transitionS = {
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "164:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
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
            return "306:1: statement returns [StatementReturn r] : (b= block | ^( ASSERT expression ( expression )? ) | ifSwitchTransformation | ^( FOR forInit forCondition forUpdater s= statement ) | ^( FOR_EACH localModifierList type IDENT expression s= statement ) | ^( WHILE parenthesizedExpression s= statement ) | ^( DO s= statement parenthesizedExpression ) | ^( TRY b1= block ( catches )? (b2= block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression b= block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT s= statement ) | expression | SEMI );";
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
            return "376:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );";
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
            return "422:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource130 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource132 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource135 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource138 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource141 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration194 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration197 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDeclaration_in_typeDeclaration225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration264 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration266 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration285 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration326 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration330 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration333 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration336 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause378 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause407 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause409 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList441 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter465 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound497 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope521 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant552 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant554 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope589 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations644 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations648 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constructorDeclaration_in_classScopeDeclarations659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclarations_in_classScopeDeclarations669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_constructorDeclaration713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_constructorDeclaration715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_constructorDeclaration717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_constructorDeclaration720 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_constructorDeclaration722 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_constructorDeclaration725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodDeclarations760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodDeclarations762 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodDeclarations764 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodDeclarations769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclarations773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_methodDeclarations777 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodDeclarations779 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodDeclarations782 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_methodDeclarations785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodDeclarations798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodDeclarations800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodDeclarations802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodDeclarations807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_methodDeclarations811 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodDeclarations813 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_methodDeclarations816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope844 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations872 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations874 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations881 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations883 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations908 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations910 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations925 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList962 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator986 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId1014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1066 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1088 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1090 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1120 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1144 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1168 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1311 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1365 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1369 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1396 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1534 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1714 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1749 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1751 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1783 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1814 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1886 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1910 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation1912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1963 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1976 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer2003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer2005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2030 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue2032 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2080 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2108 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2112 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2129 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2221 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2341 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2408 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifSwitchTransformation_in_statement2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2441 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2461 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2465 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2467 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2487 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2527 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_catches_in_statement2529 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement2534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2567 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_statement2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2666 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_statement2670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2716 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2744 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_block_in_catchClause2746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2769 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2772 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2775 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2807 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2809 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2837 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2870 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2928 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression2958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression2983 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression2985 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr3006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3008 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr3022 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3024 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr3038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3040 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr3054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3056 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr3070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3072 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr3086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3088 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr3102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3104 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3106 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr3118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3120 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr3134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3136 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3152 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3154 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3168 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3184 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr3198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3200 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3202 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3218 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3234 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3250 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3266 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3282 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3298 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3300 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3314 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3330 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3346 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3362 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3378 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3394 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3410 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3426 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3442 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3458 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3474 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3476 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3490 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3506 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3508 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3522 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr3564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr3578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr3592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr3606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3650 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3707 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression3853 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression3873 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3875 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3932 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression3934 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression3937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3961 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4040 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4057 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4060 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4084 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4087 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4091 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4095 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4137 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4139 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4160 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4202 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4204 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4234 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4236 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4238 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4263 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4275 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4301 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifSwitchTransformation4479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_ifSwitchTransformation4484 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_ifSwitchTransformation4512 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000110002004L});
    public static final BitSet FOLLOW_statement_in_ifSwitchTransformation4540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred124_IfSwitchReplacementParser2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred131_IfSwitchReplacementParser2870 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}