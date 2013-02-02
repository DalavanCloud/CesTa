// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g 2013-02-02 20:05:56

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
    public CheckTransactionsParser_JavaTreeParser gJavaTreeParser;
    // delegators


        public CheckTransactionsParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public CheckTransactionsParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[371+1];
             
            gJavaTreeParser = new CheckTransactionsParser_JavaTreeParser(input, state, this);         
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
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g"; }

    	
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:212:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) ;
    public final CheckTransactionsParser.javaSource_return javaSource() throws RecognitionException {
        javaSource_stack.push(new javaSource_scope());
        CheckTransactionsParser.javaSource_return retval = new CheckTransactionsParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();

                ((javaSource_scope)javaSource_stack.peek()).imports = new TreeSet<String>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:219:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:219:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource146); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource148);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:219:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource150);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:219:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource153);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:219:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource156);
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
            if ( state.backtracking>0 ) { memoize(input, 289, javaSource_StartIndex); }
            javaSource_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "javaSource"

    public static class importDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "importDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:222:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final CheckTransactionsParser.importDeclaration_return importDeclaration() throws RecognitionException {
        CheckTransactionsParser.importDeclaration_return retval = new CheckTransactionsParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        CommonTree DOTSTAR2=null;
        CheckTransactionsParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:223:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:223:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration182); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:223:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration184); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration187);
            qualifiedIdentifier1=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:223:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: DOTSTAR
                    {
                    DOTSTAR2=(CommonTree)match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration189); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 290, importDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"

    public static class classScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classScopeDeclarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:229:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final CheckTransactionsParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        CheckTransactionsParser.classScopeDeclarations_return retval = new CheckTransactionsParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:230:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt6=5;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt6=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt6=2;
                }
                break;
            case CONSTRUCTOR_DECL:
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt6=3;
                }
                break;
            case VAR_DECLARATION:
                {
                alt6=4;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:230:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations225); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations227);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:231:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations239); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations241);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:232:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations252);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:233:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations263); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations265);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations267);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations269);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:234:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations280);
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
            if ( state.backtracking>0 ) { memoize(input, 291, classScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    public static class expression_return extends TreeRuleReturnScope {
        public Variable variable;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:239:1: expression returns [Variable variable] : ^( EXPR expr ) ;
    public final CheckTransactionsParser.expression_return expression() throws RecognitionException {
        CheckTransactionsParser.expression_return retval = new CheckTransactionsParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CheckTransactionsParser.expr_return expr3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:240:5: ( ^( EXPR expr ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:240:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression310); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression312);
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
            if ( state.backtracking>0 ) { memoize(input, 292, expression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:243:1: modifyVariableExpression returns [Variable variable] : ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) ) ;
    public final CheckTransactionsParser.modifyVariableExpression_return modifyVariableExpression() throws RecognitionException {
        CheckTransactionsParser.modifyVariableExpression_return retval = new CheckTransactionsParser.modifyVariableExpression_return();
        retval.start = input.LT(1);
        int modifyVariableExpression_StartIndex = input.index();
        CheckTransactionsParser.expr_return var = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:244:5: ( ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:245:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )
            {
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:245:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )
            int alt7=16;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:246:17: ^( ASSIGN var= expr expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_modifyVariableExpression363); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression367);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression369);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:247:17: ^( PLUS_ASSIGN var= expr expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_modifyVariableExpression389); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression393);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression395);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:248:17: ^( MINUS_ASSIGN var= expr expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_modifyVariableExpression415); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression419);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression421);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:249:17: ^( STAR_ASSIGN var= expr expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_modifyVariableExpression441); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression445);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression447);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:250:17: ^( DIV_ASSIGN var= expr expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_modifyVariableExpression467); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression471);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression473);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:251:17: ^( AND_ASSIGN var= expr expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_modifyVariableExpression493); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression497);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression499);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:252:17: ^( OR_ASSIGN var= expr expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_modifyVariableExpression519); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression523);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression525);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:253:17: ^( XOR_ASSIGN var= expr expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_modifyVariableExpression545); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression549);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression551);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:254:17: ^( MOD_ASSIGN var= expr expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_modifyVariableExpression571); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression575);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression577);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:255:17: ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression597); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression601);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression603);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:256:17: ^( SHIFT_RIGHT_ASSIGN var= expr expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression623); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression627);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression629);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:257:17: ^( SHIFT_LEFT_ASSIGN var= expr expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_modifyVariableExpression649); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression653);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression655);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:258:17: ^( PRE_INC var= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_modifyVariableExpression675); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression679);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:259:17: ^( PRE_DEC var= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_modifyVariableExpression699); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression703);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:260:17: ^( POST_INC var= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_modifyVariableExpression723); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression727);
                    var=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:261:17: ^( POST_DEC var= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_modifyVariableExpression747); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_modifyVariableExpression751);
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
            if ( state.backtracking>0 ) { memoize(input, 293, modifyVariableExpression_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:272:1: expr returns [Variable variable] : ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression );
    public final CheckTransactionsParser.expr_return expr() throws RecognitionException {
        CheckTransactionsParser.expr_return retval = new CheckTransactionsParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        CheckTransactionsParser.primaryExpression_return pe = null;

        CheckTransactionsParser.modifyVariableExpression_return modifyVariableExpression4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:273:5: ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression )
            int alt8=28;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:274:9: modifyVariableExpression
                    {
                    pushFollow(FOLLOW_modifyVariableExpression_in_expr801);
                    modifyVariableExpression4=modifyVariableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.variable =(modifyVariableExpression4!=null?modifyVariableExpression4.variable:null); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:276:9: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr819); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr821);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr823);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr825);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:277:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr837); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr839);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr841);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:278:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr853); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr855);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr857);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:279:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr869); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr871);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr873);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:280:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr885); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr887);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr889);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:281:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr901); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr903);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr905);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:282:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr917); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr919);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr921);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:283:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr933); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr935);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr937);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:284:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr949); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr951);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr953);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:285:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr965); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr967);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr969);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:286:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr981); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr983);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr985);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:287:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr997); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr999);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1001);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:288:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr1013); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1015);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1017);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:289:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr1029); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1031);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1033);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:290:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr1045); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1047);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1049);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:291:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr1061); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1063);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1065);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:292:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr1077); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1079);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1081);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:293:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr1093); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1095);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1097);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:294:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr1109); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1111);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1113);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:295:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr1125); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1127);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1129);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:296:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr1141); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1143);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1145);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:297:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr1157); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1159);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:298:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr1171); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1173);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:299:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr1185); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1187);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:300:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr1199); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1201);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:301:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr1213); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr1215);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1217);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:302:9: pe= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr1230);
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
            if ( state.backtracking>0 ) { memoize(input, 294, expr_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:305:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final CheckTransactionsParser.primaryExpression_return primaryExpression() throws RecognitionException {
        CheckTransactionsParser.primaryExpression_return retval = new CheckTransactionsParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        CommonTree IDENT5=null;
        CommonTree IDENT6=null;
        CheckTransactionsParser.primaryExpression_return p = null;

        CheckTransactionsParser.primaryExpression_return pe = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:306:5: ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt11=11;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:306:9: ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression1262); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:307:13: (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt10=3;
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
                        alt10=1;
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
                        alt10=2;
                        }
                        break;
                    case VOID:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:307:17: p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression1282);
                            p=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                              retval.ident = ((p!=null?p.ident:null)==null?"":((p!=null?p.ident:null)+"."));
                            }
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:308:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt9=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt9=1;
                                }
                                break;
                            case THIS:
                                {
                                alt9=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt9=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt9=4;
                                }
                                break;
                            case CLASS:
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
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:308:21: IDENT
                                    {
                                    IDENT5=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1306); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += (IDENT5!=null?IDENT5.getText():null); 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:309:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression1330); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "this"; 
                                    }

                                    }
                                    break;
                                case 3 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:310:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression1354); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "super"; 
                                    }

                                    }
                                    break;
                                case 4 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:311:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression1378);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:312:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression1400); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:314:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression1436);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression1438); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:315:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression1456); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression1458); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:318:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression1492);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:319:9: IDENT
                    {
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression1502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = (IDENT6!=null?IDENT6.getText():null); 
                    }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:320:9: methodCall
                    {
                    pushFollow(FOLLOW_methodCall_in_primaryExpression1514);
                    methodCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:321:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression1524);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:322:9: ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression1535); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression1539);
                    pe=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression1541);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:323:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression1554);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:324:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression1564);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:325:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression1574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = "this"; 
                    }

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:326:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression1586);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:327:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression1596); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 295, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class arguments_return extends TreeRuleReturnScope {
        public List<Variable> variables;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:330:1: arguments returns [List<Variable> variables] : ^( ARGUMENT_LIST ( expression )* ) ;
    public final CheckTransactionsParser.arguments_return arguments() throws RecognitionException {
        CheckTransactionsParser.arguments_return retval = new CheckTransactionsParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        CheckTransactionsParser.expression_return expression7 = null;



                retval.variables = new LinkedList<Variable>();
            
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:334:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:334:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments1631); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:335:13: ( expression )*
                loop12:
                do {
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==EXPR) ) {
                        alt12=1;
                    }


                    switch (alt12) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:335:14: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments1647);
                	    expression7=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {

                	                          retval.variables.add((expression7!=null?expression7.variable:null));
                	                      
                	    }

                	    }
                	    break;

                	default :
                	    break loop12;
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
            if ( state.backtracking>0 ) { memoize(input, 296, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:342:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) ;
    public final CheckTransactionsParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        methodScopeDeclarations_stack.push(new methodScopeDeclarations_scope());
        CheckTransactionsParser.methodScopeDeclarations_return retval = new CheckTransactionsParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);
        int methodScopeDeclarations_StartIndex = input.index();

        		((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).transaction = new Transaction();
                        ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).methodStart = retval.start;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:351:2: ( ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:352:9: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            {
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:352:9: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt22=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt22=2;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:353:17: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations1740); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations1742);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:353:53: ( genericTypeParameterList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1744);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodScopeDeclarations1747);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations1749); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations1751);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:353:110: ( arrayDeclaratorList )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ARRAY_DECLARATOR_LIST) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations1753);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:353:131: ( throwsClause )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==THROWS_CLAUSE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations1756);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:353:145: ( block )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==BLOCK_SCOPE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations1759);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:354:15: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations1778); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations1780);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:354:47: ( genericTypeParameterList )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1782);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations1785); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations1787);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:354:99: ( throwsClause )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==THROWS_CLAUSE) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations1789);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:354:113: ( block )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==BLOCK_SCOPE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations1792);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:355:15: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations1811); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations1813);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:355:47: ( genericTypeParameterList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1815);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations1818);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:355:93: ( throwsClause )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==THROWS_CLAUSE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations1820);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_methodScopeDeclarations1823);
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
            if ( state.backtracking>0 ) { memoize(input, 297, methodScopeDeclarations_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:364:1: methodCall : ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments ) ;
    public final CheckTransactionsParser.methodCall_return methodCall() throws RecognitionException {
        CheckTransactionsParser.methodCall_return retval = new CheckTransactionsParser.methodCall_return();
        retval.start = input.LT(1);
        int methodCall_StartIndex = input.index();
        CheckTransactionsParser.primaryExpression_return p = null;

        CheckTransactionsParser.arguments_return arguments8 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:371:5: ( ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:372:5: ^( METHOD_CALL p= primaryExpression ( genericTypeArgumentList )? arguments )
            {
            match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall1864); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_primaryExpression_in_methodCall1868);
            p=primaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:372:39: ( genericTypeArgumentList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==GENERIC_TYPE_ARG_LIST) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\CheckTransactionsParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_methodCall1870);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_arguments_in_methodCall1873);
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
            if ( state.backtracking>0 ) { memoize(input, 298, methodCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "methodCall"

    // Delegated rules
    public CheckTransactionsParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }
    public CheckTransactionsParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }
    public CheckTransactionsParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }
    public CheckTransactionsParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }
    public CheckTransactionsParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException { return gJavaTreeParser.modifierList(); }
    public CheckTransactionsParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }
    public CheckTransactionsParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }
    public CheckTransactionsParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }
    public CheckTransactionsParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }
    public CheckTransactionsParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }
    public CheckTransactionsParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException { return gJavaTreeParser.variableDeclaratorList(); }
    public CheckTransactionsParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }
    public CheckTransactionsParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }
    public CheckTransactionsParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }
    public CheckTransactionsParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }
    public CheckTransactionsParser_JavaTreeParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException { return gJavaTreeParser.classTopLevelScope(); }
    public CheckTransactionsParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }
    public CheckTransactionsParser_JavaTreeParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException { return gJavaTreeParser.variableDeclaratorId(); }
    public CheckTransactionsParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }
    public CheckTransactionsParser_JavaTreeParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException { return gJavaTreeParser.interfaceScopeDeclarations(); }
    public CheckTransactionsParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }
    public CheckTransactionsParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }
    public CheckTransactionsParser_JavaTreeParser.statement_return statement() throws RecognitionException { return gJavaTreeParser.statement(); }
    public CheckTransactionsParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }
    public CheckTransactionsParser_JavaTreeParser.typeDeclaration_return typeDeclaration() throws RecognitionException { return gJavaTreeParser.typeDeclaration(); }
    public CheckTransactionsParser_JavaTreeParser.variableDeclarator_return variableDeclarator() throws RecognitionException { return gJavaTreeParser.variableDeclarator(); }
    public CheckTransactionsParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }
    public CheckTransactionsParser_JavaTreeParser.variableInitializer_return variableInitializer() throws RecognitionException { return gJavaTreeParser.variableInitializer(); }
    public CheckTransactionsParser_JavaTreeParser.localModifier_return localModifier() throws RecognitionException { return gJavaTreeParser.localModifier(); }
    public CheckTransactionsParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }
    public CheckTransactionsParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }
    public CheckTransactionsParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }
    public CheckTransactionsParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }
    public CheckTransactionsParser_JavaTreeParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException { return gJavaTreeParser.localVariableDeclaration(); }
    public CheckTransactionsParser_JavaTreeParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException { return gJavaTreeParser.arrayDeclaratorList(); }
    public CheckTransactionsParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }
    public CheckTransactionsParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }
    public CheckTransactionsParser_JavaTreeParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException { return gJavaTreeParser.formalParameterStandardDecl(); }
    public CheckTransactionsParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }
    public CheckTransactionsParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }
    public CheckTransactionsParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }
    public CheckTransactionsParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }
    public CheckTransactionsParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }
    public CheckTransactionsParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }
    public CheckTransactionsParser_JavaTreeParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException { return gJavaTreeParser.parenthesizedExpression(); }
    public CheckTransactionsParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }
    public CheckTransactionsParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }
    public CheckTransactionsParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }
    public CheckTransactionsParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }
    public CheckTransactionsParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }
    public CheckTransactionsParser_JavaTreeParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException { return gJavaTreeParser.formalParameterVarargDecl(); }
    public CheckTransactionsParser_JavaTreeParser.modifier_return modifier() throws RecognitionException { return gJavaTreeParser.modifier(); }
    public CheckTransactionsParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }
    public CheckTransactionsParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }
    public CheckTransactionsParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }
    public CheckTransactionsParser_JavaTreeParser.block_return block() throws RecognitionException { return gJavaTreeParser.block(); }
    public CheckTransactionsParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }
    public CheckTransactionsParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }
    public CheckTransactionsParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }
    public CheckTransactionsParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }
    public CheckTransactionsParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException { return gJavaTreeParser.blockStatement(); }
    public CheckTransactionsParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }
    public CheckTransactionsParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\21\uffff";
    static final String DFA7_minS =
        "\1\5\20\uffff";
    static final String DFA7_maxS =
        "\1\u0096\20\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "245:9: ( ^( ASSIGN var= expr expr ) | ^( PLUS_ASSIGN var= expr expr ) | ^( MINUS_ASSIGN var= expr expr ) | ^( STAR_ASSIGN var= expr expr ) | ^( DIV_ASSIGN var= expr expr ) | ^( AND_ASSIGN var= expr expr ) | ^( OR_ASSIGN var= expr expr ) | ^( XOR_ASSIGN var= expr expr ) | ^( MOD_ASSIGN var= expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_RIGHT_ASSIGN var= expr expr ) | ^( SHIFT_LEFT_ASSIGN var= expr expr ) | ^( PRE_INC var= expr ) | ^( PRE_DEC var= expr ) | ^( POST_INC var= expr ) | ^( POST_DEC var= expr ) )";
        }
    }
    static final String DFA8_eotS =
        "\35\uffff";
    static final String DFA8_eofS =
        "\35\uffff";
    static final String DFA8_minS =
        "\1\4\34\uffff";
    static final String DFA8_maxS =
        "\1\u00aa\34\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34";
    static final String DFA8_specialS =
        "\35\uffff}>";
    static final String[] DFA8_transitionS = {
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "272:1: expr returns [Variable variable] : ( modifyVariableExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | pe= primaryExpression );";
        }
    }
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\14\uffff";
    static final String DFA11_minS =
        "\1\17\13\uffff";
    static final String DFA11_maxS =
        "\1\u00aa\13\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA11_specialS =
        "\14\uffff}>";
    static final String[] DFA11_transitionS = {
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "305:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | methodCall | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS pe= primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource148 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource150 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource153 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource156 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration184 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration187 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration189 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations239 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodScopeDeclarations_in_classScopeDeclarations252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPR_in_expression310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression312 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_modifyVariableExpression363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression367 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression369 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_modifyVariableExpression389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression393 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_modifyVariableExpression415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression419 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_modifyVariableExpression441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression445 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_modifyVariableExpression467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression471 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_modifyVariableExpression493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression497 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression499 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_modifyVariableExpression519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression523 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_modifyVariableExpression545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression549 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_modifyVariableExpression571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression575 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression601 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_modifyVariableExpression623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression627 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_modifyVariableExpression649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression653 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_modifyVariableExpression675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression679 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_modifyVariableExpression699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression703 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_modifyVariableExpression723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_modifyVariableExpression747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_modifyVariableExpression751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_modifyVariableExpression_in_expr801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr821 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr823 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr839 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr855 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr871 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr887 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr903 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr919 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr935 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr953 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr967 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr983 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr985 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr997 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr999 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr1013 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1015 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1017 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr1029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1031 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr1045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1047 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr1061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1063 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1065 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1079 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr1093 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1095 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1111 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr1125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1127 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr1141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1143 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr1157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1159 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr1171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr1185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr1199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr1215 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1217 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression1262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression1282 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression1330 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression1354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression1378 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression1400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression1436 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression1438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression1456 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression1458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_primaryExpression1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression1535 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression1539 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments1631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments1647 = new BitSet(new long[]{0x0000000000000008L,0x4000000000000000L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations1740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations1742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations1751 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations1753 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations1756 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations1759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations1778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations1787 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations1789 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations1792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations1811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations1815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations1818 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations1820 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations1823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_CALL_in_methodCall1864 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_methodCall1868 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_methodCall1870 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_arguments_in_methodCall1873 = new BitSet(new long[]{0x0000000000000008L});

}