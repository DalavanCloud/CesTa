// $ANTLR 3.2 Sep 23, 2009 12:02:23 E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g 2013-02-02 20:12:19

package org.cesta.parsers.java;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
import java.util.Iterator;
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
 * Each variable with supported type (currently byte, short, boolean) has its own
 * shadow negation copy, which is updated on each modification and checked on each
 * read access.
 **/
public class ShadowVariablesParser extends AbstractTreeParser {
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
    public ShadowVariablesParser_JavaTreeParser gJavaTreeParser;
    // delegators

    protected static class VariableDeclaration_scope {
        String type;
        boolean isGlobal;
        boolean isStatic;
        boolean isFinal;
        boolean isPrivate;
    }
    protected Stack VariableDeclaration_stack = new Stack();


        public ShadowVariablesParser(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ShadowVariablesParser(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[429+1];
             
            gJavaTreeParser = new ShadowVariablesParser_JavaTreeParser(input, state, this);         
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ShadowVariablesParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return ShadowVariablesParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g"; }


    	
            /**
    	 *	Model for variables
    	 */
    	public class Variable {
    		public String type = "";
    		public String name = "";
    		public int id = -1;
    		public int methodId = -1;
    		public boolean isGlobal = false;
    		public boolean isParameter = false;
    		public boolean isStatic = false;
    		public boolean isPrivate = false;
    		public boolean isFinal = false;
    		public boolean isArray = false;
                    /**
                     *  Whether this variable is supported or not.
                     *  Supported are only simple variabes byte, short and boolean
                     */
    		public boolean isResistanceSupported(){
    			return (
    				!isArray && !isFinal && !isParameter && 
                                    (isGlobal || getParamB("replaceLocal")) &&
                                    type.matches(getParamS("replaceTypes")) &&
                                    name.matches(getParamS("includeVariables")) &&
                                    !name.matches(getParamS("excludeVariables"))
    			);
    		}
    		public VariableGroup getGroup(){
    			// factory with singletons for groups would be probably better in the future
    			return new VariableGroup(type, isGlobal, isStatic);
    		}
    		public String toString(){
    			return
                                name+" ["+
                                (isGlobal?"global ":"")+
                                (isStatic?"static ":"")+
                                (isParameter?"method parameter ":"")+
                                type+
                                ", ID="+id+(
    				(methodId>-1)?(":"+String.valueOf(methodId)):""
                                )+"]";
    		}
    	}
    	/**
    	 *	Model for different types of variables 
    	 */
    	public class VariableGroup {
    		public String type = "";
    		public boolean isStatic = false;
    		public boolean isGlobal = false;
    		public int maxId = -1;
    		public int size = 0;

    		public VariableGroup(String type, boolean isGlobal, boolean isStatic){
    			this.type = type;
    			this.isGlobal = isGlobal;
    			this.isStatic = isStatic;
    		}
    		public boolean equals(Object o){
    			VariableGroup group = (VariableGroup)o;
    			return (
    				group.isStatic == isStatic &&
    				group.isGlobal == isGlobal &&
    				group.type.equals(type)
    			);
    		}
    		public int hashCode(){
    			int hash = 1;
    			hash = hash * 31 + type.hashCode();
    			hash = hash * 31 + (isStatic?1:0);
    			hash = hash * 31 + (isGlobal?1:0);
    			return hash;
    		}		
    		/**
    		 *	Different groups should have different idents
    		 */
    		public String getIdent(){
    			return type+((isGlobal|isStatic)?"_":"")+(isGlobal?"g":"")+(isStatic?"s":"");
    		}
    		public String toString(){
    			return getIdent()+" ["+(isGlobal?"global ":"")+(isStatic?"static ":"")+type+"]";
    		}
    		/**
    		 *	Returns name of template, which should be used to generate negation of the value
    		 */
    		public String getNegationTmpl(){
    			return "computeNegation_"+type;
    		}
    		/**
                     *  Returns name of template, which should be used to initialize resistant array
                     */
                    public String getResistantArrayInitTmpl(){
    			return "resistantArrayInit_"+type;
    		}
                    /**
                     *  Returns size of shadow array
                     */
                    public int getSize(){
                        return maxId+1;
                    }
    	}

    	/**
    	 *	Will replace tokens with new setter if specified variable exists and is supported.
    	 */
    	public void resistantSetValue(Object start, String ident, String value, String templateName){
    		Variable var = getVariable(ident);
    		CommonTree tree = (CommonTree)start;

                    if (var == null && (ident!=null && !ident.isEmpty())) {
                        getLogger().warning("Declaration for variable \""+ident+"\" could not be found. Please, check whether the resulted code is not broken.");
                        tokens.insertAfter(
                                input.getTreeAdaptor().getTokenStopIndex(tree),
                                "/* WARNING: unknown variable */"
                        );
                    }

    		if (var==null || !var.isResistanceSupported()) return;
    		
    		
    		getLogger().finer("Setter for "+ident+" and value "+value);
    		
    		StringTemplate st = getTemplateLib().getInstanceOf(templateName);
    		st.setAttribute("variable", var);
                    st.setAttribute("ident", ident);
    		st.setAttribute("value", value);
    		st.setAttribute("shouldReturnValue", 
    			(!parenthesizedExpression_stack.isEmpty() && ((parenthesizedExpression_scope)parenthesizedExpression_stack.peek()).shouldReturnValue) || 
    			(!primaryExpression_stack.isEmpty() && ((primaryExpression_scope)primaryExpression_stack.peek()).shouldReturnValue) ||
                            // right side of assign expression
                            // in i = j+=2; we may need return value in second statement
    			(!assignExpression_stack.isEmpty() && assignExpression_stack.size()>1)
    		);
    		
    		tokens.replace(
    			input.getTreeAdaptor().getTokenStartIndex(tree), 
    			input.getTreeAdaptor().getTokenStopIndex(tree), 
    			st
    		);
    	}
    	/**
    	 *	Will replace tokens with new getter if specified variable exists and is supported.
    	 */
    	public void resistantGetValue(Object start, String ident){
    		resistantGetValue(start, ident, "resistantGetValue");
    	}
            /**
    	 *  Will replace tokens with new getter if specified variable exists and is supported.
             *  You can provide custom template name. 
             *
             *@param start tree which should be replaced by getter
             *@param ident which identifier should be used (this.var or var)
             *@param templateName name of template, that should be used for replace
    	 */
    	public void resistantGetValue(Object start, String ident, String templateName){
                    Variable var = getVariable(ident);
    		if (var==null || !var.isResistanceSupported()) return;
    		
    		CommonTree tree = (CommonTree)start;
    		
    		getLogger().finer("Getter for "+var.toString());
    		
    		StringTemplate st = getTemplateLib().getInstanceOf(templateName);
    		st.setAttribute("variable", var);
                    st.setAttribute("ident", ident);
    		
    		tokens.replace(
    			input.getTreeAdaptor().getTokenStartIndex(tree), 
    			input.getTreeAdaptor().getTokenStopIndex(tree), 
    			st
    		);
    	}
    	
    	/**
    	 *	Search for global variable with given name in current context
    	 */
    	public Variable getGlobalVariable(String name){
    		Variable variable = null;
                    name = name.replaceAll("this\\.","");
                    for (int i=classDeclaration_stack.size()-1;i>=0;i--){
    			classDeclaration_scope scope = (classDeclaration_scope)classDeclaration_stack.get(i);
    			if (scope.globalVariables.containsKey(name)) {
    				variable = scope.globalVariables.get(name);
    				break;
    			}
    		}
    		return variable;
    	}
    	/**
    	 *	Search for local variable with given name in current context
    	 */
    	public Variable getLocalVariable(String name){
    		Variable variable = null;
    		
    		for (int i=block_stack.size()-1;i>=0;i--){		
    			block_scope scope = (block_scope)block_stack.get(i);
    			if (scope.localVariables.containsKey(name)) {
    				variable = scope.localVariables.get(name);
    				break;
    			}
    		}
    		
    		return variable;
    	}
            /**
             *  Searches for variable in method parameters
             */
            public Variable getMethodVariable(String name){
                    Variable variable = null;
                    for (int i=methodScopeDeclarations_stack.size()-1;i>=0;i--){
    			methodScopeDeclarations_scope scope = (methodScopeDeclarations_scope)methodScopeDeclarations_stack.get(i);
    			if (scope.localVariables.containsKey(name)) {
    				variable = scope.localVariables.get(name);
    				break;
    			}
    		}
                    return variable;
            }
    	/**
    	 *	Will try to search variable with given name (local from block or global from class).
    	 */
    	public Variable getVariable(String name){
    		if (name==null || name.equals("")) return null;
    		
    		Variable variable = getLocalVariable(name);
                    if (variable == null) variable = getMethodVariable(name);
    		if (variable == null) variable = getGlobalVariable(name);

    		return variable;
    	}


    public static class javaSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "javaSource"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:278:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final ShadowVariablesParser.javaSource_return javaSource() throws RecognitionException {
        ShadowVariablesParser.javaSource_return retval = new ShadowVariablesParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        ShadowVariablesParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 289) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:279:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:279:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource137); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource139);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:279:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource141);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:279:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource144);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:279:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource147);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource150);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:282:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final ShadowVariablesParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        ShadowVariablesParser.typeDeclaration_return retval = new ShadowVariablesParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 290) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:283:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:283:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration175);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:284:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration186); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration188);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration190); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:284:40: ( genericTypeParameterList )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration192);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:284:66: ( extendsClause )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==EXTENDS_CLAUSE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration195);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration198);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration210); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration212);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration214); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:35: ( implementsClause )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IMPLEMENTS_CLAUSE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration216);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration219);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:286:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration231); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration233);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration235); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration237);
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

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:289:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final ShadowVariablesParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        ShadowVariablesParser.classTopLevelScope_return retval = new ShadowVariablesParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 291) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope262); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:33: ( classScopeDeclarations )*
                loop8:
                do {
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==AT||LA8_0==CLASS||LA8_0==ENUM||LA8_0==INTERFACE||(LA8_0>=CLASS_INSTANCE_INITIALIZER && LA8_0<=CLASS_STATIC_INITIALIZER)||LA8_0==CONSTRUCTOR_DECL||LA8_0==FUNCTION_METHOD_DECL||LA8_0==VAR_DECLARATION||LA8_0==VOID_METHOD_DECL) ) {
                        alt8=1;
                    }


                    switch (alt8) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope264);
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
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope268);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:293:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration );
    public final ShadowVariablesParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        ShadowVariablesParser.classScopeDeclarations_return retval = new ShadowVariablesParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 292) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:294:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:294:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations289); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations291);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:295:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations303); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations305);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:296:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations316);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:297:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_classScopeDeclarations326);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:298:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations336);
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:301:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration );
    public final ShadowVariablesParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        ShadowVariablesParser.interfaceScopeDeclarations_return retval = new ShadowVariablesParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 293) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:302:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration )
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:302:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations360); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations362);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:302:45: ( genericTypeParameterList )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations364);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations367);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations369); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations371);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:302:102: ( arrayDeclaratorList )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ARRAY_DECLARATOR_LIST) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations373);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:302:123: ( throwsClause )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==THROWS_CLAUSE) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations376);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:303:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations389); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations391);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:303:41: ( genericTypeParameterList )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations393);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations396); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations398);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:303:93: ( throwsClause )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==THROWS_CLAUSE) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations400);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:307:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations490);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:308:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations500);
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
            if ( state.backtracking>0 ) { memoize(input, 293, interfaceScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceScopeDeclarations"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorId"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:311:1: variableDeclaratorId : ^(ident= IDENT ( arrayDeclaratorList )? ) ;
    public final ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        ShadowVariablesParser.variableDeclaratorId_return retval = new ShadowVariablesParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        CommonTree ident=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 294) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:312:2: ( ^(ident= IDENT ( arrayDeclaratorList )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:312:6: ^(ident= IDENT ( arrayDeclaratorList )? )
            {
            ident=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId527); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
               
              				// save variable name for use in variableDeclarator
              				if (!variableDeclarator_stack.isEmpty()) ((variableDeclarator_scope)variableDeclarator_stack.peek()).var.name = (ident!=null?ident.getText():null); 
              			
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:318:4: ( arrayDeclaratorList )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ARRAY_DECLARATOR_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId538);
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
            if ( state.backtracking>0 ) { memoize(input, 294, variableDeclaratorId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class arrayDeclaratorList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclaratorList"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:322:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final ShadowVariablesParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        ShadowVariablesParser.arrayDeclaratorList_return retval = new ShadowVariablesParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();

        		if (!variableDeclarator_stack.isEmpty()) ((variableDeclarator_scope)variableDeclarator_stack.peek()).var.isArray = true;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 295) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList569); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:33: ( ARRAY_DECLARATOR )*
                loop17:
                do {
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ARRAY_DECLARATOR) ) {
                        alt17=1;
                    }


                    switch (alt17) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList571); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop17;
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
            if ( state.backtracking>0 ) { memoize(input, 295, arrayDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaratorList"

    public static class modifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifier"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:329:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final ShadowVariablesParser.modifier_return modifier() throws RecognitionException {
        ShadowVariablesParser.modifier_return retval = new ShadowVariablesParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 296) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:330:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt18=11;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:330:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier594); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:331:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier604); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:332:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier614); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isPrivate = true; 
                    }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:333:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isStatic = true; 
                    }

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:334:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier638); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:335:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier648); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:336:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier658); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:337:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier668); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:338:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier678); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:339:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier688); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:340:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier698);
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
            if ( state.backtracking>0 ) { memoize(input, 296, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class localModifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localModifier"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:343:1: localModifier : ( FINAL | annotation );
    public final ShadowVariablesParser.localModifier_return localModifier() throws RecognitionException {
        ShadowVariablesParser.localModifier_return retval = new ShadowVariablesParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 297) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:344:5: ( FINAL | annotation )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FINAL) ) {
                alt19=1;
            }
            else if ( (LA19_0==AT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:344:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier717); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isFinal = true; 
                    }

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:345:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier729);
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
            if ( state.backtracking>0 ) { memoize(input, 297, localModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifier"

    public static class formalParameterStandardDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterStandardDecl"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:348:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final ShadowVariablesParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        ShadowVariablesParser.formalParameterStandardDecl_return retval = new ShadowVariablesParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId2 = null;

        ShadowVariablesParser_JavaTreeParser.type_return type3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 298) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:349:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:349:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl753); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl755);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl757);
            type3=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl759);
            variableDeclaratorId2=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if (!methodScopeDeclarations_stack.isEmpty()){
                              Variable var = new Variable();
                              var.name = (variableDeclaratorId2!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId2.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId2.start))):null);
                              var.type = (type3!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type3.start),
                input.getTreeAdaptor().getTokenStopIndex(type3.start))):null);
                              var.isParameter = true;
                              ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).localVariables.put(var.name, var);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 298, formalParameterStandardDecl_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:361:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final ShadowVariablesParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        ShadowVariablesParser.formalParameterVarargDecl_return retval = new ShadowVariablesParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId4 = null;

        ShadowVariablesParser_JavaTreeParser.type_return type5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 299) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:362:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:362:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl794); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl796);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl798);
            type5=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl800);
            variableDeclaratorId4=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                          if (!methodScopeDeclarations_stack.isEmpty()){
                              Variable var = new Variable();
                              var.name = (variableDeclaratorId4!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId4.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId4.start))):null);
                              var.type = (type5!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type5.start),
                input.getTreeAdaptor().getTokenStopIndex(type5.start))):null);
                              var.isParameter = true;
                              ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).localVariables.put(var.name, var);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 299, formalParameterVarargDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterVarargDecl"

    protected static class block_scope {
        Map<String, Variable> localVariables;
    }
    protected Stack block_stack = new Stack();

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:376:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final ShadowVariablesParser.block_return block() throws RecognitionException {
        block_stack.push(new block_scope());
        ShadowVariablesParser.block_return retval = new ShadowVariablesParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();

        		((block_scope)block_stack.peek()).localVariables = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 300) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block844); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:23: ( blockStatement )*
                loop20:
                do {
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==AT||LA20_0==SEMI||LA20_0==ASSERT||LA20_0==BREAK||(LA20_0>=CLASS && LA20_0<=CONTINUE)||LA20_0==DO||LA20_0==ENUM||(LA20_0>=FOR && LA20_0<=IF)||LA20_0==INTERFACE||LA20_0==RETURN||(LA20_0>=SWITCH && LA20_0<=SYNCHRONIZED)||LA20_0==THROW||LA20_0==TRY||LA20_0==WHILE||LA20_0==BLOCK_SCOPE||LA20_0==EXPR||LA20_0==FOR_EACH||LA20_0==LABELED_STATEMENT||LA20_0==VAR_DECLARATION) ) {
                        alt20=1;
                    }


                    switch (alt20) {
                	case 1 :
                	    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block846);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop20;
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
            if ( state.backtracking>0 ) { memoize(input, 300, block_StartIndex); }
            block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:386:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final ShadowVariablesParser.statement_return statement() throws RecognitionException {
        ShadowVariablesParser.statement_return retval = new ShadowVariablesParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 301) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:387:5: ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt27=17;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:387:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement875);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:388:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement886); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement888);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:388:29: ( expression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==EXPR) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement890);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:389:9: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement902);
                    ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:390:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement913); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement915);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement917);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement919);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement921);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:391:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement933); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement935);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement937);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement939); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement941);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement943);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:392:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement956); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement958);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement960);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:393:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement972); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement974);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement976);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:394:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement988); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement990);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:394:21: ( catches )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==CATCH_CLAUSE_LIST) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement992);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:394:30: ( block )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==BLOCK_SCOPE) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement995);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:395:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement1010); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement1012);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement1014);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:396:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement1026); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement1028);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement1030);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:397:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1042); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:397:18: ( expression )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==EXPR) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement1044);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:398:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement1057); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement1059);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:399:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement1071); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:399:17: ( IDENT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement1073); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:400:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1086); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:400:20: ( IDENT )?
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==IDENT) ) {
                            alt26=1;
                        }
                        switch (alt26) {
                            case 1 :
                                // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement1088); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:401:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement1101); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement1103); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement1105);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:402:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement1116);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:403:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement1126); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 301, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    protected static class ifStatement_scope {
        Boolean dummy;
        // we are testing only the existence of ifStatement stack;
    }
    protected Stack ifStatement_stack = new Stack();

    public static class ifStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ifStatement"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:406:1: ifStatement : ^( IF parenthesizedExpression statement ( statement )? ) ;
    public final ShadowVariablesParser.ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_stack.push(new ifStatement_scope());
        ShadowVariablesParser.ifStatement_return retval = new ShadowVariablesParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 302) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:410:5: ( ^( IF parenthesizedExpression statement ( statement )? ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:411:9: ^( IF parenthesizedExpression statement ( statement )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1161); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_parenthesizedExpression_in_ifStatement1163);
            parenthesizedExpression();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_statement_in_ifStatement1165);
            statement();

            state._fsp--;
            if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:411:48: ( statement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SEMI||LA28_0==ASSERT||LA28_0==BREAK||LA28_0==CONTINUE||LA28_0==DO||(LA28_0>=FOR && LA28_0<=IF)||LA28_0==RETURN||(LA28_0>=SWITCH && LA28_0<=SYNCHRONIZED)||LA28_0==THROW||LA28_0==TRY||LA28_0==WHILE||LA28_0==BLOCK_SCOPE||LA28_0==EXPR||LA28_0==FOR_EACH||LA28_0==LABELED_STATEMENT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifStatement1167);
                    statement();

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
            if ( state.backtracking>0 ) { memoize(input, 302, ifStatement_StartIndex); }
            ifStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    protected static class parenthesizedExpression_scope {
        boolean shouldReturnValue;
    }
    protected Stack parenthesizedExpression_stack = new Stack();

    public static class parenthesizedExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parenthesizedExpression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:416:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final ShadowVariablesParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        parenthesizedExpression_stack.push(new parenthesizedExpression_scope());
        ShadowVariablesParser.parenthesizedExpression_return retval = new ShadowVariablesParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();

        		((parenthesizedExpression_scope)parenthesizedExpression_stack.peek()).shouldReturnValue =true;		
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 303) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:423:5: ( ^( PARENTESIZED_EXPR expression ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:423:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression1206); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression1208);
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
            if ( state.backtracking>0 ) { memoize(input, 303, parenthesizedExpression_StartIndex); }
            parenthesizedExpression_stack.pop();
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:426:1: expression : ^( EXPR expr ) ;
    public final ShadowVariablesParser.expression_return expression() throws RecognitionException {
        ShadowVariablesParser.expression_return retval = new ShadowVariablesParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 304) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:427:5: ( ^( EXPR expr ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:427:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression1233); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression1235);
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
            if ( state.backtracking>0 ) { memoize(input, 304, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    protected static class assignExpression_scope {
        String valueText;
        String template;
    }
    protected Stack assignExpression_stack = new Stack();

    public static class assignExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignExpression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:451:1: assignExpression : ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) ) ;
    public final ShadowVariablesParser.assignExpression_return assignExpression() throws RecognitionException {
        assignExpression_stack.push(new assignExpression_scope());
        ShadowVariablesParser.assignExpression_return retval = new ShadowVariablesParser.assignExpression_return();
        retval.start = input.LT(1);
        int assignExpression_StartIndex = input.index();
        ShadowVariablesParser.expr_return variable = null;

        ShadowVariablesParser.expr_return value = null;



        		((assignExpression_scope)assignExpression_stack.peek()).template = "assignSetValue";
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 305) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:459:2: ( ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:460:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )
            {
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:460:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )
            int alt29=16;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:461:2: ^( ASSIGN variable= expr value= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpression1271); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1275);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1279);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:463:9: ^( PLUS_ASSIGN variable= expr value= expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignExpression1296); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1300);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1304);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"+("+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null)+")"; 
                    }

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:465:9: ^( MINUS_ASSIGN variable= expr value= expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignExpression1321); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1325);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1329);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"-("+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null)+")"; 
                    }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:467:9: ^( STAR_ASSIGN variable= expr value= expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_assignExpression1346); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1350);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1354);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"*"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:469:9: ^( DIV_ASSIGN variable= expr value= expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignExpression1371); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1375);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1379);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"/"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:471:9: ^( AND_ASSIGN variable= expr value= expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_assignExpression1396); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1400);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1404);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"&"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:473:9: ^( OR_ASSIGN variable= expr value= expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_assignExpression1421); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1425);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1429);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"|"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:475:9: ^( XOR_ASSIGN variable= expr value= expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_assignExpression1446); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1450);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1454);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"^"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:477:9: ^( MOD_ASSIGN variable= expr value= expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignExpression1471); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1475);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1479);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"%"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:479:9: ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression1496); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1500);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1504);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+">>>"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:481:9: ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression1521); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1525);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1529);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+">>"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:483:9: ^( SHIFT_LEFT_ASSIGN variable= expr value= expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression1546); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1550);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1554);
                    value=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"<<"+(value!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(value.start),
                        input.getTreeAdaptor().getTokenStopIndex(value.start))):null); 
                    }

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:485:9: ^( PRE_INC variable= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_assignExpression1571); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1575);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"+1"; 
                    }
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).template = "preIncSetValue"; 
                    }

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:488:9: ^( PRE_DEC variable= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_assignExpression1639); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1643);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"-1"; 
                    }
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).template = "preDecSetValue"; 
                    }

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:491:9: ^( POST_INC variable= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_assignExpression1707); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1711);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"+1"; 
                    }
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).template = "postIncSetValue"; 
                    }

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:494:9: ^( POST_DEC variable= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_assignExpression1775); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression1779);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).valueText = (variable!=null?(input.getTokenStream().toString(
                        input.getTreeAdaptor().getTokenStartIndex(variable.start),
                        input.getTreeAdaptor().getTokenStopIndex(variable.start))):null)+"-1"; 
                    }
                    if ( state.backtracking==0 ) {
                       ((assignExpression_scope)assignExpression_stack.peek()).template = "postDecSetValue"; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                      resistantSetValue(retval.start, (variable!=null?variable.ident:null), ((assignExpression_scope)assignExpression_stack.peek()).valueText, ((assignExpression_scope)assignExpression_stack.peek()).template);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 305, assignExpression_StartIndex); }
            assignExpression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "assignExpression"

    public static class expr_return extends TreeRuleReturnScope {
        public String ident;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:502:1: expr returns [String ident] : ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression );
    public final ShadowVariablesParser.expr_return expr() throws RecognitionException {
        ShadowVariablesParser.expr_return retval = new ShadowVariablesParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        ShadowVariablesParser.primaryExpression_return e = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 306) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:503:5: ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression )
            int alt30=28;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:503:9: assignExpression
                    {
                    pushFollow(FOLLOW_assignExpression_in_expr1866);
                    assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:504:7: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr1875); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1877);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1879);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1881);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:505:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr1893); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1895);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1897);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:506:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr1909); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1911);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1913);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:507:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr1925); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1927);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1929);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:508:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr1941); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1943);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1945);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:509:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr1957); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1959);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1961);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:510:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr1973); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1975);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1977);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:511:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr1989); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1991);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1993);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:512:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr2005); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2007);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr2009);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:513:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr2021); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2023);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2025);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:514:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr2037); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2039);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2041);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:515:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr2053); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2055);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2057);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:516:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr2069); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2071);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2073);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:517:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr2085); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2087);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2089);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:518:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr2101); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2103);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2105);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:519:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr2117); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2119);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2121);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:520:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr2133); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2135);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2137);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:521:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr2149); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2151);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2153);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:522:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr2165); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2167);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2169);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:523:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr2181); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2183);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2185);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:524:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr2197); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2199);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2201);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:525:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr2213); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2215);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:526:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr2227); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2229);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:527:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr2241); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2243);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:528:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr2255); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2257);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:529:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr2269); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr2271);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr2273);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:530:9: e= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr2286);
                    e=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                  retval.ident = (e!=null?e.ident:null);
                                  resistantGetValue(e.start, (e!=null?e.ident:null));
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 306, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    protected static class primaryExpression_scope {
        boolean shouldReturnValue;
    }
    protected Stack primaryExpression_stack = new Stack();

    public static class primaryExpression_return extends TreeRuleReturnScope {
        public String ident;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:537:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final ShadowVariablesParser.primaryExpression_return primaryExpression() throws RecognitionException {
        primaryExpression_stack.push(new primaryExpression_scope());
        ShadowVariablesParser.primaryExpression_return retval = new ShadowVariablesParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        CommonTree IDENT6=null;
        CommonTree IDENT7=null;
        ShadowVariablesParser.primaryExpression_return p = null;



        		((primaryExpression_scope)primaryExpression_stack.peek()).shouldReturnValue = false;		
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 307) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:544:5: ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt34=11;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:544:9: ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression2331); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:545:13: (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt32=3;
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
                        alt32=1;
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
                        alt32=2;
                        }
                        break;
                    case VOID:
                        {
                        alt32=3;
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
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:545:17: p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression2351);
                            p=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                              retval.ident = ((p!=null?p.ident:null)==null?"":((p!=null?p.ident:null)+"."));
                            }
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:546:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt31=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt31=1;
                                }
                                break;
                            case THIS:
                                {
                                alt31=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt31=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt31=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt31=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 31, 0, input);

                                throw nvae;
                            }

                            switch (alt31) {
                                case 1 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:546:21: IDENT
                                    {
                                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2375); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += (IDENT6!=null?IDENT6.getText():null); 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:547:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression2399); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "this"; 
                                    }

                                    }
                                    break;
                                case 3 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:548:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression2423); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "super"; 
                                    }

                                    }
                                    break;
                                case 4 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:549:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression2447);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:550:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2469); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:552:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression2505);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2507); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:553:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression2525); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression2527); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:556:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression2561);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:557:9: IDENT
                    {
                    IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression2571); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = (IDENT7!=null?IDENT7.getText():null); 
                    }

                    }
                    break;
                case 4 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:558:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression2586); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2588);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:558:41: ( genericTypeArgumentList )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression2590);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((primaryExpression_scope)primaryExpression_stack.peek()).shouldReturnValue = true;
                    }
                    pushFollow(FOLLOW_arguments_in_primaryExpression2595);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:559:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression2608);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:560:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2619); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression2621);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression2623);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:561:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2634);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:562:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression2644);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:563:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression2654); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = "this"; 
                    }

                    }
                    break;
                case 10 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:564:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression2666);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:565:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression2676); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 307, primaryExpression_StartIndex); }
            primaryExpression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    protected static class classDeclaration_scope {
        // all variables in class
        		Vector<Variable> variables;
        // only global variables
        		Map<String, Variable> globalVariables;
        // only variables, that should be transformed
        		Map<VariableGroup, Set<Variable>> variablesByGroups;
        // counter for methods in class
        		int methodScopeCount;
    }
    protected Stack classDeclaration_stack = new Stack();

    public static class classDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:568:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
    public final ShadowVariablesParser.classDeclaration_return classDeclaration() throws RecognitionException {
        classDeclaration_stack.push(new classDeclaration_scope());
        ShadowVariablesParser.classDeclaration_return retval = new ShadowVariablesParser.classDeclaration_return();
        retval.start = input.LT(1);
        int classDeclaration_StartIndex = input.index();

        		((classDeclaration_scope)classDeclaration_stack.peek()).variables = new Vector<Variable>();		
        		((classDeclaration_scope)classDeclaration_stack.peek()).globalVariables = new HashMap<String, Variable>();
        		((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups = new HashMap<VariableGroup, Set<Variable>>();
        		
        		((classDeclaration_scope)classDeclaration_stack.peek()).methodScopeCount = 0;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 308) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:589:2: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:590:3: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration2708); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration2710);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENT,FOLLOW_IDENT_in_classDeclaration2712); if (state.failed) return retval;
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:590:30: ( genericTypeParameterList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration2714);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:590:56: ( extendsClause )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EXTENDS_CLAUSE) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration2717);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:590:71: ( implementsClause )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IMPLEMENTS_CLAUSE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration2720);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration2723);
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
            if ( state.backtracking>0 ) { memoize(input, 308, classDeclaration_StartIndex); }
            classDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classDeclaration"

    protected static class methodScopeDeclarations_scope {
        Map<String, Variable> localVariables;
    }
    protected Stack methodScopeDeclarations_stack = new Stack();

    public static class methodScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "methodScopeDeclarations"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:593:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) );
    public final ShadowVariablesParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        methodScopeDeclarations_stack.push(new methodScopeDeclarations_scope());
        ShadowVariablesParser.methodScopeDeclarations_return retval = new ShadowVariablesParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);
        int methodScopeDeclarations_StartIndex = input.index();

        		if (!classDeclaration_stack.isEmpty()) ((classDeclaration_scope)classDeclaration_stack.peek()).methodScopeCount++;
                        ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).localVariables = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 309) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:608:2: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt47=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt47=2;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt47=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:609:3: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations2762); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations2764);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:609:39: ( genericTypeParameterList )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2766);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodScopeDeclarations2769);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations2771); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations2773);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:609:96: ( arrayDeclaratorList )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==ARRAY_DECLARATOR_LIST) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations2775);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:609:117: ( throwsClause )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==THROWS_CLAUSE) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations2778);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:609:131: ( block )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==BLOCK_SCOPE) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations2781);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:610:4: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations2789); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations2791);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:610:36: ( genericTypeParameterList )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2793);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations2796); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations2798);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:610:88: ( throwsClause )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==THROWS_CLAUSE) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations2800);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:610:102: ( block )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==BLOCK_SCOPE) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations2803);
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
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:611:4: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations2811); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations2813);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:611:36: ( genericTypeParameterList )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2815);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations2818);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:611:82: ( throwsClause )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==THROWS_CLAUSE) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations2820);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_methodScopeDeclarations2823);
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
            if ( state.backtracking>0 ) { memoize(input, 309, methodScopeDeclarations_StartIndex); }
            methodScopeDeclarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "methodScopeDeclarations"

    public static class globalVariableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "globalVariableDeclaration"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:614:1: globalVariableDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final ShadowVariablesParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        VariableDeclaration_stack.push(new VariableDeclaration_scope());

        ShadowVariablesParser.globalVariableDeclaration_return retval = new ShadowVariablesParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);
        int globalVariableDeclaration_StartIndex = input.index();
        ShadowVariablesParser_JavaTreeParser.type_return type8 = null;



        		((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isGlobal = true;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 310) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:622:2: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:623:3: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration2852); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_globalVariableDeclaration2858);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_globalVariableDeclaration2864);
            type8=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).type =(type8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type8.start),
                input.getTreeAdaptor().getTokenStopIndex(type8.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_globalVariableDeclaration2871);
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
            if ( state.backtracking>0 ) { memoize(input, 310, globalVariableDeclaration_StartIndex); }
            VariableDeclaration_stack.pop();

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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:629:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final ShadowVariablesParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        VariableDeclaration_stack.push(new VariableDeclaration_scope());

        ShadowVariablesParser.localVariableDeclaration_return retval = new ShadowVariablesParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        ShadowVariablesParser_JavaTreeParser.type_return type9 = null;



        		
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 311) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:637:2: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:638:3: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2909); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2915);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2921);
            type9=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).type =(type9!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type9.start),
                input.getTreeAdaptor().getTokenStopIndex(type9.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2928);
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
            if ( state.backtracking>0 ) { memoize(input, 311, localVariableDeclaration_StartIndex); }
            VariableDeclaration_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    protected static class variableDeclarator_scope {
        Variable var;
    }
    protected Stack variableDeclarator_stack = new Stack();

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:644:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] ) ;
    public final ShadowVariablesParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        ShadowVariablesParser.variableDeclarator_return retval = new ShadowVariablesParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId10 = null;



        		((variableDeclarator_scope)variableDeclarator_stack.peek()).var = new Variable();				
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 312) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:654:2: ( ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] ) )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:654:6: ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator2960); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator2962);
            variableDeclaratorId10=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              if (!classDeclaration_stack.isEmpty() && !VariableDeclaration_stack.isEmpty()){	// if we are in class
              				Variable var = ((variableDeclarator_scope)variableDeclarator_stack.peek()).var;
              				var.type = ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).type;
              				var.isStatic = ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isStatic;
              				var.isGlobal = ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isGlobal;
              				var.isFinal = ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isFinal;
              				var.isPrivate = ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isPrivate;
              				
              				// in variablesByGroups are only supported variables
              				if (var.isResistanceSupported()){
              					if (!((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups.containsKey(var.getGroup()))
              						((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups.put(var.getGroup(), new HashSet<Variable>());
              						
              					Set<Variable> groupVariables = ((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups.get(var.getGroup());
              					if (var.isGlobal || !getParamB("useMethodId")){
                                                          var.id = groupVariables.size();
                                                      } else {
                                                              var.methodId = ((classDeclaration_scope)classDeclaration_stack.peek()).methodScopeCount;
              						int count = 0;
              						for (Variable v:groupVariables)
              							if (v.methodId == var.methodId) count++;
              						var.id = count;
              					}
              					groupVariables.add(var);
              				}
              				
              				((classDeclaration_scope)classDeclaration_stack.peek()).variables.add(var);
              				
              				// we are in block					
              				if (!block_stack.isEmpty())
              					((block_scope)block_stack.peek()).localVariables.put(var.name, var);
              				
              				// global variable
              				if (var.isGlobal) {
              					((classDeclaration_scope)classDeclaration_stack.peek()).globalVariables.put(var.name, var);
                                                      if (var.isResistanceSupported() && !var.isPrivate){
                                                          getLogger().warning("Variable "+var.name+" is not private, encapsulation can be broken");
                                                      }
              				}
              			}
            }
            pushFollow(FOLLOW_variableResistantInitializer_in_variableDeclarator2972);
            variableResistantInitializer((CommonTree)(variableDeclaratorId10!=null?((CommonTree)variableDeclaratorId10.start):null));

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
            if ( state.backtracking>0 ) { memoize(input, 312, variableDeclarator_StartIndex); }
            variableDeclarator_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableResistantInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableResistantInitializer"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:697:1: variableResistantInitializer[CommonTree varDecl] : ( variableInitializer )? ;
    public final ShadowVariablesParser.variableResistantInitializer_return variableResistantInitializer(CommonTree varDecl) throws RecognitionException {
        ShadowVariablesParser.variableResistantInitializer_return retval = new ShadowVariablesParser.variableResistantInitializer_return();
        retval.start = input.LT(1);
        int variableResistantInitializer_StartIndex = input.index();
        ShadowVariablesParser_JavaTreeParser.variableInitializer_return variableInitializer11 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 313) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:701:2: ( ( variableInitializer )? )
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:702:3: ( variableInitializer )?
            {
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:702:3: ( variableInitializer )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ARRAY_INITIALIZER||LA48_0==EXPR) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableResistantInitializer2992);
                    variableInitializer11=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              if (!variableDeclarator_stack.isEmpty() && ((variableDeclarator_scope)variableDeclarator_stack.peek()).var.isResistanceSupported()){
              			
              			getLogger().finer("Initializer for "+((variableDeclarator_scope)variableDeclarator_stack.peek()).var.toString()+" with value \""+(variableInitializer11!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableInitializer11.start),
                input.getTreeAdaptor().getTokenStopIndex(variableInitializer11.start))):null)+"\"");
              			
                                      if ((variableInitializer11!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableInitializer11.start),
                input.getTreeAdaptor().getTokenStopIndex(variableInitializer11.start))):null)!=null) {
                                          StringTemplate st = getTemplateLib().getInstanceOf("resistantSetValue");
                                          st.setAttribute("variable", ((variableDeclarator_scope)variableDeclarator_stack.peek()).var);
                                          st.setAttribute("value", (variableInitializer11!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableInitializer11.start),
                input.getTreeAdaptor().getTokenStopIndex(variableInitializer11.start))):null));
                                          tokens.replace(
                                                  input.getTreeAdaptor().getTokenStartIndex((variableInitializer11!=null?((CommonTree)variableInitializer11.start):null)),
                                                  input.getTreeAdaptor().getTokenStopIndex((variableInitializer11!=null?((CommonTree)variableInitializer11.start):null)),
                                                  st
                                          );
                                      } else {
                                          // we need to insert default initializer to initialize shadow array and variable
                                          // to the same value
                                          StringTemplate st = getTemplateLib().getInstanceOf("resistantInitValue");
                                          st.setAttribute("variable", ((variableDeclarator_scope)variableDeclarator_stack.peek()).var);
                                          st.setAttribute("value", ANTLRJavaHelper.getTypeDefaultValue(((variableDeclarator_scope)variableDeclarator_stack.peek()).var.type));
                                          tokens.insertAfter(
                                                  input.getTreeAdaptor().getTokenStopIndex(varDecl),
                                                  st
                                          );
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
            if ( state.backtracking>0 ) { memoize(input, 313, variableResistantInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableResistantInitializer"

    public static class classAdditionalCode_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classAdditionalCode"
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:731:1: classAdditionalCode[CommonTree tree] : ;
    public final ShadowVariablesParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        ShadowVariablesParser.classAdditionalCode_return retval = new ShadowVariablesParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 314) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:735:2: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:736:3: 
            {
            if ( state.backtracking==0 ) {
              if (!classDeclaration_stack.isEmpty()){
              			for(VariableGroup group:((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups.keySet()){
              				Set<Variable> variables = ((classDeclaration_scope)classDeclaration_stack.peek()).variablesByGroups.get(group);
              				
                                              group.maxId = -1;
                                              for (Variable var:variables){
                                                  if (var.id>group.maxId) group.maxId=var.id;
                                              }
                                  		if (group.maxId<0) break;
              				
              				getLogger().fine("Declaring helpers for group "+group.toString()+" with size "+(group.getSize()));
              			
              				StringTemplate st;
              				
              				st = getTemplateLib().getInstanceOf("declareResistantArray");
              				st.setAttribute("varGroup", group);
              				tokens.insertAfter(tree.getTokenStartIndex(), st);
              				
              				st = getTemplateLib().getInstanceOf("declareResistantSetter");
              				st.setAttribute("varGroup", group);
              				tokens.insertBefore(tree.getTokenStopIndex(), st);
              				
              				st = getTemplateLib().getInstanceOf("declareResistantGetter");
              				st.setAttribute("varGroup", group);
              				tokens.insertBefore(tree.getTokenStopIndex(), st);				
              			}
              		}
            }

            }

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 314, classAdditionalCode_StartIndex); }
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
    // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:766:1: additionalImports[CommonTree tree] : ;
    public final ShadowVariablesParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        ShadowVariablesParser.additionalImports_return retval = new ShadowVariablesParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 315) ) { return retval; }
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:767:2: ()
            // E:\\GitHub\\CesTa\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:768:13: 
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
            if ( state.backtracking>0 ) { memoize(input, 315, additionalImports_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalImports"

    // Delegated rules
    public ShadowVariablesParser_JavaTreeParser.formalParameterList_return formalParameterList() throws RecognitionException { return gJavaTreeParser.formalParameterList(); }
    public ShadowVariablesParser_JavaTreeParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException { return gJavaTreeParser.arrayDeclarator(); }
    public ShadowVariablesParser_JavaTreeParser.forInit_return forInit() throws RecognitionException { return gJavaTreeParser.forInit(); }
    public ShadowVariablesParser_JavaTreeParser.annotation_return annotation() throws RecognitionException { return gJavaTreeParser.annotation(); }
    public ShadowVariablesParser_JavaTreeParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException { return gJavaTreeParser.switchDefaultLabel(); }
    public ShadowVariablesParser_JavaTreeParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException { return gJavaTreeParser.variableDeclaratorList(); }
    public ShadowVariablesParser_JavaTreeParser.localModifierList_return localModifierList() throws RecognitionException { return gJavaTreeParser.localModifierList(); }
    public ShadowVariablesParser_JavaTreeParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException { return gJavaTreeParser.annotationTopLevelScope(); }
    public ShadowVariablesParser_JavaTreeParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException { return gJavaTreeParser.genericWildcardBoundType(); }
    public ShadowVariablesParser_JavaTreeParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException { return gJavaTreeParser.interfaceTopLevelScope(); }
    public ShadowVariablesParser_JavaTreeParser.forCondition_return forCondition() throws RecognitionException { return gJavaTreeParser.forCondition(); }
    public ShadowVariablesParser_JavaTreeParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException { return gJavaTreeParser.genericTypeArgument(); }
    public ShadowVariablesParser_JavaTreeParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException { return gJavaTreeParser.explicitConstructorCall(); }
    public ShadowVariablesParser_JavaTreeParser.innerNewExpression_return innerNewExpression() throws RecognitionException { return gJavaTreeParser.innerNewExpression(); }
    public ShadowVariablesParser_JavaTreeParser.forUpdater_return forUpdater() throws RecognitionException { return gJavaTreeParser.forUpdater(); }
    public ShadowVariablesParser_JavaTreeParser.throwsClause_return throwsClause() throws RecognitionException { return gJavaTreeParser.throwsClause(); }
    public ShadowVariablesParser_JavaTreeParser.bound_return bound() throws RecognitionException { return gJavaTreeParser.bound(); }
    public ShadowVariablesParser_JavaTreeParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException { return gJavaTreeParser.annotationDefaultValue(); }
    public ShadowVariablesParser_JavaTreeParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException { return gJavaTreeParser.annotationScopeDeclarations(); }
    public ShadowVariablesParser_JavaTreeParser.catchClause_return catchClause() throws RecognitionException { return gJavaTreeParser.catchClause(); }
    public ShadowVariablesParser_JavaTreeParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException { return gJavaTreeParser.qualifiedTypeIdent(); }
    public ShadowVariablesParser_JavaTreeParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException { return gJavaTreeParser.genericTypeParameter(); }
    public ShadowVariablesParser_JavaTreeParser.blockStatement_return blockStatement() throws RecognitionException { return gJavaTreeParser.blockStatement(); }
    public ShadowVariablesParser_JavaTreeParser.modifierList_return modifierList() throws RecognitionException { return gJavaTreeParser.modifierList(); }
    public ShadowVariablesParser_JavaTreeParser.literal_return literal() throws RecognitionException { return gJavaTreeParser.literal(); }
    public ShadowVariablesParser_JavaTreeParser.annotationInit_return annotationInit() throws RecognitionException { return gJavaTreeParser.annotationInit(); }
    public ShadowVariablesParser_JavaTreeParser.enumConstant_return enumConstant() throws RecognitionException { return gJavaTreeParser.enumConstant(); }
    public ShadowVariablesParser_JavaTreeParser.newExpression_return newExpression() throws RecognitionException { return gJavaTreeParser.newExpression(); }
    public ShadowVariablesParser_JavaTreeParser.primitiveType_return primitiveType() throws RecognitionException { return gJavaTreeParser.primitiveType(); }
    public ShadowVariablesParser_JavaTreeParser.typeIdent_return typeIdent() throws RecognitionException { return gJavaTreeParser.typeIdent(); }
    public ShadowVariablesParser_JavaTreeParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException { return gJavaTreeParser.genericTypeParameterList(); }
    public ShadowVariablesParser_JavaTreeParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException { return gJavaTreeParser.switchBlockLabels(); }
    public ShadowVariablesParser_JavaTreeParser.arguments_return arguments() throws RecognitionException { return gJavaTreeParser.arguments(); }
    public ShadowVariablesParser_JavaTreeParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException { return gJavaTreeParser.enumTopLevelScope(); }
    public ShadowVariablesParser_JavaTreeParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException { return gJavaTreeParser.newArrayConstruction(); }
    public ShadowVariablesParser_JavaTreeParser.type_return type() throws RecognitionException { return gJavaTreeParser.type(); }
    public ShadowVariablesParser_JavaTreeParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException { return gJavaTreeParser.switchCaseLabel(); }
    public ShadowVariablesParser_JavaTreeParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException { return gJavaTreeParser.arrayTypeDeclarator(); }
    public ShadowVariablesParser_JavaTreeParser.extendsClause_return extendsClause() throws RecognitionException { return gJavaTreeParser.extendsClause(); }
    public ShadowVariablesParser_JavaTreeParser.variableInitializer_return variableInitializer() throws RecognitionException { return gJavaTreeParser.variableInitializer(); }
    public ShadowVariablesParser_JavaTreeParser.importDeclaration_return importDeclaration() throws RecognitionException { return gJavaTreeParser.importDeclaration(); }
    public ShadowVariablesParser_JavaTreeParser.annotationElementValue_return annotationElementValue() throws RecognitionException { return gJavaTreeParser.annotationElementValue(); }
    public ShadowVariablesParser_JavaTreeParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException { return gJavaTreeParser.genericTypeArgumentList(); }
    public ShadowVariablesParser_JavaTreeParser.catches_return catches() throws RecognitionException { return gJavaTreeParser.catches(); }
    public ShadowVariablesParser_JavaTreeParser.arrayInitializer_return arrayInitializer() throws RecognitionException { return gJavaTreeParser.arrayInitializer(); }
    public ShadowVariablesParser_JavaTreeParser.packageDeclaration_return packageDeclaration() throws RecognitionException { return gJavaTreeParser.packageDeclaration(); }
    public ShadowVariablesParser_JavaTreeParser.implementsClause_return implementsClause() throws RecognitionException { return gJavaTreeParser.implementsClause(); }
    public ShadowVariablesParser_JavaTreeParser.annotationInitializers_return annotationInitializers() throws RecognitionException { return gJavaTreeParser.annotationInitializers(); }
    public ShadowVariablesParser_JavaTreeParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException { return gJavaTreeParser.qualifiedIdentifier(); }
    public ShadowVariablesParser_JavaTreeParser.annotationList_return annotationList() throws RecognitionException { return gJavaTreeParser.annotationList(); }
    public ShadowVariablesParser_JavaTreeParser.annotationInitializer_return annotationInitializer() throws RecognitionException { return gJavaTreeParser.annotationInitializer(); }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA18_eotS =
        "\14\uffff";
    static final String DFA18_eofS =
        "\14\uffff";
    static final String DFA18_minS =
        "\1\7\13\uffff";
    static final String DFA18_maxS =
        "\1\146\13\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA18_specialS =
        "\14\uffff}>";
    static final String[] DFA18_transitionS = {
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "329:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
        }
    }
    static final String DFA27_eotS =
        "\22\uffff";
    static final String DFA27_eofS =
        "\22\uffff";
    static final String DFA27_minS =
        "\1\54\21\uffff";
    static final String DFA27_maxS =
        "\1\u008d\21\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21";
    static final String DFA27_specialS =
        "\22\uffff}>";
    static final String[] DFA27_transitionS = {
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "386:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
        }
    }
    static final String DFA29_eotS =
        "\21\uffff";
    static final String DFA29_eofS =
        "\21\uffff";
    static final String DFA29_minS =
        "\1\5\20\uffff";
    static final String DFA29_maxS =
        "\1\u0096\20\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA29_specialS =
        "\21\uffff}>";
    static final String[] DFA29_transitionS = {
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "460:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )";
        }
    }
    static final String DFA30_eotS =
        "\35\uffff";
    static final String DFA30_eofS =
        "\35\uffff";
    static final String DFA30_minS =
        "\1\4\34\uffff";
    static final String DFA30_maxS =
        "\1\u00aa\34\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34";
    static final String DFA30_specialS =
        "\35\uffff}>";
    static final String[] DFA30_transitionS = {
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "502:1: expr returns [String ident] : ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression );";
        }
    }
    static final String DFA34_eotS =
        "\14\uffff";
    static final String DFA34_eofS =
        "\14\uffff";
    static final String DFA34_minS =
        "\1\17\13\uffff";
    static final String DFA34_maxS =
        "\1\u00aa\13\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA34_specialS =
        "\14\uffff}>";
    static final String[] DFA34_transitionS = {
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "537:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource139 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource141 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource144 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource147 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDeclaration_in_typeDeclaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration214 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration216 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration235 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope264 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations291 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodScopeDeclarations_in_classScopeDeclarations316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_classScopeDeclarations326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations360 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations371 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations373 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations398 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList571 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_localModifier717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block846 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_block_in_statement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement888 = new BitSet(new long[]{0x0000000000000008L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_statement890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement913 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement919 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement933 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_statement937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement939 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_statement941 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement958 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement972 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement988 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement990 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement992 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement1010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement1014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement1026 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement1028 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement1030 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement1042 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement1071 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement1073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement1088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement1101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement1103 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement1105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_ifStatement1163 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_ifStatement1165 = new BitSet(new long[]{0x6140100000000088L,0x4020009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_ifStatement1167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression1206 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression1208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression1233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression1235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignExpression1271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1275 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignExpression1296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1300 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignExpression1321 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1325 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_assignExpression1346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1350 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_assignExpression1371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1375 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1379 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_assignExpression1396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1400 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_assignExpression1421 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1425 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_assignExpression1446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1450 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1454 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_assignExpression1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1475 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression1496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1500 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression1521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1525 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1529 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression1546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1550 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression1554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_assignExpression1571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_assignExpression1639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_assignExpression1707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_assignExpression1775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression1779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignExpression_in_expr1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr1875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1877 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1879 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr1893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1895 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr1909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1911 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr1925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1927 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr1941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1943 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr1957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1959 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr1973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1975 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr1989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr1991 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr1993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr2005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_expr2009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr2021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2023 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr2037 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2039 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2041 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr2053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2055 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2057 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr2069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2071 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2073 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr2085 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2087 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2089 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr2101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2103 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2105 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr2117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2119 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr2133 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2135 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr2149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2151 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr2165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2167 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2169 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr2181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2183 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr2197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2199 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2201 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr2213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr2227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr2241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr2255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr2257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr2269 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr2271 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr2273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression2331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2351 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression2399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression2423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression2447 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression2505 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression2525 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression2527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression2586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2588 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression2590 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression2595 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression2619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression2621 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2623 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration2708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration2712 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration2714 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration2717 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration2720 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration2723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations2762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations2769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations2771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations2773 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations2775 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations2778 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations2781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations2789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations2791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations2798 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations2800 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations2811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations2813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations2818 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations2820 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations2823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration2852 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_globalVariableDeclaration2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_globalVariableDeclaration2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_globalVariableDeclaration2871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator2960 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator2962 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableResistantInitializer_in_variableDeclarator2972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableInitializer_in_variableResistantInitializer2992 = new BitSet(new long[]{0x0000000000000002L});

}