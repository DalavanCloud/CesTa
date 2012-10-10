// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g 2010-05-22 11:43:38

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
            this.state.ruleMemo = new HashMap[296+1];
             
             
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
    public String getGrammarFileName() { return "D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g"; }


    	
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:276:1: javaSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) ;
    public final ShadowVariablesParser.javaSource_return javaSource() throws RecognitionException {
        ShadowVariablesParser.javaSource_return retval = new ShadowVariablesParser.javaSource_return();
        retval.start = input.LT(1);
        int javaSource_StartIndex = input.index();
        ShadowVariablesParser.typeDeclaration_return typeDeclaration1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:277:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:277:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* ( typeDeclaration )* additionalImports[(CommonTree)$typeDeclaration.start] )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_javaSource131); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_javaSource133);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:277:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_javaSource135);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:277:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_javaSource138);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:277:77: ( typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_javaSource141);
            	    typeDeclaration1=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_additionalImports_in_javaSource144);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:280:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final ShadowVariablesParser.packageDeclaration_return packageDeclaration() throws RecognitionException {
        ShadowVariablesParser.packageDeclaration_return retval = new ShadowVariablesParser.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:281:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:281:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration166); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration168);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:284:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final ShadowVariablesParser.importDeclaration_return importDeclaration() throws RecognitionException {
        ShadowVariablesParser.importDeclaration_return retval = new ShadowVariablesParser.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration195); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration197); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration200);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:285:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration202); if (state.failed) return retval;

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:288:1: typeDeclaration : ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final ShadowVariablesParser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        ShadowVariablesParser.typeDeclaration_return retval = new ShadowVariablesParser.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:289:5: ( classDeclaration | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:289:9: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_typeDeclaration227);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration238); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration240);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration242); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:40: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration244);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:290:66: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration247);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration250);
                    interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:291:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration262); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration264);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration266); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:291:35: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration268);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration271);
                    enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:292:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration283); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration285);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration287); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration289);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:295:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final ShadowVariablesParser.extendsClause_return extendsClause() throws RecognitionException {
        ShadowVariablesParser.extendsClause_return retval = new ShadowVariablesParser.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:297:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:297:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause326); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:297:26: ( type )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TYPE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause328);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:300:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final ShadowVariablesParser.implementsClause_return implementsClause() throws RecognitionException {
        ShadowVariablesParser.implementsClause_return retval = new ShadowVariablesParser.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:301:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:301:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause357); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:301:29: ( type )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TYPE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause359);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:304:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final ShadowVariablesParser.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        ShadowVariablesParser.genericTypeParameterList_return retval = new ShadowVariablesParser.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:305:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:305:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList389); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:305:35: ( genericTypeParameter )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList391);
            	    genericTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:308:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final ShadowVariablesParser.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        ShadowVariablesParser.genericTypeParameter_return retval = new ShadowVariablesParser.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:309:5: ( ^( IDENT ( bound )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:309:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter413); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:309:17: ( bound )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==EXTENDS_BOUND_LIST) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter415);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:312:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final ShadowVariablesParser.bound_return bound() throws RecognitionException {
        ShadowVariablesParser.bound_return retval = new ShadowVariablesParser.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:313:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:313:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound445); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:313:30: ( type )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound447);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:316:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final ShadowVariablesParser.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        ShadowVariablesParser.enumTopLevelScope_return retval = new ShadowVariablesParser.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:317:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:317:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope469); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:317:32: ( enumConstant )+
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
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope471);
            	    enumConstant();

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

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:317:46: ( classTopLevelScope )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope474);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:320:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final ShadowVariablesParser.enumConstant_return enumConstant() throws RecognitionException {
        ShadowVariablesParser.enumConstant_return retval = new ShadowVariablesParser.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:321:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:321:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant500); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant502);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:321:32: ( arguments )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ARGUMENT_LIST) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant504);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:321:43: ( classTopLevelScope )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant507);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:325:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] ;
    public final ShadowVariablesParser.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        ShadowVariablesParser.classTopLevelScope_return retval = new ShadowVariablesParser.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start] )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) classAdditionalCode[(CommonTree)retval.start]
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope538); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:326:33: ( classScopeDeclarations )*
                loop19:
                do {
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==AT||LA19_0==CLASS||LA19_0==ENUM||LA19_0==INTERFACE||(LA19_0>=CLASS_INSTANCE_INITIALIZER && LA19_0<=CLASS_STATIC_INITIALIZER)||LA19_0==CONSTRUCTOR_DECL||LA19_0==FUNCTION_METHOD_DECL||LA19_0==VAR_DECLARATION||LA19_0==VOID_METHOD_DECL) ) {
                        alt19=1;
                    }


                    switch (alt19) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope540);
                	    classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop19;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            pushFollow(FOLLOW_classAdditionalCode_in_classTopLevelScope544);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:329:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration );
    public final ShadowVariablesParser.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        ShadowVariablesParser.classScopeDeclarations_return retval = new ShadowVariablesParser.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:330:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | methodScopeDeclarations | globalVariableDeclaration | typeDeclaration )
            int alt20=5;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt20=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt20=2;
                }
                break;
            case CONSTRUCTOR_DECL:
            case FUNCTION_METHOD_DECL:
            case VOID_METHOD_DECL:
                {
                alt20=3;
                }
                break;
            case VAR_DECLARATION:
                {
                alt20=4;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:330:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations565); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations567);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:331:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations579); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations581);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:332:9: methodScopeDeclarations
                    {
                    pushFollow(FOLLOW_methodScopeDeclarations_in_classScopeDeclarations592);
                    methodScopeDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:333:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_classScopeDeclarations602);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:334:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations612);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:337:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final ShadowVariablesParser.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        ShadowVariablesParser.interfaceTopLevelScope_return retval = new ShadowVariablesParser.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:338:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:338:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope636); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:338:37: ( interfaceScopeDeclarations )*
                loop21:
                do {
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==AT||LA21_0==CLASS||LA21_0==ENUM||LA21_0==INTERFACE||LA21_0==FUNCTION_METHOD_DECL||LA21_0==VAR_DECLARATION||LA21_0==VOID_METHOD_DECL) ) {
                        alt21=1;
                    }


                    switch (alt21) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope638);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop21;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:341:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration );
    public final ShadowVariablesParser.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        ShadowVariablesParser.interfaceScopeDeclarations_return retval = new ShadowVariablesParser.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:342:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | globalVariableDeclaration | typeDeclaration )
            int alt27=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt27=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt27=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt27=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt27=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:342:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations664); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations666);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:342:45: ( genericTypeParameterList )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations668);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations671);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations673); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations675);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:342:102: ( arrayDeclaratorList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ARRAY_DECLARATOR_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations677);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:342:123: ( throwsClause )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==THROWS_CLAUSE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations680);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:343:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations693); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations695);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:343:41: ( genericTypeParameterList )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations697);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations700); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations702);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:343:93: ( throwsClause )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==THROWS_CLAUSE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations704);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:347:9: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations794);
                    globalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:348:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations804);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:351:1: variableDeclaratorList : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final ShadowVariablesParser.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        ShadowVariablesParser.variableDeclaratorList_return retval = new ShadowVariablesParser.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:352:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:352:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList824); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:352:31: ( variableDeclarator )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==VAR_DECLARATOR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList826);
            	    variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorId"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:355:1: variableDeclaratorId : ^(ident= IDENT ( arrayDeclaratorList )? ) ;
    public final ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        ShadowVariablesParser.variableDeclaratorId_return retval = new ShadowVariablesParser.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        CommonTree ident=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:356:2: ( ^(ident= IDENT ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:356:6: ^(ident= IDENT ( arrayDeclaratorList )? )
            {
            ident=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId855); if (state.failed) return retval;

            if ( state.backtracking==0 ) {
               
              				// save variable name for use in variableDeclarator
              				if (!variableDeclarator_stack.isEmpty()) ((variableDeclarator_scope)variableDeclarator_stack.peek()).var.name = (ident!=null?ident.getText():null); 
              			
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:362:4: ( arrayDeclaratorList )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ARRAY_DECLARATOR_LIST) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId866);
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
            if ( state.backtracking>0 ) { memoize(input, 17, variableDeclaratorId_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:366:1: variableInitializer : ( arrayInitializer | expression );
    public final ShadowVariablesParser.variableInitializer_return variableInitializer() throws RecognitionException {
        ShadowVariablesParser.variableInitializer_return retval = new ShadowVariablesParser.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:367:5: ( arrayInitializer | expression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ARRAY_INITIALIZER) ) {
                alt30=1;
            }
            else if ( (LA30_0==EXPR) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:367:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer890);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:368:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer900);
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
            if ( state.backtracking>0 ) { memoize(input, 18, variableInitializer_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:371:1: arrayDeclarator : LBRACK RBRACK ;
    public final ShadowVariablesParser.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        ShadowVariablesParser.arrayDeclarator_return retval = new ShadowVariablesParser.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:372:5: ( LBRACK RBRACK )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:372:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator919); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator921); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, arrayDeclarator_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:375:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final ShadowVariablesParser.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        ShadowVariablesParser.arrayDeclaratorList_return retval = new ShadowVariablesParser.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();

        		if (!variableDeclarator_stack.isEmpty()) ((variableDeclarator_scope)variableDeclarator_stack.peek()).var.isArray = true;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:379:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:379:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList947); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:379:33: ( ARRAY_DECLARATOR )*
                loop31:
                do {
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ARRAY_DECLARATOR) ) {
                        alt31=1;
                    }


                    switch (alt31) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList949); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop31;
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
            if ( state.backtracking>0 ) { memoize(input, 20, arrayDeclaratorList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:382:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final ShadowVariablesParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
        ShadowVariablesParser.arrayInitializer_return retval = new ShadowVariablesParser.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer977); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:383:29: ( variableInitializer )*
                loop32:
                do {
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ARRAY_INITIALIZER||LA32_0==EXPR) ) {
                        alt32=1;
                    }


                    switch (alt32) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer979);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop32;
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
            if ( state.backtracking>0 ) { memoize(input, 21, arrayInitializer_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:386:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final ShadowVariablesParser.throwsClause_return throwsClause() throws RecognitionException {
        ShadowVariablesParser.throwsClause_return retval = new ShadowVariablesParser.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:387:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:387:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1001); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:387:25: ( qualifiedIdentifier )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==DOT||LA33_0==IDENT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1003);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, throwsClause_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:390:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final ShadowVariablesParser.modifierList_return modifierList() throws RecognitionException {
        ShadowVariablesParser.modifierList_return retval = new ShadowVariablesParser.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:391:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:391:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1025); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:391:25: ( modifier )*
                loop34:
                do {
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==AT||LA34_0==ABSTRACT||LA34_0==FINAL||LA34_0==NATIVE||(LA34_0>=PRIVATE && LA34_0<=PUBLIC)||(LA34_0>=STATIC && LA34_0<=STRICTFP)||LA34_0==SYNCHRONIZED||LA34_0==TRANSIENT||LA34_0==VOLATILE) ) {
                        alt34=1;
                    }


                    switch (alt34) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1027);
                	    modifier();

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
            if ( state.backtracking>0 ) { memoize(input, 23, modifierList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:394:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final ShadowVariablesParser.modifier_return modifier() throws RecognitionException {
        ShadowVariablesParser.modifier_return retval = new ShadowVariablesParser.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:395:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt35=11;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:395:9: PUBLIC
                    {
                    match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1048); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:396:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1058); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:397:9: PRIVATE
                    {
                    match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isPrivate = true; 
                    }

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:398:9: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_modifier1080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isStatic = true; 
                    }

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:399:9: ABSTRACT
                    {
                    match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1092); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:400:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1102); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:401:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1112); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:402:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1122); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:403:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1132); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:404:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1142); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:405:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1152);
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
            if ( state.backtracking>0 ) { memoize(input, 24, modifier_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:408:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final ShadowVariablesParser.localModifierList_return localModifierList() throws RecognitionException {
        ShadowVariablesParser.localModifierList_return retval = new ShadowVariablesParser.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:409:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:409:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1172); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:409:31: ( localModifier )*
                loop36:
                do {
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==AT||LA36_0==FINAL) ) {
                        alt36=1;
                    }


                    switch (alt36) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1174);
                	    localModifier();

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
            if ( state.backtracking>0 ) { memoize(input, 25, localModifierList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:412:1: localModifier : ( FINAL | annotation );
    public final ShadowVariablesParser.localModifier_return localModifier() throws RecognitionException {
        ShadowVariablesParser.localModifier_return retval = new ShadowVariablesParser.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:413:5: ( FINAL | annotation )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==FINAL) ) {
                alt37=1;
            }
            else if ( (LA37_0==AT) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:413:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       if (!VariableDeclaration_stack.empty()) ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isFinal = true; 
                    }

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:414:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1207);
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
            if ( state.backtracking>0 ) { memoize(input, 26, localModifier_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:417:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final ShadowVariablesParser.type_return type() throws RecognitionException {
        ShadowVariablesParser.type_return retval = new ShadowVariablesParser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1227); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:16: ( primitiveType | qualifiedTypeIdent )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==BOOLEAN||LA38_0==BYTE||LA38_0==CHAR||LA38_0==DOUBLE||LA38_0==FLOAT||(LA38_0>=INT && LA38_0<=LONG)||LA38_0==SHORT) ) {
                alt38=1;
            }
            else if ( (LA38_0==QUALIFIED_TYPE_IDENT) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1230);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1234);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:418:53: ( arrayDeclaratorList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ARRAY_DECLARATOR_LIST) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1237);
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
            if ( state.backtracking>0 ) { memoize(input, 27, type_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:421:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final ShadowVariablesParser.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        ShadowVariablesParser.qualifiedTypeIdent_return retval = new ShadowVariablesParser.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:422:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:422:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1259); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:422:32: ( typeIdent )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==IDENT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1261);
            	    typeIdent();

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
            if ( state.backtracking>0 ) { memoize(input, 28, qualifiedTypeIdent_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:425:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final ShadowVariablesParser.typeIdent_return typeIdent() throws RecognitionException {
        ShadowVariablesParser.typeIdent_return retval = new ShadowVariablesParser.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:426:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:426:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_typeIdent1284); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:426:17: ( genericTypeArgumentList )?
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt41=1;
                }
                switch (alt41) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1286);
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
            if ( state.backtracking>0 ) { memoize(input, 29, typeIdent_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:429:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final ShadowVariablesParser.primitiveType_return primitiveType() throws RecognitionException {
        ShadowVariablesParser.primitiveType_return retval = new ShadowVariablesParser.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:430:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:
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
            if ( state.backtracking>0 ) { memoize(input, 30, primitiveType_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:440:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final ShadowVariablesParser.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        ShadowVariablesParser.genericTypeArgumentList_return retval = new ShadowVariablesParser.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:441:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:441:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1397); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:441:33: ( genericTypeArgument )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==QUESTION||LA42_0==TYPE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1399);
            	    genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, genericTypeArgumentList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:444:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final ShadowVariablesParser.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        ShadowVariablesParser.genericTypeArgument_return retval = new ShadowVariablesParser.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:445:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==TYPE) ) {
                alt44=1;
            }
            else if ( (LA44_0==QUESTION) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:445:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument1424);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:446:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1435); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:446:20: ( genericWildcardBoundType )?
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==EXTENDS||LA43_0==SUPER) ) {
                            alt43=1;
                        }
                        switch (alt43) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1437);
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
            if ( state.backtracking>0 ) { memoize(input, 32, genericTypeArgument_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:449:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final ShadowVariablesParser.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        ShadowVariablesParser.genericWildcardBoundType_return retval = new ShadowVariablesParser.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:450:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==EXTENDS) ) {
                alt45=1;
            }
            else if ( (LA45_0==SUPER) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:450:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1577); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1579);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:451:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1591); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1593);
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
            if ( state.backtracking>0 ) { memoize(input, 33, genericWildcardBoundType_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:454:1: formalParameterList : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final ShadowVariablesParser.formalParameterList_return formalParameterList() throws RecognitionException {
        ShadowVariablesParser.formalParameterList_return retval = new ShadowVariablesParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:455:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:455:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1614); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:455:29: ( formalParameterStandardDecl )*
                loop46:
                do {
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==FORMAL_PARAM_STD_DECL) ) {
                        alt46=1;
                    }


                    switch (alt46) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1616);
                	    formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop46;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:455:58: ( formalParameterVarargDecl )?
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt47=1;
                }
                switch (alt47) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1619);
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
            if ( state.backtracking>0 ) { memoize(input, 34, formalParameterList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:458:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final ShadowVariablesParser.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        ShadowVariablesParser.formalParameterStandardDecl_return retval = new ShadowVariablesParser.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId2 = null;

        ShadowVariablesParser.type_return type3 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:459:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:459:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1646); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1648);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1650);
            type3=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1652);
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
            if ( state.backtracking>0 ) { memoize(input, 35, formalParameterStandardDecl_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:471:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final ShadowVariablesParser.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        ShadowVariablesParser.formalParameterVarargDecl_return retval = new ShadowVariablesParser.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId4 = null;

        ShadowVariablesParser.type_return type5 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:472:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:472:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1687); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl1689);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl1691);
            type5=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1693);
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
            if ( state.backtracking>0 ) { memoize(input, 36, formalParameterVarargDecl_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:484:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final ShadowVariablesParser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        ShadowVariablesParser.qualifiedIdentifier_return retval = new ShadowVariablesParser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:485:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                alt48=1;
            }
            else if ( (LA48_0==DOT) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:485:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1727); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:486:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier1738); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1740);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier1742); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 37, qualifiedIdentifier_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:491:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final ShadowVariablesParser.annotationList_return annotationList() throws RecognitionException {
        ShadowVariablesParser.annotationList_return retval = new ShadowVariablesParser.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:492:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:492:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList1769); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:492:27: ( annotation )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList1771);
                	    annotation();

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
            if ( state.backtracking>0 ) { memoize(input, 38, annotationList_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:495:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final ShadowVariablesParser.annotation_return annotation() throws RecognitionException {
        ShadowVariablesParser.annotation_return retval = new ShadowVariablesParser.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:496:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:496:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation1793); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation1795);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:496:34: ( annotationInit )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ANNOTATION_INIT_BLOCK) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation1797);
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
            if ( state.backtracking>0 ) { memoize(input, 39, annotation_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:499:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final ShadowVariablesParser.annotationInit_return annotationInit() throws RecognitionException {
        ShadowVariablesParser.annotationInit_return retval = new ShadowVariablesParser.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:500:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:500:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1823); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit1825);
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
            if ( state.backtracking>0 ) { memoize(input, 40, annotationInit_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:503:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final ShadowVariablesParser.annotationInitializers_return annotationInitializers() throws RecognitionException {
        ShadowVariablesParser.annotationInitializers_return retval = new ShadowVariablesParser.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:504:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt52=1;
            }
            else if ( (LA52_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:504:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1846); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:504:36: ( annotationInitializer )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==IDENT) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers1848);
                    	    annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:505:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1861); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers1863);
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
            if ( state.backtracking>0 ) { memoize(input, 41, annotationInitializers_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:508:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final ShadowVariablesParser.annotationInitializer_return annotationInitializer() throws RecognitionException {
        ShadowVariablesParser.annotationInitializer_return retval = new ShadowVariablesParser.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:509:5: ( ^( IDENT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:509:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer1888); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer1890);
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
            if ( state.backtracking>0 ) { memoize(input, 42, annotationInitializer_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:512:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final ShadowVariablesParser.annotationElementValue_return annotationElementValue() throws RecognitionException {
        ShadowVariablesParser.annotationElementValue_return retval = new ShadowVariablesParser.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:513:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt54=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt54=1;
                }
                break;
            case AT:
                {
                alt54=2;
                }
                break;
            case EXPR:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:513:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1915); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:513:41: ( annotationElementValue )*
                        loop53:
                        do {
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==AT||LA53_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA53_0==EXPR) ) {
                                alt53=1;
                            }


                            switch (alt53) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue1917);
                        	    annotationElementValue();

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
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:514:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue1929);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:515:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue1939);
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
            if ( state.backtracking>0 ) { memoize(input, 43, annotationElementValue_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:518:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final ShadowVariablesParser.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        ShadowVariablesParser.annotationTopLevelScope_return retval = new ShadowVariablesParser.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:519:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:519:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope1963); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:519:38: ( annotationScopeDeclarations )*
                loop55:
                do {
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==AT||LA55_0==CLASS||LA55_0==ENUM||LA55_0==INTERFACE||LA55_0==ANNOTATION_METHOD_DECL||LA55_0==VAR_DECLARATION) ) {
                        alt55=1;
                    }


                    switch (alt55) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope1965);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop55;
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
            if ( state.backtracking>0 ) { memoize(input, 44, annotationTopLevelScope_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:522:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final ShadowVariablesParser.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        ShadowVariablesParser.annotationScopeDeclarations_return retval = new ShadowVariablesParser.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:523:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt57=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt57=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt57=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:523:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations1991); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations1993);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations1995);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations1997); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:523:58: ( annotationDefaultValue )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==DEFAULT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations1999);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:524:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2012); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2014);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2016);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2018);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:525:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2029);
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
            if ( state.backtracking>0 ) { memoize(input, 45, annotationScopeDeclarations_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:528:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final ShadowVariablesParser.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        ShadowVariablesParser.annotationDefaultValue_return retval = new ShadowVariablesParser.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:529:5: ( ^( DEFAULT annotationElementValue ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:529:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2053); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2055);
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
            if ( state.backtracking>0 ) { memoize(input, 46, annotationDefaultValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationDefaultValue"

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:534:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) ;
    public final ShadowVariablesParser.block_return block() throws RecognitionException {
        block_stack.push(new block_scope());
        ShadowVariablesParser.block_return retval = new ShadowVariablesParser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();

        		((block_scope)block_stack.peek()).localVariables = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:541:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:541:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2089); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:541:23: ( blockStatement )*
                loop58:
                do {
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==AT||LA58_0==SEMI||LA58_0==ASSERT||LA58_0==BREAK||(LA58_0>=CLASS && LA58_0<=CONTINUE)||LA58_0==DO||LA58_0==ENUM||(LA58_0>=FOR && LA58_0<=IF)||LA58_0==INTERFACE||LA58_0==RETURN||(LA58_0>=SWITCH && LA58_0<=SYNCHRONIZED)||LA58_0==THROW||LA58_0==TRY||LA58_0==WHILE||LA58_0==BLOCK_SCOPE||LA58_0==EXPR||LA58_0==FOR_EACH||LA58_0==LABELED_STATEMENT||LA58_0==VAR_DECLARATION) ) {
                        alt58=1;
                    }


                    switch (alt58) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2091);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop58;
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
            if ( state.backtracking>0 ) { memoize(input, 47, block_StartIndex); }
            block_stack.pop();
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:544:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final ShadowVariablesParser.blockStatement_return blockStatement() throws RecognitionException {
        ShadowVariablesParser.blockStatement_return retval = new ShadowVariablesParser.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:545:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt59=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt59=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt59=2;
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
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:545:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2116);
                    localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:546:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2126);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:547:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2136);
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
            if ( state.backtracking>0 ) { memoize(input, 48, blockStatement_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:550:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final ShadowVariablesParser.statement_return statement() throws RecognitionException {
        ShadowVariablesParser.statement_return retval = new ShadowVariablesParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:551:5: ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt66=17;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:551:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2163);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:552:9: ^( ASSERT expression ( expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2174); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2176);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:552:29: ( expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==EXPR) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2178);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:553:9: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement2190);
                    ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:554:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement2201); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement2203);
                    forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement2205);
                    forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement2207);
                    forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2209);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:555:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2221); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement2223);
                    localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement2225);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2227); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2229);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2231);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:556:9: ^( WHILE parenthesizedExpression statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement2244); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2246);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2248);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:557:9: ^( DO statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement2260); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2262);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2264);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:558:9: ^( TRY block ( catches )? ( block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement2276); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2278);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:558:21: ( catches )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==CATCH_CLAUSE_LIST) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement2280);
                            catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:558:30: ( block )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==BLOCK_SCOPE) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_statement2283);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:559:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement2298); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2300);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2302);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:560:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2314); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2316);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement2318);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:561:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement2330); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:561:18: ( expression )?
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==EXPR) ) {
                            alt63=1;
                        }
                        switch (alt63) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement2332);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:562:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement2345); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2347);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:563:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement2359); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:563:17: ( IDENT )?
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==IDENT) ) {
                            alt64=1;
                        }
                        switch (alt64) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2361); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:564:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2374); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:564:20: ( IDENT )?
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==IDENT) ) {
                            alt65=1;
                        }
                        switch (alt65) {
                            case 1 :
                                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: IDENT
                                {
                                match(input,IDENT,FOLLOW_IDENT_in_statement2376); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:565:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2389); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement2391); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2393);
                    statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:566:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement2404);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:567:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement2414); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, statement_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:570:1: ifStatement : ^( IF parenthesizedExpression statement ( statement )? ) ;
    public final ShadowVariablesParser.ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_stack.push(new ifStatement_scope());
        ShadowVariablesParser.ifStatement_return retval = new ShadowVariablesParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:574:5: ( ^( IF parenthesizedExpression statement ( statement )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:575:9: ^( IF parenthesizedExpression statement ( statement )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement2449); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_parenthesizedExpression_in_ifStatement2451);
            parenthesizedExpression();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_statement_in_ifStatement2453);
            statement();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:575:48: ( statement )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==SEMI||LA67_0==ASSERT||LA67_0==BREAK||LA67_0==CONTINUE||LA67_0==DO||(LA67_0>=FOR && LA67_0<=IF)||LA67_0==RETURN||(LA67_0>=SWITCH && LA67_0<=SYNCHRONIZED)||LA67_0==THROW||LA67_0==TRY||LA67_0==WHILE||LA67_0==BLOCK_SCOPE||LA67_0==EXPR||LA67_0==FOR_EACH||LA67_0==LABELED_STATEMENT) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: statement
                    {
                    pushFollow(FOLLOW_statement_in_ifStatement2455);
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
            if ( state.backtracking>0 ) { memoize(input, 50, ifStatement_StartIndex); }
            ifStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class catches_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catches"
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:578:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final ShadowVariablesParser.catches_return catches() throws RecognitionException {
        ShadowVariablesParser.catches_return retval = new ShadowVariablesParser.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:579:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:579:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2477); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:579:29: ( catchClause )+
            int cnt68=0;
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==CATCH) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches2479);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt68 >= 1 ) break loop68;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, catches_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:582:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final ShadowVariablesParser.catchClause_return catchClause() throws RecognitionException {
        ShadowVariablesParser.catchClause_return retval = new ShadowVariablesParser.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:583:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:583:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause2505); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2507);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause2509);
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
            if ( state.backtracking>0 ) { memoize(input, 52, catchClause_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:586:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final ShadowVariablesParser.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        ShadowVariablesParser.switchBlockLabels_return retval = new ShadowVariablesParser.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2530); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:35: ( switchCaseLabel )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==CASE) ) {
                        int LA69_2 = input.LA(2);

                        if ( (synpred110_ShadowVariablesParser()) ) {
                            alt69=1;
                        }


                    }


                    switch (alt69) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2532);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:52: ( switchDefaultLabel )?
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==DEFAULT) ) {
                    alt70=1;
                }
                switch (alt70) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2535);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:72: ( switchCaseLabel )*
                loop71:
                do {
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==CASE) ) {
                        alt71=1;
                    }


                    switch (alt71) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2538);
                	    switchCaseLabel();

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
            if ( state.backtracking>0 ) { memoize(input, 53, switchBlockLabels_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:590:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final ShadowVariablesParser.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        ShadowVariablesParser.switchCaseLabel_return retval = new ShadowVariablesParser.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:591:5: ( ^( CASE expression ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:591:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2568); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel2570);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:591:27: ( blockStatement )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==AT||LA72_0==SEMI||LA72_0==ASSERT||LA72_0==BREAK||(LA72_0>=CLASS && LA72_0<=CONTINUE)||LA72_0==DO||LA72_0==ENUM||(LA72_0>=FOR && LA72_0<=IF)||LA72_0==INTERFACE||LA72_0==RETURN||(LA72_0>=SWITCH && LA72_0<=SYNCHRONIZED)||LA72_0==THROW||LA72_0==TRY||LA72_0==WHILE||LA72_0==BLOCK_SCOPE||LA72_0==EXPR||LA72_0==FOR_EACH||LA72_0==LABELED_STATEMENT||LA72_0==VAR_DECLARATION) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2572);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop72;
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
            if ( state.backtracking>0 ) { memoize(input, 54, switchCaseLabel_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:594:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final ShadowVariablesParser.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        ShadowVariablesParser.switchDefaultLabel_return retval = new ShadowVariablesParser.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:595:5: ( ^( DEFAULT ( blockStatement )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:595:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2598); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:595:19: ( blockStatement )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==AT||LA73_0==SEMI||LA73_0==ASSERT||LA73_0==BREAK||(LA73_0>=CLASS && LA73_0<=CONTINUE)||LA73_0==DO||LA73_0==ENUM||(LA73_0>=FOR && LA73_0<=IF)||LA73_0==INTERFACE||LA73_0==RETURN||(LA73_0>=SWITCH && LA73_0<=SYNCHRONIZED)||LA73_0==THROW||LA73_0==TRY||LA73_0==WHILE||LA73_0==BLOCK_SCOPE||LA73_0==EXPR||LA73_0==FOR_EACH||LA73_0==LABELED_STATEMENT||LA73_0==VAR_DECLARATION) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2600);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop73;
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
            if ( state.backtracking>0 ) { memoize(input, 55, switchDefaultLabel_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:598:1: forInit : ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) ;
    public final ShadowVariablesParser.forInit_return forInit() throws RecognitionException {
        ShadowVariablesParser.forInit_return retval = new ShadowVariablesParser.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:5: ( ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:9: ^( FOR_INIT ( localVariableDeclaration | ( expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit2626); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:20: ( localVariableDeclaration | ( expression )* )?
                int alt75=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt75=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt75=2;
                        }
                        break;
                    case UP:
                        {
                        int LA75_3 = input.LA(2);

                        if ( (synpred117_ShadowVariablesParser()) ) {
                            alt75=2;
                        }
                        }
                        break;
                }

                switch (alt75) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:21: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit2629);
                        localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:48: ( expression )*
                        {
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:48: ( expression )*
                        loop74:
                        do {
                            int alt74=2;
                            int LA74_0 = input.LA(1);

                            if ( (LA74_0==EXPR) ) {
                                alt74=1;
                            }


                            switch (alt74) {
                        	case 1 :
                        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit2633);
                        	    expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop74;
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
            if ( state.backtracking>0 ) { memoize(input, 56, forInit_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:602:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final ShadowVariablesParser.forCondition_return forCondition() throws RecognitionException {
        ShadowVariablesParser.forCondition_return retval = new ShadowVariablesParser.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:603:5: ( ^( FOR_CONDITION ( expression )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:603:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition2661); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:603:25: ( expression )?
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==EXPR) ) {
                    alt76=1;
                }
                switch (alt76) {
                    case 1 :
                        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition2663);
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
            if ( state.backtracking>0 ) { memoize(input, 57, forCondition_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:606:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final ShadowVariablesParser.forUpdater_return forUpdater() throws RecognitionException {
        ShadowVariablesParser.forUpdater_return retval = new ShadowVariablesParser.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:607:5: ( ^( FOR_UPDATE ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:607:9: ^( FOR_UPDATE ( expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater2689); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:607:22: ( expression )*
                loop77:
                do {
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==EXPR) ) {
                        alt77=1;
                    }


                    switch (alt77) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater2691);
                	    expression();

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
            if ( state.backtracking>0 ) { memoize(input, 58, forUpdater_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdater"

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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:612:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final ShadowVariablesParser.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        parenthesizedExpression_stack.push(new parenthesizedExpression_scope());
        ShadowVariablesParser.parenthesizedExpression_return retval = new ShadowVariablesParser.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();

        		((parenthesizedExpression_scope)parenthesizedExpression_stack.peek()).shouldReturnValue =true;		
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:619:5: ( ^( PARENTESIZED_EXPR expression ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:619:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2730); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression2732);
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
            if ( state.backtracking>0 ) { memoize(input, 59, parenthesizedExpression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:622:1: expression : ^( EXPR expr ) ;
    public final ShadowVariablesParser.expression_return expression() throws RecognitionException {
        ShadowVariablesParser.expression_return retval = new ShadowVariablesParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:623:5: ( ^( EXPR expr ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:623:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression2757); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression2759);
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
            if ( state.backtracking>0 ) { memoize(input, 60, expression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:647:1: assignExpression : ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) ) ;
    public final ShadowVariablesParser.assignExpression_return assignExpression() throws RecognitionException {
        assignExpression_stack.push(new assignExpression_scope());
        ShadowVariablesParser.assignExpression_return retval = new ShadowVariablesParser.assignExpression_return();
        retval.start = input.LT(1);
        int assignExpression_StartIndex = input.index();
        ShadowVariablesParser.expr_return variable = null;

        ShadowVariablesParser.expr_return value = null;



        		((assignExpression_scope)assignExpression_stack.peek()).template = "assignSetValue";
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:655:2: ( ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:656:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:656:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )
            int alt78=16;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:657:2: ^( ASSIGN variable= expr value= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_assignExpression2795); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2799);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2803);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:659:9: ^( PLUS_ASSIGN variable= expr value= expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_assignExpression2820); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2824);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2828);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:661:9: ^( MINUS_ASSIGN variable= expr value= expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_assignExpression2845); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2849);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2853);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:663:9: ^( STAR_ASSIGN variable= expr value= expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_assignExpression2870); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2874);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2878);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:665:9: ^( DIV_ASSIGN variable= expr value= expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_assignExpression2895); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2899);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2903);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:667:9: ^( AND_ASSIGN variable= expr value= expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_assignExpression2920); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2924);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2928);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:669:9: ^( OR_ASSIGN variable= expr value= expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_assignExpression2945); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2949);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2953);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:671:9: ^( XOR_ASSIGN variable= expr value= expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_assignExpression2970); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2974);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2978);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:673:9: ^( MOD_ASSIGN variable= expr value= expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_assignExpression2995); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression2999);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3003);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:675:9: ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression3020); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3024);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3028);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:677:9: ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression3045); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3049);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3053);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:679:9: ^( SHIFT_LEFT_ASSIGN variable= expr value= expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression3070); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3074);
                    variable=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3078);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:681:9: ^( PRE_INC variable= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_assignExpression3095); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3099);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:684:9: ^( PRE_DEC variable= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_assignExpression3163); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3167);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:687:9: ^( POST_INC variable= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_assignExpression3231); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3235);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:690:9: ^( POST_DEC variable= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_assignExpression3299); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_assignExpression3303);
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
            if ( state.backtracking>0 ) { memoize(input, 61, assignExpression_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:698:1: expr returns [String ident] : ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression );
    public final ShadowVariablesParser.expr_return expr() throws RecognitionException {
        ShadowVariablesParser.expr_return retval = new ShadowVariablesParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        ShadowVariablesParser.primaryExpression_return e = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:699:5: ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression )
            int alt79=28;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:699:9: assignExpression
                    {
                    pushFollow(FOLLOW_assignExpression_in_expr3390);
                    assignExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:700:7: ^( QUESTION expr expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr3399); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3401);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3403);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3405);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:701:9: ^( LOGICAL_OR expr expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3417); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3419);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3421);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:702:9: ^( LOGICAL_AND expr expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3433); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3435);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3437);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:703:9: ^( OR expr expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr3449); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3451);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3453);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:704:9: ^( XOR expr expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr3465); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3467);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3469);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:705:9: ^( AND expr expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr3481); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3483);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3485);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:706:9: ^( EQUAL expr expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr3497); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3499);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3501);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:707:9: ^( NOT_EQUAL expr expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3513); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3515);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3517);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:708:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3529); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3531);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3533);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:709:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3545); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3547);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3549);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:710:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3561); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3563);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3565);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 13 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:711:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3577); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3579);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3581);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:712:9: ^( SHIFT_RIGHT expr expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3593); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3595);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3597);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:713:9: ^( GREATER_THAN expr expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3609); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3611);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3613);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 16 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:714:9: ^( SHIFT_LEFT expr expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3625); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3627);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3629);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 17 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:715:9: ^( LESS_THAN expr expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3641); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3643);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3645);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 18 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:716:9: ^( PLUS expr expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr3657); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3659);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3661);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 19 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:717:9: ^( MINUS expr expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr3673); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3675);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3677);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 20 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:718:9: ^( STAR expr expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr3689); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3691);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3693);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 21 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:719:9: ^( DIV expr expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr3705); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3707);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3709);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:720:9: ^( MOD expr expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr3721); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3723);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3725);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 23 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:721:9: ^( UNARY_PLUS expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3737); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3739);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 24 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:722:9: ^( UNARY_MINUS expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3751); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3753);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 25 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:723:9: ^( NOT expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr3765); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3767);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 26 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:724:9: ^( LOGICAL_NOT expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3779); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3781);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 27 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:725:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3793); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr3795);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3797);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 28 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:726:9: e= primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr3810);
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
            if ( state.backtracking>0 ) { memoize(input, 62, expr_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:733:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:740:5: ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt83=11;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:740:9: ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression3855); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:741:13: (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt81=3;
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
                        alt81=1;
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
                        alt81=2;
                        }
                        break;
                    case VOID:
                        {
                        alt81=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }

                    switch (alt81) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:741:17: p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3875);
                            p=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                              retval.ident = ((p!=null?p.ident:null)==null?"":((p!=null?p.ident:null)+"."));
                            }
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:742:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt80=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt80=1;
                                }
                                break;
                            case THIS:
                                {
                                alt80=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt80=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt80=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt80=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 80, 0, input);

                                throw nvae;
                            }

                            switch (alt80) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:742:21: IDENT
                                    {
                                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3899); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += (IDENT6!=null?IDENT6.getText():null); 
                                    }

                                    }
                                    break;
                                case 2 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:743:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression3923); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "this"; 
                                    }

                                    }
                                    break;
                                case 3 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:744:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3947); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                       retval.ident += "super"; 
                                    }

                                    }
                                    break;
                                case 4 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:745:21: innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3971);
                                    innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;
                                case 5 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:746:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3993); if (state.failed) return retval;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:748:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression4029);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression4031); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:749:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression4049); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression4051); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:752:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression4085);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:753:9: IDENT
                    {
                    IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = (IDENT7!=null?IDENT7.getText():null); 
                    }

                    }
                    break;
                case 4 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:754:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression4110); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4112);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:754:41: ( genericTypeArgumentList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression4114);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((primaryExpression_scope)primaryExpression_stack.peek()).shouldReturnValue = true;
                    }
                    pushFollow(FOLLOW_arguments_in_primaryExpression4119);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:755:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression4132);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:756:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4143); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4145);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression4147);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:757:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression4158);
                    literal();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:758:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression4168);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:759:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression4178); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.ident = "this"; 
                    }

                    }
                    break;
                case 10 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:760:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4190);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:761:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4200); if (state.failed) return retval;
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
            if ( state.backtracking>0 ) { memoize(input, 63, primaryExpression_StartIndex); }
            primaryExpression_stack.pop();
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:764:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final ShadowVariablesParser.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        ShadowVariablesParser.explicitConstructorCall_return retval = new ShadowVariablesParser.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:765:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==THIS_CONSTRUCTOR_CALL) ) {
                alt87=1;
            }
            else if ( (LA87_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:765:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4226); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:765:33: ( genericTypeArgumentList )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4228);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4231);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:766:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4243); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:766:34: ( primaryExpression )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==DOT||LA85_0==FALSE||LA85_0==NULL||LA85_0==SUPER||LA85_0==THIS||LA85_0==TRUE||LA85_0==ARRAY_DECLARATOR||LA85_0==ARRAY_ELEMENT_ACCESS||LA85_0==CLASS_CONSTRUCTOR_CALL||LA85_0==METHOD_CALL||LA85_0==PARENTESIZED_EXPR||(LA85_0>=STATIC_ARRAY_CREATOR && LA85_0<=SUPER_CONSTRUCTOR_CALL)||LA85_0==THIS_CONSTRUCTOR_CALL||(LA85_0>=IDENT && LA85_0<=STRING_LITERAL)) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4245);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:766:53: ( genericTypeArgumentList )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4248);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4251);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:769:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final ShadowVariablesParser.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        ShadowVariablesParser.arrayTypeDeclarator_return retval = new ShadowVariablesParser.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4272); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt88=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt88=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt88=2;
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
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4275);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4279);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:770:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4283);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:773:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final ShadowVariablesParser.newExpression_return newExpression() throws RecognitionException {
        ShadowVariablesParser.newExpression_return retval = new ShadowVariablesParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:774:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==STATIC_ARRAY_CREATOR) ) {
                alt93=1;
            }
            else if ( (LA93_0==CLASS_CONSTRUCTOR_CALL) ) {
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:774:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4307); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:775:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==BOOLEAN||LA90_0==BYTE||LA90_0==CHAR||LA90_0==DOUBLE||LA90_0==FLOAT||(LA90_0>=INT && LA90_0<=LONG)||LA90_0==SHORT) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==GENERIC_TYPE_ARG_LIST||LA90_0==QUALIFIED_TYPE_IDENT) ) {
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
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:775:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression4325);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4327);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:776:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:776:17: ( genericTypeArgumentList )?
                            int alt89=2;
                            int LA89_0 = input.LA(1);

                            if ( (LA89_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt89=1;
                            }
                            switch (alt89) {
                                case 1 :
                                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4345);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4348);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4350);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:779:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4385); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:779:34: ( genericTypeArgumentList )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4387);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4390);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression4392);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:779:88: ( classTopLevelScope )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4394);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:782:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final ShadowVariablesParser.innerNewExpression_return innerNewExpression() throws RecognitionException {
        ShadowVariablesParser.innerNewExpression_return retval = new ShadowVariablesParser.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:783:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:783:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4417); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:783:34: ( genericTypeArgumentList )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4419);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4422); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression4424);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:783:75: ( classTopLevelScope )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4426);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:786:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final ShadowVariablesParser.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        ShadowVariablesParser.newArrayConstruction_return retval = new ShadowVariablesParser.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:787:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==ARRAY_DECLARATOR_LIST) ) {
                alt98=1;
            }
            else if ( (LA98_0==EXPR) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:787:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4451);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4453);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:788:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:788:9: ( expression )+
                    int cnt96=0;
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==EXPR) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4463);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt96 >= 1 ) break loop96;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(96, input);
                                throw eee;
                        }
                        cnt96++;
                    } while (true);

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:788:21: ( arrayDeclaratorList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==ARRAY_DECLARATOR_LIST) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4466);
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:791:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final ShadowVariablesParser.arguments_return arguments() throws RecognitionException {
        ShadowVariablesParser.arguments_return retval = new ShadowVariablesParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:792:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:792:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4487); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:792:25: ( expression )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==EXPR) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments4489);
                	    expression();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop99;
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:795:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final ShadowVariablesParser.literal_return literal() throws RecognitionException {
        ShadowVariablesParser.literal_return retval = new ShadowVariablesParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:796:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:807:1: classDeclaration : ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:828:2: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:829:3: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDeclaration4621); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_classDeclaration4623);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            match(input,IDENT,FOLLOW_IDENT_in_classDeclaration4625); if (state.failed) return retval;
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:829:30: ( genericTypeParameterList )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==GENERIC_TYPE_PARAM_LIST) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                    {
                    pushFollow(FOLLOW_genericTypeParameterList_in_classDeclaration4627);
                    genericTypeParameterList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:829:56: ( extendsClause )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==EXTENDS_CLAUSE) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: extendsClause
                    {
                    pushFollow(FOLLOW_extendsClause_in_classDeclaration4630);
                    extendsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:829:71: ( implementsClause )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IMPLEMENTS_CLAUSE) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: implementsClause
                    {
                    pushFollow(FOLLOW_implementsClause_in_classDeclaration4633);
                    implementsClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_classTopLevelScope_in_classDeclaration4636);
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
            if ( state.backtracking>0 ) { memoize(input, 71, classDeclaration_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:832:1: methodScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) );
    public final ShadowVariablesParser.methodScopeDeclarations_return methodScopeDeclarations() throws RecognitionException {
        methodScopeDeclarations_stack.push(new methodScopeDeclarations_scope());
        ShadowVariablesParser.methodScopeDeclarations_return retval = new ShadowVariablesParser.methodScopeDeclarations_return();
        retval.start = input.LT(1);
        int methodScopeDeclarations_StartIndex = input.index();

        		if (!classDeclaration_stack.isEmpty()) ((classDeclaration_scope)classDeclaration_stack.peek()).methodScopeCount++;
                        ((methodScopeDeclarations_scope)methodScopeDeclarations_stack.peek()).localVariables = new HashMap<String, Variable>();
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:847:2: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) )
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:848:3: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations4675); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4677);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:848:39: ( genericTypeParameterList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4679);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_methodScopeDeclarations4682);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations4684); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4686);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:848:96: ( arrayDeclaratorList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==ARRAY_DECLARATOR_LIST) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations4688);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:848:117: ( throwsClause )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==THROWS_CLAUSE) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4691);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:848:131: ( block )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==BLOCK_SCOPE) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations4694);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:849:4: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations4702); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4704);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:849:36: ( genericTypeParameterList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4706);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_methodScopeDeclarations4709); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4711);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:849:88: ( throwsClause )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==THROWS_CLAUSE) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4713);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:849:102: ( block )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==BLOCK_SCOPE) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_methodScopeDeclarations4716);
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
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:850:4: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations4724); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_methodScopeDeclarations4726);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:850:36: ( genericTypeParameterList )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4728);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_methodScopeDeclarations4731);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:850:82: ( throwsClause )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==THROWS_CLAUSE) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_methodScopeDeclarations4733);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_methodScopeDeclarations4736);
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
            if ( state.backtracking>0 ) { memoize(input, 72, methodScopeDeclarations_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:853:1: globalVariableDeclaration : ^( VAR_DECLARATION modifierList type variableDeclaratorList ) ;
    public final ShadowVariablesParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        VariableDeclaration_stack.push(new VariableDeclaration_scope());

        ShadowVariablesParser.globalVariableDeclaration_return retval = new ShadowVariablesParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);
        int globalVariableDeclaration_StartIndex = input.index();
        ShadowVariablesParser.type_return type8 = null;



        		((VariableDeclaration_scope)VariableDeclaration_stack.peek()).isGlobal = true;
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:861:2: ( ^( VAR_DECLARATION modifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:862:3: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration4765); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_modifierList_in_globalVariableDeclaration4771);
            modifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_globalVariableDeclaration4777);
            type8=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).type =(type8!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type8.start),
                input.getTreeAdaptor().getTokenStopIndex(type8.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_globalVariableDeclaration4784);
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
            if ( state.backtracking>0 ) { memoize(input, 73, globalVariableDeclaration_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:868:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final ShadowVariablesParser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        VariableDeclaration_stack.push(new VariableDeclaration_scope());

        ShadowVariablesParser.localVariableDeclaration_return retval = new ShadowVariablesParser.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        ShadowVariablesParser.type_return type9 = null;



        		
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:876:2: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:877:3: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration4822); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration4828);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration4834);
            type9=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((VariableDeclaration_scope)VariableDeclaration_stack.peek()).type =(type9!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(type9.start),
                input.getTreeAdaptor().getTokenStopIndex(type9.start))):null);
            }
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration4841);
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
            if ( state.backtracking>0 ) { memoize(input, 74, localVariableDeclaration_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:883:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] ) ;
    public final ShadowVariablesParser.variableDeclarator_return variableDeclarator() throws RecognitionException {
        variableDeclarator_stack.push(new variableDeclarator_scope());
        ShadowVariablesParser.variableDeclarator_return retval = new ShadowVariablesParser.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        ShadowVariablesParser.variableDeclaratorId_return variableDeclaratorId10 = null;



        		((variableDeclarator_scope)variableDeclarator_stack.peek()).var = new Variable();				
        	
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:893:2: ( ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] ) )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:893:6: ^( VAR_DECLARATOR variableDeclaratorId variableResistantInitializer[(CommonTree)$variableDeclaratorId.start] )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator4873); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator4875);
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
            pushFollow(FOLLOW_variableResistantInitializer_in_variableDeclarator4885);
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
            if ( state.backtracking>0 ) { memoize(input, 75, variableDeclarator_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:936:1: variableResistantInitializer[CommonTree varDecl] : ( variableInitializer )? ;
    public final ShadowVariablesParser.variableResistantInitializer_return variableResistantInitializer(CommonTree varDecl) throws RecognitionException {
        ShadowVariablesParser.variableResistantInitializer_return retval = new ShadowVariablesParser.variableResistantInitializer_return();
        retval.start = input.LT(1);
        int variableResistantInitializer_StartIndex = input.index();
        ShadowVariablesParser.variableInitializer_return variableInitializer11 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:940:2: ( ( variableInitializer )? )
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:941:3: ( variableInitializer )?
            {
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:941:3: ( variableInitializer )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==ARRAY_INITIALIZER||LA113_0==EXPR) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableResistantInitializer4905);
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
            if ( state.backtracking>0 ) { memoize(input, 76, variableResistantInitializer_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:970:1: classAdditionalCode[CommonTree tree] : ;
    public final ShadowVariablesParser.classAdditionalCode_return classAdditionalCode(CommonTree tree) throws RecognitionException {
        ShadowVariablesParser.classAdditionalCode_return retval = new ShadowVariablesParser.classAdditionalCode_return();
        retval.start = input.LT(1);
        int classAdditionalCode_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:974:2: ()
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:975:3: 
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
            if ( state.backtracking>0 ) { memoize(input, 77, classAdditionalCode_StartIndex); }
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
    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:1005:1: additionalImports[CommonTree tree] : ;
    public final ShadowVariablesParser.additionalImports_return additionalImports(CommonTree tree) throws RecognitionException {
        ShadowVariablesParser.additionalImports_return retval = new ShadowVariablesParser.additionalImports_return();
        retval.start = input.LT(1);
        int additionalImports_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:1006:2: ()
            // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:1007:13: 
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
            if ( state.backtracking>0 ) { memoize(input, 78, additionalImports_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additionalImports"

    // $ANTLR start synpred110_ShadowVariablesParser
    public final void synpred110_ShadowVariablesParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:35: ( switchCaseLabel )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:587:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred110_ShadowVariablesParser2532);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_ShadowVariablesParser

    // $ANTLR start synpred117_ShadowVariablesParser
    public final void synpred117_ShadowVariablesParser_fragment() throws RecognitionException {   
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:48: ( ( expression )* )
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:48: ( expression )*
        {
        // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:599:48: ( expression )*
        loop131:
        do {
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==EXPR) ) {
                alt131=1;
            }


            switch (alt131) {
        	case 1 :
        	    // D:\\work\\CESTA\\trunk\\src\\org\\cesta\\grammars\\java\\ShadowVariablesParser.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred117_ShadowVariablesParser2633);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop131;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred117_ShadowVariablesParser

    // Delegated rules

    public final boolean synpred117_ShadowVariablesParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_ShadowVariablesParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_ShadowVariablesParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_ShadowVariablesParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA35 dfa35 = new DFA35(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\14\uffff";
    static final String DFA35_minS =
        "\1\7\13\uffff";
    static final String DFA35_maxS =
        "\1\146\13\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "394:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );";
        }
    }
    static final String DFA66_eotS =
        "\22\uffff";
    static final String DFA66_eofS =
        "\22\uffff";
    static final String DFA66_minS =
        "\1\54\21\uffff";
    static final String DFA66_maxS =
        "\1\u008d\21\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21";
    static final String DFA66_specialS =
        "\22\uffff}>";
    static final String[] DFA66_transitionS = {
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

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "550:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ifStatement | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );";
        }
    }
    static final String DFA78_eotS =
        "\21\uffff";
    static final String DFA78_eofS =
        "\21\uffff";
    static final String DFA78_minS =
        "\1\5\20\uffff";
    static final String DFA78_maxS =
        "\1\u0096\20\uffff";
    static final String DFA78_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20";
    static final String DFA78_specialS =
        "\21\uffff}>";
    static final String[] DFA78_transitionS = {
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "656:5: ( ^( ASSIGN variable= expr value= expr ) | ^( PLUS_ASSIGN variable= expr value= expr ) | ^( MINUS_ASSIGN variable= expr value= expr ) | ^( STAR_ASSIGN variable= expr value= expr ) | ^( DIV_ASSIGN variable= expr value= expr ) | ^( AND_ASSIGN variable= expr value= expr ) | ^( OR_ASSIGN variable= expr value= expr ) | ^( XOR_ASSIGN variable= expr value= expr ) | ^( MOD_ASSIGN variable= expr value= expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_RIGHT_ASSIGN variable= expr value= expr ) | ^( SHIFT_LEFT_ASSIGN variable= expr value= expr ) | ^( PRE_INC variable= expr ) | ^( PRE_DEC variable= expr ) | ^( POST_INC variable= expr ) | ^( POST_DEC variable= expr ) )";
        }
    }
    static final String DFA79_eotS =
        "\35\uffff";
    static final String DFA79_eofS =
        "\35\uffff";
    static final String DFA79_minS =
        "\1\4\34\uffff";
    static final String DFA79_maxS =
        "\1\u00aa\34\uffff";
    static final String DFA79_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34";
    static final String DFA79_specialS =
        "\35\uffff}>";
    static final String[] DFA79_transitionS = {
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "698:1: expr returns [String ident] : ( assignExpression | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | e= primaryExpression );";
        }
    }
    static final String DFA83_eotS =
        "\14\uffff";
    static final String DFA83_eofS =
        "\14\uffff";
    static final String DFA83_minS =
        "\1\17\13\uffff";
    static final String DFA83_maxS =
        "\1\u00aa\13\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA83_specialS =
        "\14\uffff}>";
    static final String[] DFA83_transitionS = {
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
            return "733:1: primaryExpression returns [String ident] : ( ^( DOT (p= primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS | arrayTypeDeclarator | SUPER );";
        }
    }
 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_javaSource131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_javaSource133 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_javaSource135 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_javaSource138 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_javaSource141 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_additionalImports_in_javaSource144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration197 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration200 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_classDeclaration_in_typeDeclaration227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration266 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration268 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration287 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause328 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause359 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList391 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound445 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound447 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope471 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope474 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant502 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L});
    public static final BitSet FOLLOW_arguments_in_enumConstant504 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope540 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_classAdditionalCode_in_classTopLevelScope544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_methodScopeDeclarations_in_classScopeDeclarations592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_classScopeDeclarations602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope638 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations666 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations668 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations675 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations677 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations702 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_interfaceScopeDeclarations794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList826 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId866 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator919 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList949 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer979 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1003 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1027 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1174 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1230 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1234 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1261 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1399 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1614 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1616 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1648 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl1687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl1689 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl1693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier1738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier1740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList1769 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList1771 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation1793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation1795 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation1797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit1823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit1825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers1848 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers1861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers1863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer1888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer1890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue1915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue1917 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope1963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope1965 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations1991 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations1993 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations1997 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations1999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2012 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2014 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2053 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2055 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2091 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2176 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ifStatement_in_statement2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2207 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2223 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2227 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2229 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2246 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2248 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2278 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement2280 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2316 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2391 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement2449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_ifStatement2451 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_ifStatement2453 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_ifStatement2455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2479 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2507 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause2509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2532 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2535 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2538 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2570 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2572 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2600 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit2626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit2629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit2633 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition2661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition2663 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater2689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater2691 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression2730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression2757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression2759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_assignExpression2795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2799 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_assignExpression2820 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2824 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_assignExpression2845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2849 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_assignExpression2870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2874 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_assignExpression2895 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2899 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_assignExpression2920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2924 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_assignExpression2945 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2949 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2953 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_assignExpression2970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2974 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression2978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_assignExpression2995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression2999 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression3003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_assignExpression3020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3024 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression3028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_assignExpression3045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3049 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression3053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_assignExpression3070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3074 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_assignExpression3078 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_assignExpression3095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_assignExpression3163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_assignExpression3231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_assignExpression3299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_assignExpression3303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignExpression_in_expr3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr3399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3401 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3403 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3405 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3419 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3435 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3451 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3467 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3483 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3499 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3501 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3513 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3515 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3529 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3531 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3545 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3547 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3563 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3565 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3579 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3595 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3611 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3613 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3625 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3627 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3643 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3659 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3675 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3691 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3707 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3709 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3723 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3795 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3875 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3923 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3971 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3993 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression4029 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression4031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression4049 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression4051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression4110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4112 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression4114 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression4119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression4132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4145 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4228 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4245 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4248 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4325 = new BitSet(new long[]{0x0000000000000008L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4348 = new BitSet(new long[]{0x0000000000000008L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4390 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4392 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4422 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4424 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4426 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4451 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4463 = new BitSet(new long[]{0x000000000000000AL,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4489 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDeclaration4621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classDeclaration4623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classDeclaration4625 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classDeclaration4627 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001001L});
    public static final BitSet FOLLOW_extendsClause_in_classDeclaration4630 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_classDeclaration4633 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_classTopLevelScope_in_classDeclaration4636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_methodScopeDeclarations4675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4677 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4679 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_methodScopeDeclarations4682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations4684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4686 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_methodScopeDeclarations4688 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4691 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4694 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_methodScopeDeclarations4702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_methodScopeDeclarations4709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4711 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4713 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_methodScopeDeclarations4724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_methodScopeDeclarations4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_methodScopeDeclarations4728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_methodScopeDeclarations4731 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodScopeDeclarations4733 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_methodScopeDeclarations4736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_globalVariableDeclaration4765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_globalVariableDeclaration4771 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_globalVariableDeclaration4777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_globalVariableDeclaration4784 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration4822 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration4828 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration4834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration4841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator4873 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator4875 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableResistantInitializer_in_variableDeclarator4885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variableInitializer_in_variableResistantInitializer4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred110_ShadowVariablesParser2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred117_ShadowVariablesParser2633 = new BitSet(new long[]{0x000000000000000AL,0x4010000000000000L});

}