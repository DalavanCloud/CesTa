// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g 2012-12-09 01:11:34

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
 * This tree rewrite parser provides protection against error induction.
 * Each variable with supported type (currently byte, boolean) is transformed
 * into bigger type containing integrity information, which is updated on each
 * modification and checked on each read access.
 **/
public class IntegrityVariablesParser extends AbstractTreeParser {
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


        public IntegrityVariablesParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public IntegrityVariablesParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[290+1];
             
             
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

    	
        


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:31:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final IntegrityVariablesParser.javaSource_return javaSource() throws RecognitionException {
        IntegrityVariablesParser.javaSource_return retval = new IntegrityVariablesParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        IntegrityVariablesParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:32:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:32:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource124); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource126);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:32:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource128);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:32:58: ( importDeclaration )*
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
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource131);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:32:77: ( typeDeclaration )*
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
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource134);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource137);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:35:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final IntegrityVariablesParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        IntegrityVariablesParser.packageDeclaration_return retval = new IntegrityVariablesParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:36:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:36:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration159); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration161);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:39:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final IntegrityVariablesParser.importDeclaration_return importDeclaration() throws RecognitionException {
        IntegrityVariablesParser.importDeclaration_return retval = new IntegrityVariablesParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:40:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:40:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration188); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:40:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration190); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration193);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:40:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration195); if (state.failed) return retval;

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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:43:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final IntegrityVariablesParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        IntegrityVariablesParser.typeDeclaration_return retval = new IntegrityVariablesParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:44:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:44:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration221); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration223);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration225); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:44:36: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration227);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:44:62: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration230);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:44:77: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration233);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration236);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:45:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration248); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration250);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration252); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:45:40: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration254);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:45:66: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration257);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration260);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:46:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration272); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration274);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration276); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:46:35: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration278);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration281);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:47:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration293); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration295);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration297); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration299);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:50:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final IntegrityVariablesParser.extendsClause_return extendsClause() throws RecognitionException {
        IntegrityVariablesParser.extendsClause_return retval = new IntegrityVariablesParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause336); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:52:26: ( type )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause338);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:55:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final IntegrityVariablesParser.implementsClause_return implementsClause() throws RecognitionException {
        IntegrityVariablesParser.implementsClause_return retval = new IntegrityVariablesParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:56:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:56:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause367); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:56:29: ( type )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause369);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:59:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final IntegrityVariablesParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        IntegrityVariablesParser.genericTypeParameterList_return retval = new IntegrityVariablesParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:60:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:60:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList399); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:60:35: ( genericTypeParameter )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList401);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final IntegrityVariablesParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        IntegrityVariablesParser.genericTypeParameter_return retval = new IntegrityVariablesParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:5: ( ^( IDENT ( bound )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter423); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter425);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:67:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final IntegrityVariablesParser.bound_return bound() throws RecognitionException {
        IntegrityVariablesParser.bound_return retval = new IntegrityVariablesParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:68:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:68:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound455); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:68:30: ( type )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound457);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:71:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.enumTopLevelScope_return retval = new IntegrityVariablesParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:72:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:72:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope479); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:72:32: ( enumConstant )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope481);
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

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:72:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope484);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:75:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser.enumConstant_return enumConstant() throws RecognitionException {
        IntegrityVariablesParser.enumConstant_return retval = new IntegrityVariablesParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:76:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:76:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant510); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant512);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:76:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant514);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:76:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant517);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:80:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final IntegrityVariablesParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.classTopLevelScope_return retval = new IntegrityVariablesParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:81:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:81:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope548); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:81:33: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope550);
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
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope554);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final IntegrityVariablesParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.classScopeDeclarations_return retval = new IntegrityVariablesParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
            int alt32=7;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt32=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt32=2;
                }
                break;
            case FUNCTION_METHOD_DECL:
                {
                alt32=3;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt32=4;
                }
                break;
            case VAR_DECLARATION:
                {
                alt32=5;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt32=6;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt32=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations579); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations581);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:86:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations593); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations595);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:87:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations607); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations609);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:87:45: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations611);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_classScopeDeclarations614);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations616); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations618);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:87:102: ( arrayDeclaratorList )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ARRAY_DECLARATOR_LIST) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations620);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:87:123: ( throwsClause )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THROWS_CLAUSE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations623);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:87:137: ( block )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BLOCK_SCOPE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations626);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:88:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations639); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations641);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:88:41: ( genericTypeParameterList )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations643);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations646); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations648);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:88:93: ( throwsClause )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THROWS_CLAUSE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations650);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:88:107: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BLOCK_SCOPE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations653);
                            block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:89:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations666); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations668);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations670);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations672);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:90:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations684); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations686);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:90:41: ( genericTypeParameterList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations688);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations691);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:90:87: ( throwsClause )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==THROWS_CLAUSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations693);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classScopeDeclarations696);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:91:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations707);
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

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:94:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final IntegrityVariablesParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.interfaceTopLevelScope_return retval = new IntegrityVariablesParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:95:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:95:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope731); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:95:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==INTERFACE||LA33_0==FUNCTION_METHOD_DECL||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope733);
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
            if ( state.backtracking>0 ) { memoize(input, 14, interfaceTopLevelScope_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:98:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final IntegrityVariablesParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.interfaceScopeDeclarations_return retval = new IntegrityVariablesParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations759); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations761);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:45: ( genericTypeParameterList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations763);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations766);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations768); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations770);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:102: ( arrayDeclaratorList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations772);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:123: ( throwsClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THROWS_CLAUSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations775);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:100:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations788); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations790);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:100:41: ( genericTypeParameterList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations792);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations795); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations797);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:100:93: ( throwsClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THROWS_CLAUSE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations799);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:104:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations890); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations892);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations894);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations896);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:105:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations907);
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
            if ( state.backtracking>0 ) { memoize(input, 15, interfaceScopeDeclarations_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:108:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final IntegrityVariablesParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        IntegrityVariablesParser.variableDeclaratorList_return retval = new IntegrityVariablesParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:109:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:109:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList927); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:109:31: ( variableDeclarator )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList929);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 16, variableDeclaratorList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:112:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final IntegrityVariablesParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        IntegrityVariablesParser.variableDeclarator_return retval = new IntegrityVariablesParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:113:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:113:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator951); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator953);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:113:47: ( variableInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator955);
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
            if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarator_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:116:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final IntegrityVariablesParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        IntegrityVariablesParser.variableDeclaratorId_return retval = new IntegrityVariablesParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:117:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:117:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId981); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:117:17: ( arrayDeclaratorList )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId983);
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
            if ( state.backtracking>0 ) { memoize(input, 18, variableDeclaratorId_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:1: variableInitializer : ( arrayInitializer | expression );
    public final IntegrityVariablesParser.variableInitializer_return variableInitializer() throws RecognitionException {
        IntegrityVariablesParser.variableInitializer_return retval = new IntegrityVariablesParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:121:5: ( arrayInitializer | expression )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:121:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1004);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:122:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1014);
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
            if ( state.backtracking>0 ) { memoize(input, 19, variableInitializer_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:125:1: arrayDeclarator : LBRACK RBRACK ;
    public final IntegrityVariablesParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        IntegrityVariablesParser.arrayDeclarator_return retval = new IntegrityVariablesParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:126:5: ( LBRACK RBRACK )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:126:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1033); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1035); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, arrayDeclarator_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:129:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final IntegrityVariablesParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        IntegrityVariablesParser.arrayDeclaratorList_return retval = new IntegrityVariablesParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:130:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:130:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1055); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:130:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1057); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 21, arrayDeclaratorList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final IntegrityVariablesParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        IntegrityVariablesParser.arrayInitializer_return retval = new IntegrityVariablesParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:134:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:134:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1085); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:134:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1087);
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
            if ( state.backtracking>0 ) { memoize(input, 22, arrayInitializer_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:137:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final IntegrityVariablesParser.throwsClause_return throwsClause() throws RecognitionException {
        IntegrityVariablesParser.throwsClause_return retval = new IntegrityVariablesParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:138:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:138:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1109); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:138:25: ( qualifiedIdentifier )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1111);
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
            if ( state.backtracking>0 ) { memoize(input, 23, throwsClause_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:141:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final IntegrityVariablesParser.modifierList_return modifierList() throws RecognitionException {
        IntegrityVariablesParser.modifierList_return retval = new IntegrityVariablesParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1133); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AT||LA47_0==ABSTRACT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0>=PRIVATE && LA47_0<=PUBLIC)||(LA47_0>=STATIC && LA47_0<=STRICTFP)||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1135);
                	    modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 24, modifierList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:145:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final IntegrityVariablesParser.modifier_return modifier() throws RecognitionException {
        IntegrityVariablesParser.modifier_return retval = new IntegrityVariablesParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt48=11;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1156); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:147:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1166); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:148:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1176); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:149:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1186); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:150:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1196); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:151:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1206); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:152:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1216); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:153:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1226); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:154:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1236); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:155:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1246); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:156:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1256);
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
            if ( state.backtracking>0 ) { memoize(input, 25, modifier_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:159:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final IntegrityVariablesParser.localModifierList_return localModifierList() throws RecognitionException {
        IntegrityVariablesParser.localModifierList_return retval = new IntegrityVariablesParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1276); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:160:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1278);
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
            if ( state.backtracking>0 ) { memoize(input, 26, localModifierList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:163:1: localModifier : ( FINAL | annotation );
    public final IntegrityVariablesParser.localModifier_return localModifier() throws RecognitionException {
        IntegrityVariablesParser.localModifier_return retval = new IntegrityVariablesParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:164:5: ( FINAL | annotation )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:164:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1299); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:165:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1309);
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
            if ( state.backtracking>0 ) { memoize(input, 27, localModifier_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:168:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final IntegrityVariablesParser.type_return type() throws RecognitionException {
        IntegrityVariablesParser.type_return retval = new IntegrityVariablesParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1329); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:16: ( primitiveType | qualifiedTypeIdent )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1332);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1336);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:169:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1339);
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
            if ( state.backtracking>0 ) { memoize(input, 28, type_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:172:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final IntegrityVariablesParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        IntegrityVariablesParser.qualifiedTypeIdent_return retval = new IntegrityVariablesParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:173:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:173:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1361); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:173:32: ( typeIdent )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1363);
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
            if ( state.backtracking>0 ) { memoize(input, 29, qualifiedTypeIdent_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:176:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final IntegrityVariablesParser.typeIdent_return typeIdent() throws RecognitionException {
        IntegrityVariablesParser.typeIdent_return retval = new IntegrityVariablesParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:177:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:177:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1386); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:177:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1388);
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
            if ( state.backtracking>0 ) { memoize(input, 30, typeIdent_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:180:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final IntegrityVariablesParser.primitiveType_return primitiveType() throws RecognitionException {
        IntegrityVariablesParser.primitiveType_return retval = new IntegrityVariablesParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:
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
            if ( state.backtracking>0 ) { memoize(input, 31, primitiveType_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:191:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final IntegrityVariablesParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        IntegrityVariablesParser.genericTypeArgumentList_return retval = new IntegrityVariablesParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:192:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:192:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1499); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:192:33: ( genericTypeArgument )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1501);
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
            if ( state.backtracking>0 ) { memoize(input, 32, genericTypeArgumentList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:195:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final IntegrityVariablesParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        IntegrityVariablesParser.genericTypeArgument_return retval = new IntegrityVariablesParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:196:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:196:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1526);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:197:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1537); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:197:20: ( genericWildcardBoundType )?
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==EXTENDS||LA56_0==SUPER) ) {
                            alt56=1;
                        }
                        switch (alt56) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1539);
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
            if ( state.backtracking>0 ) { memoize(input, 33, genericTypeArgument_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:200:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final IntegrityVariablesParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        IntegrityVariablesParser.genericWildcardBoundType_return retval = new IntegrityVariablesParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:201:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:201:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1679); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1681);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:202:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1693); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1695);
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
            if ( state.backtracking>0 ) { memoize(input, 34, genericWildcardBoundType_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:205:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final IntegrityVariablesParser.formalParameterList_return formalParameterList() throws RecognitionException {
        IntegrityVariablesParser.formalParameterList_return retval = new IntegrityVariablesParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:206:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:206:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1716); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:206:29: ( formalParameterStandardDecl )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==FORMAL_PARAM_STD_DECL) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1718);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);

                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:206:58: ( formalParameterVarargDecl )?
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt60=1;
                }
                switch (alt60) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1721);
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
            if ( state.backtracking>0 ) { memoize(input, 35, formalParameterList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:209:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final IntegrityVariablesParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        IntegrityVariablesParser.formalParameterStandardDecl_return retval = new IntegrityVariablesParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:210:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:210:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1748); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1750);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1752);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1754);
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
            if ( state.backtracking>0 ) { memoize(input, 36, formalParameterStandardDecl_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:213:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final IntegrityVariablesParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        IntegrityVariablesParser.formalParameterVarargDecl_return retval = new IntegrityVariablesParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:214:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:214:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1779); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1781);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1783);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1785);
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
            if ( state.backtracking>0 ) { memoize(input, 37, formalParameterVarargDecl_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:217:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final IntegrityVariablesParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        IntegrityVariablesParser.qualifiedIdentifier_return retval = new IntegrityVariablesParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:218:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:218:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1809); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:219:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1820); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1822);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1824); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 38, qualifiedIdentifier_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:224:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final IntegrityVariablesParser.annotationList_return annotationList() throws RecognitionException {
        IntegrityVariablesParser.annotationList_return retval = new IntegrityVariablesParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:225:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:225:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1851); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:225:27: ( annotation )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1853);
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
            if ( state.backtracking>0 ) { memoize(input, 39, annotationList_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:228:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final IntegrityVariablesParser.annotation_return annotation() throws RecognitionException {
        IntegrityVariablesParser.annotation_return retval = new IntegrityVariablesParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:229:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:229:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation1875); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1877);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:229:34: ( annotationInit )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ANNOTATION_INIT_BLOCK) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation1879);
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
            if ( state.backtracking>0 ) { memoize(input, 40, annotation_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:232:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final IntegrityVariablesParser.annotationInit_return annotationInit() throws RecognitionException {
        IntegrityVariablesParser.annotationInit_return retval = new IntegrityVariablesParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:233:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:233:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1905); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit1907);
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
            if ( state.backtracking>0 ) { memoize(input, 41, annotationInit_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:236:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final IntegrityVariablesParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        IntegrityVariablesParser.annotationInitializers_return retval = new IntegrityVariablesParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:237:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:237:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1928); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:237:36: ( annotationInitializer )+
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
                    	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1930);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:238:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1943); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1945);
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
            if ( state.backtracking>0 ) { memoize(input, 42, annotationInitializers_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:241:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final IntegrityVariablesParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        IntegrityVariablesParser.annotationInitializer_return retval = new IntegrityVariablesParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:242:5: ( ^( IDENT annotationElementValue ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:242:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer1970); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer1972);
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
            if ( state.backtracking>0 ) { memoize(input, 43, annotationInitializer_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:245:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final IntegrityVariablesParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        IntegrityVariablesParser.annotationElementValue_return retval = new IntegrityVariablesParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:246:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:246:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1997); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:246:41: ( annotationElementValue )*
                        loop66:
                        do {
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==AT||LA66_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA66_0==EXPR) ) {
                                alt66=1;
                            }


                            switch (alt66) {
                        	case 1 :
                        	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue1999);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:247:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2011);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:248:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue2021);
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
            if ( state.backtracking>0 ) { memoize(input, 44, annotationElementValue_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:251:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final IntegrityVariablesParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.annotationTopLevelScope_return retval = new IntegrityVariablesParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:252:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:252:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2045); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:252:38: ( annotationScopeDeclarations )*
                loop68:
                do {
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AT||LA68_0==CLASS||LA68_0==ENUM||LA68_0==INTERFACE||LA68_0==ANNOTATION_METHOD_DECL||LA68_0==VAR_DECLARATION) ) {
                        alt68=1;
                    }


                    switch (alt68) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2047);
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
            if ( state.backtracking>0 ) { memoize(input, 45, annotationTopLevelScope_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:255:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final IntegrityVariablesParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.annotationScopeDeclarations_return retval = new IntegrityVariablesParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:256:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:256:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2073); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2075);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2077);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2079); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:256:58: ( annotationDefaultValue )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DEFAULT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2081);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:257:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2094); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2096);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2098);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2100);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:258:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2111);
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
            if ( state.backtracking>0 ) { memoize(input, 46, annotationScopeDeclarations_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:261:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final IntegrityVariablesParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        IntegrityVariablesParser.annotationDefaultValue_return retval = new IntegrityVariablesParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:262:5: ( ^( DEFAULT annotationElementValue ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:262:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2135); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2137);
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
            if ( state.backtracking>0 ) { memoize(input, 47, annotationDefaultValue_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:267:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final IntegrityVariablesParser.block_return block() throws RecognitionException {
        IntegrityVariablesParser.block_return retval = new IntegrityVariablesParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:268:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:268:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2160); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:268:23: ( blockStatement )*
                loop71:
                do {
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==AT||LA71_0==SEMI||LA71_0==ASSERT||LA71_0==BREAK||(LA71_0>=CLASS && LA71_0<=CONTINUE)||LA71_0==DO||LA71_0==ENUM||(LA71_0>=FOR && LA71_0<=IF)||LA71_0==INTERFACE||LA71_0==RETURN||(LA71_0>=SWITCH && LA71_0<=SYNCHRONIZED)||LA71_0==THROW||LA71_0==TRY||LA71_0==WHILE||LA71_0==BLOCK_SCOPE||LA71_0==EXPR||LA71_0==FOR_EACH||LA71_0==LABELED_STATEMENT||LA71_0==VAR_DECLARATION) ) {
                        alt71=1;
                    }


                    switch (alt71) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2162);
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
            if ( state.backtracking>0 ) { memoize(input, 48, block_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:271:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final IntegrityVariablesParser.blockStatement_return blockStatement() throws RecognitionException {
        IntegrityVariablesParser.blockStatement_return retval = new IntegrityVariablesParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:272:5: ( localVariableDeclaration | typeDeclaration | statement )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:272:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2187);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:273:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2197);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:274:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2207);
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
            if ( state.backtracking>0 ) { memoize(input, 49, blockStatement_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:277:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final IntegrityVariablesParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        IntegrityVariablesParser.localVariableDeclaration_return retval = new IntegrityVariablesParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:278:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:278:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2231); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2233);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2235);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2237);
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
            if ( state.backtracking>0 ) { memoize(input, 50, localVariableDeclaration_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:282:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final IntegrityVariablesParser.statement_return statement() throws RecognitionException {
        IntegrityVariablesParser.statement_return retval = new IntegrityVariablesParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:283:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt80=17;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:283:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2270);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:284:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2281); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2283);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:284:29: ( expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==EXPR) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2285);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:285:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2298); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2300);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2302);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:285:48: ( statement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==SEMI||LA74_0==ASSERT||LA74_0==BREAK||LA74_0==CONTINUE||LA74_0==DO||(LA74_0>=FOR && LA74_0<=IF)||LA74_0==RETURN||(LA74_0>=SWITCH && LA74_0<=SYNCHRONIZED)||LA74_0==THROW||LA74_0==TRY||LA74_0==WHILE||LA74_0==BLOCK_SCOPE||LA74_0==EXPR||LA74_0==FOR_EACH||LA74_0==LABELED_STATEMENT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2304);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:286:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2317); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2319);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2321);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2323);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2325);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:287:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2337); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2339);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2341);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2343); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2345);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2347);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:288:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2360); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2362);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2364);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:289:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2376); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2378);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2380);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:290:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2392); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2394);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:290:21: ( catches )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2396);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:290:30: ( block )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BLOCK_SCOPE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement2399);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:291:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2414); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2416);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2418);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:292:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2430); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2432);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2434);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:293:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2446); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:293:18: ( expression )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==EXPR) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2448);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:294:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2461); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2463);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:295:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2475); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:295:17: ( IDENT )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==IDENT) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2477); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:296:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2490); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:296:20: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2492); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:297:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2505); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2507); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2509);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:298:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2520);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:299:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2530); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, statement_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:302:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final IntegrityVariablesParser.catches_return catches() throws RecognitionException {
        IntegrityVariablesParser.catches_return retval = new IntegrityVariablesParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:303:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:303:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2559); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:303:29: ( catchClause )+
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
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2561);
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
            if ( state.backtracking>0 ) { memoize(input, 52, catches_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:306:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final IntegrityVariablesParser.catchClause_return catchClause() throws RecognitionException {
        IntegrityVariablesParser.catchClause_return retval = new IntegrityVariablesParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:307:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:307:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2587); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2589);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2591);
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
            if ( state.backtracking>0 ) { memoize(input, 53, catchClause_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:310:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final IntegrityVariablesParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        IntegrityVariablesParser.switchBlockLabels_return retval = new IntegrityVariablesParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2612); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:35: ( switchCaseLabel )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CASE) ) {
                        int LA82_2 = input.LA(2);

                        if ( (synpred125_IntegrityVariablesParser()) ) {
                            alt82=1;
                        }


                    }


                    switch (alt82) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2614);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);

                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:52: ( switchDefaultLabel )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DEFAULT) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2617);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:72: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2620);
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
            if ( state.backtracking>0 ) { memoize(input, 54, switchBlockLabels_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:314:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final IntegrityVariablesParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        IntegrityVariablesParser.switchCaseLabel_return retval = new IntegrityVariablesParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:315:5: ( ^( CASE expression ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:315:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2650); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2652);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:315:27: ( blockStatement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT||LA85_0==SEMI||LA85_0==ASSERT||LA85_0==BREAK||(LA85_0>=CLASS && LA85_0<=CONTINUE)||LA85_0==DO||LA85_0==ENUM||(LA85_0>=FOR && LA85_0<=IF)||LA85_0==INTERFACE||LA85_0==RETURN||(LA85_0>=SWITCH && LA85_0<=SYNCHRONIZED)||LA85_0==THROW||LA85_0==TRY||LA85_0==WHILE||LA85_0==BLOCK_SCOPE||LA85_0==EXPR||LA85_0==FOR_EACH||LA85_0==LABELED_STATEMENT||LA85_0==VAR_DECLARATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2654);
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
            if ( state.backtracking>0 ) { memoize(input, 55, switchCaseLabel_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:318:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final IntegrityVariablesParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        IntegrityVariablesParser.switchDefaultLabel_return retval = new IntegrityVariablesParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:319:5: ( ^( DEFAULT ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:319:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2680); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:319:19: ( blockStatement )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2682);
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
            if ( state.backtracking>0 ) { memoize(input, 56, switchDefaultLabel_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:322:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final IntegrityVariablesParser.forInit_return forInit() throws RecognitionException {
        IntegrityVariablesParser.forInit_return retval = new IntegrityVariablesParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2708); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:20: ( localVariableDeclaration | ( expression )* )?
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

                        if ( (synpred132_IntegrityVariablesParser()) ) {
                            alt88=2;
                        }
                        }
                        break;
                }

                switch (alt88) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2711);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:48: ( expression )*
                        {
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:48: ( expression )*
                        loop87:
                        do {
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==EXPR) ) {
                                alt87=1;
                            }


                            switch (alt87) {
                        	case 1 :
                        	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2715);
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
            if ( state.backtracking>0 ) { memoize(input, 57, forInit_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:326:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final IntegrityVariablesParser.forCondition_return forCondition() throws RecognitionException {
        IntegrityVariablesParser.forCondition_return retval = new IntegrityVariablesParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:327:5: ( ^( FOR_CONDITION ( expression )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:327:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2743); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:327:25: ( expression )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==EXPR) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2745);
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
            if ( state.backtracking>0 ) { memoize(input, 58, forCondition_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:330:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final IntegrityVariablesParser.forUpdater_return forUpdater() throws RecognitionException {
        IntegrityVariablesParser.forUpdater_return retval = new IntegrityVariablesParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:331:5: ( ^( FOR_UPDATE ( expression )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:331:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2771); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:331:22: ( expression )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EXPR) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2773);
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
            if ( state.backtracking>0 ) { memoize(input, 59, forUpdater_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:336:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final IntegrityVariablesParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        IntegrityVariablesParser.parenthesizedExpression_return retval = new IntegrityVariablesParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:337:5: ( ^( PARENTESIZED_EXPR expression ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:337:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2801); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression2803);
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
            if ( state.backtracking>0 ) { memoize(input, 60, parenthesizedExpression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:340:1: expression : ^( EXPR expr ) ;
    public final IntegrityVariablesParser.expression_return expression() throws RecognitionException {
        IntegrityVariablesParser.expression_return retval = new IntegrityVariablesParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:341:5: ( ^( EXPR expr ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:341:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression2828); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression2830);
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
            if ( state.backtracking>0 ) { memoize(input, 61, expression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:344:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final IntegrityVariablesParser.expr_return expr() throws RecognitionException {
        IntegrityVariablesParser.expr_return retval = new IntegrityVariablesParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:345:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt91=43;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:345:9: ^( ASSIGN expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr2851); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2853);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2855);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:346:9: ^( PLUS_ASSIGN expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr2867); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2869);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2871);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:347:9: ^( MINUS_ASSIGN expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr2883); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2885);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2887);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:348:9: ^( STAR_ASSIGN expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr2899); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2901);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2903);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:349:9: ^( DIV_ASSIGN expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr2915); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2917);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2919);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:350:9: ^( AND_ASSIGN expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr2931); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2933);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2935);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:351:9: ^( OR_ASSIGN expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr2947); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2949);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2951);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:352:9: ^( XOR_ASSIGN expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr2963); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2965);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2967);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:353:9: ^( MOD_ASSIGN expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr2979); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2981);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2983);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:354:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr2995); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2997);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2999);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:355:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3011); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3013);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3015);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:356:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3027); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3029);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3031);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:357:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3043); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3045);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3047);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3049);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:358:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3061); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3063);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3065);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:359:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3077); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3079);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3081);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:360:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3093); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3095);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3097);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:361:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3109); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3111);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3113);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:362:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3125); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3127);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3129);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:363:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3141); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3143);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3145);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:364:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3157); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3159);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3161);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:365:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3173); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3175);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3177);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:366:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3189); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3191);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3193);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:367:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3205); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3207);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3209);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:368:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3221); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3223);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3225);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:369:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3237); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3239);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3241);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:370:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3253); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3255);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3257);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:371:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3269); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3271);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3273);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:372:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3285); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3287);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3289);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 29 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:373:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3301); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3303);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3305);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 30 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:374:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3317); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3319);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3321);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 31 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:375:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3333); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3335);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3337);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 32 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:376:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3349); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3351);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3353);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 33 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:377:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3365); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3367);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3369);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 34 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:378:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3381); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3383);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 35 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:379:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3395); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3397);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 36 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:380:9: ^( PRE_INC expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3409); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3411);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 37 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:381:9: ^( PRE_DEC expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3423); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3425);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 38 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:382:9: ^( POST_INC expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr3437); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3439);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 39 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:383:9: ^( POST_DEC expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3451); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3453);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 40 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:384:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3465); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3467);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 41 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:385:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3479); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3481);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 42 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:386:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3493); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3495);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3497);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 43 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:387:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3508);
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
            if ( state.backtracking>0 ) { memoize(input, 62, expr_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:390:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final IntegrityVariablesParser.primaryExpression_return primaryExpression() throws RecognitionException {
        IntegrityVariablesParser.primaryExpression_return retval = new IntegrityVariablesParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:391:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt95=11;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:391:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3534); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:392:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
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
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:392:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3552);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:393:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
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
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:393:21: IDENT
                                    {
                                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3574); if (state.failed) return retval;

                                    }
                                    break;
                                case 2 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:394:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3596); if (state.failed) return retval;

                                    }
                                    break;
                                case 3 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:395:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3618); if (state.failed) return retval;

                                    }
                                    break;
                                case 4 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:396:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3640);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:397:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3662); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:399:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression3698);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3700); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:400:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression3718); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3720); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:403:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression3754);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:404:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3764); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:405:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression3775); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3777);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:405:41: ( genericTypeArgumentList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression3779);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_primaryExpression3782);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:406:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression3793);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:407:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3804); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression3806);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression3808);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:408:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3819);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:409:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression3829);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:410:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3839); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:411:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression3849);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:412:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3859); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, primaryExpression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:415:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final IntegrityVariablesParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        IntegrityVariablesParser.explicitConstructorCall_return retval = new IntegrityVariablesParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:416:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:416:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3883); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:416:33: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3885);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall3888);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:417:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3900); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:417:34: ( primaryExpression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DOT||LA97_0==FALSE||LA97_0==NULL||LA97_0==SUPER||LA97_0==THIS||LA97_0==TRUE||LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==METHOD_CALL||LA97_0==PARENTESIZED_EXPR||(LA97_0>=STATIC_ARRAY_CREATOR && LA97_0<=SUPER_CONSTRUCTOR_CALL)||LA97_0==THIS_CONSTRUCTOR_CALL||(LA97_0>=IDENT && LA97_0<=STRING_LITERAL)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall3902);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:417:53: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3905);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall3908);
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
            if ( state.backtracking>0 ) { memoize(input, 64, explicitConstructorCall_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:420:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final IntegrityVariablesParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        IntegrityVariablesParser.arrayTypeDeclarator_return retval = new IntegrityVariablesParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3929); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3932);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3936);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:421:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator3940);
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
            if ( state.backtracking>0 ) { memoize(input, 65, arrayTypeDeclarator_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:424:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final IntegrityVariablesParser.newExpression_return newExpression() throws RecognitionException {
        IntegrityVariablesParser.newExpression_return retval = new IntegrityVariablesParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:425:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:425:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3964); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:426:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
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
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:426:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression3982);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression3984);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:427:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:427:17: ( genericTypeArgumentList )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4002);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4005);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4007);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:430:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4042); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:430:34: ( genericTypeArgumentList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4044);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4047);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4049);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:430:88: ( classTopLevelScope )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4051);
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
            if ( state.backtracking>0 ) { memoize(input, 66, newExpression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:433:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        IntegrityVariablesParser.innerNewExpression_return retval = new IntegrityVariablesParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:434:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:434:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4074); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:434:34: ( genericTypeArgumentList )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4076);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4079); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4081);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:434:75: ( classTopLevelScope )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4083);
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
            if ( state.backtracking>0 ) { memoize(input, 67, innerNewExpression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:437:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final IntegrityVariablesParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        IntegrityVariablesParser.newArrayConstruction_return retval = new IntegrityVariablesParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:438:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:438:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4108);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4110);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:439:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:439:9: ( expression )+
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
                    	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4120);
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

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:439:21: ( arrayDeclaratorList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4123);
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
            if ( state.backtracking>0 ) { memoize(input, 68, newArrayConstruction_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:442:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final IntegrityVariablesParser.arguments_return arguments() throws RecognitionException {
        IntegrityVariablesParser.arguments_return retval = new IntegrityVariablesParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:443:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:443:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4144); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:443:25: ( expression )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==EXPR) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4146);
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
            if ( state.backtracking>0 ) { memoize(input, 69, arguments_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:446:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final IntegrityVariablesParser.literal_return literal() throws RecognitionException {
        IntegrityVariablesParser.literal_return retval = new IntegrityVariablesParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:447:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:
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
            if ( state.backtracking>0 ) { memoize(input, 70, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class additionalImports_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "additionalImports"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:458:1: additionalImports[CommonTree tree] : ;
    public final IntegrityVariablesParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.additionalImports_return retval = new IntegrityVariablesParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:462:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:463:9: 
            {
            if ( state.backtracking==0 ) {

                          if (tree!=null){
                              getLogger().finer("Adding additional imports");
                              StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                              tokens.insertBefore(tree.getTokenStartIndex(), st);
                          }
                      
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, additionalImports_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:472:1: classAdditionalCode[CommonTree tree] : ;
    public final IntegrityVariablesParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.classAdditionalCode_return retval = new IntegrityVariablesParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:476:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:477:9: 
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
                      
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, classAdditionalCode_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classAdditionalCode"

    // $ANTLR start synpred125_IntegrityVariablesParser
    public final void synpred125_IntegrityVariablesParser_fragment() throws RecognitionException {   
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:35: ( switchCaseLabel )
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred125_IntegrityVariablesParser2614);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_IntegrityVariablesParser

    // $ANTLR start synpred132_IntegrityVariablesParser
    public final void synpred132_IntegrityVariablesParser_fragment() throws RecognitionException {   
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:48: ( ( expression )* )
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:48: ( expression )*
        {
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:48: ( expression )*
        loop142:
        do {
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==EXPR) ) {
                alt142=1;
            }


            switch (alt142) {
        	case 1 :
        	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred132_IntegrityVariablesParser2715);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop142;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred132_IntegrityVariablesParser

    // Delegated rules

    public final boolean synpred132_IntegrityVariablesParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_IntegrityVariablesParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_IntegrityVariablesParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_IntegrityVariablesParser_fragment(); // can never throw exception
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
            return "145:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
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
            return "282:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
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
            return "344:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );";
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
            return "390:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource126 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource128 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource131 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource134 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration190 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration193 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration225 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration227 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration230 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration233 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration260 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration276 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration278 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration297 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause338 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause369 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList401 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound457 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope481 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant512 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant514 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope550 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations609 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations611 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations618 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations620 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations623 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations648 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations650 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations668 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations691 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations693 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope733 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations759 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations761 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations763 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations770 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations772 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations797 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations892 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations896 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList927 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList929 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator953 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1033 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1057 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1087 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1111 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1135 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1278 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1329 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1332 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1336 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1363 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1501 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1718 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1750 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1781 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1853 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation1875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1877 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation1879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1930 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer1970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer1972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue1999 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2047 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2075 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2079 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2096 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2162 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2233 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2281 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2283 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2300 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2302 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2323 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2339 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2343 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2345 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2362 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2394 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement2396 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2414 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2432 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2463 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2507 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2561 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2587 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2589 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause2591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2614 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2617 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2620 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2652 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2654 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2682 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2715 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2773 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression2828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression2830 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr2851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2853 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr2867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2869 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr2883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2885 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr2899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2901 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr2915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2917 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr2931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2933 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr2947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2949 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr2963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2965 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr2979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2981 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr2995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2997 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3013 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3029 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr3043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3045 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3047 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3063 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3079 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3095 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3111 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3127 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3143 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3159 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3175 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3191 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3207 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3223 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3225 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3239 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3255 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3271 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3287 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3303 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3319 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3335 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3349 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3351 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3367 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3381 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr3409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr3423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr3437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr3451 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3495 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3552 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3574 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3640 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression3698 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression3718 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression3775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3777 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression3779 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression3782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression3804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3806 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3808 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3883 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3885 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall3902 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3905 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3932 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3936 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator3940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression3982 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression3984 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4005 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4047 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4049 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4079 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4081 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4083 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4108 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4120 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4146 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_IntegrityVariablesParser2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred132_IntegrityVariablesParser2715 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}