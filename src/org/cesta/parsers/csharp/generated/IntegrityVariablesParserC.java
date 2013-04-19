// $ANTLR 3.4 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g 2013-04-19 22:47:08

package org.cesta.parsers.csharp.generated;



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
public class IntegrityVariablesParserC extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AS", "ASSIGNMENT", "Asterisks", "Available_identifier", "BACK_SLASH", "BANG", "BASE", "BITWISE_OR", "BOOL", "BREAK", "BYTE", "CARET", "CASE", "CATCH", "CHAR", "CHARACTER_LITERAL", "CHECKED", "CLASS", "CLOSE_BRACE", "CLOSE_BRACKET", "CLOSE_PARENS", "COLON", "COMMA", "CONST", "CONTINUE", "Character", "Combining_character", "Conditional_symbol", "Connecting_character", "DECIMAL", "DECIMAL_DIGIT", "DEFAULT", "DELEGATE", "DELIMITED_COMMENT", "DELIMITED_DOC_COMMENT", "DIV", "DO", "DOT", "DOUBLE", "DOUBLE_BACK_SLASH", "DOUBLE_COLON", "DOUBLE_QUOTE", "Decimal_digit_character", "Decimal_digits", "Decimal_integer_literal", "Delimited_comment_section", "ELSE", "ENUM", "EVENT", "EXPLICIT", "EXTERN", "Exponent_part", "FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "File_name", "File_name_character", "File_name_characters", "Formatting_character", "GOTO", "GT", "HEX_DIGIT", "Hex_digits", "Hexadecimal_escape_sequence", "Hexadecimal_integer_literal", "IDENTIFIER", "IF", "IMPLICIT", "IN", "INT", "INTEGER_LITERAL", "INTERFACE", "INTERNAL", "INTERR", "IS", "Identifier_or_keyword", "Identifier_part_character", "Identifier_start_character", "Input_character", "Input_characters", "Integer_type_suffix", "LOCK", "LONG", "LT", "Letter_character", "Line_indicator", "LiteralAccess", "MINUS", "NAMESPACE", "NEW", "NEW_LINE", "NEW_LINE_CHARACTER", "NULL", "Not_number_sign", "Not_slash_or_asterisk", "OBJECT", "OPEN_BRACE", "OPEN_BRACKET", "OPEN_PARENS", "OPERATOR", "OP_ADD_ASSIGNMENT", "OP_AND", "OP_AND_ASSIGNMENT", "OP_COALESCING", "OP_DEC", "OP_DIV_ASSIGNMENT", "OP_EQ", "OP_GE", "OP_INC", "OP_LE", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_MULT_ASSIGNMENT", "OP_NE", "OP_OR", "OP_OR_ASSIGNMENT", "OP_PTR", "OP_SUB_ASSIGNMENT", "OP_XOR_ASSIGNMENT", "OUT", "OVERRIDE", "PARAMS", "PERCENT", "PLUS", "PRIVATE", "PROTECTED", "PUBLIC", "Pp_and_expression", "Pp_conditional", "Pp_declaration", "Pp_diagnostic", "Pp_directive", "Pp_elif_section", "Pp_else_section", "Pp_end_region", "Pp_endif", "Pp_equality_expression", "Pp_expression", "Pp_if_section", "Pp_line", "Pp_message", "Pp_new_line", "Pp_or_expression", "Pp_pragma", "Pp_pragma_text", "Pp_primary_expression", "Pp_region", "Pp_start_region", "Pp_unary_expression", "QUOTE", "Quote_escape_sequence", "READONLY", "REAL_LITERAL", "REF", "RETURN", "Real_type_suffix", "Regular_string_literal", "Regular_string_literal_character", "SBYTE", "SEALED", "SEMICOLON", "SHARP", "SHORT", "SINGLE_LINE_COMMENT", "SINGLE_LINE_DOC_COMMENT", "SIZEOF", "STACKALLOC", "STAR", "STATIC", "STRING", "STRING_LITERAL", "STRUCT", "SWITCH", "Sign", "Simple_escape_sequence", "Single_character", "Single_regular_string_literal_character", "Single_verbatim_string_literal_character", "SkiPped_characters", "SkiPped_section_part", "THIS", "THROW", "TILDE", "TRUE", "TRY", "TYPEOF", "Tokens", "UINT", "ULONG", "UNCHECKED", "UNICODE_CLASS_CF", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_MC", "UNICODE_CLASS_MN", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "UNICODE_CLASS_PC", "UNICODE_CLASS_ZS", "UNSAFE", "USHORT", "USING", "Unicode_escape_sequence", "VIRTUAL", "VOID", "VOLATILE", "Verbatim_string_literal", "Verbatim_string_literal_character", "WHILE", "WHITESPACE", "Whitespace_character", "Whitespace_characters", "ARGUMENT", "ARGUMENT_VALUE", "ARRAY_ACCESS", "ASSIGNMENT_OPERATOR", "ATTRIBUTE", "ATTRIBUTES", "ATTRIBUTE_LIST", "ATTRIBUTE_NAME", "ATTRIBUTE_TARGET", "BLOCK", "BOOL_NOT", "CAST_EXPRESSION", "CLASS_MEMBER_DECLARATIONS", "CONDITION", "CONDITIONAL_EXPRESSION", "CONSTANT_DECLARATOR", "CONSTANT_DECLARATORS", "CONSTANT_INITIALIZER", "CONSTRUCTOR_DECL", "EALED", "ENUM_EXTENDS", "ENUM_MEMBER_DECLARATION", "ENUM_MEMBER_DECLARATIONS", "ENUM_MEMBER_INITIALIZER", "EXPRESSION_STATEMENT", "EXTENDS_OR_IMPLEMENTS", "EXTERN_ALIAS_DIRECTIVES", "FIELD_DECL", "FIRST_OP", "FIXED_PARAMETER", "FORMAL_PARAMETER_LIST", "FOR_INITIALIZER", "FOR_ITERATOR", "IMPLEMENTS", "INDEXER_DECL", "INTERFACE_MEMBER_DECLARATIONS", "LABELED_STATEMENT", "LOCAL_VARIABLE_DECLARATOR", "LOCAL_VARIABLE_INITIALIZER", "LOOP_BODY", "MEMBER_ACCESS", "MEMBER_NAME", "METHOD_DECL", "METHOD_INVOCATION", "MODIFIERS", "NAMESPACE_MEMBER_DECLARATIONS", "NAMESPACE_OR_TYPE_NAME", "NAMESPACE_OR_TYPE_PART", "OBJECT_CREATION_EXPRESSION", "OP_RIGHT_SHIFT", "OP_RIGHT_SHIFT_ASSIGNMENT", "PARAMETER_ARRAY", "PARAMETER_MODIFIER", "POSITIONAL_ARGUMENT_LIST", "POST_DEC", "POST_INC", "PROPERTY_DECL", "QUALIFIED_ALIAS_MEMBER", "QUALIFIED_IDENTIFIER", "RANK_SPECIFIER", "SECOND_OP", "SIMPLE_NAME", "STRUCT_MEMBER_DECLARATIONS", "THEN", "TYPE", "TYPE_ARGUMENT_LIST", "TYPE_PARAM", "TYPE_PARAMETERS", "TYPE_PARAMETER_CONSTRAINTS_CLAUSE", "TYPE_PARAMETER_CONSTRAINTS_CLAUSES", "UNARY_EXPRESSION", "USING_ALIAS_DIRECTIVE", "USING_DIRECTIVES", "USING_NAMESPACE_DIRECTIVE", "VARIABLE_DECLARATOR", "VARIABLE_INITIALIZER", "VARIANCE_ANNOTATION", "VARIANT_TYPE_PARAMETERS", "425", "426", "427", "428"
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
    public static final int ARGUMENT=227;
    public static final int ARGUMENT_VALUE=228;
    public static final int ARRAY_ACCESS=229;
    public static final int ASSIGNMENT_OPERATOR=232;
    public static final int ATTRIBUTE=233;
    public static final int ATTRIBUTES=234;
    public static final int ATTRIBUTE_LIST=235;
    public static final int ATTRIBUTE_NAME=236;
    public static final int ATTRIBUTE_TARGET=237;
    public static final int BLOCK=241;
    public static final int BOOL_NOT=243;
    public static final int CAST_EXPRESSION=248;
    public static final int CLASS_MEMBER_DECLARATIONS=254;
    public static final int CONDITION=260;
    public static final int CONDITIONAL_EXPRESSION=261;
    public static final int CONSTANT_DECLARATOR=263;
    public static final int CONSTANT_DECLARATORS=264;
    public static final int CONSTANT_INITIALIZER=265;
    public static final int CONSTRUCTOR_DECL=266;
    public static final int EALED=276;
    public static final int ENUM_EXTENDS=279;
    public static final int ENUM_MEMBER_DECLARATION=280;
    public static final int ENUM_MEMBER_DECLARATIONS=281;
    public static final int ENUM_MEMBER_INITIALIZER=282;
    public static final int EXPRESSION_STATEMENT=285;
    public static final int EXTENDS_OR_IMPLEMENTS=286;
    public static final int EXTERN_ALIAS_DIRECTIVES=288;
    public static final int FIELD_DECL=290;
    public static final int FIRST_OP=292;
    public static final int FIXED_PARAMETER=293;
    public static final int FORMAL_PARAMETER_LIST=297;
    public static final int FOR_INITIALIZER=298;
    public static final int FOR_ITERATOR=299;
    public static final int IMPLEMENTS=304;
    public static final int INDEXER_DECL=307;
    public static final int INTERFACE_MEMBER_DECLARATIONS=311;
    public static final int LABELED_STATEMENT=315;
    public static final int LOCAL_VARIABLE_DECLARATOR=316;
    public static final int LOCAL_VARIABLE_INITIALIZER=317;
    public static final int LOOP_BODY=320;
    public static final int MEMBER_ACCESS=322;
    public static final int MEMBER_NAME=323;
    public static final int METHOD_DECL=324;
    public static final int METHOD_INVOCATION=325;
    public static final int MODIFIERS=327;
    public static final int NAMESPACE_MEMBER_DECLARATIONS=329;
    public static final int NAMESPACE_OR_TYPE_NAME=330;
    public static final int NAMESPACE_OR_TYPE_PART=331;
    public static final int OBJECT_CREATION_EXPRESSION=335;
    public static final int OP_RIGHT_SHIFT=358;
    public static final int OP_RIGHT_SHIFT_ASSIGNMENT=359;
    public static final int PARAMETER_ARRAY=364;
    public static final int PARAMETER_MODIFIER=365;
    public static final int POSITIONAL_ARGUMENT_LIST=369;
    public static final int POST_DEC=370;
    public static final int POST_INC=371;
    public static final int PROPERTY_DECL=373;
    public static final int QUALIFIED_ALIAS_MEMBER=376;
    public static final int QUALIFIED_IDENTIFIER=377;
    public static final int RANK_SPECIFIER=378;
    public static final int SECOND_OP=385;
    public static final int SIMPLE_NAME=388;
    public static final int STRUCT_MEMBER_DECLARATIONS=396;
    public static final int THEN=398;
    public static final int TYPE=404;
    public static final int TYPE_ARGUMENT_LIST=406;
    public static final int TYPE_PARAM=407;
    public static final int TYPE_PARAMETERS=408;
    public static final int TYPE_PARAMETER_CONSTRAINTS_CLAUSE=409;
    public static final int TYPE_PARAMETER_CONSTRAINTS_CLAUSES=410;
    public static final int UNARY_EXPRESSION=413;
    public static final int USING_ALIAS_DIRECTIVE=418;
    public static final int USING_DIRECTIVES=419;
    public static final int USING_NAMESPACE_DIRECTIVE=420;
    public static final int VARIABLE_DECLARATOR=421;
    public static final int VARIABLE_INITIALIZER=422;
    public static final int VARIANCE_ANNOTATION=423;
    public static final int VARIANT_TYPE_PARAMETERS=424;

    // delegates
    public IntegrityVariablesParserC_CSharp4Tree gCSharp4Tree;
    public TreeParser[] getDelegates() {
        return new TreeParser[] {gCSharp4Tree};
    }

    // delegators


    public IntegrityVariablesParserC(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public IntegrityVariablesParserC(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[1148+1];
         

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

    	
        


    public static class compilation_unit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "compilation_unit"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:28:1: compilation_unit : ( extern_alias_directives )? ( using_directives )? ( global_attribute_section )* ( namespace_member_declarations )? ;
    public final IntegrityVariablesParserC.compilation_unit_return compilation_unit() throws RecognitionException {
        IntegrityVariablesParserC.compilation_unit_return retval = new IntegrityVariablesParserC.compilation_unit_return();
        retval.start = input.LT(1);

        int compilation_unit_StartIndex = input.index();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1145) ) { return retval; }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:5: ( ( extern_alias_directives )? ( using_directives )? ( global_attribute_section )* ( namespace_member_declarations )? )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:10: ( extern_alias_directives )? ( using_directives )? ( global_attribute_section )* ( namespace_member_declarations )?
            {
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:10: ( extern_alias_directives )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EXTERN_ALIAS_DIRECTIVES) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:10: extern_alias_directives
                    {
                    pushFollow(FOLLOW_extern_alias_directives_in_compilation_unit129);
                    extern_alias_directives();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:35: ( using_directives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==USING_DIRECTIVES) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:35: using_directives
                    {
                    pushFollow(FOLLOW_using_directives_in_compilation_unit132);
                    using_directives();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:53: ( global_attribute_section )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ABSTRACT||LA3_0==AS||LA3_0==BASE||(LA3_0 >= BOOL && LA3_0 <= BYTE)||(LA3_0 >= CASE && LA3_0 <= CHAR)||(LA3_0 >= CHECKED && LA3_0 <= CLASS)||(LA3_0 >= CONST && LA3_0 <= CONTINUE)||LA3_0==DECIMAL||(LA3_0 >= DEFAULT && LA3_0 <= DELEGATE)||LA3_0==DO||LA3_0==DOUBLE||(LA3_0 >= ELSE && LA3_0 <= EXTERN)||(LA3_0 >= FALSE && LA3_0 <= FINALLY)||(LA3_0 >= FLOAT && LA3_0 <= FOREACH)||LA3_0==GOTO||(LA3_0 >= IDENTIFIER && LA3_0 <= INT)||(LA3_0 >= INTERFACE && LA3_0 <= INTERNAL)||LA3_0==IS||(LA3_0 >= LOCK && LA3_0 <= LONG)||(LA3_0 >= NAMESPACE && LA3_0 <= NEW)||LA3_0==NULL||LA3_0==OBJECT||LA3_0==OPERATOR||(LA3_0 >= OUT && LA3_0 <= PARAMS)||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)||LA3_0==READONLY||(LA3_0 >= REF && LA3_0 <= RETURN)||(LA3_0 >= SBYTE && LA3_0 <= SEALED)||LA3_0==SHORT||(LA3_0 >= SIZEOF && LA3_0 <= STACKALLOC)||(LA3_0 >= STATIC && LA3_0 <= STRING)||(LA3_0 >= STRUCT && LA3_0 <= SWITCH)||(LA3_0 >= THIS && LA3_0 <= THROW)||(LA3_0 >= TRUE && LA3_0 <= TYPEOF)||(LA3_0 >= UINT && LA3_0 <= UNCHECKED)||(LA3_0 >= UNSAFE && LA3_0 <= USING)||(LA3_0 >= VIRTUAL && LA3_0 <= VOLATILE)||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:29:53: global_attribute_section
            	    {
            	    pushFollow(FOLLOW_global_attribute_section_in_compilation_unit135);
            	    global_attribute_section();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:30:10: ( namespace_member_declarations )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NAMESPACE_MEMBER_DECLARATIONS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\csharp\\IntegrityVariablesParserC.g:30:10: namespace_member_declarations
                    {
                    pushFollow(FOLLOW_namespace_member_declarations_in_compilation_unit147);
                    namespace_member_declarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1145, compilation_unit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "compilation_unit"

    // Delegated rules
    public IntegrityVariablesParserC_CSharp4Tree.class_modifiers_return class_modifiers() throws RecognitionException { return gCSharp4Tree.class_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_declarator_return variable_declarator() throws RecognitionException { return gCSharp4Tree.variable_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.expression_list_return expression_list() throws RecognitionException { return gCSharp4Tree.expression_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.parenthesized_expression_return parenthesized_expression() throws RecognitionException { return gCSharp4Tree.parenthesized_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.labeled_statement_return labeled_statement() throws RecognitionException { return gCSharp4Tree.labeled_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.property_modifier_return property_modifier() throws RecognitionException { return gCSharp4Tree.property_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.remove_accessor_declaration_return remove_accessor_declaration() throws RecognitionException { return gCSharp4Tree.remove_accessor_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.from_contextual_keyword_return from_contextual_keyword() throws RecognitionException { return gCSharp4Tree.from_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.destructor_definition_return destructor_definition() throws RecognitionException { return gCSharp4Tree.destructor_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.non_array_type2_return non_array_type2() throws RecognitionException { return gCSharp4Tree.non_array_type2(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_declarator_return constructor_declarator() throws RecognitionException { return gCSharp4Tree.constructor_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.object_initializer_return object_initializer() throws RecognitionException { return gCSharp4Tree.object_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_modifier_return constructor_modifier() throws RecognitionException { return gCSharp4Tree.constructor_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.pre_decrement_expression_return pre_decrement_expression() throws RecognitionException { return gCSharp4Tree.pre_decrement_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameter_list_return type_parameter_list() throws RecognitionException { return gCSharp4Tree.type_parameter_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_member_declaration_return struct_member_declaration() throws RecognitionException { return gCSharp4Tree.struct_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.variant_type_parameter_list_return variant_type_parameter_list() throws RecognitionException { return gCSharp4Tree.variant_type_parameter_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.element_initializer_list_return element_initializer_list() throws RecognitionException { return gCSharp4Tree.element_initializer_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.array_type_return array_type() throws RecognitionException { return gCSharp4Tree.array_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_declaration_return class_declaration() throws RecognitionException { return gCSharp4Tree.class_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_declaration_return constructor_declaration() throws RecognitionException { return gCSharp4Tree.constructor_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.ascending_contextual_keyword_return ascending_contextual_keyword() throws RecognitionException { return gCSharp4Tree.ascending_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.boolean_literal_return boolean_literal() throws RecognitionException { return gCSharp4Tree.boolean_literal(); }

    public IntegrityVariablesParserC_CSharp4Tree.where_contextual_keyword_return where_contextual_keyword() throws RecognitionException { return gCSharp4Tree.where_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_creation_expression_return delegate_creation_expression() throws RecognitionException { return gCSharp4Tree.delegate_creation_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.if_statement_return if_statement() throws RecognitionException { return gCSharp4Tree.if_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_method_declaration_return interface_method_declaration() throws RecognitionException { return gCSharp4Tree.interface_method_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_declarator_return member_declarator() throws RecognitionException { return gCSharp4Tree.member_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.expression_statement_return expression_statement() throws RecognitionException { return gCSharp4Tree.expression_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.event_declaration2_return event_declaration2() throws RecognitionException { return gCSharp4Tree.event_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_modifier_return operator_modifier() throws RecognitionException { return gCSharp4Tree.operator_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_indexer_declaration2_return interface_indexer_declaration2() throws RecognitionException { return gCSharp4Tree.interface_indexer_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_base_return enum_base() throws RecognitionException { return gCSharp4Tree.enum_base(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_declarators_return variable_declarators() throws RecognitionException { return gCSharp4Tree.variable_declarators(); }

    public IntegrityVariablesParserC_CSharp4Tree.into_contextual_keyword_return into_contextual_keyword() throws RecognitionException { return gCSharp4Tree.into_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_declaration2_return constructor_declaration2() throws RecognitionException { return gCSharp4Tree.constructor_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_member_name2_return method_member_name2() throws RecognitionException { return gCSharp4Tree.method_member_name2(); }

    public IntegrityVariablesParserC_CSharp4Tree.unchecked_statement_return unchecked_statement() throws RecognitionException { return gCSharp4Tree.unchecked_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.global_attribute_section_return global_attribute_section() throws RecognitionException { return gCSharp4Tree.global_attribute_section(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_type_list_return interface_type_list() throws RecognitionException { return gCSharp4Tree.interface_type_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.non_assignment_expression_return non_assignment_expression() throws RecognitionException { return gCSharp4Tree.non_assignment_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.join_contextual_keyword_return join_contextual_keyword() throws RecognitionException { return gCSharp4Tree.join_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_base_return class_base() throws RecognitionException { return gCSharp4Tree.class_base(); }

    public IntegrityVariablesParserC_CSharp4Tree.group_contextual_keyword_return group_contextual_keyword() throws RecognitionException { return gCSharp4Tree.group_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.by_contextual_keyword_return by_contextual_keyword() throws RecognitionException { return gCSharp4Tree.by_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_initializer_return member_initializer() throws RecognitionException { return gCSharp4Tree.member_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.destructor_body_return destructor_body() throws RecognitionException { return gCSharp4Tree.destructor_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_declaration_return enum_declaration() throws RecognitionException { return gCSharp4Tree.enum_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_modifiers_return method_modifiers() throws RecognitionException { return gCSharp4Tree.method_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_sections_return switch_sections() throws RecognitionException { return gCSharp4Tree.switch_sections(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_declarator_return operator_declarator() throws RecognitionException { return gCSharp4Tree.operator_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.remove_contextual_keyword_return remove_contextual_keyword() throws RecognitionException { return gCSharp4Tree.remove_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_function_parameter_modifier_return anonymous_function_parameter_modifier() throws RecognitionException { return gCSharp4Tree.anonymous_function_parameter_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.multiplicative_expression_return multiplicative_expression() throws RecognitionException { return gCSharp4Tree.multiplicative_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_labels_return switch_labels() throws RecognitionException { return gCSharp4Tree.switch_labels(); }

    public IntegrityVariablesParserC_CSharp4Tree.query_body_return query_body() throws RecognitionException { return gCSharp4Tree.query_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_method_declaration2_return interface_method_declaration2() throws RecognitionException { return gCSharp4Tree.interface_method_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.query_body_clause_return query_body_clause() throws RecognitionException { return gCSharp4Tree.query_body_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_event_declaration2_return interface_event_declaration2() throws RecognitionException { return gCSharp4Tree.interface_event_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.array_initializer_return array_initializer() throws RecognitionException { return gCSharp4Tree.array_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_target_return attribute_target() throws RecognitionException { return gCSharp4Tree.attribute_target(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_member_declarations_return class_member_declarations() throws RecognitionException { return gCSharp4Tree.class_member_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.default_value_expression_return default_value_expression() throws RecognitionException { return gCSharp4Tree.default_value_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.all_member_modifier_return all_member_modifier() throws RecognitionException { return gCSharp4Tree.all_member_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_void_return type_void() throws RecognitionException { return gCSharp4Tree.type_void(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_declaration_return namespace_declaration() throws RecognitionException { return gCSharp4Tree.namespace_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.parameter_modifier2_return parameter_modifier2() throws RecognitionException { return gCSharp4Tree.parameter_modifier2(); }

    public IntegrityVariablesParserC_CSharp4Tree.equals_contextual_keyword_return equals_contextual_keyword() throws RecognitionException { return gCSharp4Tree.equals_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_indexer_declaration_return interface_indexer_declaration() throws RecognitionException { return gCSharp4Tree.interface_indexer_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_definition_return interface_definition() throws RecognitionException { return gCSharp4Tree.interface_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.descending_contextual_keyword_return descending_contextual_keyword() throws RecognitionException { return gCSharp4Tree.descending_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.null_coalescing_expression_return null_coalescing_expression() throws RecognitionException { return gCSharp4Tree.null_coalescing_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_initializer_list_return variable_initializer_list() throws RecognitionException { return gCSharp4Tree.variable_initializer_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.integral_type_return integral_type() throws RecognitionException { return gCSharp4Tree.integral_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.literal_return literal() throws RecognitionException { return gCSharp4Tree.literal(); }

    public IntegrityVariablesParserC_CSharp4Tree.is_disambiguation_token_return is_disambiguation_token() throws RecognitionException { return gCSharp4Tree.is_disambiguation_token(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_name_return type_name() throws RecognitionException { return gCSharp4Tree.type_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.unary_expression2_return unary_expression2() throws RecognitionException { return gCSharp4Tree.unary_expression2(); }

    public IntegrityVariablesParserC_CSharp4Tree.indexer_declaration2_return indexer_declaration2() throws RecognitionException { return gCSharp4Tree.indexer_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_member_declarations_return struct_member_declarations() throws RecognitionException { return gCSharp4Tree.struct_member_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_argument_list_return type_argument_list() throws RecognitionException { return gCSharp4Tree.type_argument_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.select_or_group_clause_return select_or_group_clause() throws RecognitionException { return gCSharp4Tree.select_or_group_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.select_contextual_keyword_return select_contextual_keyword() throws RecognitionException { return gCSharp4Tree.select_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.named_argument_return named_argument() throws RecognitionException { return gCSharp4Tree.named_argument(); }

    public IntegrityVariablesParserC_CSharp4Tree.base_access_return base_access() throws RecognitionException { return gCSharp4Tree.base_access(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_modifiers_return struct_modifiers() throws RecognitionException { return gCSharp4Tree.struct_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.let_clause_return let_clause() throws RecognitionException { return gCSharp4Tree.let_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.fixed_parameter_return fixed_parameter() throws RecognitionException { return gCSharp4Tree.fixed_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.statement_list_return statement_list() throws RecognitionException { return gCSharp4Tree.statement_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.bracket_expression_return bracket_expression() throws RecognitionException { return gCSharp4Tree.bracket_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.right_shift_assignment_return right_shift_assignment() throws RecognitionException { return gCSharp4Tree.right_shift_assignment(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_declaration_return operator_declaration() throws RecognitionException { return gCSharp4Tree.operator_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.argument_name_return argument_name() throws RecognitionException { return gCSharp4Tree.argument_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.argument_return argument() throws RecognitionException { return gCSharp4Tree.argument(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_declarators_return local_variable_declarators() throws RecognitionException { return gCSharp4Tree.local_variable_declarators(); }

    public IntegrityVariablesParserC_CSharp4Tree.for_initializer_return for_initializer() throws RecognitionException { return gCSharp4Tree.for_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.for_condition_return for_condition() throws RecognitionException { return gCSharp4Tree.for_condition(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_initializer_return local_variable_initializer() throws RecognitionException { return gCSharp4Tree.local_variable_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_modifier_return enum_modifier() throws RecognitionException { return gCSharp4Tree.enum_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.partial_contextual_keyword_return partial_contextual_keyword() throws RecognitionException { return gCSharp4Tree.partial_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException { return gCSharp4Tree.exclusive_or_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_statement_return switch_statement() throws RecognitionException { return gCSharp4Tree.switch_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.object_creation_expression_return object_creation_expression() throws RecognitionException { return gCSharp4Tree.object_creation_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_body_return class_body() throws RecognitionException { return gCSharp4Tree.class_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.non_array_type_return non_array_type() throws RecognitionException { return gCSharp4Tree.non_array_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.fixed_parameters_return fixed_parameters() throws RecognitionException { return gCSharp4Tree.fixed_parameters(); }

    public IntegrityVariablesParserC_CSharp4Tree.nullable_type_return nullable_type() throws RecognitionException { return gCSharp4Tree.nullable_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.embedded_statement_return embedded_statement() throws RecognitionException { return gCSharp4Tree.embedded_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.for_iterator_return for_iterator() throws RecognitionException { return gCSharp4Tree.for_iterator(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_body_return interface_body() throws RecognitionException { return gCSharp4Tree.interface_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.goto_statement_return goto_statement() throws RecognitionException { return gCSharp4Tree.goto_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.using_statement_return using_statement() throws RecognitionException { return gCSharp4Tree.using_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.indexer_declaration_return indexer_declaration() throws RecognitionException { return gCSharp4Tree.indexer_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_return attribute() throws RecognitionException { return gCSharp4Tree.attribute(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_modifier_return struct_modifier() throws RecognitionException { return gCSharp4Tree.struct_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.specific_catch_clause_return specific_catch_clause() throws RecognitionException { return gCSharp4Tree.specific_catch_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.object_or_collection_initializer_return object_or_collection_initializer() throws RecognitionException { return gCSharp4Tree.object_or_collection_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.query_continuation_return query_continuation() throws RecognitionException { return gCSharp4Tree.query_continuation(); }

    public IntegrityVariablesParserC_CSharp4Tree.assignment_operator_return assignment_operator() throws RecognitionException { return gCSharp4Tree.assignment_operator(); }

    public IntegrityVariablesParserC_CSharp4Tree.parameter_modifier_return parameter_modifier() throws RecognitionException { return gCSharp4Tree.parameter_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_body_return enum_body() throws RecognitionException { return gCSharp4Tree.enum_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.set_accessor_declaration_return set_accessor_declaration() throws RecognitionException { return gCSharp4Tree.set_accessor_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.argument_value2_return argument_value2() throws RecognitionException { return gCSharp4Tree.argument_value2(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_body_return constructor_body() throws RecognitionException { return gCSharp4Tree.constructor_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.overloadable_unary_operator_return overloadable_unary_operator() throws RecognitionException { return gCSharp4Tree.overloadable_unary_operator(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_arguments_return type_arguments() throws RecognitionException { return gCSharp4Tree.type_arguments(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_modifiers_return delegate_modifiers() throws RecognitionException { return gCSharp4Tree.delegate_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.conditional_expression_return conditional_expression() throws RecognitionException { return gCSharp4Tree.conditional_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.pre_increment_expression_return pre_increment_expression() throws RecognitionException { return gCSharp4Tree.pre_increment_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_modifiers_return operator_modifiers() throws RecognitionException { return gCSharp4Tree.operator_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.qualified_alias_member_return qualified_alias_member() throws RecognitionException { return gCSharp4Tree.qualified_alias_member(); }

    public IntegrityVariablesParserC_CSharp4Tree.type2_return type2() throws RecognitionException { return gCSharp4Tree.type2(); }

    public IntegrityVariablesParserC_CSharp4Tree.statement_expression_return statement_expression() throws RecognitionException { return gCSharp4Tree.statement_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.array_type2_return array_type2() throws RecognitionException { return gCSharp4Tree.array_type2(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_modifier_return delegate_modifier() throws RecognitionException { return gCSharp4Tree.delegate_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameter_constraints_clauses_return type_parameter_constraints_clauses() throws RecognitionException { return gCSharp4Tree.type_parameter_constraints_clauses(); }

    public IntegrityVariablesParserC_CSharp4Tree.cast_disambiguation_token_return cast_disambiguation_token() throws RecognitionException { return gCSharp4Tree.cast_disambiguation_token(); }

    public IntegrityVariablesParserC_CSharp4Tree.resource_acquisition_return resource_acquisition() throws RecognitionException { return gCSharp4Tree.resource_acquisition(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_member_declaration_return class_member_declaration() throws RecognitionException { return gCSharp4Tree.class_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.indexer_declarator_return indexer_declarator() throws RecognitionException { return gCSharp4Tree.indexer_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.explicit_anonymous_function_parameter_list_return explicit_anonymous_function_parameter_list() throws RecognitionException { return gCSharp4Tree.explicit_anonymous_function_parameter_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.query_body_clauses_return query_body_clauses() throws RecognitionException { return gCSharp4Tree.query_body_clauses(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_argument_list_opt_return type_argument_list_opt() throws RecognitionException { return gCSharp4Tree.type_argument_list_opt(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_member_declaration_return enum_member_declaration() throws RecognitionException { return gCSharp4Tree.enum_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.overloadable_operator_return overloadable_operator() throws RecognitionException { return gCSharp4Tree.overloadable_operator(); }

    public IntegrityVariablesParserC_CSharp4Tree.primary_expression_start_return primary_expression_start() throws RecognitionException { return gCSharp4Tree.primary_expression_start(); }

    public IntegrityVariablesParserC_CSharp4Tree.combined_join_clause_return combined_join_clause() throws RecognitionException { return gCSharp4Tree.combined_join_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.constant_declarators_return constant_declarators() throws RecognitionException { return gCSharp4Tree.constant_declarators(); }

    public IntegrityVariablesParserC_CSharp4Tree.scan_for_cast_generic_precedence_return scan_for_cast_generic_precedence() throws RecognitionException { return gCSharp4Tree.scan_for_cast_generic_precedence(); }

    public IntegrityVariablesParserC_CSharp4Tree.expression_return expression() throws RecognitionException { return gCSharp4Tree.expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.throw_statement_return throw_statement() throws RecognitionException { return gCSharp4Tree.throw_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_definition_return delegate_definition() throws RecognitionException { return gCSharp4Tree.delegate_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_label_return switch_label() throws RecognitionException { return gCSharp4Tree.switch_label(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_member_declaration_return interface_member_declaration() throws RecognitionException { return gCSharp4Tree.interface_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.parameter_array_return parameter_array() throws RecognitionException { return gCSharp4Tree.parameter_array(); }

    public IntegrityVariablesParserC_CSharp4Tree.event_modifier_return event_modifier() throws RecognitionException { return gCSharp4Tree.event_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.collection_initializer_return collection_initializer() throws RecognitionException { return gCSharp4Tree.collection_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.lambda_expression_return lambda_expression() throws RecognitionException { return gCSharp4Tree.lambda_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.select_clause_return select_clause() throws RecognitionException { return gCSharp4Tree.select_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_sections_return attribute_sections() throws RecognitionException { return gCSharp4Tree.attribute_sections(); }

    public IntegrityVariablesParserC_CSharp4Tree.reference_type_return reference_type() throws RecognitionException { return gCSharp4Tree.reference_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_function_signature_return anonymous_function_signature() throws RecognitionException { return gCSharp4Tree.anonymous_function_signature(); }

    public IntegrityVariablesParserC_CSharp4Tree.join_into_clause_return join_into_clause() throws RecognitionException { return gCSharp4Tree.join_into_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_modifiers_return constructor_modifiers() throws RecognitionException { return gCSharp4Tree.constructor_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_property_declaration2_return interface_property_declaration2() throws RecognitionException { return gCSharp4Tree.interface_property_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.general_catch_clause_return general_catch_clause() throws RecognitionException { return gCSharp4Tree.general_catch_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.unchecked_expression_return unchecked_expression() throws RecognitionException { return gCSharp4Tree.unchecked_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_or_type_name_return namespace_or_type_name() throws RecognitionException { return gCSharp4Tree.namespace_or_type_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.right_shift_return right_shift() throws RecognitionException { return gCSharp4Tree.right_shift(); }

    public IntegrityVariablesParserC_CSharp4Tree.primary_expression_return primary_expression() throws RecognitionException { return gCSharp4Tree.primary_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.argument_value_return argument_value() throws RecognitionException { return gCSharp4Tree.argument_value(); }

    public IntegrityVariablesParserC_CSharp4Tree.explicit_anonymous_function_signature_return explicit_anonymous_function_signature() throws RecognitionException { return gCSharp4Tree.explicit_anonymous_function_signature(); }

    public IntegrityVariablesParserC_CSharp4Tree.named_argument_list_return named_argument_list() throws RecognitionException { return gCSharp4Tree.named_argument_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.typeof_expression_return typeof_expression() throws RecognitionException { return gCSharp4Tree.typeof_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.conditional_and_expression_return conditional_and_expression() throws RecognitionException { return gCSharp4Tree.conditional_and_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.constant_declaration2_return constant_declaration2() throws RecognitionException { return gCSharp4Tree.constant_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.global_attribute_target_return global_attribute_target() throws RecognitionException { return gCSharp4Tree.global_attribute_target(); }

    public IntegrityVariablesParserC_CSharp4Tree.keyword_return keyword() throws RecognitionException { return gCSharp4Tree.keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.yield_contextual_keyword_return yield_contextual_keyword() throws RecognitionException { return gCSharp4Tree.yield_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.add_contextual_keyword_return add_contextual_keyword() throws RecognitionException { return gCSharp4Tree.add_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.alias_contextual_keyword_return alias_contextual_keyword() throws RecognitionException { return gCSharp4Tree.alias_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_declaration2_return method_declaration2() throws RecognitionException { return gCSharp4Tree.method_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_method_expression_return anonymous_method_expression() throws RecognitionException { return gCSharp4Tree.anonymous_method_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.orderby_clause_return orderby_clause() throws RecognitionException { return gCSharp4Tree.orderby_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.common_member_declaration_return common_member_declaration() throws RecognitionException { return gCSharp4Tree.common_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameters_return type_parameters() throws RecognitionException { return gCSharp4Tree.type_parameters(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_declarator_return local_variable_declarator() throws RecognitionException { return gCSharp4Tree.local_variable_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.object_creation_expression2_return object_creation_expression2() throws RecognitionException { return gCSharp4Tree.object_creation_expression2(); }

    public IntegrityVariablesParserC_CSharp4Tree.event_accessor_declarations_return event_accessor_declarations() throws RecognitionException { return gCSharp4Tree.event_accessor_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_body_return namespace_body() throws RecognitionException { return gCSharp4Tree.namespace_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_declaration_return interface_declaration() throws RecognitionException { return gCSharp4Tree.interface_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.let_contextual_keyword_return let_contextual_keyword() throws RecognitionException { return gCSharp4Tree.let_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.query_expression_return query_expression() throws RecognitionException { return gCSharp4Tree.query_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.argument_list_return argument_list() throws RecognitionException { return gCSharp4Tree.argument_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.body_return body() throws RecognitionException { return gCSharp4Tree.body(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_modifier_return class_modifier() throws RecognitionException { return gCSharp4Tree.class_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.base_type_return base_type() throws RecognitionException { return gCSharp4Tree.base_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.add_accessor_declaration_return add_accessor_declaration() throws RecognitionException { return gCSharp4Tree.add_accessor_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_modifiers_return interface_modifiers() throws RecognitionException { return gCSharp4Tree.interface_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.predefined_type_return predefined_type() throws RecognitionException { return gCSharp4Tree.predefined_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_section_return attribute_section() throws RecognitionException { return gCSharp4Tree.attribute_section(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_target_specifier_return attribute_target_specifier() throws RecognitionException { return gCSharp4Tree.attribute_target_specifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_type_return class_type() throws RecognitionException { return gCSharp4Tree.class_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.implicit_anonymous_function_parameter_return implicit_anonymous_function_parameter() throws RecognitionException { return gCSharp4Tree.implicit_anonymous_function_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.statement_expression_list_return statement_expression_list() throws RecognitionException { return gCSharp4Tree.statement_expression_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.positional_argument_return positional_argument() throws RecognitionException { return gCSharp4Tree.positional_argument(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_interfaces_return struct_interfaces() throws RecognitionException { return gCSharp4Tree.struct_interfaces(); }

    public IntegrityVariablesParserC_CSharp4Tree.this_access_return this_access() throws RecognitionException { return gCSharp4Tree.this_access(); }

    public IntegrityVariablesParserC_CSharp4Tree.extern_alias_directives_return extern_alias_directives() throws RecognitionException { return gCSharp4Tree.extern_alias_directives(); }

    public IntegrityVariablesParserC_CSharp4Tree.using_directive_return using_directive() throws RecognitionException { return gCSharp4Tree.using_directive(); }

    public IntegrityVariablesParserC_CSharp4Tree.initializer_value_return initializer_value() throws RecognitionException { return gCSharp4Tree.initializer_value(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_access2_return member_access2() throws RecognitionException { return gCSharp4Tree.member_access2(); }

    public IntegrityVariablesParserC_CSharp4Tree.implicit_anonymous_function_parameter_list_return implicit_anonymous_function_parameter_list() throws RecognitionException { return gCSharp4Tree.implicit_anonymous_function_parameter_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_initializer_return variable_initializer() throws RecognitionException { return gCSharp4Tree.variable_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.property_declaration_return property_declaration() throws RecognitionException { return gCSharp4Tree.property_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_initializer2_return variable_initializer2() throws RecognitionException { return gCSharp4Tree.variable_initializer2(); }

    public IntegrityVariablesParserC_CSharp4Tree.break_statement_return break_statement() throws RecognitionException { return gCSharp4Tree.break_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.block_return block() throws RecognitionException { return gCSharp4Tree.block(); }

    public IntegrityVariablesParserC_CSharp4Tree.catch_clauses_return catch_clauses() throws RecognitionException { return gCSharp4Tree.catch_clauses(); }

    public IntegrityVariablesParserC_CSharp4Tree.unbound_type_name_return unbound_type_name() throws RecognitionException { return gCSharp4Tree.unbound_type_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.variant_type_parameters_return variant_type_parameters() throws RecognitionException { return gCSharp4Tree.variant_type_parameters(); }

    public IntegrityVariablesParserC_CSharp4Tree.implicit_anonymous_function_signature_return implicit_anonymous_function_signature() throws RecognitionException { return gCSharp4Tree.implicit_anonymous_function_signature(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_declarator2_return variable_declarator2() throws RecognitionException { return gCSharp4Tree.variable_declarator2(); }

    public IntegrityVariablesParserC_CSharp4Tree.variable_reference_return variable_reference() throws RecognitionException { return gCSharp4Tree.variable_reference(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_definition_return struct_definition() throws RecognitionException { return gCSharp4Tree.struct_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.statement_return statement() throws RecognitionException { return gCSharp4Tree.statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_arguments_return attribute_arguments() throws RecognitionException { return gCSharp4Tree.attribute_arguments(); }

    public IntegrityVariablesParserC_CSharp4Tree.explicit_anonymous_function_parameter_return explicit_anonymous_function_parameter() throws RecognitionException { return gCSharp4Tree.explicit_anonymous_function_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.indexer_modifiers_return indexer_modifiers() throws RecognitionException { return gCSharp4Tree.indexer_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_type_return interface_type() throws RecognitionException { return gCSharp4Tree.interface_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.event_modifiers_return event_modifiers() throws RecognitionException { return gCSharp4Tree.event_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.indexer_modifier_return indexer_modifier() throws RecognitionException { return gCSharp4Tree.indexer_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.rank_specifiers_return rank_specifiers() throws RecognitionException { return gCSharp4Tree.rank_specifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.right_arrow_return right_arrow() throws RecognitionException { return gCSharp4Tree.right_arrow(); }

    public IntegrityVariablesParserC_CSharp4Tree.declaration_statement_return declaration_statement() throws RecognitionException { return gCSharp4Tree.declaration_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.yield_statement_return yield_statement() throws RecognitionException { return gCSharp4Tree.yield_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_access_return member_access() throws RecognitionException { return gCSharp4Tree.member_access(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_constant_declaration_return local_constant_declaration() throws RecognitionException { return gCSharp4Tree.local_constant_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.return_type_return return_type() throws RecognitionException { return gCSharp4Tree.return_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.equality_expression_return equality_expression() throws RecognitionException { return gCSharp4Tree.equality_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_section_return switch_section() throws RecognitionException { return gCSharp4Tree.switch_section(); }

    public IntegrityVariablesParserC_CSharp4Tree.dynamic_contextual_keyword_return dynamic_contextual_keyword() throws RecognitionException { return gCSharp4Tree.dynamic_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.for_statement_return for_statement() throws RecognitionException { return gCSharp4Tree.for_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_object_creation_expression_return anonymous_object_creation_expression() throws RecognitionException { return gCSharp4Tree.anonymous_object_creation_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_declaration_return struct_declaration() throws RecognitionException { return gCSharp4Tree.struct_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_header_return method_header() throws RecognitionException { return gCSharp4Tree.method_header(); }

    public IntegrityVariablesParserC_CSharp4Tree.group_clause_return group_clause() throws RecognitionException { return gCSharp4Tree.group_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.arglist_return arglist() throws RecognitionException { return gCSharp4Tree.arglist(); }

    public IntegrityVariablesParserC_CSharp4Tree.set_contextual_keyword_return set_contextual_keyword() throws RecognitionException { return gCSharp4Tree.set_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_object_initializer_return anonymous_object_initializer() throws RecognitionException { return gCSharp4Tree.anonymous_object_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.floating_point_type_return floating_point_type() throws RecognitionException { return gCSharp4Tree.floating_point_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.assignment_operator2_return assignment_operator2() throws RecognitionException { return gCSharp4Tree.assignment_operator2(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_declaration2_return operator_declaration2() throws RecognitionException { return gCSharp4Tree.operator_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_initializer_list_return member_initializer_list() throws RecognitionException { return gCSharp4Tree.member_initializer_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException { return gCSharp4Tree.inclusive_or_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.finally_clause_return finally_clause() throws RecognitionException { return gCSharp4Tree.finally_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.do_statement_return do_statement() throws RecognitionException { return gCSharp4Tree.do_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.simple_type_return simple_type() throws RecognitionException { return gCSharp4Tree.simple_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.checked_statement_return checked_statement() throws RecognitionException { return gCSharp4Tree.checked_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.attributes_return attributes() throws RecognitionException { return gCSharp4Tree.attributes(); }

    public IntegrityVariablesParserC_CSharp4Tree.anonymous_function_body_return anonymous_function_body() throws RecognitionException { return gCSharp4Tree.anonymous_function_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.try_statement_return try_statement() throws RecognitionException { return gCSharp4Tree.try_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.and_expression_return and_expression() throws RecognitionException { return gCSharp4Tree.and_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_initializer2_return local_variable_initializer2() throws RecognitionException { return gCSharp4Tree.local_variable_initializer2(); }

    public IntegrityVariablesParserC_CSharp4Tree.orderby_contextual_keyword_return orderby_contextual_keyword() throws RecognitionException { return gCSharp4Tree.orderby_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_member_declarations_return enum_member_declarations() throws RecognitionException { return gCSharp4Tree.enum_member_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_name_return member_name() throws RecognitionException { return gCSharp4Tree.member_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.join_clause_return join_clause() throws RecognitionException { return gCSharp4Tree.join_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.continue_statement_return continue_statement() throws RecognitionException { return gCSharp4Tree.continue_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.foreach_statement_return foreach_statement() throws RecognitionException { return gCSharp4Tree.foreach_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.selection_statement_return selection_statement() throws RecognitionException { return gCSharp4Tree.selection_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.generic_dimension_specifier_return generic_dimension_specifier() throws RecognitionException { return gCSharp4Tree.generic_dimension_specifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_argument_expression_return attribute_argument_expression() throws RecognitionException { return gCSharp4Tree.attribute_argument_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.operator_body_return operator_body() throws RecognitionException { return gCSharp4Tree.operator_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_declaration_return type_declaration() throws RecognitionException { return gCSharp4Tree.type_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.iteration_statement_return iteration_statement() throws RecognitionException { return gCSharp4Tree.iteration_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.where_clause_return where_clause() throws RecognitionException { return gCSharp4Tree.where_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.constant_expression_return constant_expression() throws RecognitionException { return gCSharp4Tree.constant_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.switch_block_return switch_block() throws RecognitionException { return gCSharp4Tree.switch_block(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_member_declarations_return namespace_member_declarations() throws RecognitionException { return gCSharp4Tree.namespace_member_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.global_attribute_sections_return global_attribute_sections() throws RecognitionException { return gCSharp4Tree.global_attribute_sections(); }

    public IntegrityVariablesParserC_CSharp4Tree.property_modifiers_return property_modifiers() throws RecognitionException { return gCSharp4Tree.property_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.static_constructor_body_return static_constructor_body() throws RecognitionException { return gCSharp4Tree.static_constructor_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_or_type_name2_return namespace_or_type_name2() throws RecognitionException { return gCSharp4Tree.namespace_or_type_name2(); }

    public IntegrityVariablesParserC_CSharp4Tree.class_definition_return class_definition() throws RecognitionException { return gCSharp4Tree.class_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.extern_alias_directive_return extern_alias_directive() throws RecognitionException { return gCSharp4Tree.extern_alias_directive(); }

    public IntegrityVariablesParserC_CSharp4Tree.on_contextual_keyword_return on_contextual_keyword() throws RecognitionException { return gCSharp4Tree.on_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.accessor_declarations_return accessor_declarations() throws RecognitionException { return gCSharp4Tree.accessor_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.dim_separators_return dim_separators() throws RecognitionException { return gCSharp4Tree.dim_separators(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_initializer_return constructor_initializer() throws RecognitionException { return gCSharp4Tree.constructor_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.binary_operator_declarator_return binary_operator_declarator() throws RecognitionException { return gCSharp4Tree.binary_operator_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameter_return type_parameter() throws RecognitionException { return gCSharp4Tree.type_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.orderings_return orderings() throws RecognitionException { return gCSharp4Tree.orderings(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_event_declaration_return interface_event_declaration() throws RecognitionException { return gCSharp4Tree.interface_event_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_type_return local_variable_type() throws RecognitionException { return gCSharp4Tree.local_variable_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.from_clause_return from_clause() throws RecognitionException { return gCSharp4Tree.from_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.get_accessor_declaration_return get_accessor_declaration() throws RecognitionException { return gCSharp4Tree.get_accessor_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.local_variable_declaration_return local_variable_declaration() throws RecognitionException { return gCSharp4Tree.local_variable_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_member_declarations_return interface_member_declarations() throws RecognitionException { return gCSharp4Tree.interface_member_declarations(); }

    public IntegrityVariablesParserC_CSharp4Tree.attributed_type_parameter_return attributed_type_parameter() throws RecognitionException { return gCSharp4Tree.attributed_type_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_declaration_return delegate_declaration() throws RecognitionException { return gCSharp4Tree.delegate_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameter_constraints_clause_return type_parameter_constraints_clause() throws RecognitionException { return gCSharp4Tree.type_parameter_constraints_clause(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_modifier_return interface_modifier() throws RecognitionException { return gCSharp4Tree.interface_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.additive_expression_return additive_expression() throws RecognitionException { return gCSharp4Tree.additive_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_modifier_return method_modifier() throws RecognitionException { return gCSharp4Tree.method_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.member_declarator_list_return member_declarator_list() throws RecognitionException { return gCSharp4Tree.member_declarator_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_property_declaration_return interface_property_declaration() throws RecognitionException { return gCSharp4Tree.interface_property_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_base_return interface_base() throws RecognitionException { return gCSharp4Tree.interface_base(); }

    public IntegrityVariablesParserC_CSharp4Tree.element_initializer_return element_initializer() throws RecognitionException { return gCSharp4Tree.element_initializer(); }

    public IntegrityVariablesParserC_CSharp4Tree.delegate_type_return delegate_type() throws RecognitionException { return gCSharp4Tree.delegate_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_declaration_return method_declaration() throws RecognitionException { return gCSharp4Tree.method_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.unary_operator_declarator_return unary_operator_declarator() throws RecognitionException { return gCSharp4Tree.unary_operator_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.primary_constraint_return primary_constraint() throws RecognitionException { return gCSharp4Tree.primary_constraint(); }

    public IntegrityVariablesParserC_CSharp4Tree.attributed_variance_type_parameter_return attributed_variance_type_parameter() throws RecognitionException { return gCSharp4Tree.attributed_variance_type_parameter(); }

    public IntegrityVariablesParserC_CSharp4Tree.property_declaration2_return property_declaration2() throws RecognitionException { return gCSharp4Tree.property_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.unary_expression_return unary_expression() throws RecognitionException { return gCSharp4Tree.unary_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.non_nullable_value_type_return non_nullable_value_type() throws RecognitionException { return gCSharp4Tree.non_nullable_value_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.commas_return commas() throws RecognitionException { return gCSharp4Tree.commas(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_name_return attribute_name() throws RecognitionException { return gCSharp4Tree.attribute_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.attribute_list_return attribute_list() throws RecognitionException { return gCSharp4Tree.attribute_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.qualified_identifier_return qualified_identifier() throws RecognitionException { return gCSharp4Tree.qualified_identifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.default_argument_return default_argument() throws RecognitionException { return gCSharp4Tree.default_argument(); }

    public IntegrityVariablesParserC_CSharp4Tree.using_alias_directive_return using_alias_directive() throws RecognitionException { return gCSharp4Tree.using_alias_directive(); }

    public IntegrityVariablesParserC_CSharp4Tree.array_creation_expression_return array_creation_expression() throws RecognitionException { return gCSharp4Tree.array_creation_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.while_statement_return while_statement() throws RecognitionException { return gCSharp4Tree.while_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_member_declaration_return namespace_member_declaration() throws RecognitionException { return gCSharp4Tree.namespace_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.isType_return isType() throws RecognitionException { return gCSharp4Tree.isType(); }

    public IntegrityVariablesParserC_CSharp4Tree.boolean_expression_return boolean_expression() throws RecognitionException { return gCSharp4Tree.boolean_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.interface_accessors_return interface_accessors() throws RecognitionException { return gCSharp4Tree.interface_accessors(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_part_return namespace_part() throws RecognitionException { return gCSharp4Tree.namespace_part(); }

    public IntegrityVariablesParserC_CSharp4Tree.ordering_direction_return ordering_direction() throws RecognitionException { return gCSharp4Tree.ordering_direction(); }

    public IntegrityVariablesParserC_CSharp4Tree.all_member_modifiers_return all_member_modifiers() throws RecognitionException { return gCSharp4Tree.all_member_modifiers(); }

    public IntegrityVariablesParserC_CSharp4Tree.secondary_constraints_return secondary_constraints() throws RecognitionException { return gCSharp4Tree.secondary_constraints(); }

    public IntegrityVariablesParserC_CSharp4Tree.jump_statement_return jump_statement() throws RecognitionException { return gCSharp4Tree.jump_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.variance_annotation_return variance_annotation() throws RecognitionException { return gCSharp4Tree.variance_annotation(); }

    public IntegrityVariablesParserC_CSharp4Tree.relational_expression_return relational_expression() throws RecognitionException { return gCSharp4Tree.relational_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.assignment_return assignment() throws RecognitionException { return gCSharp4Tree.assignment(); }

    public IntegrityVariablesParserC_CSharp4Tree.empty_statement_return empty_statement() throws RecognitionException { return gCSharp4Tree.empty_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.namespace_name_return namespace_name() throws RecognitionException { return gCSharp4Tree.namespace_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.lock_statement_return lock_statement() throws RecognitionException { return gCSharp4Tree.lock_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.using_directives_return using_directives() throws RecognitionException { return gCSharp4Tree.using_directives(); }

    public IntegrityVariablesParserC_CSharp4Tree.rank_specifier_return rank_specifier() throws RecognitionException { return gCSharp4Tree.rank_specifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_body_return method_body() throws RecognitionException { return gCSharp4Tree.method_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_definition_return enum_definition() throws RecognitionException { return gCSharp4Tree.enum_definition(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_argument_return type_argument() throws RecognitionException { return gCSharp4Tree.type_argument(); }

    public IntegrityVariablesParserC_CSharp4Tree.global_attribute_target_specifier_return global_attribute_target_specifier() throws RecognitionException { return gCSharp4Tree.global_attribute_target_specifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.return_statement_return return_statement() throws RecognitionException { return gCSharp4Tree.return_statement(); }

    public IntegrityVariablesParserC_CSharp4Tree.checked_expression_return checked_expression() throws RecognitionException { return gCSharp4Tree.checked_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_return type() throws RecognitionException { return gCSharp4Tree.type(); }

    public IntegrityVariablesParserC_CSharp4Tree.type_parameter_constraints_return type_parameter_constraints() throws RecognitionException { return gCSharp4Tree.type_parameter_constraints(); }

    public IntegrityVariablesParserC_CSharp4Tree.shift_expression_return shift_expression() throws RecognitionException { return gCSharp4Tree.shift_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_invocation2_return method_invocation2() throws RecognitionException { return gCSharp4Tree.method_invocation2(); }

    public IntegrityVariablesParserC_CSharp4Tree.cast_expression_return cast_expression() throws RecognitionException { return gCSharp4Tree.cast_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.conditional_or_expression_return conditional_or_expression() throws RecognitionException { return gCSharp4Tree.conditional_or_expression(); }

    public IntegrityVariablesParserC_CSharp4Tree.accessor_body_return accessor_body() throws RecognitionException { return gCSharp4Tree.accessor_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.field_declaration2_return field_declaration2() throws RecognitionException { return gCSharp4Tree.field_declaration2(); }

    public IntegrityVariablesParserC_CSharp4Tree.method_member_name_return method_member_name() throws RecognitionException { return gCSharp4Tree.method_member_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.specific_catch_clauses_return specific_catch_clauses() throws RecognitionException { return gCSharp4Tree.specific_catch_clauses(); }

    public IntegrityVariablesParserC_CSharp4Tree.overloadable_binary_operator_return overloadable_binary_operator() throws RecognitionException { return gCSharp4Tree.overloadable_binary_operator(); }

    public IntegrityVariablesParserC_CSharp4Tree.conversion_operator_declarator_return conversion_operator_declarator() throws RecognitionException { return gCSharp4Tree.conversion_operator_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.typed_member_declaration_return typed_member_declaration() throws RecognitionException { return gCSharp4Tree.typed_member_declaration(); }

    public IntegrityVariablesParserC_CSharp4Tree.simple_name_return simple_name() throws RecognitionException { return gCSharp4Tree.simple_name(); }

    public IntegrityVariablesParserC_CSharp4Tree.constructor_constraint_return constructor_constraint() throws RecognitionException { return gCSharp4Tree.constructor_constraint(); }

    public IntegrityVariablesParserC_CSharp4Tree.formal_parameter_list_return formal_parameter_list() throws RecognitionException { return gCSharp4Tree.formal_parameter_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.numeric_type_return numeric_type() throws RecognitionException { return gCSharp4Tree.numeric_type(); }

    public IntegrityVariablesParserC_CSharp4Tree.constant_declarator_return constant_declarator() throws RecognitionException { return gCSharp4Tree.constant_declarator(); }

    public IntegrityVariablesParserC_CSharp4Tree.ordering_return ordering() throws RecognitionException { return gCSharp4Tree.ordering(); }

    public IntegrityVariablesParserC_CSharp4Tree.using_namespace_directive_return using_namespace_directive() throws RecognitionException { return gCSharp4Tree.using_namespace_directive(); }

    public IntegrityVariablesParserC_CSharp4Tree.accessor_modifier_return accessor_modifier() throws RecognitionException { return gCSharp4Tree.accessor_modifier(); }

    public IntegrityVariablesParserC_CSharp4Tree.struct_body_return struct_body() throws RecognitionException { return gCSharp4Tree.struct_body(); }

    public IntegrityVariablesParserC_CSharp4Tree.get_contextual_keyword_return get_contextual_keyword() throws RecognitionException { return gCSharp4Tree.get_contextual_keyword(); }

    public IntegrityVariablesParserC_CSharp4Tree.positional_argument_list_return positional_argument_list() throws RecognitionException { return gCSharp4Tree.positional_argument_list(); }

    public IntegrityVariablesParserC_CSharp4Tree.enum_modifiers_return enum_modifiers() throws RecognitionException { return gCSharp4Tree.enum_modifiers(); }


 

    public static final BitSet FOLLOW_extern_alias_directives_in_compilation_unit129 = new BitSet(new long[]{0xEDF0146860DDD052L,0x000011260C0B7C10L,0xC06D931A000001CEL,0x00000000277000EEL,0x0000000000000000L,0x0000000000000200L,0x0000000800000000L});
    public static final BitSet FOLLOW_using_directives_in_compilation_unit132 = new BitSet(new long[]{0xEDF0146860DDD052L,0x000011260C0B7C10L,0xC06D931A000001CEL,0x00000000277000EEL,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_global_attribute_section_in_compilation_unit135 = new BitSet(new long[]{0xEDF0146860DDD052L,0x000011260C0B7C10L,0xC06D931A000001CEL,0x00000000277000EEL,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_namespace_member_declarations_in_compilation_unit147 = new BitSet(new long[]{0x0000000000000002L});

}