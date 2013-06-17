// $ANTLR 3.4 CSharp4Tree.g 2013-06-17 21:29:28

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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class IntegrityVariablesParserC_CSharp4Tree extends AbstractTreeParserC {
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
    public AbstractTreeParserC[] getDelegates() {
        return new AbstractTreeParserC[] {};
    }

    // delegators
    public IntegrityVariablesParserC gIntegrityVariablesParserC;
    public IntegrityVariablesParserC gParent;


    public IntegrityVariablesParserC_CSharp4Tree(TreeNodeStream input, IntegrityVariablesParserC gIntegrityVariablesParserC) {
        this(input, new RecognizerSharedState(), gIntegrityVariablesParserC);
    }
    public IntegrityVariablesParserC_CSharp4Tree(TreeNodeStream input, RecognizerSharedState state, IntegrityVariablesParserC gIntegrityVariablesParserC) {
        super(input, state);
        this.gIntegrityVariablesParserC = gIntegrityVariablesParserC;
        gParent = gIntegrityVariablesParserC;
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("IntegrityVariablesParserC_CSharp4TreeTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "CSharp4Tree.g"; }


    public static class class_body_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "class_body"
    // CSharp4Tree.g:1143:1: class_body :;
    public final IntegrityVariablesParserC_CSharp4Tree.class_body_return class_body() throws RecognitionException {
        IntegrityVariablesParserC_CSharp4Tree.class_body_return retval = new IntegrityVariablesParserC_CSharp4Tree.class_body_return();
        retval.start = input.LT(1);

        int class_body_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // CSharp4Tree.g:1144:5: ()
            // CSharp4Tree.g:1145:5: 
            {
            }

        }
        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, class_body_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "class_body"


    public static class member_access2_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "member_access2"
    // CSharp4Tree.g:2109:1: member_access2 :;
    public final IntegrityVariablesParserC_CSharp4Tree.member_access2_return member_access2() throws RecognitionException {
        IntegrityVariablesParserC_CSharp4Tree.member_access2_return retval = new IntegrityVariablesParserC_CSharp4Tree.member_access2_return();
        retval.start = input.LT(1);

        int member_access2_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // CSharp4Tree.g:2110:5: ()
            // CSharp4Tree.g:2111:5: 
            {
            }

        }
        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, member_access2_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "member_access2"

    // Delegated rules


 

}