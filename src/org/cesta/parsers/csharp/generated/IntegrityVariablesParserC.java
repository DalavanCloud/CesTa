// $ANTLR 3.4 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g 2013-06-17 21:29:28

package org.cesta.parsers.csharp.generated;

import org.cesta.parsers.csharp.AbstractTreeParserC;


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
 * Version of Integrity variables parser transformation for C#.
 **/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class IntegrityVariablesParserC extends AbstractTreeParserC {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AS", "ASSIGNMENT", "Asterisks", "Available_identifier", "BACK_SLASH", "BANG", "BASE", "BITWISE_OR", "BOOL", "BREAK", "BYTE", "CARET", "CASE", "CATCH", "CHAR", "CHARACTER_LITERAL", "CHECKED", "CLASS", "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PARENS", "COLON", "COMMA", "CONST", "CONTINUE", "Character", "Combining_character", "Conditional_symbol", "Connecting_character", "DECIMAL", "DECIMAL_DIGIT", "DEFAULT", "DELEGATE", "DELIMITED_COMMENT", "DELIMITED_DOC_COMMENT", "DIV", "DO", "DOT", "DOUBLE", "DOUBLE_BACK_SLASH", "DOUBLE_COLON", "DOUBLE_QUOTE", "Decimal_digit_character", "Decimal_digits", "Decimal_integer_literal", "Delimited_comment_section", "ELSE", "ENUM", "EVENT", "EXPLICIT", "EXTERN", "Exponent_part", "FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "File_name", "File_name_character", "File_name_characters", "Formatting_character", "GOTO", "GT", "HEX_DIGIT", "Hex_digits", "Hexadecimal_escape_sequence", "Hexadecimal_integer_literal", "IDENTIFIER", "IF", "IMPLICIT", "IN", "INT", "INTEGER_LITERAL", "INTERFACE", "INTERNAL", "INTERR", "IS", "Identifier_or_keyword", "Identifier_part_character", "Identifier_start_character", "Input_character", "Input_characters", "Integer_type_suffix", "LOCK", "LONG", "LT", "Letter_character", "Line_indicator", "LiteralAccess", "MINUS", "NAMESPACE", "NEW", "NEW_LINE", "NEW_LINE_CHARACTER", "NULL", "Not_number_sign", "Not_slash_or_asterisk", "OBJECT", "OPEN_BRACE", "OPEN_BRACKET", "OPEN_PARENS", "OPERATOR", "OP_ADD_ASSIGNMENT", "OP_AND", "OP_AND_ASSIGNMENT", "OP_COALESCING", "OP_DEC", "OP_DIV_ASSIGNMENT", "OP_EQ", "OP_GE", "OP_INC", "OP_LE", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_NE", "OP_OR", "OP_OR_ASSIGNMENT", "OP_PTR", "OP_SUB_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OUT", "OVERRIDE", "PARAMS", "PERCENT", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "Pp_and_expression", "Pp_conditional", "Pp_declaration", "Pp_diagnostic", "Pp_directive", "Pp_elif_section", "Pp_else_section", "Pp_end_region", "Pp_endif", "Pp_equality_expression", "Pp_expression", "Pp_if_section", "Pp_line", "Pp_message", "Pp_new_line", "Pp_or_expression", "Pp_pragma", "Pp_pragma_text", "Pp_primary_expression", "Pp_region", "Pp_start_region", "Pp_unary_expression", "QUOTE", "Quote_escape_sequence", "READONLY", "REAL_LITERAL", "REF", "RETURN", "Real_type_suffix", "Regular_string_literal", "Regular_string_literal_character", "SBYTE", "SEALED", "SEMICOLON", "SHARP", "SHORT", "SINGLE_LINE_COMMENT", "SINGLE_LINE_DOC_COMMENT", "SIZEOF", "STACKALLOC", "STAR", "STATIC", "STRING", "STRING_LITERAL", "STRUCT", "SWITCH", "Sign", "Simple_escape_sequence", "Single_character", "Single_regular_string_literal_character", "Single_verbatim_string_literal_character", "SkiPped_characters", "SkiPped_section_part", "THIS", "THROW", "TILDE", "TRUE", "TRY", "TYPEOF", "Tokens", "UINT", "ULONG", "UNCHECKED", "UNICODE_CLASS_CF", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_MC", "UNICODE_CLASS_MN", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "UNICODE_CLASS_PC", "UNICODE_CLASS_ZS", "UNSAFE", "USHORT", "USING", "Unicode_escape_sequence", "VIRTUAL", "VOID", "VOLATILE", "Verbatim_string_literal", "Verbatim_string_literal_character", "WHILE", "WHITESPACE", "Whitespace_character", "Whitespace_characters", "ARGUMENT", "ARGUMENT_VALUE", "ARRAY_ACCESS", "ASSIGNMENT_OPERATOR", "ATTRIBUTE", "ATTRIBUTES", "ATTRIBUTE_LIST", "ATTRIBUTE_NAME", "ATTRIBUTE_TARGET", "BLOCK", "BOOL_NOT", "CAST_EXPRESSION", "CLASS_MEMBER_DECLARATIONS", "CONDITION", "CONDITIONAL_EXPRESSION", "CONSTANT_DECLARATOR", "CONSTANT_DECLARATORS", "CONSTANT_INITIALIZER", "CONSTRUCTOR_DECL", "CSHARP_SOURCE", "ENUM_EXTENDS", "ENUM_MEMBER_DECLARATION", "ENUM_MEMBER_DECLARATIONS", "ENUM_MEMBER_INITIALIZER", "EXPRESSION_STATEMENT", "EXTENDS_OR_IMPLEMENTS", "EXTERN_ALIAS_DIRECTIVES", "FIELD_DECL", "FIRST_OP", "FIXED_PARAMETER", "FORMAL_PARAMETER_LIST", "FOR_INITIALIZER", "FOR_ITERATOR", "IMPLEMENTS", "INDEXER_DECL", "INTERFACE_MEMBER_DECLARATIONS", "LABELED_STATEMENT", "LOCAL_VARIABLE_DECLARATION", "LOCAL_VARIABLE_DECLARATOR", "LOCAL_VARIABLE_INITIALIZER", "LOOP_BODY", "MEMBER_ACCESS", "MEMBER_NAME", "METHOD_DECL", "METHOD_INVOCATION", "MODIFIERS", "NAMESPACE_MEMBER_DECLARATIONS", "NAMESPACE_OR_TYPE_NAME", "NAMESPACE_OR_TYPE_PART", "OBJECT_CREATION_EXPRESSION", "OP_RIGHT_SHIFT", "OP_RIGHT_SHIFT_ASSIGNMENT", "PARAMETER_ARRAY", "PARAMETER_MODIFIER", "POSITIONAL_ARGUMENT_LIST", "POST_DEC", "POST_INC", "PROPERTY_DECL", "QUALIFIED_ALIAS_MEMBER", "QUALIFIED_IDENTIFIER", "RANK_SPECIFIER", "SECOND_OP", "SIMPLE_NAME", "STRUCT_MEMBER_DECLARATIONS", "THEN", "TYPE", "TYPE_ARGUMENT_LIST", "TYPE_PARAM", "TYPE_PARAMETERS", "TYPE_PARAMETER_CONSTRAINTS_CLAUSE", "TYPE_PARAMETER_CONSTRAINTS_CLAUSES", "UNARY_EXPRESSION", "USING_ALIAS_DIRECTIVE", "USING_DIRECTIVES", "USING_NAMESPACE_DIRECTIVE", "VARIABLE_DECLARATOR", "VARIABLE_INITIALIZER", "VARIANCE_ANNOTATION", "VARIANT_TYPE_PARAMETERS", "304", "305", "306", "307"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AMP=5;
    public static final int AS=6;
    public static final int ASSIGNMENT=7;
    public static final int Asterisks=8;
    public static final int Available_identifier=9;
    public static final int BACK_SLASH=10;
    public static final int BANG=11;
    public static final int BASE=12;
    public static final int BITWISE_OR=13;
    public static final int BOOL=14;
    public static final int BREAK=15;
    public static final int BYTE=16;
    public static final int CARET=17;
    public static final int CASE=18;
    public static final int CATCH=19;
    public static final int CHAR=20;
    public static final int CHARACTER_LITERAL=21;
    public static final int CHECKED=22;
    public static final int CLASS=23;
    public static final int CLOSE_BRACE=24;
    public static final int CLOSE_BRACKET=25;
    public static final int CLOSE_PARENS=26;
    public static final int COLON=27;
    public static final int COMMA=28;
    public static final int CONST=29;
    public static final int CONTINUE=30;
    public static final int Character=31;
    public static final int Combining_character=32;
    public static final int Conditional_symbol=33;
    public static final int Connecting_character=34;
    public static final int DECIMAL=35;
    public static final int DECIMAL_DIGIT=36;
    public static final int DEFAULT=37;
    public static final int DELEGATE=38;
    public static final int DELIMITED_COMMENT=39;
    public static final int DELIMITED_DOC_COMMENT=40;
    public static final int DIV=41;
    public static final int DO=42;
    public static final int DOT=43;
    public static final int DOUBLE=44;
    public static final int DOUBLE_BACK_SLASH=45;
    public static final int DOUBLE_COLON=46;
    public static final int DOUBLE_QUOTE=47;
    public static final int Decimal_digit_character=48;
    public static final int Decimal_digits=49;
    public static final int Decimal_integer_literal=50;
    public static final int Delimited_comment_section=51;
    public static final int ELSE=52;
    public static final int ENUM=53;
    public static final int EVENT=54;
    public static final int EXPLICIT=55;
    public static final int EXTERN=56;
    public static final int Exponent_part=57;
    public static final int FALSE=58;
    public static final int FINALLY=59;
    public static final int FIXED=60;
    public static final int FLOAT=61;
    public static final int FOR=62;
    public static final int FOREACH=63;
    public static final int File_name=64;
    public static final int File_name_character=65;
    public static final int File_name_characters=66;
    public static final int Formatting_character=67;
    public static final int GOTO=68;
    public static final int GT=69;
    public static final int HEX_DIGIT=70;
    public static final int Hex_digits=71;
    public static final int Hexadecimal_escape_sequence=72;
    public static final int Hexadecimal_integer_literal=73;
    public static final int IDENTIFIER=74;
    public static final int IF=75;
    public static final int IMPLICIT=76;
    public static final int IN=77;
    public static final int INT=78;
    public static final int INTEGER_LITERAL=79;
    public static final int INTERFACE=80;
    public static final int INTERNAL=81;
    public static final int INTERR=82;
    public static final int IS=83;
    public static final int Identifier_or_keyword=84;
    public static final int Identifier_part_character=85;
    public static final int Identifier_start_character=86;
    public static final int Input_character=87;
    public static final int Input_characters=88;
    public static final int Integer_type_suffix=89;
    public static final int LOCK=90;
    public static final int LONG=91;
    public static final int LT=92;
    public static final int Letter_character=93;
    public static final int Line_indicator=94;
    public static final int LiteralAccess=95;
    public static final int MINUS=96;
    public static final int NAMESPACE=97;
    public static final int NEW=98;
    public static final int NEW_LINE=99;
    public static final int NEW_LINE_CHARACTER=100;
    public static final int NULL=101;
    public static final int Not_number_sign=102;
    public static final int Not_slash_or_asterisk=103;
    public static final int OBJECT=104;
    public static final int OPEN_BRACE=105;
    public static final int OPEN_BRACKET=106;
    public static final int OPEN_PARENS=107;
    public static final int OPERATOR=108;
    public static final int OP_ADD_ASSIGNMENT=109;
    public static final int OP_AND=110;
    public static final int OP_AND_ASSIGNMENT=111;
    public static final int OP_COALESCING=112;
    public static final int OP_DEC=113;
    public static final int OP_DIV_ASSIGNMENT=114;
    public static final int OP_EQ=115;
    public static final int OP_GE=116;
    public static final int OP_INC=117;
    public static final int OP_LE=118;
    public static final int OP_LEFT_SHIFT=119;
    public static final int OP_LEFT_SHIFT_ASSIGNMENT=120;
    public static final int OP_MOD_ASSIGNMENT=121;
    public static final int OP_MULT_ASSIGNMENT=122;
    public static final int OP_NE=123;
    public static final int OP_OR=124;
    public static final int OP_OR_ASSIGNMENT=125;
    public static final int OP_PTR=126;
    public static final int OP_SUB_ASSIGNMENT=127;
    public static final int OP_XOR_ASSIGNMENT=128;
    public static final int OUT=129;
    public static final int OVERRIDE=130;
    public static final int PARAMS=131;
    public static final int PERCENT=132;
    public static final int PLUS=133;
    public static final int PRIVATE=134;
    public static final int PROTECTED=135;
    public static final int PUBLIC=136;
    public static final int Pp_and_expression=137;
    public static final int Pp_conditional=138;
    public static final int Pp_declaration=139;
    public static final int Pp_diagnostic=140;
    public static final int Pp_directive=141;
    public static final int Pp_elif_section=142;
    public static final int Pp_else_section=143;
    public static final int Pp_end_region=144;
    public static final int Pp_endif=145;
    public static final int Pp_equality_expression=146;
    public static final int Pp_expression=147;
    public static final int Pp_if_section=148;
    public static final int Pp_line=149;
    public static final int Pp_message=150;
    public static final int Pp_new_line=151;
    public static final int Pp_or_expression=152;
    public static final int Pp_pragma=153;
    public static final int Pp_pragma_text=154;
    public static final int Pp_primary_expression=155;
    public static final int Pp_region=156;
    public static final int Pp_start_region=157;
    public static final int Pp_unary_expression=158;
    public static final int QUOTE=159;
    public static final int Quote_escape_sequence=160;
    public static final int READONLY=161;
    public static final int REAL_LITERAL=162;
    public static final int REF=163;
    public static final int RETURN=164;
    public static final int Real_type_suffix=165;
    public static final int Regular_string_literal=166;
    public static final int Regular_string_literal_character=167;
    public static final int SBYTE=168;
    public static final int SEALED=169;
    public static final int SEMICOLON=170;
    public static final int SHARP=171;
    public static final int SHORT=172;
    public static final int SINGLE_LINE_COMMENT=173;
    public static final int SINGLE_LINE_DOC_COMMENT=174;
    public static final int SIZEOF=175;
    public static final int STACKALLOC=176;
    public static final int STAR=177;
    public static final int STATIC=178;
    public static final int STRING=179;
    public static final int STRING_LITERAL=180;
    public static final int STRUCT=181;
    public static final int SWITCH=182;
    public static final int Sign=183;
    public static final int Simple_escape_sequence=184;
    public static final int Single_character=185;
    public static final int Single_regular_string_literal_character=186;
    public static final int Single_verbatim_string_literal_character=187;
    public static final int SkiPped_characters=188;
    public static final int SkiPped_section_part=189;
    public static final int THIS=190;
    public static final int THROW=191;
    public static final int TILDE=192;
    public static final int TRUE=193;
    public static final int TRY=194;
    public static final int TYPEOF=195;
    public static final int Tokens=196;
    public static final int UINT=197;
    public static final int ULONG=198;
    public static final int UNCHECKED=199;
    public static final int UNICODE_CLASS_CF=200;
    public static final int UNICODE_CLASS_LL=201;
    public static final int UNICODE_CLASS_LM=202;
    public static final int UNICODE_CLASS_LO=203;
    public static final int UNICODE_CLASS_LT=204;
    public static final int UNICODE_CLASS_LU=205;
    public static final int UNICODE_CLASS_MC=206;
    public static final int UNICODE_CLASS_MN=207;
    public static final int UNICODE_CLASS_ND=208;
    public static final int UNICODE_CLASS_NL=209;
    public static final int UNICODE_CLASS_PC=210;
    public static final int UNICODE_CLASS_ZS=211;
    public static final int UNSAFE=212;
    public static final int USHORT=213;
    public static final int USING=214;
    public static final int Unicode_escape_sequence=215;
    public static final int VIRTUAL=216;
    public static final int VOID=217;
    public static final int VOLATILE=218;
    public static final int Verbatim_string_literal=219;
    public static final int Verbatim_string_literal_character=220;
    public static final int WHILE=221;
    public static final int WHITESPACE=222;
    public static final int Whitespace_character=223;
    public static final int Whitespace_characters=224;
    public static final int ARGUMENT=225;
    public static final int ARGUMENT_VALUE=226;
    public static final int ARRAY_ACCESS=227;
    public static final int ASSIGNMENT_OPERATOR=228;
    public static final int ATTRIBUTE=229;
    public static final int ATTRIBUTES=230;
    public static final int ATTRIBUTE_LIST=231;
    public static final int ATTRIBUTE_NAME=232;
    public static final int ATTRIBUTE_TARGET=233;
    public static final int BLOCK=234;
    public static final int BOOL_NOT=235;
    public static final int CAST_EXPRESSION=236;
    public static final int CLASS_MEMBER_DECLARATIONS=237;
    public static final int CONDITION=238;
    public static final int CONDITIONAL_EXPRESSION=239;
    public static final int CONSTANT_DECLARATOR=240;
    public static final int CONSTANT_DECLARATORS=241;
    public static final int CONSTANT_INITIALIZER=242;
    public static final int CONSTRUCTOR_DECL=243;
    public static final int CSHARP_SOURCE=244;
    public static final int ENUM_EXTENDS=245;
    public static final int ENUM_MEMBER_DECLARATION=246;
    public static final int ENUM_MEMBER_DECLARATIONS=247;
    public static final int ENUM_MEMBER_INITIALIZER=248;
    public static final int EXPRESSION_STATEMENT=249;
    public static final int EXTENDS_OR_IMPLEMENTS=250;
    public static final int EXTERN_ALIAS_DIRECTIVES=251;
    public static final int FIELD_DECL=252;
    public static final int FIRST_OP=253;
    public static final int FIXED_PARAMETER=254;
    public static final int FORMAL_PARAMETER_LIST=255;
    public static final int FOR_INITIALIZER=256;
    public static final int FOR_ITERATOR=257;
    public static final int IMPLEMENTS=258;
    public static final int INDEXER_DECL=259;
    public static final int INTERFACE_MEMBER_DECLARATIONS=260;
    public static final int LABELED_STATEMENT=261;
    public static final int LOCAL_VARIABLE_DECLARATION=262;
    public static final int LOCAL_VARIABLE_DECLARATOR=263;
    public static final int LOCAL_VARIABLE_INITIALIZER=264;
    public static final int LOOP_BODY=265;
    public static final int MEMBER_ACCESS=266;
    public static final int MEMBER_NAME=267;
    public static final int METHOD_DECL=268;
    public static final int METHOD_INVOCATION=269;
    public static final int MODIFIERS=270;
    public static final int NAMESPACE_MEMBER_DECLARATIONS=271;
    public static final int NAMESPACE_OR_TYPE_NAME=272;
    public static final int NAMESPACE_OR_TYPE_PART=273;
    public static final int OBJECT_CREATION_EXPRESSION=274;
    public static final int OP_RIGHT_SHIFT=275;
    public static final int OP_RIGHT_SHIFT_ASSIGNMENT=276;
    public static final int PARAMETER_ARRAY=277;
    public static final int PARAMETER_MODIFIER=278;
    public static final int POSITIONAL_ARGUMENT_LIST=279;
    public static final int POST_DEC=280;
    public static final int POST_INC=281;
    public static final int PROPERTY_DECL=282;
    public static final int QUALIFIED_ALIAS_MEMBER=283;
    public static final int QUALIFIED_IDENTIFIER=284;
    public static final int RANK_SPECIFIER=285;
    public static final int SECOND_OP=286;
    public static final int SIMPLE_NAME=287;
    public static final int STRUCT_MEMBER_DECLARATIONS=288;
    public static final int THEN=289;
    public static final int TYPE=290;
    public static final int TYPE_ARGUMENT_LIST=291;
    public static final int TYPE_PARAM=292;
    public static final int TYPE_PARAMETERS=293;
    public static final int TYPE_PARAMETER_CONSTRAINTS_CLAUSE=294;
    public static final int TYPE_PARAMETER_CONSTRAINTS_CLAUSES=295;
    public static final int UNARY_EXPRESSION=296;
    public static final int USING_ALIAS_DIRECTIVE=297;
    public static final int USING_DIRECTIVES=298;
    public static final int USING_NAMESPACE_DIRECTIVE=299;
    public static final int VARIABLE_DECLARATOR=300;
    public static final int VARIABLE_INITIALIZER=301;
    public static final int VARIANCE_ANNOTATION=302;
    public static final int VARIANT_TYPE_PARAMETERS=303;

    // delegates
    public IntegrityVariablesParserC_CSharp4Tree gCSharp4Tree;
    public AbstractTreeParserC[] getDelegates() {
        return new AbstractTreeParserC[] {gCSharp4Tree};
    }

    // delegators


    public IntegrityVariablesParserC(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IntegrityVariablesParserC(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[11+1];
         

        gCSharp4Tree = new IntegrityVariablesParserC_CSharp4Tree(input, state, this);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("IntegrityVariablesParserCTemplates", AngleBracketTemplateLexer.class);

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
    public String[] getTokenNames() { return IntegrityVariablesParserC.tokenNames; }
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g"; }

    	
        


    public static class csharpSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "csharpSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:28:1: csharpSource : ^( CSHARP_SOURCE ( namespace_member_declarations )? ) ;
    public final IntegrityVariablesParserC.csharpSource_return csharpSource() throws RecognitionException {
        IntegrityVariablesParserC.csharpSource_return retval = new IntegrityVariablesParserC.csharpSource_return();
        retval.start = input.LT(1);

        int csharpSource_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:5: ( ^( CSHARP_SOURCE ( namespace_member_declarations )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:9: ^( CSHARP_SOURCE ( namespace_member_declarations )? )
            {
            match(input,CSHARP_SOURCE,FOLLOW_CSHARP_SOURCE_in_csharpSource129); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:30:39: ( namespace_member_declarations )?
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAMESPACE_MEMBER_DECLARATIONS) ) {
                    alt1=1;
                }
                switch (alt1) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:30:39: namespace_member_declarations
                        {
                        pushFollow(FOLLOW_namespace_member_declarations_in_csharpSource133);
                        namespace_member_declarations();

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
            if ( state.backtracking>0 ) { memoize(input, 10, csharpSource_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "csharpSource"


    public static class namespace_member_declarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "namespace_member_declarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:67:1: namespace_member_declarations : ^( NAMESPACE_MEMBER_DECLARATIONS ( namespace_member_declaration )+ ) ;
    public final IntegrityVariablesParserC.namespace_member_declarations_return namespace_member_declarations() throws RecognitionException {
        IntegrityVariablesParserC.namespace_member_declarations_return retval = new IntegrityVariablesParserC.namespace_member_declarations_return();
        retval.start = input.LT(1);

        int namespace_member_declarations_StartIndex = input.index();

        	
                           System.out.println("namespace_member_declarations");
        	  
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:71:5: ( ^( NAMESPACE_MEMBER_DECLARATIONS ( namespace_member_declaration )+ ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:71:10: ^( NAMESPACE_MEMBER_DECLARATIONS ( namespace_member_declaration )+ )
            {
            match(input,NAMESPACE_MEMBER_DECLARATIONS,FOLLOW_NAMESPACE_MEMBER_DECLARATIONS_in_namespace_member_declarations178); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:71:42: ( namespace_member_declaration )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:71:42: namespace_member_declaration
            	    {
            	    pushFollow(FOLLOW_namespace_member_declaration_in_namespace_member_declarations180);
            	    namespace_member_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, namespace_member_declarations_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "namespace_member_declarations"


    public static class namespace_member_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "namespace_member_declaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:74:1: namespace_member_declaration : type_declaration ;
    public final IntegrityVariablesParserC.namespace_member_declaration_return namespace_member_declaration() throws RecognitionException {
        IntegrityVariablesParserC.namespace_member_declaration_return retval = new IntegrityVariablesParserC.namespace_member_declaration_return();
        retval.start = input.LT(1);

        int namespace_member_declaration_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:75:5: ( type_declaration )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:76:12: type_declaration
            {
            pushFollow(FOLLOW_type_declaration_in_namespace_member_declaration208);
            type_declaration();

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
            if ( state.backtracking>0 ) { memoize(input, 12, namespace_member_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "namespace_member_declaration"


    public static class type_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "type_declaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:80:1: type_declaration : class_definition ;
    public final IntegrityVariablesParserC.type_declaration_return type_declaration() throws RecognitionException {
        IntegrityVariablesParserC.type_declaration_return retval = new IntegrityVariablesParserC.type_declaration_return();
        retval.start = input.LT(1);

        int type_declaration_StartIndex = input.index();

        	
                           System.out.println("type_declarations");
        	  
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:84:5: ( class_definition )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:84:10: class_definition
            {
            pushFollow(FOLLOW_class_definition_in_type_declaration239);
            class_definition();

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
            if ( state.backtracking>0 ) { memoize(input, 13, type_declaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type_declaration"


    public static class class_definition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_definition"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:91:1: class_definition : ^( CLASS IDENTIFIER class_body ) ;
    public final IntegrityVariablesParserC.class_definition_return class_definition() throws RecognitionException {
        IntegrityVariablesParserC.class_definition_return retval = new IntegrityVariablesParserC.class_definition_return();
        retval.start = input.LT(1);

        int class_definition_StartIndex = input.index();

        CommonTree IDENTIFIER1=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:92:5: ( ^( CLASS IDENTIFIER class_body ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:92:10: ^( CLASS IDENTIFIER class_body )
            {
            match(input,CLASS,FOLLOW_CLASS_in_class_definition262); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            IDENTIFIER1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_definition264); if (state.failed) return retval;

            if ( state.backtracking==0 ) {System.out.println((IDENTIFIER1!=null?IDENTIFIER1.getText():null));}

            pushFollow(FOLLOW_class_body_in_class_definition270);
            class_body();

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
            if ( state.backtracking>0 ) { memoize(input, 14, class_definition_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "class_definition"

    // Delegated rules
    public IntegrityVariablesParserC_CSharp4Tree.member_access2_return member_access2() throws RecognitionException { return gCSharp4Tree.member_access2(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_body_return class_body() throws RecognitionException { return gCSharp4Tree.class_body(); }


 

    public static final BitSet FOLLOW_CSHARP_SOURCE_in_csharpSource129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_namespace_member_declarations_in_csharpSource133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMESPACE_MEMBER_DECLARATIONS_in_namespace_member_declarations178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_namespace_member_declaration_in_namespace_member_declarations180 = new BitSet(new long[]{0x0000000000800008L});
    public static final BitSet FOLLOW_type_declaration_in_namespace_member_declaration208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_definition_in_type_declaration239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_definition262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_definition264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_class_body_in_class_definition270 = new BitSet(new long[]{0x0000000000000008L});

}