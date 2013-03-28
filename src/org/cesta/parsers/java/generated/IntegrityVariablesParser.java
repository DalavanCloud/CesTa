// $ANTLR 3.4 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g 2013-03-28 20:14:18

package org.cesta.parsers.java.generated;

// import java.util.Map;
// import java.util.HashMap;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
import org.cesta.parsers.java.IntegrityVariablesMembers;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class IntegrityVariablesParser extends IntegrityVariablesMembers {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ASSIGN", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "COLON", "COMMA", "DEC", "DIV", "DIV_ASSIGN", "DOT", "DOTSTAR", "ELLIPSIS", "EQUAL", "GREATER_OR_EQUAL", "GREATER_THAN", "INC", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "MINUS", "MINUS_ASSIGN", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "OR", "OR_ASSIGN", "PLUS", "PLUS_ASSIGN", "QUESTION", "RBRACK", "RCURLY", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "STAR", "STAR_ASSIGN", "XOR", "XOR_ASSIGN", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INTERFACE", "IMPORT", "INT", "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "BLOCK_SCOPE", "CAST_EXPR", "CATCH_CLAUSE_LIST", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "CONSTRUCTOR_DECL", "ENUM_TOP_LEVEL_SCOPE", "EXPR", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "INTERFACE_TOP_LEVEL_SCOPE", "IMPLEMENTS_CLAUSE", "LABELED_STATEMENT", "LOCAL_MODIFIER_LIST", "JAVA_SOURCE", "METHOD_CALL", "MODIFIER_LIST", "PARENTESIZED_EXPR", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUALIFIED_TYPE_IDENT", "STATIC_ARRAY_CREATOR", "SUPER_CONSTRUCTOR_CALL", "SWITCH_BLOCK_LABEL_LIST", "THIS_CONSTRUCTOR_CALL", "THROWS_CLAUSE", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID_METHOD_DECL", "IDENT", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "JAVA_ID_START", "JAVA_ID_PART", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288", "289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324", "325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335"
    };

    public static final int EOF=-1;
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
    public static final int DIV_ASSIGN=14;
    public static final int LOGICAL_AND=26;
    public static final int BREAK=56;
    public static final int UNARY_PLUS=159;
    public static final int BIT_SHIFT_RIGHT_ASSIGN=9;
    public static final int TYPE=157;
    public static final int RPAREN=43;
    public static final int INC=21;
    public static final int FINAL=70;
    public static final int IMPORT=78;
    public static final int STRING_LITERAL=170;
    public static final int FOR_UPDATE=132;
    public static final int FLOATING_POINT_LITERAL=168;
    public static final int CAST_EXPR=118;
    public static final int NOT_EQUAL=35;
    public static final int VOID_METHOD_DECL=163;
    public static final int THIS=95;
    public static final int RETURN=88;
    public static final int DOUBLE=65;
    public static final int ENUM_TOP_LEVEL_SCOPE=125;
    public static final int VOID=101;
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
    public static final int DEC=12;
    public static final int PROTECTED=86;
    public static final int CLASS=61;
    public static final int LBRACK=22;
    public static final int BIT_SHIFT_RIGHT=8;
    public static final int THROWS_CLAUSE=156;
    public static final int GREATER_OR_EQUAL=19;
    public static final int FOR=73;
    public static final int THIS_CONSTRUCTOR_CALL=155;
    public static final int LOGICAL_NOT=27;
    public static final int FLOAT=72;
    public static final int ABSTRACT=53;
    public static final int AND=4;
    public static final int POST_DEC=147;
    public static final int AND_ASSIGN=5;
    public static final int STATIC_ARRAY_CREATOR=152;
    public static final int MODIFIER_LIST=145;
    public static final int ANNOTATION_SCOPE=110;
    public static final int LPAREN=29;
    public static final int IF=74;
    public static final int AT=7;
    public static final int ESCAPE_SEQUENCE=175;
    public static final int CONSTRUCTOR_DECL=124;
    public static final int LABELED_STATEMENT=141;
    public static final int UNICODE_ESCAPE=176;
    public static final int EXPR=126;
    public static final int SYNCHRONIZED=94;
    public static final int BOOLEAN=55;
    public static final int CLASS_TOP_LEVEL_SCOPE=123;
    public static final int IMPLEMENTS=75;
    public static final int CONTINUE=62;
    public static final int COMMA=11;
    public static final int TRANSIENT=98;
    public static final int EQUAL=18;
    public static final int XOR_ASSIGN=52;
    public static final int LOGICAL_OR=28;
    public static final int IDENT=164;
    public static final int QUALIFIED_TYPE_IDENT=151;
    public static final int ARGUMENT_LIST=112;
    public static final int PLUS=38;
    public static final int HEX_LITERAL=165;
    public static final int ANNOTATION_INIT_BLOCK=105;
    public static final int DOT=15;
    public static final int SHIFT_LEFT_ASSIGN=46;
    public static final int FORMAL_PARAM_LIST=133;
    public static final int GENERIC_TYPE_ARG_LIST=137;
    public static final int ANNOTATION_TOP_LEVEL_SCOPE=111;
    public static final int DOTSTAR=16;
    public static final int BYTE=57;
    public static final int XOR=51;
    public static final int JAVA_ID_PART=179;
    public static final int GREATER_THAN=20;
    public static final int VOLATILE=102;
    public static final int PARENTESIZED_EXPR=146;
    public static final int CLASS_STATIC_INITIALIZER=122;
    public static final int ARRAY_DECLARATOR_LIST=114;
    public static final int LESS_OR_EQUAL=24;
    public static final int DEFAULT=63;
    public static final int OCTAL_LITERAL=166;
    public static final int HEX_DIGIT=171;
    public static final int SHORT=89;
    public static final int INSTANCEOF=76;
    public static final int MINUS=30;
    public static final int EXTENDS_CLAUSE=128;
    public static final int TRUE=99;
    public static final int SEMI=44;
    public static final int STAR_ASSIGN=50;
    public static final int VAR_DECLARATOR_LIST=162;
    public static final int ARRAY_DECLARATOR=113;
    public static final int COLON=10;
    public static final int OR_ASSIGN=37;
    public static final int ENUM=67;
    public static final int NEWLINE=181;
    public static final int QUESTION=40;
    public static final int FINALLY=71;
    public static final int RCURLY=42;
    public static final int PLUS_ASSIGN=39;
    public static final int ASSIGN=6;
    public static final int ANNOTATION_INIT_ARRAY_ELEMENT=104;
    public static final int FUNCTION_METHOD_DECL=136;
    public static final int INTERFACE=77;
    public static final int POST_INC=148;
    public static final int DIV=13;
    public static final int CLASS_CONSTRUCTOR_CALL=120;
    public static final int LONG=80;
    public static final int FOR_EACH=130;
    public static final int EXTENDS=68;
    public static final int PUBLIC=87;
    public static final int ARRAY_INITIALIZER=116;
    public static final int CATCH_CLAUSE_LIST=119;
    public static final int SUPER_CONSTRUCTOR_CALL=153;

    // delegates
    public IntegrityVariablesParser_JavaTreeParser gJavaTreeParser;
    public IntegrityVariablesMembers[] getDelegates() {
        return new IntegrityVariablesMembers[] {gJavaTreeParser};
    }

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
        this.state.ruleMemo = new HashMap[436+1];
         

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

    	
        public Variable getVariable(String id) {
            if (id.contains(".")) {
                // TODO: make difference between global and local variable
                String[] parts = id.split("\\.");
                id = parts[parts.length - 1];
            }
            for (int i = Variables_stack.size() - 1; i >= 0; i--) {
                if (((Variables_scope)Variables_stack.elementAt(i)).variableTypes == null) {
                    System.out.println("variable '" + id + "': types " + i + " null");
                    continue;
                }
                if (((Variables_scope)Variables_stack.elementAt(i)).variableTypes.containsKey(id)) {
                    return ((Variables_scope)Variables_stack.elementAt(i)).variableTypes.get(id);
                }
            }
            return null;
        }


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "javaSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:56:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final IntegrityVariablesParser.javaSource_return javaSource() throws RecognitionException {
        IntegrityVariablesParser.javaSource_return retval = new IntegrityVariablesParser.javaSource_return();
        retval.start = input.LT(1);

        int javaSource_StartIndex = input.index();

        IntegrityVariablesParser.typeDeclaration_return typeDeclaration1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource136); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource138);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:38: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource140);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:58: importDeclaration
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


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:57:77: typeDeclaration
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:61:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final IntegrityVariablesParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        IntegrityVariablesParser.typeDeclaration_return retval = new IntegrityVariablesParser.typeDeclaration_return();
        retval.start = input.LT(1);

        int typeDeclaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:62:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:62:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration171);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration183); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration185);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration187); if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:40: ( genericTypeParameterList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:40: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration189);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:66: ( extendsClause )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXTENDS_CLAUSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:63:66: extendsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration207); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration209);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration211); if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:35: ( implementsClause )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IMPLEMENTS_CLAUSE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:64:35: implementsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:65:9: ^( AT modifierList IDENT annotationTopLevelScope )
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:69:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final IntegrityVariablesParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser.classTopLevelScope_return retval = new IntegrityVariablesParser.classTopLevelScope_return();
        retval.start = input.LT(1);

        int classTopLevelScope_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope256); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:33: ( classScopeDeclarations )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==AT||LA8_0==CLASS||LA8_0==ENUM||LA8_0==INTERFACE||(LA8_0 >= CLASS_INSTANCE_INITIALIZER && LA8_0 <= CLASS_STATIC_INITIALIZER)||LA8_0==CONSTRUCTOR_DECL||LA8_0==FUNCTION_METHOD_DECL||LA8_0==VAR_DECLARATION||LA8_0==VOID_METHOD_DECL) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:70:33: classScopeDeclarations
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:74:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration );
    public final IntegrityVariablesParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.classScopeDeclarations_return retval = new IntegrityVariablesParser.classScopeDeclarations_return();
        retval.start = input.LT(1);

        int classScopeDeclarations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:75:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:75:9: ^( CLASS_INSTANCE_INITIALIZER block )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:76:9: ^( CLASS_STATIC_INITIALIZER block )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:77:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations311);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:78:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_classScopeDeclarations322);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:79:9: typeDeclaration
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:83:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration );
    public final IntegrityVariablesParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser.interfaceScopeDeclarations_return retval = new IntegrityVariablesParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);

        int interfaceScopeDeclarations_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations354); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations356);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:45: ( genericTypeParameterList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:45: genericTypeParameterList
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

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:102: ( arrayDeclaratorList )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ARRAY_DECLARATOR_LIST) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:102: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations367);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:123: ( throwsClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==THROWS_CLAUSE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:84:123: throwsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations383); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations385);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:41: ( genericTypeParameterList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:41: genericTypeParameterList
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

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:93: ( throwsClause )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THROWS_CLAUSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:85:93: throwsClause
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:89:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations484);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:90:9: typeDeclaration
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:97:1: additionalImports[CommonTree tree] :;
    public final IntegrityVariablesParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.additionalImports_return retval = new IntegrityVariablesParser.additionalImports_return();
        retval.start = input.LT(1);

        int additionalImports_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:98:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:99:9: 
            {
            if ( state.backtracking==0 ) {
                        addImports(tree);
                    }

            }

        }
        finally {
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:105:1: classAdditionalCode[CommonTree tree] :;
    public final IntegrityVariablesParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        IntegrityVariablesParser.classAdditionalCode_return retval = new IntegrityVariablesParser.classAdditionalCode_return();
        retval.start = input.LT(1);

        int classAdditionalCode_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:106:5: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:107:9: 
            {
            if ( state.backtracking==0 ) {
                        addCode(tree);
                    }

            }

        }
        finally {
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:113:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
    public final IntegrityVariablesParser.classDeclaration_return classDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.classDeclaration_return retval = new IntegrityVariablesParser.classDeclaration_return();
        retval.start = input.LT(1);

        int classDeclaration_StartIndex = input.index();

        	
                        // initializes a scope for class attributes
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:119:2: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:3: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration582); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration584);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;

            match(input,IDENT,FOLLOW_IDENT_in_classDeclaration586); if (state.failed) return retval;

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:30: ( genericTypeParameterList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:30: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration588);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:56: ( extendsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==EXTENDS_CLAUSE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:56: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration591);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:71: ( implementsClause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IMPLEMENTS_CLAUSE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:120:71: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration594);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration597);
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:124:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) );
    public final IntegrityVariablesParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.methodScopeDeclarations_return retval = new IntegrityVariablesParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);

        int methodScopeDeclarations_StartIndex = input.index();


                        // initializes a scope for local variables in a method
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:130:2: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:3: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations632); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations634);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:39: ( genericTypeParameterList )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:39: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations636);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_type_in_methodScopeDeclarations639);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations641); if (state.failed) return retval;

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations643);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:96: ( arrayDeclaratorList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ARRAY_DECLARATOR_LIST) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:96: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations645);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:117: ( throwsClause )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THROWS_CLAUSE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:117: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations648);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:131: ( block )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==BLOCK_SCOPE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:131:131: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations651);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:4: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations659); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations661);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:36: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:36: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations663);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations666); if (state.failed) return retval;

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations668);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:88: ( throwsClause )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THROWS_CLAUSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:88: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations670);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:102: ( block )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==BLOCK_SCOPE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:132:102: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations673);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:4: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations681); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations683);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:36: ( genericTypeParameterList )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:36: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations685);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations688);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:82: ( throwsClause )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==THROWS_CLAUSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:133:82: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations690);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_block_in_methodScopeDeclarations693);
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:136:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final IntegrityVariablesParser.block_return block() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.block_return retval = new IntegrityVariablesParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();


        		// initializes a scope for local variables in a block of code
                        ((Variables_scope)Variables_stack.peek()).variableTypes = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:9: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:13: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block727); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:27: ( blockStatement )*
                loop29:
                do {
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==AT||LA29_0==SEMI||LA29_0==ASSERT||LA29_0==BREAK||(LA29_0 >= CLASS && LA29_0 <= CONTINUE)||LA29_0==DO||LA29_0==ENUM||(LA29_0 >= FOR && LA29_0 <= IF)||LA29_0==INTERFACE||LA29_0==RETURN||(LA29_0 >= SWITCH && LA29_0 <= SYNCHRONIZED)||LA29_0==THROW||LA29_0==TRY||LA29_0==WHILE||LA29_0==BLOCK_SCOPE||LA29_0==EXPR||LA29_0==FOR_EACH||LA29_0==LABELED_STATEMENT||LA29_0==VAR_DECLARATION) ) {
                        alt29=1;
                    }


                    switch (alt29) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:142:27: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block729);
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:146:1: globalVariableDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final IntegrityVariablesParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.globalVariableDeclaration_return retval = new IntegrityVariablesParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        int globalVariableDeclaration_StartIndex = input.index();

        IntegrityVariablesParser_JavaTreeParser.type_return type2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 299) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:148:2: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:149:3: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration766); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_globalVariableDeclaration772);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_type_in_globalVariableDeclaration778);
            type2=type();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                                             ((Variables_scope)Variables_stack.peek()).type =(type2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type2.start),input.getTreeAdaptor().getTokenStopIndex(type2.start))):null);
                                             // TODO: replace only if all variables should be replaced
                                             // TODO: split the declaration if some variables should be replaced and some not
                                             replaceType((CommonTree) (type2!=null?((CommonTree)type2.start):null), (type2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type2.start),input.getTreeAdaptor().getTokenStopIndex(type2.start))):null));
                                         }

            pushFollow(FOLLOW_variableDeclaratorList_in_globalVariableDeclaration785);
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
        	// do for sure before leaving
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:162:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final IntegrityVariablesParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.localVariableDeclaration_return retval = new IntegrityVariablesParser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        int localVariableDeclaration_StartIndex = input.index();

        IntegrityVariablesParser_JavaTreeParser.type_return type3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 300) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:164:2: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:165:3: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration817); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration823);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;

            pushFollow(FOLLOW_type_in_localVariableDeclaration829);
            type3=type();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                                              ((Variables_scope)Variables_stack.peek()).type =(type3!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type3.start),input.getTreeAdaptor().getTokenStopIndex(type3.start))):null);
                                              replaceType((CommonTree) (type3!=null?((CommonTree)type3.start):null), (type3!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(type3.start),input.getTreeAdaptor().getTokenStopIndex(type3.start))):null));
                                         }

            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration836);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 300, localVariableDeclaration_StartIndex); }

            Variables_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"


    protected static class variableDeclarator_scope {
        String id;
        String type;
    }
    protected Stack variableDeclarator_stack = new Stack();


    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variableDeclarator"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:176:1: variableDeclarator : ^( VAR_DECLARATOR i= variableDeclaratorId ( variableInitializer )? ) ;
    public final IntegrityVariablesParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        IntegrityVariablesParser.variableDeclarator_return retval = new IntegrityVariablesParser.variableDeclarator_return();
        retval.start = input.LT(1);

        int variableDeclarator_StartIndex = input.index();

        IntegrityVariablesParser.variableDeclaratorId_return i =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 301) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:5: ( ^( VAR_DECLARATOR i= variableDeclaratorId ( variableInitializer )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:9: ^( VAR_DECLARATOR i= variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator868); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator872);
            i=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {((variableDeclarator_scope)variableDeclarator_stack.peek()).id =(i!=null?i.id:null); ((variableDeclarator_scope)variableDeclarator_stack.peek()).type =(i!=null?i.type:null);}

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:117: ( variableInitializer )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ARRAY_INITIALIZER||LA30_0==EXPR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:181:117: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator876);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 301, variableDeclarator_StartIndex); }

            variableDeclarator_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"


    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public String id;
        public String type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "variableDeclaratorId"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:185:1: variableDeclaratorId returns [String id, String type] : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final IntegrityVariablesParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        Variables_stack.push(new Variables_scope());

        IntegrityVariablesParser.variableDeclaratorId_return retval = new IntegrityVariablesParser.variableDeclaratorId_return();
        retval.start = input.LT(1);

        int variableDeclaratorId_StartIndex = input.index();

        CommonTree IDENT4=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 302) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:187:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:188:13: ^( IDENT ( arrayDeclaratorList )? )
            {
            IDENT4=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId922); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                                    Variable var = new Variable((IDENT4!=null?IDENT4.getText():null), ((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-1-1)).type);
                                    ((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-2-1)).variableTypes.put((IDENT4!=null?IDENT4.getText():null), var);
                                    retval.id =(IDENT4!=null?IDENT4.getText():null);
                                    retval.type =((Variables_scope)Variables_stack.elementAt(Variables_stack.size()-1-1)).type;
                                }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:194:21: ( arrayDeclaratorList )?
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ARRAY_DECLARATOR_LIST) ) {
                    alt31=1;
                }
                switch (alt31) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:194:21: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId946);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 302, variableDeclaratorId_StartIndex); }

            Variables_stack.pop();

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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:199:1: variableInitializer : ( arrayInitializer |e= expression );
    public final IntegrityVariablesParser.variableInitializer_return variableInitializer() throws RecognitionException {
        IntegrityVariablesParser.variableInitializer_return retval = new IntegrityVariablesParser.variableInitializer_return();
        retval.start = input.LT(1);

        int variableInitializer_StartIndex = input.index();

        IntegrityVariablesParser_JavaTreeParser.expression_return e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 303) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:200:5: ( arrayInitializer |e= expression )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARRAY_INITIALIZER) ) {
                alt32=1;
            }
            else if ( (LA32_0==EXPR) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:200:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer981);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:201:9: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer993);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                                             Variable var = new Variable(((variableDeclarator_scope)variableDeclarator_stack.peek()).id, ((variableDeclarator_scope)variableDeclarator_stack.peek()).type);
                                             setResistantType((e!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e.start),input.getTreeAdaptor().getTokenStopIndex(e.start))):null), var, (CommonTree) (e!=null?((CommonTree)e.start):null));
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 303, variableInitializer_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableInitializer"


    public static class assignExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "assignExpression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:208:1: assignExpression : ( ^( ASSIGN variable= leftExpr value= expr ) | ^(a= PLUS_ASSIGN variable= leftExpr value= expr ) | ^(a= MINUS_ASSIGN variable= leftExpr value= expr ) | ^(a= STAR_ASSIGN variable= leftExpr value= expr ) | ^(a= DIV_ASSIGN variable= leftExpr value= expr ) | ^(a= AND_ASSIGN variable= leftExpr value= expr ) | ^(a= OR_ASSIGN variable= leftExpr value= expr ) | ^(a= XOR_ASSIGN variable= leftExpr value= expr ) | ^(a= MOD_ASSIGN variable= leftExpr value= expr ) | ^(a= BIT_SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr ) | ^(a= SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr ) | ^(a= SHIFT_LEFT_ASSIGN variable= leftExpr value= expr ) | ^( PRE_INC variable= leftExpr ) | ^( PRE_DEC variable= leftExpr ) | ^( POST_INC variable= leftExpr ) | ^( POST_DEC variable= leftExpr ) );
    public final IntegrityVariablesParser.assignExpression_return assignExpression() throws RecognitionException {
        IntegrityVariablesParser.assignExpression_return retval = new IntegrityVariablesParser.assignExpression_return();
        retval.start = input.LT(1);

        int assignExpression_StartIndex = input.index();

        CommonTree a=null;
        CommonTree PRE_INC5=null;
        CommonTree PRE_DEC6=null;
        CommonTree POST_INC7=null;
        CommonTree POST_DEC8=null;
        IntegrityVariablesParser.leftExpr_return variable =null;

        IntegrityVariablesParser.expr_return value =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 304) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:209:5: ( ^( ASSIGN variable= leftExpr value= expr ) | ^(a= PLUS_ASSIGN variable= leftExpr value= expr ) | ^(a= MINUS_ASSIGN variable= leftExpr value= expr ) | ^(a= STAR_ASSIGN variable= leftExpr value= expr ) | ^(a= DIV_ASSIGN variable= leftExpr value= expr ) | ^(a= AND_ASSIGN variable= leftExpr value= expr ) | ^(a= OR_ASSIGN variable= leftExpr value= expr ) | ^(a= XOR_ASSIGN variable= leftExpr value= expr ) | ^(a= MOD_ASSIGN variable= leftExpr value= expr ) | ^(a= BIT_SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr ) | ^(a= SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr ) | ^(a= SHIFT_LEFT_ASSIGN variable= leftExpr value= expr ) | ^( PRE_INC variable= leftExpr ) | ^( PRE_DEC variable= leftExpr ) | ^( POST_INC variable= leftExpr ) | ^( POST_DEC variable= leftExpr ) )
            int alt33=16;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt33=1;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt33=2;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt33=3;
                }
                break;
            case STAR_ASSIGN:
                {
                alt33=4;
                }
                break;
            case DIV_ASSIGN:
                {
                alt33=5;
                }
                break;
            case AND_ASSIGN:
                {
                alt33=6;
                }
                break;
            case OR_ASSIGN:
                {
                alt33=7;
                }
                break;
            case XOR_ASSIGN:
                {
                alt33=8;
                }
                break;
            case MOD_ASSIGN:
                {
                alt33=9;
                }
                break;
            case BIT_SHIFT_RIGHT_ASSIGN:
                {
                alt33=10;
                }
                break;
            case SHIFT_RIGHT_ASSIGN:
                {
                alt33=11;
                }
                break;
            case SHIFT_LEFT_ASSIGN:
                {
                alt33=12;
                }
                break;
            case PRE_INC:
                {
                alt33=13;
                }
                break;
            case PRE_DEC:
                {
                alt33=14;
                }
                break;
            case POST_INC:
                {
                alt33=15;
                }
                break;
            case POST_DEC:
                {
                alt33=16;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:210:2: ^( ASSIGN variable= leftExpr value= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpression1015); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1019);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1023);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setResistantType((value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) (value!=null?((CommonTree)value.start):null)); }

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:212:9: ^(a= PLUS_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignExpression1042); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1046);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1050);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "+", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:214:9: ^(a= MINUS_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignExpression1069); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1073);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1077);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "-", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:216:9: ^(a= STAR_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_assignExpression1096); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1100);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1104);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "*", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:218:9: ^(a= DIV_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignExpression1123); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1127);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1131);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "/", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:220:9: ^(a= AND_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_assignExpression1150); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1154);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1158);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "&", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:222:9: ^(a= OR_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_assignExpression1177); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1181);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1185);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "|", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:224:9: ^(a= XOR_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_assignExpression1204); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1208);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1212);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "^", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:226:9: ^(a= MOD_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignExpression1231); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1235);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1239);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "%", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:228:9: ^(a= BIT_SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression1258); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1262);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1266);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "<<<", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:230:9: ^(a= SHIFT_RIGHT_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression1285); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1289);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1293);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), ">>", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:232:9: ^(a= SHIFT_LEFT_ASSIGN variable= leftExpr value= expr )
                    {
                    a=(CommonTree)match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression1312); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1316);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_assignExpression1320);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setAssign((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null), (value!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(value.start),input.getTreeAdaptor().getTokenStopIndex(value.start))):null), "<<", getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), (CommonTree) a); }

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:234:9: ^( PRE_INC variable= leftExpr )
                    {
                    PRE_INC5=(CommonTree)match(input,PRE_INC,FOLLOW_PRE_INC_in_assignExpression1337); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1341);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setPreIncDec(getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), "+", (CommonTree) PRE_INC5); }

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:236:9: ^( PRE_DEC variable= leftExpr )
                    {
                    PRE_DEC6=(CommonTree)match(input,PRE_DEC,FOLLOW_PRE_DEC_in_assignExpression1379); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1383);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setPreIncDec(getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), "-", (CommonTree) PRE_DEC6); }

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:238:9: ^( POST_INC variable= leftExpr )
                    {
                    POST_INC7=(CommonTree)match(input,POST_INC,FOLLOW_POST_INC_in_assignExpression1421); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1425);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setPostIncDec(getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), "+", (CommonTree) POST_INC7); }

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:240:9: ^( POST_DEC variable= leftExpr )
                    {
                    POST_DEC8=(CommonTree)match(input,POST_DEC,FOLLOW_POST_DEC_in_assignExpression1463); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_leftExpr_in_assignExpression1467);
                    variable=leftExpr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    if ( state.backtracking==0 ) { setPostIncDec(getVariable((variable!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable.start),input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)), "-", (CommonTree) POST_DEC8); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 304, assignExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignExpression"


    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "expr"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:245:1: expr : ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) |e= primaryExpression );
    public final IntegrityVariablesParser.expr_return expr() throws RecognitionException {
        IntegrityVariablesParser.expr_return retval = new IntegrityVariablesParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        IntegrityVariablesParser.primaryExpression_return e =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 305) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:246:5: ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) |e= primaryExpression )
            int alt34=28;
            switch ( input.LA(1) ) {
            case AND_ASSIGN:
            case ASSIGN:
            case BIT_SHIFT_RIGHT_ASSIGN:
            case DIV_ASSIGN:
            case MINUS_ASSIGN:
            case MOD_ASSIGN:
            case OR_ASSIGN:
            case PLUS_ASSIGN:
            case SHIFT_LEFT_ASSIGN:
            case SHIFT_RIGHT_ASSIGN:
            case STAR_ASSIGN:
            case XOR_ASSIGN:
            case POST_DEC:
            case POST_INC:
            case PRE_DEC:
            case PRE_INC:
                {
                alt34=1;
                }
                break;
            case QUESTION:
                {
                alt34=2;
                }
                break;
            case LOGICAL_OR:
                {
                alt34=3;
                }
                break;
            case LOGICAL_AND:
                {
                alt34=4;
                }
                break;
            case OR:
                {
                alt34=5;
                }
                break;
            case XOR:
                {
                alt34=6;
                }
                break;
            case AND:
                {
                alt34=7;
                }
                break;
            case EQUAL:
                {
                alt34=8;
                }
                break;
            case NOT_EQUAL:
                {
                alt34=9;
                }
                break;
            case INSTANCEOF:
                {
                alt34=10;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt34=11;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt34=12;
                }
                break;
            case BIT_SHIFT_RIGHT:
                {
                alt34=13;
                }
                break;
            case SHIFT_RIGHT:
                {
                alt34=14;
                }
                break;
            case GREATER_THAN:
                {
                alt34=15;
                }
                break;
            case SHIFT_LEFT:
                {
                alt34=16;
                }
                break;
            case LESS_THAN:
                {
                alt34=17;
                }
                break;
            case PLUS:
                {
                alt34=18;
                }
                break;
            case MINUS:
                {
                alt34=19;
                }
                break;
            case STAR:
                {
                alt34=20;
                }
                break;
            case DIV:
                {
                alt34=21;
                }
                break;
            case MOD:
                {
                alt34=22;
                }
                break;
            case UNARY_PLUS:
                {
                alt34=23;
                }
                break;
            case UNARY_MINUS:
                {
                alt34=24;
                }
                break;
            case NOT:
                {
                alt34=25;
                }
                break;
            case LOGICAL_NOT:
                {
                alt34=26;
                }
                break;
            case CAST_EXPR:
                {
                alt34=27;
                }
                break;
            case DOT:
            case FALSE:
            case NULL:
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
                alt34=28;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:246:9: assignExpression
                    {
                    pushFollow(FOLLOW_assignExpression_in_expr1514);
                    assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:247:7: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr1524); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1526);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1528);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1530);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:248:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr1542); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1544);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1546);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:249:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr1558); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1560);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1562);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:250:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr1574); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1576);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1578);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:251:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr1590); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1592);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1594);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:252:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr1606); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1608);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1610);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:253:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr1622); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1624);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1626);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:254:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr1638); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1640);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1642);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:255:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr1654); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1656);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_type_in_expr1658);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:256:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr1670); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1672);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1674);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:257:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr1686); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1688);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1690);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:258:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr1702); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1704);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1706);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:259:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr1718); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1720);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1722);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:260:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr1734); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1736);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1738);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:261:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr1750); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1752);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1754);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:262:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr1766); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1768);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1770);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 18 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:263:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr1782); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1784);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1786);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 19 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:264:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr1798); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1800);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1802);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 20 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:265:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr1814); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1816);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1818);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 21 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:266:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr1830); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1832);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1834);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 22 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:267:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr1846); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1848);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1850);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 23 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:268:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr1862); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1864);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 24 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:269:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr1876); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1878);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 25 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:270:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr1890); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1892);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 26 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:271:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr1904); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1906);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 27 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:272:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr1918); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr1920);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_expr1922);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 28 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:273:9: e= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr1935);
                    e=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                                                    if ((e!=null?e.ident:null) != null) {
                                                        getResistantType((e!=null?e.ident:null), getVariable((e!=null?e.ident:null)), (CommonTree) (e!=null?((CommonTree)e.start):null));
                                                    }
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 305, expr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class primaryExpression_return extends TreeRuleReturnScope {
        public String ident;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "primaryExpression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:281:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | THIS );
    public final IntegrityVariablesParser.primaryExpression_return primaryExpression() throws RecognitionException {
        IntegrityVariablesParser.primaryExpression_return retval = new IntegrityVariablesParser.primaryExpression_return();
        retval.start = input.LT(1);

        int primaryExpression_StartIndex = input.index();

        CommonTree IDENT9=null;
        CommonTree IDENT10=null;
        IntegrityVariablesParser.primaryExpression_return p =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 306) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:282:5: ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | THIS )
            int alt38=11;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt38=1;
                }
                break;
            case PARENTESIZED_EXPR:
                {
                alt38=2;
                }
                break;
            case IDENT:
                {
                alt38=3;
                }
                break;
            case METHOD_CALL:
                {
                alt38=4;
                }
                break;
            case SUPER_CONSTRUCTOR_CALL:
            case THIS_CONSTRUCTOR_CALL:
                {
                alt38=5;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt38=6;
                }
                break;
            case FALSE:
            case NULL:
            case TRUE:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
                {
                alt38=7;
                }
                break;
            case CLASS_CONSTRUCTOR_CALL:
            case STATIC_ARRAY_CREATOR:
                {
                alt38=8;
                }
                break;
            case THIS:
                {
                int LA38_9 = input.LA(2);

                if ( (synpred98_IntegrityVariablesParser()) ) {
                    alt38=9;
                }
                else if ( (true) ) {
                    alt38=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 9, input);

                    throw nvae;

                }
                }
                break;
            case ARRAY_DECLARATOR:
                {
                alt38=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:282:9: ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1964); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:283:13: (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt36=3;
                    switch ( input.LA(1) ) {
                    case DOT:
                    case FALSE:
                    case NULL:
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
                        alt36=1;
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
                        alt36=2;
                        }
                        break;
                    case VOID:
                        {
                        alt36=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }

                    switch (alt36) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:283:17: p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression1984);
                            p=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) {
                                                                    retval.ident = (((p!=null?p.ident:null) == null) ? "" : ((p!=null?p.ident:null) + "."));
                                                                }

                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:286:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt35=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt35=1;
                                }
                                break;
                            case THIS:
                                {
                                alt35=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt35=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt35=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt35=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 35, 0, input);

                                throw nvae;

                            }

                            switch (alt35) {
                                case 1 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:286:21: IDENT
                                    {
                                    IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2008); if (state.failed) return retval;

                                    if ( state.backtracking==0 ) { retval.ident += (IDENT9!=null?IDENT9.getText():null); }

                                    }
                                    break;
                                case 2 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:287:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression2032); if (state.failed) return retval;

                                    if ( state.backtracking==0 ) { retval.ident += "this"; }

                                    }
                                    break;
                                case 3 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:288:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression2056); if (state.failed) return retval;

                                    if ( state.backtracking==0 ) { retval.ident += "super"; }

                                    }
                                    break;
                                case 4 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:289:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression2080);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:290:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2102); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:292:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression2138);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;

                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2140); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:293:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression2158); if (state.failed) return retval;

                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2160); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:296:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression2194);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:297:9: IDENT
                    {
                    IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2204); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                                      retval.ident = (IDENT10!=null?IDENT10.getText():null);
                                  }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:300:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression2217); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2219);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:300:41: ( genericTypeArgumentList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:300:41: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression2221);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_arguments_in_primaryExpression2224);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:301:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression2235);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:302:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2246); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2248);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_primaryExpression2250);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:303:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2261);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:304:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression2271);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:305:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression2281); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.ident = "this"; }

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:306:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression2293);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:307:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression2303); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.ident = "super"; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 306, primaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class leftExpr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "leftExpr"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:311:1: leftExpr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final IntegrityVariablesParser.leftExpr_return leftExpr() throws RecognitionException {
        IntegrityVariablesParser.leftExpr_return retval = new IntegrityVariablesParser.leftExpr_return();
        retval.start = input.LT(1);

        int leftExpr_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 307) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:312:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt39=43;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt39=1;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt39=2;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt39=3;
                }
                break;
            case STAR_ASSIGN:
                {
                alt39=4;
                }
                break;
            case DIV_ASSIGN:
                {
                alt39=5;
                }
                break;
            case AND_ASSIGN:
                {
                alt39=6;
                }
                break;
            case OR_ASSIGN:
                {
                alt39=7;
                }
                break;
            case XOR_ASSIGN:
                {
                alt39=8;
                }
                break;
            case MOD_ASSIGN:
                {
                alt39=9;
                }
                break;
            case BIT_SHIFT_RIGHT_ASSIGN:
                {
                alt39=10;
                }
                break;
            case SHIFT_RIGHT_ASSIGN:
                {
                alt39=11;
                }
                break;
            case SHIFT_LEFT_ASSIGN:
                {
                alt39=12;
                }
                break;
            case QUESTION:
                {
                alt39=13;
                }
                break;
            case LOGICAL_OR:
                {
                alt39=14;
                }
                break;
            case LOGICAL_AND:
                {
                alt39=15;
                }
                break;
            case OR:
                {
                alt39=16;
                }
                break;
            case XOR:
                {
                alt39=17;
                }
                break;
            case AND:
                {
                alt39=18;
                }
                break;
            case EQUAL:
                {
                alt39=19;
                }
                break;
            case NOT_EQUAL:
                {
                alt39=20;
                }
                break;
            case INSTANCEOF:
                {
                alt39=21;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt39=22;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt39=23;
                }
                break;
            case BIT_SHIFT_RIGHT:
                {
                alt39=24;
                }
                break;
            case SHIFT_RIGHT:
                {
                alt39=25;
                }
                break;
            case GREATER_THAN:
                {
                alt39=26;
                }
                break;
            case SHIFT_LEFT:
                {
                alt39=27;
                }
                break;
            case LESS_THAN:
                {
                alt39=28;
                }
                break;
            case PLUS:
                {
                alt39=29;
                }
                break;
            case MINUS:
                {
                alt39=30;
                }
                break;
            case STAR:
                {
                alt39=31;
                }
                break;
            case DIV:
                {
                alt39=32;
                }
                break;
            case MOD:
                {
                alt39=33;
                }
                break;
            case UNARY_PLUS:
                {
                alt39=34;
                }
                break;
            case UNARY_MINUS:
                {
                alt39=35;
                }
                break;
            case PRE_INC:
                {
                alt39=36;
                }
                break;
            case PRE_DEC:
                {
                alt39=37;
                }
                break;
            case POST_INC:
                {
                alt39=38;
                }
                break;
            case POST_DEC:
                {
                alt39=39;
                }
                break;
            case NOT:
                {
                alt39=40;
                }
                break;
            case LOGICAL_NOT:
                {
                alt39=41;
                }
                break;
            case CAST_EXPR:
                {
                alt39=42;
                }
                break;
            case DOT:
            case FALSE:
            case NULL:
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
                alt39=43;
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:312:9: ^( ASSIGN expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_leftExpr2326); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2328);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2330);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:313:9: ^( PLUS_ASSIGN expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_leftExpr2342); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2344);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2346);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:314:9: ^( MINUS_ASSIGN expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_leftExpr2358); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2360);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2362);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:315:9: ^( STAR_ASSIGN expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_leftExpr2374); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2376);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2378);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:316:9: ^( DIV_ASSIGN expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_leftExpr2390); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2392);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2394);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:317:9: ^( AND_ASSIGN expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_leftExpr2406); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2408);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2410);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:318:9: ^( OR_ASSIGN expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_leftExpr2422); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2424);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2426);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:319:9: ^( XOR_ASSIGN expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_leftExpr2438); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2440);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2442);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:320:9: ^( MOD_ASSIGN expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_leftExpr2454); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2456);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2458);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:321:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_leftExpr2470); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2472);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2474);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:322:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_leftExpr2486); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2488);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2490);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:323:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_leftExpr2502); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2504);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2506);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:324:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_leftExpr2518); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2520);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2522);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2524);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:325:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_leftExpr2536); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2538);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2540);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:326:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_leftExpr2552); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2554);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2556);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:327:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_leftExpr2568); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2570);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2572);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:328:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_leftExpr2584); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2586);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2588);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 18 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:329:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_leftExpr2600); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2602);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2604);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 19 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:330:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_leftExpr2616); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2618);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2620);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 20 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:331:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_leftExpr2632); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2634);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2636);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 21 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:332:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_leftExpr2648); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2650);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_type_in_leftExpr2652);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 22 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:333:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_leftExpr2664); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2666);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2668);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 23 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:334:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_leftExpr2680); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2682);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2684);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 24 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:335:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_leftExpr2696); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2698);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2700);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 25 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:336:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_leftExpr2712); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2714);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2716);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 26 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:337:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_leftExpr2728); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2730);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2732);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 27 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:338:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_leftExpr2744); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2746);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2748);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 28 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:339:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_leftExpr2760); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2762);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2764);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 29 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:340:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_leftExpr2776); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2778);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2780);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 30 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:341:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_leftExpr2792); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2794);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2796);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 31 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:342:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_leftExpr2808); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2810);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2812);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 32 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:343:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_leftExpr2824); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2826);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2828);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 33 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:344:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_leftExpr2840); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2842);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2844);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 34 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:345:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_leftExpr2856); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2858);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 35 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:346:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_leftExpr2870); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2872);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 36 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:347:9: ^( PRE_INC expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_leftExpr2884); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2886);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 37 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:348:9: ^( PRE_DEC expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_leftExpr2898); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2900);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 38 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:349:9: ^( POST_INC expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_leftExpr2912); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2914);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 39 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:350:9: ^( POST_DEC expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_leftExpr2926); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2928);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 40 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:351:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_leftExpr2940); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2942);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 41 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:352:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_leftExpr2954); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_leftExpr2956);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 42 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:353:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_leftExpr2968); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_leftExpr2970);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_leftExpr2972);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;
                case 43 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:354:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_leftExpr2983);
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
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 307, leftExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "leftExpr"

    // $ANTLR start synpred98_IntegrityVariablesParser
    public final void synpred98_IntegrityVariablesParser_fragment() throws RecognitionException {
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:305:9: ( THIS )
        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\IntegrityVariablesParser.g:305:9: THIS
        {
        match(input,THIS,FOLLOW_THIS_in_synpred98_IntegrityVariablesParser2281); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred98_IntegrityVariablesParser

    // Delegated rules
    public IntegrityVariablesParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }

    public IntegrityVariablesParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }

    public IntegrityVariablesParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException { return gJavaTreeParser.importDeclaration(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }

    public IntegrityVariablesParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }

    public IntegrityVariablesParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException { return gJavaTreeParser.parenthesizedExpression(); }

    public IntegrityVariablesParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }

    public IntegrityVariablesParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }

    public IntegrityVariablesParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }

    public IntegrityVariablesParser_JavaTreeParser.arguments_return arguments() throws RecognitionException { return gJavaTreeParser.arguments(); }

    public IntegrityVariablesParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }

    public IntegrityVariablesParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }

    public IntegrityVariablesParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }

    public IntegrityVariablesParser_JavaTreeParser.modifier_return modifier() throws RecognitionException { return gJavaTreeParser.modifier(); }

    public IntegrityVariablesParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }

    public IntegrityVariablesParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException { return gJavaTreeParser.formalParameterVarargDecl(); }

    public IntegrityVariablesParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }

    public IntegrityVariablesParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }

    public IntegrityVariablesParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }

    public IntegrityVariablesParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }

    public IntegrityVariablesParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException { return gJavaTreeParser.blockStatement(); }

    public IntegrityVariablesParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException { return gJavaTreeParser.arrayDeclaratorList(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }

    public IntegrityVariablesParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }

    public IntegrityVariablesParser_JavaTreeParser.statement_return statement() throws RecognitionException { return gJavaTreeParser.statement(); }

    public IntegrityVariablesParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }

    public IntegrityVariablesParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }

    public IntegrityVariablesParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }

    public IntegrityVariablesParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }

    public IntegrityVariablesParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException { return gJavaTreeParser.modifierList(); }

    public IntegrityVariablesParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException { return gJavaTreeParser.variableDeclaratorList(); }

    public IntegrityVariablesParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }

    public IntegrityVariablesParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }

    public IntegrityVariablesParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }

    public IntegrityVariablesParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }

    public IntegrityVariablesParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }

    public IntegrityVariablesParser_JavaTreeParser.expression_return expression() throws RecognitionException { return gJavaTreeParser.expression(); }

    public IntegrityVariablesParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }

    public IntegrityVariablesParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }

    public IntegrityVariablesParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException { return gJavaTreeParser.formalParameterStandardDecl(); }

    public IntegrityVariablesParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }

    public IntegrityVariablesParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }

    public IntegrityVariablesParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }

    public IntegrityVariablesParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException { return gJavaTreeParser.localModifier(); }

    public IntegrityVariablesParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }

    public IntegrityVariablesParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }

    public IntegrityVariablesParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }

    public IntegrityVariablesParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }

    public IntegrityVariablesParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }

    public IntegrityVariablesParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }

    public IntegrityVariablesParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }

    public IntegrityVariablesParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }

    public IntegrityVariablesParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }

    public final boolean synpred98_IntegrityVariablesParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_IntegrityVariablesParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

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
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000801L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration211 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration213 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
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
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
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
    public static final BitSet FOLLOW_CLASS_in_classDeclaration582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration586 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration588 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration591 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration594 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations643 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations645 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations648 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations668 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations670 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations673 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations688 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations690 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block729 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_globalVariableDeclaration772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_globalVariableDeclaration778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_globalVariableDeclaration785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator872 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignExpression1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1019 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignExpression1042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1046 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignExpression1069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1073 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_assignExpression1096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1100 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_assignExpression1123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1127 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_assignExpression1150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1154 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_assignExpression1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1181 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_assignExpression1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1208 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_assignExpression1231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1235 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1239 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1262 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1289 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression1312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1316 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_assignExpression1337 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1341 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_assignExpression1379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_assignExpression1421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_assignExpression1463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_leftExpr_in_assignExpression1467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignExpression_in_expr1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr1524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1526 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1528 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr1542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1544 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr1558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1560 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1562 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr1574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1576 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr1590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1592 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr1606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1608 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr1622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1624 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr1638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1640 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr1658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr1670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1672 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr1686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1688 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr1702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1704 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr1718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1720 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr1734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1736 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr1750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1752 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1754 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr1766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1768 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr1782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1784 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1800 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr1814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1816 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr1830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1832 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1848 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr1862 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1864 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr1876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr1890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr1904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1906 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr1918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr1920 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression1984 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression2032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression2056 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression2080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression2138 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression2158 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression2217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2219 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression2221 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2248 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_leftExpr2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2328 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_leftExpr2342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2344 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_leftExpr2358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2360 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_leftExpr2374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2376 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_leftExpr2390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2392 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_leftExpr2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2408 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_leftExpr2422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2424 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_leftExpr2438 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2440 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_leftExpr2454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2456 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_leftExpr2470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2472 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_leftExpr2486 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2488 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_leftExpr2502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2504 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_leftExpr2518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2520 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2522 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_leftExpr2536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2538 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_leftExpr2552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2554 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_leftExpr2568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2570 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_leftExpr2584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2586 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_leftExpr2600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2602 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2604 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_leftExpr2616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2618 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_leftExpr2632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2634 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_leftExpr2648 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_leftExpr2652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_leftExpr2664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2666 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_leftExpr2680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2682 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_leftExpr2696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2698 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2700 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_leftExpr2712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2714 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_leftExpr2728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2730 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_leftExpr2744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2746 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_leftExpr2760 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2762 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_leftExpr2776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2778 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_leftExpr2792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2794 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_leftExpr2808 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2810 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_leftExpr2824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2826 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_leftExpr2840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2842 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_leftExpr2856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_leftExpr2870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_leftExpr2884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_leftExpr2898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_leftExpr2912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_leftExpr2926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_leftExpr2940 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2942 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_leftExpr2954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_leftExpr2956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_leftExpr2968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_leftExpr2970 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000880081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_leftExpr2972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_leftExpr2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_synpred98_IntegrityVariablesParser2281 = new BitSet(new long[]{0x0000000000000002L});

}