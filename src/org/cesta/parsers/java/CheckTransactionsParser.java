// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g 2010-05-26 15:46:20

package org.cesta.parsers.java;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.LinkedList;
import java.util.regex.PatternSyntaxException;


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
 * This tree parser checks Java Card transactions,
 * whether they contain some insecure constructions.
 */
public class CheckTransactionsParser extends AbstractTreeParser {
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


        public CheckTransactionsParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public CheckTransactionsParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[291+1];
             
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("CheckTransactionsParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return CheckTransactionsParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g"; }

    	
        /**
         *  Class for modeling variables
         */
        public class Variable implements Comparable {
            String name;
            Object tree;
            public Variable(String name, Object tree){
                this.name = name;
                this.tree = tree;
            }
            @Override
            public boolean equals(Object obj) {
                if (obj == null || getClass() != obj.getClass())
                    return false;
                final Variable other = (Variable) obj;
                if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
                    return false;
                }
                if (this.tree != other.tree && (this.tree == null || !this.tree.equals(other.tree))) {
                    return false;
                }
                return true;
            }
            @Override
            public int hashCode() {
                int hash = 7;
                hash = 17 * hash + (this.name != null ? this.name.hashCode() : 0);
                hash = 17 * hash + (this.tree != null ? this.tree.hashCode() : 0);
                return hash;
            }
            @Override
            public int compareTo(Object obj) {
                if (obj == null || getClass() != obj.getClass()) return -1;
                if (name == null) return 1;
                Variable v = (Variable) obj;
                if (v.name == null) return -1;
                return name.compareTo(v.name);
            }
            @Override
            public String toString() {
                if (name!=null) return name;
                else return "Variable";
            }
        }
        /**
         *  Class for modeling transactions
         */
        public class Transaction {
            Set<Variable> modifiedVariables = new TreeSet<Variable>();
            Set<Variable> nonAtomicVariables = new TreeSet<Variable>();
            Object startTree, endTree;
            void start(Object tree){
                // end previous transaction
                if (isActive() && foundEnd()){
                    process();
                }
                // write down only first start of transaction
                if (!isActive()) startTree = tree;
            }
            void end(Object tree){
                // write down last end of transaction
                if (isActive()) endTree = tree;
            }
            boolean isActive(){
                return (startTree!=null);
            }
            boolean foundEnd(){
                return (endTree!=null);
            }
            void process(){
                if (startTree!=null && endTree!=null){

                    tokens.insertBefore(
                        input.getTreeAdaptor().getTokenStartIndex(startTree),
                        getTemplateLib().getInstanceOf("detectedStartOfTransaction")
                    );
                    tokens.insertAfter(
                        input.getTreeAdaptor().getTokenStopIndex(endTree),
                        getTemplateLib().getInstanceOf("detectedEndOfTransaction")
                    );

                    // check whether some variables are not modified and also
                    // accessed via non atomic method
                    Set<Variable> warnVariables = new TreeSet<Variable>();
                    warnVariables.addAll(modifiedVariables);
                    warnVariables.retainAll(nonAtomicVariables);
                    // test range according to tokens
                    for (Variable v:warnVariables){
                        if (input.getTreeAdaptor().getTokenStartIndex(v.tree)<input.getTreeAdaptor().getTokenStartIndex(startTree) ||
                                input.getTreeAdaptor().getTokenStartIndex(v.tree)>input.getTreeAdaptor().getTokenStartIndex(endTree)){
                            warnVariables.remove(v);
                        }
                    }

                    if (warnVariables.size()>0){
                        StringTemplate st = getTemplateLib().getInstanceOf("warningNonAtomic");

                        List<Variable> l = new LinkedList<Variable>();
                        l.addAll(warnVariables);
                        st.setAttribute("variables", l);

                        tokens.insertBefore(
                            input.getTreeAdaptor().getTokenStartIndex(startTree),
                            st
                        );

                        getLogger().warning("Transaction contains possibly insecure methods (variables "+l+")");
                    }

                    // reset transaction
                    startTree = null;
                    endTree = null;
                    modifiedVariables.clear();
                    nonAtomicVariables.clear();
                }
            }
        }
        /**
         *  Tries to resolve method name according to current imports
         *  and returns Set of possible names for this method.
         *
         *@param name name of method (e.g. JCSystem.beginTransaction)
         */
         Set<String> getMethodPossibleNames(String name){
            // TODO: this whole method needs revision and rewrite,
            // possibly also added cache mechanism
            Set<String> possibleNames = new TreeSet<String>();
            possibleNames.add(name);
            if (javaSource_stack.size()>0) for (String i:((javaSource_scope)javaSource_stack.peek()).imports){
                if (i.matches(".+\\.\\*")) {
                    possibleNames.add(i.replace("*", name));
                } else {
                    String importParts[] = i.split("\\.");
                    String nameParts[] = name.split("\\.");

                    // last part of import matches with first part of name (class name)
                    if (importParts.length>0 && nameParts.length>0 &&
                        importParts[importParts.length-1].equals(nameParts[0])) {

                        StringBuffer possibleName = new StringBuffer();
                        for (int j=0;j<importParts.length-1;j++) {
                            if (possibleName.length()>0) possibleName.append(".");
                            possibleName.append(importParts[j]);
                        }
                        for (int j=0;j<nameParts.length;j++) {
                            if (possibleName.length()>0) possibleName.append(".");
                            possibleName.append(nameParts[j]);
                        }
                        possibleNames.add(possibleName.toString());
                    }
                }
            }
            return possibleNames;
          }
        /**
         *  Tries to determine whether given method matches full class name
         *
         *@param name name of method (e.g. JCSystem.beginTransaction)
         *@param qualifiedName full name of method (e.g. javacard.framework.Util.JCSystem.beginTransaction)
         */
        boolean methodNameEquals(String name, String qualifiedName){
           return getMethodPossibleNames(name).contains(qualifiedName);
        }
        /**
         *  Tries to determine whether given method matches given pattern for full qualified name
         *
         *@param name name of method (e.g. JCSystem.beginTransaction)
         *@param regexp pattern for full qualified name
         */
        boolean methodNameMatches(String name, String regexp){
           for (String n:getMethodPossibleNames(name)){
                try {
                    if (n.matches(regexp)) return true;
                } catch (PatternSyntaxException ex){
                    getLogger().warning("Given regular expression is invalid: \""+regexp+"\"");
                }
           }
           return false;
        }


    protected static class javaSource_scope {
        Set<String> imports;
    }
    protected Stack javaSource_stack = new Stack();

    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:211:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
    public final CheckTransactionsParser.javaSource_return javaSource() throws RecognitionException {
        javaSource_stack.push(new javaSource_scope());
        CheckTransactionsParser.javaSource_return retval = new CheckTransactionsParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();

                ((javaSource_scope)javaSource_stack.peek()).imports = new TreeSet<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:218:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:218:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource141); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource143);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:218:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource145);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:218:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource148);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:218:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource151);
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
            if ( state.backtracking>0 ) { memoize(input, 1, javaSource_StartIndex); }
            javaSource_stack.pop();
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:221:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final CheckTransactionsParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        CheckTransactionsParser.packageDeclaration_return retval = new CheckTransactionsParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:222:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:222:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration173); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration175);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:225:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final CheckTransactionsParser.importDeclaration_return importDeclaration() throws RecognitionException {
        CheckTransactionsParser.importDeclaration_return retval = new CheckTransactionsParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        CommonTree DOTSTAR2=null;
        CheckTransactionsParser.qualifiedIdentifier_return qualifiedIdentifier1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:226:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:226:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration201); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:226:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration203); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration206);
            qualifiedIdentifier1=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:226:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: DOTSTAR
                    {
                    DOTSTAR2=(CommonTree)match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration208); if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          ((javaSource_scope)javaSource_stack.peek()).imports.add((qualifiedIdentifier1!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(qualifiedIdentifier1.start),
                input.getTreeAdaptor().getTokenStopIndex(qualifiedIdentifier1.start))):null)+((DOTSTAR2!=null?DOTSTAR2.getText():null)!=null?(DOTSTAR2!=null?DOTSTAR2.getText():null):""));
                      
            }

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:232:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final CheckTransactionsParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        CheckTransactionsParser.typeDeclaration_return retval = new CheckTransactionsParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration244); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration246);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration248); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:36: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration250);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:62: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration253);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:77: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration256);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration259);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:234:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration271); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration273);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration275); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:234:40: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration277);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:234:66: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration280);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration283);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:235:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration295); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration297);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration299); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:235:35: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration301);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration304);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:236:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration316); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration318);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration320); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration322);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:239:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final CheckTransactionsParser.extendsClause_return extendsClause() throws RecognitionException {
        CheckTransactionsParser.extendsClause_return retval = new CheckTransactionsParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:241:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:241:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause359); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:241:26: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause361);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:244:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final CheckTransactionsParser.implementsClause_return implementsClause() throws RecognitionException {
        CheckTransactionsParser.implementsClause_return retval = new CheckTransactionsParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:245:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:245:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause390); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:245:29: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause392);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:248:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final CheckTransactionsParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        CheckTransactionsParser.genericTypeParameterList_return retval = new CheckTransactionsParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:249:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:249:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList422); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:249:35: ( genericTypeParameter )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList424);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:252:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final CheckTransactionsParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        CheckTransactionsParser.genericTypeParameter_return retval = new CheckTransactionsParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:253:5: ( ^( IDENT ( bound )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:253:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter446); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:253:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter448);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:256:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final CheckTransactionsParser.bound_return bound() throws RecognitionException {
        CheckTransactionsParser.bound_return retval = new CheckTransactionsParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:257:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:257:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound478); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:257:30: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound480);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:260:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final CheckTransactionsParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        CheckTransactionsParser.enumTopLevelScope_return retval = new CheckTransactionsParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:261:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:261:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope502); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:261:32: ( enumConstant )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope504);
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

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:261:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope507);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:264:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final CheckTransactionsParser.enumConstant_return enumConstant() throws RecognitionException {
        CheckTransactionsParser.enumConstant_return retval = new CheckTransactionsParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:265:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:265:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant533); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant535);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:265:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant537);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:265:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant540);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:269:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) ;
    public final CheckTransactionsParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        CheckTransactionsParser.classTopLevelScope_return retval = new CheckTransactionsParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:270:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:270:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* )
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope571); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:270:33: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope573);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:273:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final CheckTransactionsParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        CheckTransactionsParser.classScopeDeclarations_return retval = new CheckTransactionsParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:274:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt23=5;
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
            case CONSTRUCTOR_DECL:
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt23=3;
                }
                break;
            case VAR_DECLARATION:
                {
                alt23=4;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt23=5;
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:274:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations599); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations601);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:275:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations613); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations615);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:276:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations626);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:277:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations637); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations639);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations641);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations643);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:278:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations654);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:281:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final CheckTransactionsParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        CheckTransactionsParser.interfaceTopLevelScope_return retval = new CheckTransactionsParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:282:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:282:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope678); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:282:37: ( interfaceScopeDeclarations )*
                loop24:
                do {
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==AT||LA24_0==CLASS||LA24_0==ENUM||LA24_0==INTERFACE||LA24_0==FUNCTION_METHOD_DECL||LA24_0==VAR_DECLARATION||LA24_0==VOID_METHOD_DECL) ) {
                        alt24=1;
                    }


                    switch (alt24) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope680);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop24;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:285:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final CheckTransactionsParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        CheckTransactionsParser.interfaceScopeDeclarations_return retval = new CheckTransactionsParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt30=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt30=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt30=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt30=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations706); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations708);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:45: ( genericTypeParameterList )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations710);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations713);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations715); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations717);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:102: ( arrayDeclaratorList )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ARRAY_DECLARATOR_LIST) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations719);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:123: ( throwsClause )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==THROWS_CLAUSE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations722);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:287:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations735); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations737);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:287:41: ( genericTypeParameterList )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations739);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations742); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations744);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:287:93: ( throwsClause )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==THROWS_CLAUSE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations746);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:291:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations837); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations839);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations841);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations843);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:292:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations854);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:295:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final CheckTransactionsParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        CheckTransactionsParser.variableDeclaratorList_return retval = new CheckTransactionsParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:296:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:296:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList874); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:296:31: ( variableDeclarator )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==VAR_DECLARATOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList876);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:299:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final CheckTransactionsParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        CheckTransactionsParser.variableDeclarator_return retval = new CheckTransactionsParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:300:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:300:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator898); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator900);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:300:47: ( variableInitializer )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARRAY_INITIALIZER||LA32_0==EXPR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator902);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:303:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final CheckTransactionsParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        CheckTransactionsParser.variableDeclaratorId_return retval = new CheckTransactionsParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:304:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:304:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId928); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:304:17: ( arrayDeclaratorList )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ARRAY_DECLARATOR_LIST) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId930);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:307:1: variableInitializer : ( arrayInitializer | expression );
    public final CheckTransactionsParser.variableInitializer_return variableInitializer() throws RecognitionException {
        CheckTransactionsParser.variableInitializer_return retval = new CheckTransactionsParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:308:5: ( arrayInitializer | expression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ARRAY_INITIALIZER) ) {
                alt34=1;
            }
            else if ( (LA34_0==EXPR) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:308:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer951);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:309:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer961);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:312:1: arrayDeclarator : LBRACK RBRACK ;
    public final CheckTransactionsParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        CheckTransactionsParser.arrayDeclarator_return retval = new CheckTransactionsParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:313:5: ( LBRACK RBRACK )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:313:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator980); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator982); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:316:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final CheckTransactionsParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        CheckTransactionsParser.arrayDeclaratorList_return retval = new CheckTransactionsParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:317:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:317:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1002); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:317:33: ( ARRAY_DECLARATOR )*
                loop35:
                do {
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR) ) {
                        alt35=1;
                    }


                    switch (alt35) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1004); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop35;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:320:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final CheckTransactionsParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        CheckTransactionsParser.arrayInitializer_return retval = new CheckTransactionsParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:321:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:321:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1032); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:321:29: ( variableInitializer )*
                loop36:
                do {
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ARRAY_INITIALIZER||LA36_0==EXPR) ) {
                        alt36=1;
                    }


                    switch (alt36) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1034);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop36;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:324:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final CheckTransactionsParser.throwsClause_return throwsClause() throws RecognitionException {
        CheckTransactionsParser.throwsClause_return retval = new CheckTransactionsParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:325:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:325:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1056); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:325:25: ( qualifiedIdentifier )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==DOT||LA37_0==IDENT) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1058);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:328:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final CheckTransactionsParser.modifierList_return modifierList() throws RecognitionException {
        CheckTransactionsParser.modifierList_return retval = new CheckTransactionsParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:329:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:329:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1080); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:329:25: ( modifier )*
                loop38:
                do {
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==AT||LA38_0==ABSTRACT||LA38_0==FINAL||LA38_0==NATIVE||(LA38_0>=PRIVATE && LA38_0<=PUBLIC)||(LA38_0>=STATIC && LA38_0<=STRICTFP)||LA38_0==SYNCHRONIZED||LA38_0==TRANSIENT||LA38_0==VOLATILE) ) {
                        alt38=1;
                    }


                    switch (alt38) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1082);
                	    modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop38;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:332:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final CheckTransactionsParser.modifier_return modifier() throws RecognitionException {
        CheckTransactionsParser.modifier_return retval = new CheckTransactionsParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:333:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt39=11;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:333:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1103); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:334:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1113); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:335:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1123); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:336:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1133); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:337:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1143); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:338:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1153); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:339:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1163); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:340:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1173); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:341:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1183); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:342:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1193); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:343:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1203);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:346:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final CheckTransactionsParser.localModifierList_return localModifierList() throws RecognitionException {
        CheckTransactionsParser.localModifierList_return retval = new CheckTransactionsParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:347:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:347:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1223); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:347:31: ( localModifier )*
                loop40:
                do {
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==AT||LA40_0==FINAL) ) {
                        alt40=1;
                    }


                    switch (alt40) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1225);
                	    localModifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop40;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:350:1: localModifier : ( FINAL | annotation );
    public final CheckTransactionsParser.localModifier_return localModifier() throws RecognitionException {
        CheckTransactionsParser.localModifier_return retval = new CheckTransactionsParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:351:5: ( FINAL | annotation )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FINAL) ) {
                alt41=1;
            }
            else if ( (LA41_0==AT) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:351:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1246); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:352:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1256);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:355:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final CheckTransactionsParser.type_return type() throws RecognitionException {
        CheckTransactionsParser.type_return retval = new CheckTransactionsParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1276); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:16: ( primitiveType | qualifiedTypeIdent )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==BOOLEAN||LA42_0==BYTE||LA42_0==CHAR||LA42_0==DOUBLE||LA42_0==FLOAT||(LA42_0>=INT && LA42_0<=LONG)||LA42_0==SHORT) ) {
                alt42=1;
            }
            else if ( (LA42_0==QUALIFIED_TYPE_IDENT) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1279);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1283);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:356:53: ( arrayDeclaratorList )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAY_DECLARATOR_LIST) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1286);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:359:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final CheckTransactionsParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        CheckTransactionsParser.qualifiedTypeIdent_return retval = new CheckTransactionsParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:360:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:360:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1308); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:360:32: ( typeIdent )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==IDENT) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1310);
            	    typeIdent();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:363:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final CheckTransactionsParser.typeIdent_return typeIdent() throws RecognitionException {
        CheckTransactionsParser.typeIdent_return retval = new CheckTransactionsParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:364:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:364:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1333); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:364:17: ( genericTypeArgumentList )?
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt45=1;
                }
                switch (alt45) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1335);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:367:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final CheckTransactionsParser.primitiveType_return primitiveType() throws RecognitionException {
        CheckTransactionsParser.primitiveType_return retval = new CheckTransactionsParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:368:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:378:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final CheckTransactionsParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        CheckTransactionsParser.genericTypeArgumentList_return retval = new CheckTransactionsParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:379:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:379:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1446); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:379:33: ( genericTypeArgument )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==QUESTION||LA46_0==TYPE) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1448);
            	    genericTypeArgument();

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:382:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final CheckTransactionsParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        CheckTransactionsParser.genericTypeArgument_return retval = new CheckTransactionsParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:383:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==TYPE) ) {
                alt48=1;
            }
            else if ( (LA48_0==QUESTION) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:383:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1473);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:384:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1484); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:384:20: ( genericWildcardBoundType )?
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==EXTENDS||LA47_0==SUPER) ) {
                            alt47=1;
                        }
                        switch (alt47) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1486);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:387:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final CheckTransactionsParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        CheckTransactionsParser.genericWildcardBoundType_return retval = new CheckTransactionsParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:388:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==EXTENDS) ) {
                alt49=1;
            }
            else if ( (LA49_0==SUPER) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:388:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1626); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1628);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:389:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1640); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1642);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:392:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final CheckTransactionsParser.formalParameterList_return formalParameterList() throws RecognitionException {
        CheckTransactionsParser.formalParameterList_return retval = new CheckTransactionsParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:393:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:393:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1663); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:393:29: ( formalParameterStandardDecl )*
                loop50:
                do {
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==FORMAL_PARAM_STD_DECL) ) {
                        alt50=1;
                    }


                    switch (alt50) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1665);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop50;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:393:58: ( formalParameterVarargDecl )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1668);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:396:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final CheckTransactionsParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        CheckTransactionsParser.formalParameterStandardDecl_return retval = new CheckTransactionsParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:397:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:397:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1695); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1697);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1699);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1701);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:400:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final CheckTransactionsParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        CheckTransactionsParser.formalParameterVarargDecl_return retval = new CheckTransactionsParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:401:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:401:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1726); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1728);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1730);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1732);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:404:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final CheckTransactionsParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        CheckTransactionsParser.qualifiedIdentifier_return retval = new CheckTransactionsParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:405:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==IDENT) ) {
                alt52=1;
            }
            else if ( (LA52_0==DOT) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:405:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1756); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:406:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1767); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1769);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1771); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:411:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final CheckTransactionsParser.annotationList_return annotationList() throws RecognitionException {
        CheckTransactionsParser.annotationList_return retval = new CheckTransactionsParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:412:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:412:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1798); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:412:27: ( annotation )*
                loop53:
                do {
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AT) ) {
                        alt53=1;
                    }


                    switch (alt53) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1800);
                	    annotation();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop53;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:415:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final CheckTransactionsParser.annotation_return annotation() throws RecognitionException {
        CheckTransactionsParser.annotation_return retval = new CheckTransactionsParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:416:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:416:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation1822); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1824);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:416:34: ( annotationInit )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ANNOTATION_INIT_BLOCK) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation1826);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:419:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final CheckTransactionsParser.annotationInit_return annotationInit() throws RecognitionException {
        CheckTransactionsParser.annotationInit_return retval = new CheckTransactionsParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:420:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:420:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1852); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit1854);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:423:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final CheckTransactionsParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        CheckTransactionsParser.annotationInitializers_return retval = new CheckTransactionsParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:424:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt56=1;
            }
            else if ( (LA56_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:424:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1875); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:424:36: ( annotationInitializer )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==IDENT) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1877);
                    	    annotationInitializer();

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
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:425:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1890); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1892);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:428:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final CheckTransactionsParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        CheckTransactionsParser.annotationInitializer_return retval = new CheckTransactionsParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:429:5: ( ^( IDENT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:429:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer1917); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer1919);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:432:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final CheckTransactionsParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        CheckTransactionsParser.annotationElementValue_return retval = new CheckTransactionsParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:433:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt58=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt58=1;
                }
                break;
            case AT:
                {
                alt58=2;
                }
                break;
            case EXPR:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:433:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1944); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:433:41: ( annotationElementValue )*
                        loop57:
                        do {
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==AT||LA57_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA57_0==EXPR) ) {
                                alt57=1;
                            }


                            switch (alt57) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue1946);
                        	    annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop57;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:434:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue1958);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:435:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue1968);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:438:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final CheckTransactionsParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        CheckTransactionsParser.annotationTopLevelScope_return retval = new CheckTransactionsParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:439:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:439:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope1992); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:439:38: ( annotationScopeDeclarations )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==AT||LA59_0==CLASS||LA59_0==ENUM||LA59_0==INTERFACE||LA59_0==ANNOTATION_METHOD_DECL||LA59_0==VAR_DECLARATION) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope1994);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop59;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:442:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final CheckTransactionsParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        CheckTransactionsParser.annotationScopeDeclarations_return retval = new CheckTransactionsParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:443:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt61=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt61=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt61=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:443:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2020); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2022);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2024);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2026); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:443:58: ( annotationDefaultValue )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==DEFAULT) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2028);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:444:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2041); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2043);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2045);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2047);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:445:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2058);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:448:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final CheckTransactionsParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        CheckTransactionsParser.annotationDefaultValue_return retval = new CheckTransactionsParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:449:5: ( ^( DEFAULT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:449:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2082); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2084);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:454:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final CheckTransactionsParser.block_return block() throws RecognitionException {
        CheckTransactionsParser.block_return retval = new CheckTransactionsParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:455:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:455:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2107); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:455:23: ( blockStatement )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT||LA62_0==SEMI||LA62_0==ASSERT||LA62_0==BREAK||(LA62_0>=CLASS && LA62_0<=CONTINUE)||LA62_0==DO||LA62_0==ENUM||(LA62_0>=FOR && LA62_0<=IF)||LA62_0==INTERFACE||LA62_0==RETURN||(LA62_0>=SWITCH && LA62_0<=SYNCHRONIZED)||LA62_0==THROW||LA62_0==TRY||LA62_0==WHILE||LA62_0==BLOCK_SCOPE||LA62_0==EXPR||LA62_0==FOR_EACH||LA62_0==LABELED_STATEMENT||LA62_0==VAR_DECLARATION) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2109);
                	    blockStatement();

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:458:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final CheckTransactionsParser.blockStatement_return blockStatement() throws RecognitionException {
        CheckTransactionsParser.blockStatement_return retval = new CheckTransactionsParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:459:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt63=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt63=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt63=2;
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
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:459:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2134);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:460:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2144);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:461:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2154);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:464:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final CheckTransactionsParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        CheckTransactionsParser.localVariableDeclaration_return retval = new CheckTransactionsParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:465:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:465:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2178); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2180);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2182);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2184);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:469:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final CheckTransactionsParser.statement_return statement() throws RecognitionException {
        CheckTransactionsParser.statement_return retval = new CheckTransactionsParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:470:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt71=17;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:470:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2217);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:471:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2228); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2230);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:471:29: ( expression )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==EXPR) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2232);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:472:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2245); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2247);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2249);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:472:48: ( statement )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==SEMI||LA65_0==ASSERT||LA65_0==BREAK||LA65_0==CONTINUE||LA65_0==DO||(LA65_0>=FOR && LA65_0<=IF)||LA65_0==RETURN||(LA65_0>=SWITCH && LA65_0<=SYNCHRONIZED)||LA65_0==THROW||LA65_0==TRY||LA65_0==WHILE||LA65_0==BLOCK_SCOPE||LA65_0==EXPR||LA65_0==FOR_EACH||LA65_0==LABELED_STATEMENT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2251);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:473:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2264); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2266);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2268);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2270);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2272);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:474:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2284); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2286);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2288);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2290); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2292);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2294);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:475:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2307); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2309);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2311);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:476:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2323); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2325);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2327);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:477:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2339); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2341);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:477:21: ( catches )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==CATCH_CLAUSE_LIST) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2343);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:477:30: ( block )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==BLOCK_SCOPE) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement2346);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:478:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2361); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2363);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2365);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:479:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2377); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2379);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2381);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:480:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2393); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:480:18: ( expression )?
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==EXPR) ) {
                            alt68=1;
                        }
                        switch (alt68) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2395);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:481:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2408); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2410);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:482:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2422); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:482:17: ( IDENT )?
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==IDENT) ) {
                            alt69=1;
                        }
                        switch (alt69) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2424); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:483:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2437); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:483:20: ( IDENT )?
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==IDENT) ) {
                            alt70=1;
                        }
                        switch (alt70) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2439); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:484:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2452); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2454); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2456);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:485:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2467);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:486:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2477); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:489:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final CheckTransactionsParser.catches_return catches() throws RecognitionException {
        CheckTransactionsParser.catches_return retval = new CheckTransactionsParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:490:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:490:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2506); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:490:29: ( catchClause )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==CATCH) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2508);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:493:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final CheckTransactionsParser.catchClause_return catchClause() throws RecognitionException {
        CheckTransactionsParser.catchClause_return retval = new CheckTransactionsParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:494:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:494:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2534); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2536);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2538);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:497:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final CheckTransactionsParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        CheckTransactionsParser.switchBlockLabels_return retval = new CheckTransactionsParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2559); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:35: ( switchCaseLabel )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==CASE) ) {
                        int LA73_2 = input.LA(2);

                        if ( (synpred114_CheckTransactionsParser()) ) {
                            alt73=1;
                        }


                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2561);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:52: ( switchDefaultLabel )?
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==DEFAULT) ) {
                    alt74=1;
                }
                switch (alt74) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2564);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:72: ( switchCaseLabel )*
                loop75:
                do {
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CASE) ) {
                        alt75=1;
                    }


                    switch (alt75) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2567);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop75;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:501:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final CheckTransactionsParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        CheckTransactionsParser.switchCaseLabel_return retval = new CheckTransactionsParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:502:5: ( ^( CASE expression ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:502:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2597); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2599);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:502:27: ( blockStatement )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==AT||LA76_0==SEMI||LA76_0==ASSERT||LA76_0==BREAK||(LA76_0>=CLASS && LA76_0<=CONTINUE)||LA76_0==DO||LA76_0==ENUM||(LA76_0>=FOR && LA76_0<=IF)||LA76_0==INTERFACE||LA76_0==RETURN||(LA76_0>=SWITCH && LA76_0<=SYNCHRONIZED)||LA76_0==THROW||LA76_0==TRY||LA76_0==WHILE||LA76_0==BLOCK_SCOPE||LA76_0==EXPR||LA76_0==FOR_EACH||LA76_0==LABELED_STATEMENT||LA76_0==VAR_DECLARATION) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2601);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:505:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final CheckTransactionsParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        CheckTransactionsParser.switchDefaultLabel_return retval = new CheckTransactionsParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:506:5: ( ^( DEFAULT ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:506:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2627); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:506:19: ( blockStatement )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==AT||LA77_0==SEMI||LA77_0==ASSERT||LA77_0==BREAK||(LA77_0>=CLASS && LA77_0<=CONTINUE)||LA77_0==DO||LA77_0==ENUM||(LA77_0>=FOR && LA77_0<=IF)||LA77_0==INTERFACE||LA77_0==RETURN||(LA77_0>=SWITCH && LA77_0<=SYNCHRONIZED)||LA77_0==THROW||LA77_0==TRY||LA77_0==WHILE||LA77_0==BLOCK_SCOPE||LA77_0==EXPR||LA77_0==FOR_EACH||LA77_0==LABELED_STATEMENT||LA77_0==VAR_DECLARATION) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2629);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop77;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:509:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final CheckTransactionsParser.forInit_return forInit() throws RecognitionException {
        CheckTransactionsParser.forInit_return retval = new CheckTransactionsParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2655); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:20: ( localVariableDeclaration | ( expression )* )?
                int alt79=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt79=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt79=2;
                        }
                        break;
                    case UP:
                        {
                        int LA79_3 = input.LA(2);

                        if ( (synpred121_CheckTransactionsParser()) ) {
                            alt79=2;
                        }
                        }
                        break;
                }

                switch (alt79) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2658);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:48: ( expression )*
                        {
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:48: ( expression )*
                        loop78:
                        do {
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==EXPR) ) {
                                alt78=1;
                            }


                            switch (alt78) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2662);
                        	    expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop78;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:513:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final CheckTransactionsParser.forCondition_return forCondition() throws RecognitionException {
        CheckTransactionsParser.forCondition_return retval = new CheckTransactionsParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:514:5: ( ^( FOR_CONDITION ( expression )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:514:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2690); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:514:25: ( expression )?
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==EXPR) ) {
                    alt80=1;
                }
                switch (alt80) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2692);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:517:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final CheckTransactionsParser.forUpdater_return forUpdater() throws RecognitionException {
        CheckTransactionsParser.forUpdater_return retval = new CheckTransactionsParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:518:5: ( ^( FOR_UPDATE ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:518:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2718); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:518:22: ( expression )*
                loop81:
                do {
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==EXPR) ) {
                        alt81=1;
                    }


                    switch (alt81) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2720);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop81;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:523:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final CheckTransactionsParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        CheckTransactionsParser.parenthesizedExpression_return retval = new CheckTransactionsParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:524:5: ( ^( PARENTESIZED_EXPR expression ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:524:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2748); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression2750);
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
        public Variable variable;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:527:1: expression returns [Variable variable] : ^( EXPR expr ) ;
    public final CheckTransactionsParser.expression_return expression() throws RecognitionException {
        CheckTransactionsParser.expression_return retval = new CheckTransactionsParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CheckTransactionsParser.expr_return expr3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:528:5: ( ^( EXPR expr ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:528:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression2779); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression2781);
            expr3=expr();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.variable = (expr3!=null?expr3.variable:null); 
            }

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

    public static class modifyVariableExpression_return extends TreeRuleReturnScope {
        public Variable variable;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifyVariableExpression"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:531:1: modifyVariableExpression returns [Variable variable] : ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) ) ;
    public final CheckTransactionsParser.modifyVariableExpression_return modifyVariableExpression() throws RecognitionException {
        CheckTransactionsParser.modifyVariableExpression_return retval = new CheckTransactionsParser.modifyVariableExpression_return();
        retval.start = input.LT(1);
        int modifyVariableExpression_StartIndex = input.index();
        CheckTransactionsParser.expr_return var = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:532:5: ( ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:533:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:533:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )
            int alt82=16;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:534:17: ^( ASSIGN var= expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_modifyVariableExpression2832); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2836);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2838);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:535:17: ^( PLUS_ASSIGN var= expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_modifyVariableExpression2858); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2862);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2864);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:536:17: ^( MINUS_ASSIGN var= expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_modifyVariableExpression2884); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2888);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2890);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:537:17: ^( STAR_ASSIGN var= expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_modifyVariableExpression2910); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2914);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2916);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:538:17: ^( DIV_ASSIGN var= expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_modifyVariableExpression2936); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2940);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2942);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:539:17: ^( AND_ASSIGN var= expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_modifyVariableExpression2962); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2966);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2968);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:540:17: ^( OR_ASSIGN var= expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_modifyVariableExpression2988); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2992);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression2994);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:541:17: ^( XOR_ASSIGN var= expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_modifyVariableExpression3014); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3018);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3020);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:542:17: ^( MOD_ASSIGN var= expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_modifyVariableExpression3040); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3044);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3046);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:543:17: ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression3066); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3070);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3072);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:544:17: ^( SHIFT_RIGHT_ASSIGN var= expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression3092); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3096);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3098);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:545:17: ^( SHIFT_LEFT_ASSIGN var= expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_modifyVariableExpression3118); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3122);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3124);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:546:17: ^( PRE_INC var= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_modifyVariableExpression3144); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3148);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:547:17: ^( PRE_DEC var= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_modifyVariableExpression3168); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3172);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:548:17: ^( POST_INC var= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_modifyVariableExpression3192); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3196);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:549:17: ^( POST_DEC var= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_modifyVariableExpression3216); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression3220);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          retval.variable = (var!=null?var.variable:null);
                          if (!methodScopeDeclarations_stack.isEmpty())
                              ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction.modifiedVariables.add(
                                  retval.variable
                              );
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, modifyVariableExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifyVariableExpression"

    public static class expr_return extends TreeRuleReturnScope {
        public Variable variable;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:560:1: expr returns [Variable variable] : ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression );
    public final CheckTransactionsParser.expr_return expr() throws RecognitionException {
        CheckTransactionsParser.expr_return retval = new CheckTransactionsParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        CheckTransactionsParser.primaryExpression_return pe = null;

        CheckTransactionsParser.modifyVariableExpression_return modifyVariableExpression4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:561:5: ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression )
            int alt83=28;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:562:9: modifyVariableExpression
                    {
                    pushFollow(FOLLOW_modifyVariableExpression_in_expr3270);
                    modifyVariableExpression4=modifyVariableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.variable =(modifyVariableExpression4!=null?modifyVariableExpression4.variable:null); 
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:564:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3288); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3290);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3292);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3294);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:565:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3306); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3308);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3310);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:566:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3322); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3324);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3326);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:567:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3338); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3340);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3342);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:568:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3354); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3356);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3358);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:569:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3370); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3372);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3374);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:570:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3386); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3388);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3390);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:571:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3402); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3404);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3406);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:572:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3418); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3420);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3422);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:573:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3434); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3436);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3438);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:574:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3450); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3452);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3454);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:575:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3466); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3468);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3470);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:576:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3482); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3484);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3486);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:577:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3498); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3500);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3502);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:578:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3514); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3516);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3518);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:579:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3530); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3532);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3534);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:580:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3546); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3548);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3550);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:581:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3562); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3564);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3566);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:582:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3578); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3580);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3582);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:583:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3594); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3596);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3598);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:584:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3610); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3612);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3614);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:585:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3626); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3628);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:586:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3640); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3642);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:587:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3654); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3656);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:588:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3668); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3670);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:589:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3682); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3684);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3686);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:590:9: pe= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3699);
                    pe=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.variable =new Variable((pe!=null?pe.ident:null), (pe!=null?((CommonTree)pe.start):null)); 
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
            if ( state.backtracking>0 ) { memoize(input, 63, expr_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:593:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final CheckTransactionsParser.primaryExpression_return primaryExpression() throws RecognitionException {
        CheckTransactionsParser.primaryExpression_return retval = new CheckTransactionsParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        CommonTree IDENT5=null;
        CommonTree IDENT6=null;
        CheckTransactionsParser.primaryExpression_return p = null;

        CheckTransactionsParser.primaryExpression_return pe = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:594:5: ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt86=11;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:594:9: ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3731); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:595:13: (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt85=3;
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
                        alt85=1;
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
                        alt85=2;
                        }
                        break;
                    case VOID:
                        {
                        alt85=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }

                    switch (alt85) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:595:17: p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3751);
                            p=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                              retval.ident = ((p!=null?p.ident:null)==null?"":((p!=null?p.ident:null)+"."));
                            }
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:596:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt84=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt84=1;
                                }
                                break;
                            case THIS:
                                {
                                alt84=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt84=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt84=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt84=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 84, 0, input);

                                throw nvae;
                            }

                            switch (alt84) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:596:21: IDENT
                                    {
                                    IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3775); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += (IDENT5!=null?IDENT5.getText():null); 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:597:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3799); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "this"; 
                                    }

                                    }
                                    break;
                                case 3 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:598:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3823); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "super"; 
                                    }

                                    }
                                    break;
                                case 4 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:599:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3847);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:600:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3869); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:602:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression3905);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3907); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:603:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression3925); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3927); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:606:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression3961);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:607:9: IDENT
                    {
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = (IDENT6!=null?IDENT6.getText():null); 
                    }

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:608:9: methodCall
                    {
                    pushFollow(FOLLOW_methodCall_in_primaryExpression3983);
                    methodCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:609:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression3993);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:610:9: ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4004); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4008);
                    pe=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression4010);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = (pe!=null?pe.ident:null); 
                    }

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:611:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4023);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:612:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression4033);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:613:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression4043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = "this"; 
                    }

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:614:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4055);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:615:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = "super"; 
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
            if ( state.backtracking>0 ) { memoize(input, 64, primaryExpression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:618:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final CheckTransactionsParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        CheckTransactionsParser.explicitConstructorCall_return retval = new CheckTransactionsParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:619:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==THIS_CONSTRUCTOR_CALL) ) {
                alt90=1;
            }
            else if ( (LA90_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:619:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4091); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:619:33: ( genericTypeArgumentList )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4093);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4096);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:620:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4108); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:620:34: ( primaryExpression )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==DOT||LA88_0==FALSE||LA88_0==NULL||LA88_0==SUPER||LA88_0==THIS||LA88_0==TRUE||LA88_0==ARRAY_DECLARATOR||LA88_0==ARRAY_ELEMENT_ACCESS||LA88_0==CLASS_CONSTRUCTOR_CALL||LA88_0==METHOD_CALL||LA88_0==PARENTESIZED_EXPR||(LA88_0>=STATIC_ARRAY_CREATOR && LA88_0<=SUPER_CONSTRUCTOR_CALL)||LA88_0==THIS_CONSTRUCTOR_CALL||(LA88_0>=IDENT && LA88_0<=STRING_LITERAL)) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4110);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:620:53: ( genericTypeArgumentList )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4113);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4116);
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
            if ( state.backtracking>0 ) { memoize(input, 65, explicitConstructorCall_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:623:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final CheckTransactionsParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        CheckTransactionsParser.arrayTypeDeclarator_return retval = new CheckTransactionsParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4137); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt91=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt91=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt91=2;
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
                alt91=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4140);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4144);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:624:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4148);
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
            if ( state.backtracking>0 ) { memoize(input, 66, arrayTypeDeclarator_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:627:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final CheckTransactionsParser.newExpression_return newExpression() throws RecognitionException {
        CheckTransactionsParser.newExpression_return retval = new CheckTransactionsParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:628:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==STATIC_ARRAY_CREATOR) ) {
                alt96=1;
            }
            else if ( (LA96_0==CLASS_CONSTRUCTOR_CALL) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:628:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4172); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:629:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==BOOLEAN||LA93_0==BYTE||LA93_0==CHAR||LA93_0==DOUBLE||LA93_0==FLOAT||(LA93_0>=INT && LA93_0<=LONG)||LA93_0==SHORT) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==GENERIC_TYPE_ARG_LIST||LA93_0==QUALIFIED_TYPE_IDENT) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:629:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression4190);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4192);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:630:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:630:17: ( genericTypeArgumentList )?
                            int alt92=2;
                            int LA92_0 = input.LA(1);

                            if ( (LA92_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt92=1;
                            }
                            switch (alt92) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4210);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4213);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4215);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:633:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4250); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:633:34: ( genericTypeArgumentList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4252);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4255);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4257);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:633:88: ( classTopLevelScope )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4259);
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
            if ( state.backtracking>0 ) { memoize(input, 67, newExpression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:636:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final CheckTransactionsParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        CheckTransactionsParser.innerNewExpression_return retval = new CheckTransactionsParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:637:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:637:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4282); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:637:34: ( genericTypeArgumentList )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==GENERIC_TYPE_ARG_LIST) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4284);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4287); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4289);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:637:75: ( classTopLevelScope )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4291);
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
            if ( state.backtracking>0 ) { memoize(input, 68, innerNewExpression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:640:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final CheckTransactionsParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        CheckTransactionsParser.newArrayConstruction_return retval = new CheckTransactionsParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:641:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==ARRAY_DECLARATOR_LIST) ) {
                alt101=1;
            }
            else if ( (LA101_0==EXPR) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:641:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4316);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4318);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:642:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:642:9: ( expression )+
                    int cnt99=0;
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==EXPR) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4328);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt99 >= 1 ) break loop99;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(99, input);
                                throw eee;
                        }
                        cnt99++;
                    } while (true);

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:642:21: ( arrayDeclaratorList )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==ARRAY_DECLARATOR_LIST) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4331);
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
            if ( state.backtracking>0 ) { memoize(input, 69, newArrayConstruction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newArrayConstruction"

    public static class arguments_return extends TreeRuleReturnScope {
        public List<Variable> variables;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:645:1: arguments returns [List<Variable> variables] : ^( ARGUMENT_LIST ( expression )* ) ;
    public final CheckTransactionsParser.arguments_return arguments() throws RecognitionException {
        CheckTransactionsParser.arguments_return retval = new CheckTransactionsParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        CheckTransactionsParser.expression_return expression7 = null;



                retval.variables = new LinkedList<Variable>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:649:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:649:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4365); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:650:13: ( expression )*
                loop102:
                do {
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==EXPR) ) {
                        alt102=1;
                    }


                    switch (alt102) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:650:14: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4381);
                	    expression7=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {

                	                          retval.variables.add((expression7!=null?expression7.variable:null));
                	                      
                	    }

                	    }
                	    break;

                	default :
                	    break loop102;
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
            if ( state.backtracking>0 ) { memoize(input, 70, arguments_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:657:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final CheckTransactionsParser.literal_return literal() throws RecognitionException {
        CheckTransactionsParser.literal_return retval = new CheckTransactionsParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:658:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:
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
            if ( state.backtracking>0 ) { memoize(input, 71, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    protected static class methodScopeDeclarations_scope {
        Transaction transaction;
        Object methodStart;
    }
    protected Stack methodScopeDeclarations_stack = new Stack();

    public static class methodScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodScopeDeclarations"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:669:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) ;
    public final CheckTransactionsParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        methodScopeDeclarations_stack.push(new methodScopeDeclarations_scope());
        CheckTransactionsParser.methodScopeDeclarations_return retval = new CheckTransactionsParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);
        int methodScopeDeclarations_StartIndex = input.index();

        		((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction = new Transaction();
                        ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).methodStart = retval.start;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:678:2: ( ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:679:9: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:679:9: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt112=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt112=2;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:680:17: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations4574); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4576);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:680:53: ( genericTypeParameterList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4578);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodScopeDeclarations4581);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations4583); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4585);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:680:110: ( arrayDeclaratorList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==ARRAY_DECLARATOR_LIST) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations4587);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:680:131: ( throwsClause )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==THROWS_CLAUSE) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4590);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:680:145: ( block )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==BLOCK_SCOPE) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations4593);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:681:15: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations4612); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4614);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:681:47: ( genericTypeParameterList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4616);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations4619); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4621);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:681:99: ( throwsClause )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==THROWS_CLAUSE) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4623);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:681:113: ( block )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==BLOCK_SCOPE) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations4626);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:682:15: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations4645); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4647);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:682:47: ( genericTypeParameterList )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4649);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4652);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:682:93: ( throwsClause )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==THROWS_CLAUSE) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4654);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_methodScopeDeclarations4657);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          if (((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction.isActive() && !((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction.foundEnd()){
                              ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction.end(((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).methodStart);
                          }
                          ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction.process();
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, methodScopeDeclarations_StartIndex); }
            methodScopeDeclarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "methodScopeDeclarations"

    public static class methodCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodCall"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:691:1: methodCall : ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments ) ;
    public final CheckTransactionsParser.methodCall_return methodCall() throws RecognitionException {
        CheckTransactionsParser.methodCall_return retval = new CheckTransactionsParser.methodCall_return();
        retval.start = input.LT(1);
        int methodCall_StartIndex = input.index();
        CheckTransactionsParser.primaryExpression_return p = null;

        CheckTransactionsParser.arguments_return arguments8 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:698:5: ( ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:699:5: ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments )
            {
            match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall4698); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_primaryExpression_in_methodCall4702);
            p=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:699:39: ( genericTypeArgumentList )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==GENERIC_TYPE_ARG_LIST) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_methodCall4704);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_arguments_in_methodCall4707);
            arguments8=arguments();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                      // we are calling method from outer method
                      if (!methodScopeDeclarations_stack.isEmpty()){
                          Transaction t = ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction;

                          if (methodNameMatches((p!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(p.start),
                input.getTreeAdaptor().getTokenStopIndex(p.start))):null), getParamS("startMethods", ""))){
                              // method is new starting transaction
                              t.start(retval.start);
                          } else if (methodNameMatches((p!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(p.start),
                input.getTreeAdaptor().getTokenStopIndex(p.start))):null), getParamS("endMethods", ""))) {
                              // method is ending transaction
                              
                              if (!t.isActive()){
                                  // if no transaction is active but end was found, 
                                  // use start of method
                                  t.start(((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).methodStart);
                              }

                              t.end(retval.start);
                          } else {
                              // TODO: optimalization
                              // check whether given method is atomic or not
                              String[] param = getParamS("nonatomicMethods", "").split(",");
                              for (String m:param){
                                  String parts[] = m.trim().split(":");
                                  if (parts.length==0) continue;

                                  int argumentNumber = 0;
                                  try {
                                      if (parts.length>1) argumentNumber = Integer.valueOf(parts[1]);
                                  } catch (NumberFormatException ex){
                                  }
                                  if (methodNameMatches((p!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(p.start),
                input.getTreeAdaptor().getTokenStopIndex(p.start))):null), parts[0].trim()) && (arguments8!=null?arguments8.variables:null).size()>=argumentNumber+1){
                                      t.nonAtomicVariables.add((arguments8!=null?arguments8.variables:null).get(argumentNumber));
                                  }
                              }
                          }
                      }
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, methodCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCall"

    // $ANTLR start synpred114_CheckTransactionsParser
    public final void synpred114_CheckTransactionsParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:35: ( switchCaseLabel )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:498:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred114_CheckTransactionsParser2561);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_CheckTransactionsParser

    // $ANTLR start synpred121_CheckTransactionsParser
    public final void synpred121_CheckTransactionsParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:48: ( ( expression )* )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:48: ( expression )*
        {
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:510:48: ( expression )*
        loop135:
        do {
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EXPR) ) {
                alt135=1;
            }


            switch (alt135) {
        	case 1 :
        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred121_CheckTransactionsParser2662);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop135;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred121_CheckTransactionsParser

    // Delegated rules

    public final boolean synpred114_CheckTransactionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_CheckTransactionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_CheckTransactionsParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_CheckTransactionsParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA86 dfa86 = new DFA86(this);
    static final String DFA39_eotS =
        "\14\uffff";
    static final String DFA39_eofS =
        "\14\uffff";
    static final String DFA39_minS =
        "\1\7\13\uffff";
    static final String DFA39_maxS =
        "\1\146\13\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA39_specialS =
        "\14\uffff}>";
    static final String[] DFA39_transitionS = {
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "332:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
        }
    }
    static final String DFA71_eotS =
        "\22\uffff";
    static final String DFA71_eofS =
        "\22\uffff";
    static final String DFA71_minS =
        "\1\54\21\uffff";
    static final String DFA71_maxS =
        "\1\u008d\21\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21";
    static final String DFA71_specialS =
        "\22\uffff}>";
    static final String[] DFA71_transitionS = {
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

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "469:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
        }
    }
    static final String DFA82_eotS =
        "\21\uffff";
    static final String DFA82_eofS =
        "\21\uffff";
    static final String DFA82_minS =
        "\1\5\20\uffff";
    static final String DFA82_maxS =
        "\1\u0096\20\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA82_specialS =
        "\21\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\6\1\1\2\uffff\1\12\4\uffff\1\5\20\uffff\1\3\1\uffff\1\11"+
            "\3\uffff\1\7\1\uffff\1\2\6\uffff\1\14\1\uffff\1\13\1\uffff\1"+
            "\4\1\uffff\1\10\136\uffff\1\20\1\17\1\16\1\15",
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "533:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )";
        }
    }
    static final String DFA83_eotS =
        "\35\uffff";
    static final String DFA83_eofS =
        "\35\uffff";
    static final String DFA83_minS =
        "\1\4\34\uffff";
    static final String DFA83_maxS =
        "\1\u00aa\34\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34";
    static final String DFA83_specialS =
        "\35\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\7\2\1\1\uffff\1\15\1\1\3\uffff\1\25\1\1\1\34\2\uffff\1\10"+
            "\1\14\1\17\3\uffff\1\13\1\21\1\4\1\32\1\3\1\uffff\1\23\1\1\1"+
            "\26\1\1\1\31\1\11\1\5\1\1\1\22\1\1\1\2\4\uffff\1\20\1\1\1\16"+
            "\1\1\1\24\1\1\1\6\1\1\20\uffff\1\34\6\uffff\1\12\6\uffff\1\34"+
            "\10\uffff\1\34\2\uffff\1\34\3\uffff\1\34\15\uffff\1\34\1\uffff"+
            "\1\34\2\uffff\1\33\1\uffff\1\34\27\uffff\1\34\1\uffff\1\34\4"+
            "\1\1\uffff\2\34\1\uffff\1\34\2\uffff\1\30\1\27\4\uffff\7\34",
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

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "560:1: expr returns [Variable variable] : ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression );";
        }
    }
    static final String DFA86_eotS =
        "\14\uffff";
    static final String DFA86_eofS =
        "\14\uffff";
    static final String DFA86_minS =
        "\1\17\13\uffff";
    static final String DFA86_maxS =
        "\1\u00aa\13\uffff";
    static final String DFA86_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA86_specialS =
        "\14\uffff}>";
    static final String[] DFA86_transitionS = {
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

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "593:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource143 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource145 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource148 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource151 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration173 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration203 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration206 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration248 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration250 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration253 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration256 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration299 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration301 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration320 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause361 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause392 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList424 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound480 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope504 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant535 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant537 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope573 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations615 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodScopeDeclarations_in_classScopeDeclarations626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations639 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope680 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations706 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations708 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations710 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations717 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations719 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations744 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations839 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList876 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator900 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator980 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1002 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1004 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1034 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1056 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1058 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1082 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1225 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1279 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1283 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1310 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1448 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1665 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1668 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1695 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1697 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1728 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1800 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation1822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1824 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation1826 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1877 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer1917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer1919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue1946 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope1992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope1994 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2022 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2026 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2043 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2047 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2109 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2178 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2180 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2230 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2247 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2249 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2264 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2270 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2286 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2290 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2292 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2309 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2341 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement2343 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2379 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2439 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2454 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2508 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2536 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause2538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2561 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2564 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2567 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2599 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2601 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2629 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2662 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2720 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression2750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression2779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression2781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_modifyVariableExpression2832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2836 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_modifyVariableExpression2858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2862 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2864 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_modifyVariableExpression2884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2888 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_modifyVariableExpression2910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2914 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2916 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_modifyVariableExpression2936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2940 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2942 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_modifyVariableExpression2962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2966 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_modifyVariableExpression2988 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2992 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression2994 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_modifyVariableExpression3014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3018 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3020 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_modifyVariableExpression3040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3044 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression3066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3070 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression3092 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3096 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_modifyVariableExpression3118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3122 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_modifyVariableExpression3144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_modifyVariableExpression3168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_modifyVariableExpression3192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3196 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_modifyVariableExpression3216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression3220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_modifyVariableExpression_in_expr3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr3288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3290 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3292 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3308 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3324 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3340 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3356 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3372 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3388 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3404 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3406 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3418 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3420 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3422 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3436 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3452 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3468 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3482 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3484 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3500 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3502 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3516 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3532 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3548 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3564 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3580 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3582 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3596 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3612 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3614 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3628 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3640 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3684 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3751 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression3905 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3907 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression3925 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_primaryExpression3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4004 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4008 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4010 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4093 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4110 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4113 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4140 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4190 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4213 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4255 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4257 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4287 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4289 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4316 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4328 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4381 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations4574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4576 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4578 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations4581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4585 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations4587 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4590 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations4612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations4619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4621 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4623 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations4645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4652 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4654 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_CALL_in_methodCall4698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_methodCall4702 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_methodCall4704 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_methodCall4707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred114_CheckTransactionsParser2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred121_CheckTransactionsParser2662 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}