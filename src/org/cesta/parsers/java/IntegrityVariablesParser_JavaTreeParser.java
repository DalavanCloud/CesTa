// $ANTLR 3.2 Sep 23, 2009 12:02:23 JavaTreeParser.g 2013-02-16 21:21:29

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
 * Sample Tree Parser, which can be used to create new parsers.
 * Tree grammar is based on grammar by Dieter Habelitz. 
 *
 * BSD licence
 * 
 * Copyright (c) 2007-2008 by HABELITZ Software Developments
 *
 * All rights reserved.
 * 
 * http://www.habelitz.com
 *
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS'' 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT, 
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
public class IntegrityVariablesParser_JavaTreeParser extends AbstractTreeParser {
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
    public static final int LEFT_EXPR=336;
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
    public IntegrityVariablesParser gIntegrityVariablesParser;
    public IntegrityVariablesParser gParent;


        public IntegrityVariablesParser_JavaTreeParser(TreeNodeStream input, IntegrityVariablesParser gIntegrityVariablesParser) {
            this(input, new RecognizerSharedState(), gIntegrityVariablesParser);
        }
        public IntegrityVariablesParser_JavaTreeParser(TreeNodeStream input, RecognizerSharedState state, IntegrityVariablesParser gIntegrityVariablesParser) {
            super(input, state);
            this.gIntegrityVariablesParser = gIntegrityVariablesParser;
             
            gParent = gIntegrityVariablesParser;
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("IntegrityVariablesParser_JavaTreeParserTemplates", AngleBracketTemplateLexer.class);

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
    public String getGrammarFileName() { return "JavaTreeParser.g"; }


    public static class packageDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "packageDeclaration"
    // JavaTreeParser.g:63:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final IntegrityVariablesParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.packageDeclaration_return retval = new IntegrityVariablesParser_JavaTreeParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // JavaTreeParser.g:64:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // JavaTreeParser.g:64:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration127); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration129);
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
    // JavaTreeParser.g:67:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.importDeclaration_return retval = new IntegrityVariablesParser_JavaTreeParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // JavaTreeParser.g:68:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // JavaTreeParser.g:68:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration156); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:68:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JavaTreeParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration158); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration161);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // JavaTreeParser.g:68:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // JavaTreeParser.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration163); if (state.failed) return retval;

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

    public static class extendsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extendsClause"
    // JavaTreeParser.g:78:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.extendsClause_return retval = new IntegrityVariablesParser_JavaTreeParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // JavaTreeParser.g:80:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // JavaTreeParser.g:80:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause304); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:80:26: ( type )+
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
            	    // JavaTreeParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause306);
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
    // JavaTreeParser.g:83:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.implementsClause_return retval = new IntegrityVariablesParser_JavaTreeParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // JavaTreeParser.g:84:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // JavaTreeParser.g:84:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause335); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:84:29: ( type )+
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
            	    // JavaTreeParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause337);
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
    // JavaTreeParser.g:87:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.genericTypeParameterList_return retval = new IntegrityVariablesParser_JavaTreeParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // JavaTreeParser.g:88:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // JavaTreeParser.g:88:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList367); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:88:35: ( genericTypeParameter )+
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
            	    // JavaTreeParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList369);
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
    // JavaTreeParser.g:91:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.genericTypeParameter_return retval = new IntegrityVariablesParser_JavaTreeParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // JavaTreeParser.g:92:5: ( ^( IDENT ( bound )? ) )
            // JavaTreeParser.g:92:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter391); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:92:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // JavaTreeParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter393);
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
    // JavaTreeParser.g:95:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.bound_return bound() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.bound_return retval = new IntegrityVariablesParser_JavaTreeParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // JavaTreeParser.g:96:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // JavaTreeParser.g:96:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound423); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:96:30: ( type )+
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
            	    // JavaTreeParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound425);
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
    // JavaTreeParser.g:99:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.enumTopLevelScope_return retval = new IntegrityVariablesParser_JavaTreeParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // JavaTreeParser.g:100:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // JavaTreeParser.g:100:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope447); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:100:32: ( enumConstant )+
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
            	    // JavaTreeParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope449);
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

            // JavaTreeParser.g:100:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // JavaTreeParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope452);
                    gIntegrityVariablesParser.classTopLevelScope();

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
    // JavaTreeParser.g:103:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.enumConstant_return retval = new IntegrityVariablesParser_JavaTreeParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // JavaTreeParser.g:104:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // JavaTreeParser.g:104:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant478); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant480);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // JavaTreeParser.g:104:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // JavaTreeParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant482);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // JavaTreeParser.g:104:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // JavaTreeParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant485);
                    gIntegrityVariablesParser.classTopLevelScope();

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

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // JavaTreeParser.g:122:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.interfaceTopLevelScope_return retval = new IntegrityVariablesParser_JavaTreeParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // JavaTreeParser.g:123:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // JavaTreeParser.g:123:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope696); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:123:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==INTERFACE||LA33_0==FUNCTION_METHOD_DECL||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope698);
                	    gIntegrityVariablesParser.interfaceScopeDeclarations();

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

    public static class variableDeclaratorList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorList"
    // JavaTreeParser.g:136:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.variableDeclaratorList_return retval = new IntegrityVariablesParser_JavaTreeParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // JavaTreeParser.g:137:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // JavaTreeParser.g:137:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList892); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:137:31: ( variableDeclarator )+
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
            	    // JavaTreeParser.g:0:0: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList894);
            	    gIntegrityVariablesParser.variableDeclarator();

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

    public static class arrayDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclarator"
    // JavaTreeParser.g:153:1: arrayDeclarator : LBRACK RBRACK ;
    public final IntegrityVariablesParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.arrayDeclarator_return retval = new IntegrityVariablesParser_JavaTreeParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // JavaTreeParser.g:154:5: ( LBRACK RBRACK )
            // JavaTreeParser.g:154:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator998); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1000); if (state.failed) return retval;

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
    // JavaTreeParser.g:157:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.arrayDeclaratorList_return retval = new IntegrityVariablesParser_JavaTreeParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // JavaTreeParser.g:158:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // JavaTreeParser.g:158:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1020); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:158:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1022); if (state.failed) return retval;

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
    // JavaTreeParser.g:161:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.arrayInitializer_return retval = new IntegrityVariablesParser_JavaTreeParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // JavaTreeParser.g:162:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // JavaTreeParser.g:162:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1050); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:162:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1052);
                	    gIntegrityVariablesParser.variableInitializer();

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
    // JavaTreeParser.g:165:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.throwsClause_return retval = new IntegrityVariablesParser_JavaTreeParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // JavaTreeParser.g:166:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // JavaTreeParser.g:166:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1074); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:166:25: ( qualifiedIdentifier )+
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
            	    // JavaTreeParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1076);
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
    // JavaTreeParser.g:169:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.modifierList_return retval = new IntegrityVariablesParser_JavaTreeParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // JavaTreeParser.g:170:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // JavaTreeParser.g:170:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1098); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:170:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AT||LA47_0==ABSTRACT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0>=PRIVATE && LA47_0<=PUBLIC)||(LA47_0>=STATIC && LA47_0<=STRICTFP)||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1100);
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
    // JavaTreeParser.g:173:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final IntegrityVariablesParser_JavaTreeParser.modifier_return modifier() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.modifier_return retval = new IntegrityVariablesParser_JavaTreeParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // JavaTreeParser.g:174:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt48=11;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // JavaTreeParser.g:174:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1121); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:175:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1131); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:176:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1141); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // JavaTreeParser.g:177:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1151); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:178:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1161); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:179:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1171); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:180:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1181); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:181:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1191); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:182:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1201); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:183:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1211); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:184:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1221);
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
    // JavaTreeParser.g:187:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.localModifierList_return retval = new IntegrityVariablesParser_JavaTreeParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // JavaTreeParser.g:188:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // JavaTreeParser.g:188:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1241); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:188:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1243);
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
    // JavaTreeParser.g:191:1: localModifier : ( FINAL | annotation );
    public final IntegrityVariablesParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.localModifier_return retval = new IntegrityVariablesParser_JavaTreeParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // JavaTreeParser.g:192:5: ( FINAL | annotation )
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
                    // JavaTreeParser.g:192:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1264); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:193:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1274);
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
    // JavaTreeParser.g:196:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.type_return type() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.type_return retval = new IntegrityVariablesParser_JavaTreeParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // JavaTreeParser.g:197:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // JavaTreeParser.g:197:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1294); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:197:16: ( primitiveType | qualifiedTypeIdent )
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
                    // JavaTreeParser.g:197:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1297);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:197:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1301);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // JavaTreeParser.g:197:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // JavaTreeParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1304);
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
    // JavaTreeParser.g:200:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.qualifiedTypeIdent_return retval = new IntegrityVariablesParser_JavaTreeParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // JavaTreeParser.g:201:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // JavaTreeParser.g:201:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1326); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:201:32: ( typeIdent )+
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
            	    // JavaTreeParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1328);
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
    // JavaTreeParser.g:204:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.typeIdent_return retval = new IntegrityVariablesParser_JavaTreeParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // JavaTreeParser.g:205:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // JavaTreeParser.g:205:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1351); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:205:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // JavaTreeParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1353);
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
    // JavaTreeParser.g:208:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final IntegrityVariablesParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.primitiveType_return retval = new IntegrityVariablesParser_JavaTreeParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // JavaTreeParser.g:209:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // JavaTreeParser.g:
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
    // JavaTreeParser.g:219:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.genericTypeArgumentList_return retval = new IntegrityVariablesParser_JavaTreeParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // JavaTreeParser.g:220:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // JavaTreeParser.g:220:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1464); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:220:33: ( genericTypeArgument )+
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
            	    // JavaTreeParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1466);
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
    // JavaTreeParser.g:223:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final IntegrityVariablesParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.genericTypeArgument_return retval = new IntegrityVariablesParser_JavaTreeParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // JavaTreeParser.g:224:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
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
                    // JavaTreeParser.g:224:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1491);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:225:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1502); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // JavaTreeParser.g:225:20: ( genericWildcardBoundType )?
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==EXTENDS||LA56_0==SUPER) ) {
                            alt56=1;
                        }
                        switch (alt56) {
                            case 1 :
                                // JavaTreeParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1504);
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
    // JavaTreeParser.g:228:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final IntegrityVariablesParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.genericWildcardBoundType_return retval = new IntegrityVariablesParser_JavaTreeParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // JavaTreeParser.g:229:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
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
                    // JavaTreeParser.g:229:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1644); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1646);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:230:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1658); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1660);
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
    // JavaTreeParser.g:233:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.formalParameterList_return retval = new IntegrityVariablesParser_JavaTreeParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // JavaTreeParser.g:234:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // JavaTreeParser.g:234:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1681); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:234:29: ( formalParameterStandardDecl )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==FORMAL_PARAM_STD_DECL) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1683);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);

                // JavaTreeParser.g:234:58: ( formalParameterVarargDecl )?
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt60=1;
                }
                switch (alt60) {
                    case 1 :
                        // JavaTreeParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1686);
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
    // JavaTreeParser.g:237:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final IntegrityVariablesParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.formalParameterStandardDecl_return retval = new IntegrityVariablesParser_JavaTreeParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // JavaTreeParser.g:238:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // JavaTreeParser.g:238:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1713); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1715);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1717);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1719);
            gIntegrityVariablesParser.variableDeclaratorId();

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
    // JavaTreeParser.g:241:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final IntegrityVariablesParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.formalParameterVarargDecl_return retval = new IntegrityVariablesParser_JavaTreeParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // JavaTreeParser.g:242:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // JavaTreeParser.g:242:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1744); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1746);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1748);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1750);
            gIntegrityVariablesParser.variableDeclaratorId();

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
    // JavaTreeParser.g:245:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final IntegrityVariablesParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.qualifiedIdentifier_return retval = new IntegrityVariablesParser_JavaTreeParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // JavaTreeParser.g:246:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
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
                    // JavaTreeParser.g:246:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1774); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:247:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1785); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1787);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1789); if (state.failed) return retval;

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
    // JavaTreeParser.g:252:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationList_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // JavaTreeParser.g:253:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // JavaTreeParser.g:253:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1816); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:253:27: ( annotation )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1818);
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
    // JavaTreeParser.g:256:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotation_return annotation() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotation_return retval = new IntegrityVariablesParser_JavaTreeParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // JavaTreeParser.g:257:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // JavaTreeParser.g:257:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation1840); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1842);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // JavaTreeParser.g:257:34: ( annotationInit )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ANNOTATION_INIT_BLOCK) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // JavaTreeParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation1844);
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
    // JavaTreeParser.g:260:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationInit_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // JavaTreeParser.g:261:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // JavaTreeParser.g:261:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1870); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit1872);
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
    // JavaTreeParser.g:264:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final IntegrityVariablesParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationInitializers_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // JavaTreeParser.g:265:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
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
                    // JavaTreeParser.g:265:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1893); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // JavaTreeParser.g:265:36: ( annotationInitializer )+
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
                    	    // JavaTreeParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1895);
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
                    // JavaTreeParser.g:266:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1908); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1910);
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
    // JavaTreeParser.g:269:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationInitializer_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // JavaTreeParser.g:270:5: ( ^( IDENT annotationElementValue ) )
            // JavaTreeParser.g:270:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer1935); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer1937);
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
    // JavaTreeParser.g:273:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final IntegrityVariablesParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationElementValue_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // JavaTreeParser.g:274:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
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
                    // JavaTreeParser.g:274:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1962); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // JavaTreeParser.g:274:41: ( annotationElementValue )*
                        loop66:
                        do {
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==AT||LA66_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA66_0==EXPR) ) {
                                alt66=1;
                            }


                            switch (alt66) {
                        	case 1 :
                        	    // JavaTreeParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue1964);
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
                    // JavaTreeParser.g:275:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue1976);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:276:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue1986);
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
    // JavaTreeParser.g:279:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationTopLevelScope_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // JavaTreeParser.g:280:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // JavaTreeParser.g:280:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2010); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:280:38: ( annotationScopeDeclarations )*
                loop68:
                do {
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AT||LA68_0==CLASS||LA68_0==ENUM||LA68_0==INTERFACE||LA68_0==ANNOTATION_METHOD_DECL||LA68_0==VAR_DECLARATION) ) {
                        alt68=1;
                    }


                    switch (alt68) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2012);
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
    // JavaTreeParser.g:283:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final IntegrityVariablesParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationScopeDeclarations_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // JavaTreeParser.g:284:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
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
                    // JavaTreeParser.g:284:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2038); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2040);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2042);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2044); if (state.failed) return retval;
                    // JavaTreeParser.g:284:58: ( annotationDefaultValue )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DEFAULT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // JavaTreeParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2046);
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
                    // JavaTreeParser.g:285:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2059); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2061);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2063);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2065);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:286:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2076);
                    gIntegrityVariablesParser.typeDeclaration();

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
    // JavaTreeParser.g:289:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final IntegrityVariablesParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.annotationDefaultValue_return retval = new IntegrityVariablesParser_JavaTreeParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // JavaTreeParser.g:290:5: ( ^( DEFAULT annotationElementValue ) )
            // JavaTreeParser.g:290:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2100); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2102);
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

    public static class blockStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // JavaTreeParser.g:299:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final IntegrityVariablesParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.blockStatement_return retval = new IntegrityVariablesParser_JavaTreeParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // JavaTreeParser.g:300:5: ( localVariableDeclaration | typeDeclaration | statement )
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
                    // JavaTreeParser.g:300:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2152);
                    gIntegrityVariablesParser.localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:301:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2162);
                    gIntegrityVariablesParser.typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:302:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2172);
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

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // JavaTreeParser.g:310:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final IntegrityVariablesParser_JavaTreeParser.statement_return statement() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.statement_return retval = new IntegrityVariablesParser_JavaTreeParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // JavaTreeParser.g:311:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt80=17;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // JavaTreeParser.g:311:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2235);
                    gIntegrityVariablesParser.block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:312:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2246); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2248);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // JavaTreeParser.g:312:29: ( expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==EXPR) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // JavaTreeParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2250);
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
                    // JavaTreeParser.g:313:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2263); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2265);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2267);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // JavaTreeParser.g:313:48: ( statement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==SEMI||LA74_0==ASSERT||LA74_0==BREAK||LA74_0==CONTINUE||LA74_0==DO||(LA74_0>=FOR && LA74_0<=IF)||LA74_0==RETURN||(LA74_0>=SWITCH && LA74_0<=SYNCHRONIZED)||LA74_0==THROW||LA74_0==TRY||LA74_0==WHILE||LA74_0==BLOCK_SCOPE||LA74_0==EXPR||LA74_0==FOR_EACH||LA74_0==LABELED_STATEMENT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // JavaTreeParser.g:0:0: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2269);
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
                    // JavaTreeParser.g:314:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2282); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2284);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2286);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2288);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2290);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // JavaTreeParser.g:315:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2302); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2304);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2306);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2308); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2310);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2312);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // JavaTreeParser.g:316:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2325); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2327);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2329);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // JavaTreeParser.g:317:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2341); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2343);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2345);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // JavaTreeParser.g:318:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2357); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2359);
                    gIntegrityVariablesParser.block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // JavaTreeParser.g:318:21: ( catches )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // JavaTreeParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2361);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // JavaTreeParser.g:318:30: ( block )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BLOCK_SCOPE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // JavaTreeParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement2364);
                            gIntegrityVariablesParser.block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // JavaTreeParser.g:319:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2379); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2381);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2383);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // JavaTreeParser.g:320:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2395); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2397);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2399);
                    gIntegrityVariablesParser.block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // JavaTreeParser.g:321:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2411); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // JavaTreeParser.g:321:18: ( expression )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==EXPR) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // JavaTreeParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2413);
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
                    // JavaTreeParser.g:322:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2426); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2428);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // JavaTreeParser.g:323:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2440); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // JavaTreeParser.g:323:17: ( IDENT )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==IDENT) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // JavaTreeParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2442); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // JavaTreeParser.g:324:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2455); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // JavaTreeParser.g:324:20: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // JavaTreeParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2457); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // JavaTreeParser.g:325:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2470); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2472); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2474);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // JavaTreeParser.g:326:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2485);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // JavaTreeParser.g:327:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2495); if (state.failed) return retval;

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
    // JavaTreeParser.g:330:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final IntegrityVariablesParser_JavaTreeParser.catches_return catches() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.catches_return retval = new IntegrityVariablesParser_JavaTreeParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // JavaTreeParser.g:331:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // JavaTreeParser.g:331:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2524); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:331:29: ( catchClause )+
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
            	    // JavaTreeParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2526);
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
    // JavaTreeParser.g:334:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final IntegrityVariablesParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.catchClause_return retval = new IntegrityVariablesParser_JavaTreeParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // JavaTreeParser.g:335:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // JavaTreeParser.g:335:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2552); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2554);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2556);
            gIntegrityVariablesParser.block();

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
    // JavaTreeParser.g:338:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.switchBlockLabels_return retval = new IntegrityVariablesParser_JavaTreeParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // JavaTreeParser.g:339:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // JavaTreeParser.g:339:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2577); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:339:35: ( switchCaseLabel )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CASE) ) {
                        int LA82_2 = input.LA(2);

                        if ( (synpred125_JavaTreeParser()) ) {
                            alt82=1;
                        }


                    }


                    switch (alt82) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2579);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);

                // JavaTreeParser.g:339:52: ( switchDefaultLabel )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DEFAULT) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // JavaTreeParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2582);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // JavaTreeParser.g:339:72: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2585);
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
    // JavaTreeParser.g:342:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.switchCaseLabel_return retval = new IntegrityVariablesParser_JavaTreeParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // JavaTreeParser.g:343:5: ( ^( CASE expression ( blockStatement )* ) )
            // JavaTreeParser.g:343:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2615); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2617);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // JavaTreeParser.g:343:27: ( blockStatement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT||LA85_0==SEMI||LA85_0==ASSERT||LA85_0==BREAK||(LA85_0>=CLASS && LA85_0<=CONTINUE)||LA85_0==DO||LA85_0==ENUM||(LA85_0>=FOR && LA85_0<=IF)||LA85_0==INTERFACE||LA85_0==RETURN||(LA85_0>=SWITCH && LA85_0<=SYNCHRONIZED)||LA85_0==THROW||LA85_0==TRY||LA85_0==WHILE||LA85_0==BLOCK_SCOPE||LA85_0==EXPR||LA85_0==FOR_EACH||LA85_0==LABELED_STATEMENT||LA85_0==VAR_DECLARATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // JavaTreeParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2619);
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
    // JavaTreeParser.g:346:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.switchDefaultLabel_return retval = new IntegrityVariablesParser_JavaTreeParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // JavaTreeParser.g:347:5: ( ^( DEFAULT ( blockStatement )* ) )
            // JavaTreeParser.g:347:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2645); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:347:19: ( blockStatement )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2647);
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
    // JavaTreeParser.g:350:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.forInit_return forInit() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.forInit_return retval = new IntegrityVariablesParser_JavaTreeParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // JavaTreeParser.g:351:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // JavaTreeParser.g:351:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2673); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:351:20: ( localVariableDeclaration | ( expression )* )?
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

                        if ( (synpred132_JavaTreeParser()) ) {
                            alt88=2;
                        }
                        }
                        break;
                }

                switch (alt88) {
                    case 1 :
                        // JavaTreeParser.g:351:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2676);
                        gIntegrityVariablesParser.localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // JavaTreeParser.g:351:48: ( expression )*
                        {
                        // JavaTreeParser.g:351:48: ( expression )*
                        loop87:
                        do {
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==EXPR) ) {
                                alt87=1;
                            }


                            switch (alt87) {
                        	case 1 :
                        	    // JavaTreeParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2680);
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
    // JavaTreeParser.g:354:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.forCondition_return retval = new IntegrityVariablesParser_JavaTreeParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // JavaTreeParser.g:355:5: ( ^( FOR_CONDITION ( expression )? ) )
            // JavaTreeParser.g:355:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2708); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:355:25: ( expression )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==EXPR) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // JavaTreeParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2710);
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
    // JavaTreeParser.g:358:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.forUpdater_return retval = new IntegrityVariablesParser_JavaTreeParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // JavaTreeParser.g:359:5: ( ^( FOR_UPDATE ( expression )* ) )
            // JavaTreeParser.g:359:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2736); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:359:22: ( expression )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EXPR) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2738);
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
    // JavaTreeParser.g:364:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final IntegrityVariablesParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.parenthesizedExpression_return retval = new IntegrityVariablesParser_JavaTreeParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // JavaTreeParser.g:365:5: ( ^( PARENTESIZED_EXPR expression ) )
            // JavaTreeParser.g:365:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2766); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression2768);
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
    // JavaTreeParser.g:368:1: expression : ^( EXPR expr ) ;
    public final IntegrityVariablesParser_JavaTreeParser.expression_return expression() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.expression_return retval = new IntegrityVariablesParser_JavaTreeParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // JavaTreeParser.g:369:5: ( ^( EXPR expr ) )
            // JavaTreeParser.g:369:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression2793); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression2795);
            gIntegrityVariablesParser.expr();

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

    public static class explicitConstructorCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "explicitConstructorCall"
    // JavaTreeParser.g:443:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final IntegrityVariablesParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.explicitConstructorCall_return retval = new IntegrityVariablesParser_JavaTreeParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // JavaTreeParser.g:444:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
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
                    // JavaTreeParser.g:444:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3848); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // JavaTreeParser.g:444:33: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // JavaTreeParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3850);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall3853);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:445:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3865); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // JavaTreeParser.g:445:34: ( primaryExpression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DOT||LA97_0==FALSE||LA97_0==NULL||LA97_0==SUPER||LA97_0==THIS||LA97_0==TRUE||LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==METHOD_CALL||LA97_0==PARENTESIZED_EXPR||(LA97_0>=STATIC_ARRAY_CREATOR && LA97_0<=SUPER_CONSTRUCTOR_CALL)||LA97_0==THIS_CONSTRUCTOR_CALL||(LA97_0>=IDENT && LA97_0<=STRING_LITERAL)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // JavaTreeParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall3867);
                            gIntegrityVariablesParser.primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // JavaTreeParser.g:445:53: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // JavaTreeParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3870);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall3873);
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
    // JavaTreeParser.g:448:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final IntegrityVariablesParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.arrayTypeDeclarator_return retval = new IntegrityVariablesParser_JavaTreeParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // JavaTreeParser.g:449:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // JavaTreeParser.g:449:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3894); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:449:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
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
                    // JavaTreeParser.g:449:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3897);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:449:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3901);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // JavaTreeParser.g:449:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator3905);
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
    // JavaTreeParser.g:452:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final IntegrityVariablesParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.newExpression_return retval = new IntegrityVariablesParser_JavaTreeParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // JavaTreeParser.g:453:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
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
                    // JavaTreeParser.g:453:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3929); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // JavaTreeParser.g:454:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
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
                            // JavaTreeParser.g:454:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression3947);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression3949);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // JavaTreeParser.g:455:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // JavaTreeParser.g:455:17: ( genericTypeArgumentList )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // JavaTreeParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression3967);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression3970);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression3972);
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
                    // JavaTreeParser.g:458:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4007); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // JavaTreeParser.g:458:34: ( genericTypeArgumentList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // JavaTreeParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4009);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4012);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4014);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // JavaTreeParser.g:458:88: ( classTopLevelScope )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // JavaTreeParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4016);
                            gIntegrityVariablesParser.classTopLevelScope();

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
    // JavaTreeParser.g:461:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final IntegrityVariablesParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.innerNewExpression_return retval = new IntegrityVariablesParser_JavaTreeParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // JavaTreeParser.g:462:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // JavaTreeParser.g:462:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4039); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // JavaTreeParser.g:462:34: ( genericTypeArgumentList )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // JavaTreeParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4041);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4044); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4046);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // JavaTreeParser.g:462:75: ( classTopLevelScope )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // JavaTreeParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4048);
                    gIntegrityVariablesParser.classTopLevelScope();

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
    // JavaTreeParser.g:465:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final IntegrityVariablesParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.newArrayConstruction_return retval = new IntegrityVariablesParser_JavaTreeParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // JavaTreeParser.g:466:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
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
                    // JavaTreeParser.g:466:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4073);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4075);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // JavaTreeParser.g:467:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // JavaTreeParser.g:467:9: ( expression )+
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
                    	    // JavaTreeParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4085);
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

                    // JavaTreeParser.g:467:21: ( arrayDeclaratorList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // JavaTreeParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4088);
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
    // JavaTreeParser.g:470:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final IntegrityVariablesParser_JavaTreeParser.arguments_return arguments() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.arguments_return retval = new IntegrityVariablesParser_JavaTreeParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // JavaTreeParser.g:471:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // JavaTreeParser.g:471:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4109); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // JavaTreeParser.g:471:25: ( expression )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==EXPR) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // JavaTreeParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4111);
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
    // JavaTreeParser.g:474:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final IntegrityVariablesParser_JavaTreeParser.literal_return literal() throws RecognitionException {
        IntegrityVariablesParser_JavaTreeParser.literal_return retval = new IntegrityVariablesParser_JavaTreeParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // JavaTreeParser.g:475:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // JavaTreeParser.g:
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

    // $ANTLR start synpred125_JavaTreeParser
    public final void synpred125_JavaTreeParser_fragment() throws RecognitionException {   
        // JavaTreeParser.g:339:35: ( switchCaseLabel )
        // JavaTreeParser.g:339:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred125_JavaTreeParser2579);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_JavaTreeParser

    // $ANTLR start synpred132_JavaTreeParser
    public final void synpred132_JavaTreeParser_fragment() throws RecognitionException {   
        // JavaTreeParser.g:351:48: ( ( expression )* )
        // JavaTreeParser.g:351:48: ( expression )*
        {
        // JavaTreeParser.g:351:48: ( expression )*
        loop142:
        do {
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==EXPR) ) {
                alt142=1;
            }


            switch (alt142) {
        	case 1 :
        	    // JavaTreeParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred132_JavaTreeParser2680);
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
    // $ANTLR end synpred132_JavaTreeParser

    // Delegated rules

    public final boolean synpred132_JavaTreeParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_JavaTreeParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_JavaTreeParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_JavaTreeParser_fragment(); // can never throw exception
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
            return "173:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
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
            return "310:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
        }
    }
 

    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration158 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration161 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause306 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause337 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList369 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound425 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope449 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant480 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L});
    public static final BitSet FOLLOW_arguments_in_enumConstant482 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope698 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList892 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList894 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator998 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1022 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1052 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1076 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1098 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1100 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1243 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1297 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1301 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1328 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1466 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1658 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1683 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1715 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1746 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1785 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1818 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation1840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1842 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation1844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1872 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1895 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1910 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer1935 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer1937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue1964 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2012 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2040 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2044 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2061 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2246 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2248 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2265 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2267 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2288 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2304 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2308 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2310 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2327 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2359 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement2361 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2379 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2383 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2397 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2440 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2442 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2455 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2457 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2472 = new BitSet(new long[]{0x4140100000000008L,0x4030009161000601L,0x0000000000002004L});
    public static final BitSet FOLLOW_statement_in_statement2474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2526 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2554 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause2556 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2579 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2582 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2585 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2617 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000900002104L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2619 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000900002104L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2647 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000900002104L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2680 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2738 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2766 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression2768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression2793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression2795 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall3848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3850 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall3865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall3867 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall3870 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall3873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator3894 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator3897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator3901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator3905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression3929 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression3947 = new BitSet(new long[]{0x0000000000000008L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression3949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression3967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression3970 = new BitSet(new long[]{0x0000000000000008L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression3972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4012 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4014 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4044 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4046 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4048 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4073 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4085 = new BitSet(new long[]{0x000000000000000AL,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4111 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_JavaTreeParser2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred132_JavaTreeParser2680 = new BitSet(new long[]{0x000000000000000AL,0x4010000000000000L});

}