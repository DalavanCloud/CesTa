/**
 * This tree rewrite parser provides protection against error induction.
 * Each variable with supported type (currently byte, short, boolean) has its own
 * shadow negation copy, which is updated on each modification and checked on each
 * read access.
 **/

tree grammar ShadowVariablesParser;

options {
    superClass = AbstractTreeParser;
    backtrack = true;
    memoize = true;
    tokenVocab = Java;
    ASTLabelType = CommonTree;
    output = template;
    rewrite = true;
}

import JavaTreeParser;

// Used to detect modifiers and type for variables
scope VariableDeclaration {
    String type;
    boolean isGlobal;
    boolean isStatic;
    boolean isFinal;
    boolean isPrivate;
}

@treeparser::header {
package org.cesta.parsers.java.generated;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;
import java.util.Iterator;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
import org.cesta.parsers.java.AbstractTreeParser;
}

@treeparser::members {
	
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
			(!$parenthesizedExpression.isEmpty() && $parenthesizedExpression::shouldReturnValue) || 
			(!$primaryExpression.isEmpty() && $primaryExpression::shouldReturnValue) ||
                        // right side of assign expression
                        // in i = j+=2; we may need return value in second statement
			(!$assignExpression.isEmpty() && $assignExpression.size()>1)
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
}

// Starting point for parsing a Java file.
javaSource
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclaration* additionalImports[(CommonTree)$typeDeclaration.start])
    ;
    
typeDeclaration
    :   classDeclaration
    |   ^(INTERFACE modifierList IDENT genericTypeParameterList? extendsClause? interfaceTopLevelScope)
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
    |   ^(AT modifierList IDENT annotationTopLevelScope)
    ;
    
classTopLevelScope
    :   ^(CLASS_TOP_LEVEL_SCOPE classScopeDeclarations*) classAdditionalCode[(CommonTree)retval.start]
    ;

classScopeDeclarations
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   methodScopeDeclarations
    |   globalVariableDeclaration
    |   typeDeclaration
    ;
    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
    |   globalVariableDeclaration
    |   typeDeclaration
    ;
    
variableDeclaratorId
	:   ^(
			ident=IDENT 
			{ 
				// save variable name for use in variableDeclarator
				if (!$variableDeclarator.isEmpty()) $variableDeclarator::var.name = $ident.text; 
			}
			arrayDeclaratorList?
		)
    ;

arrayDeclaratorList
	@init {
		if (!$variableDeclarator.isEmpty()) $variableDeclarator::var.isArray = true;
	}
    :   ^(ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR*)  
    ;

modifier
    :   PUBLIC
    |   PROTECTED
    |   PRIVATE { if (!$VariableDeclaration.empty()) $VariableDeclaration::isPrivate = true; }
    |   STATIC { if (!$VariableDeclaration.empty()) $VariableDeclaration::isStatic = true; }
    |   ABSTRACT
    |   NATIVE
    |   SYNCHRONIZED
    |   TRANSIENT
    |   VOLATILE
    |   STRICTFP
    |   localModifier
    ;

localModifier
    :   FINAL { if (!$VariableDeclaration.empty()) $VariableDeclaration::isFinal = true; }
    |   annotation
    ;
    
formalParameterStandardDecl
    :   ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId)
        {
            if (!$methodScopeDeclarations.isEmpty()){
                Variable var = new Variable();
                var.name = $variableDeclaratorId.text;
                var.type = $type.text;
                var.isParameter = true;
                $methodScopeDeclarations::localVariables.put(var.name, var);
            }
        }
    ;
    
formalParameterVarargDecl
    :   ^(FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId)
        {
            if (!$methodScopeDeclarations.isEmpty()){
                Variable var = new Variable();
                var.name = $variableDeclaratorId.text;
                var.type = $type.text;
                var.isParameter = true;
                $methodScopeDeclarations::localVariables.put(var.name, var);
            }
        }
    ;

// STATEMENTS / BLOCKS

block
	scope {
		Map<String, Variable> localVariables;
	}
	@init {
		$block::localVariables = new HashMap<String, Variable>();
	}
    :   ^(BLOCK_SCOPE blockStatement*)
    ;
        
statement
    :   block
    |   ^(ASSERT expression expression?)
    |   ifStatement
    |   ^(FOR forInit forCondition forUpdater statement)
    |   ^(FOR_EACH localModifierList type IDENT expression statement) 
    |   ^(WHILE parenthesizedExpression statement)
    |   ^(DO statement parenthesizedExpression)
    |   ^(TRY block catches? block?)  // The second optional block is the optional finally block.
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression block)
    |   ^(RETURN expression?)
    |   ^(THROW expression)
    |   ^(BREAK IDENT?)
    |   ^(CONTINUE IDENT?)
    |   ^(LABELED_STATEMENT IDENT statement)
    |   expression
    |   SEMI // Empty statement.
    ;

ifStatement
    scope {
        Boolean dummy;  // we are testing only the existence of ifStatement stack
    }
    :
        ^(IF parenthesizedExpression statement statement?)
    ;
    
// EXPRESSIONS

parenthesizedExpression
	scope {
		boolean shouldReturnValue;
	}
	@init {
		$parenthesizedExpression::shouldReturnValue=true;		
	}
    :   ^(PARENTESIZED_EXPR expression)
    ;
    
expression
    :   ^(EXPR expr)
    ;

/* 
	shouldReturnValue from scope is used when templating PRE_INC a PRE_DEC with
	resistantSetValue. we want to return original value only when the expression
	is in right side of assignment, in method call, parenthesized expression etc...
	
	Example:
	
	in
	
		i++;
	
	"i++" should be converted to i=__set(i+1,ID)
	
	but in
	
		j=i++;
		method(i++);
		
	"i++" should be converted to (short)((i=__set(i+1,ID))-1)

*/
assignExpression
	scope {
		String valueText;
                String template;
	}
	@init {
		$assignExpression::template = "assignSetValue";
	}
	:
    (
	^(ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $value.text; }
    |   ^(PLUS_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"+("+$value.text+")"; }
    |   ^(MINUS_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"-("+$value.text+")"; }
    |   ^(STAR_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"*"+$value.text; }
    |   ^(DIV_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"/"+$value.text; }
    |   ^(AND_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"&"+$value.text; }
    |   ^(OR_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"|"+$value.text; }
    |   ^(XOR_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"^"+$value.text; }
    |   ^(MOD_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"\%"+$value.text; }
    |   ^(BIT_SHIFT_RIGHT_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+">>>"+$value.text; }
    |   ^(SHIFT_RIGHT_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+">>"+$value.text; }
    |   ^(SHIFT_LEFT_ASSIGN variable=expr value=expr)
			{ $assignExpression::valueText = $variable.text+"<<"+$value.text; }
    |   ^(PRE_INC variable=expr)
                        { $assignExpression::valueText = $variable.text+"+1"; }
                        { $assignExpression::template = "preIncSetValue"; }
    |   ^(PRE_DEC variable=expr)
                        { $assignExpression::valueText = $variable.text+"-1"; }
                        { $assignExpression::template = "preDecSetValue"; }
    |   ^(POST_INC variable=expr)
                        { $assignExpression::valueText = $variable.text+"+1"; }
                        { $assignExpression::template = "postIncSetValue"; }
    |   ^(POST_DEC variable=expr)
                        { $assignExpression::valueText = $variable.text+"-1"; }
                        { $assignExpression::template = "postDecSetValue"; }
    )
    {
        resistantSetValue(retval.start, $variable.ident, $assignExpression::valueText, $assignExpression::template);
    }
    ;
expr returns [String ident]
    :   assignExpression
    |	^(QUESTION expr expr expr)
    |   ^(LOGICAL_OR expr expr)
    |   ^(LOGICAL_AND expr expr)
    |   ^(OR expr expr)
    |   ^(XOR expr expr)
    |   ^(AND expr expr)
    |   ^(EQUAL expr expr)
    |   ^(NOT_EQUAL expr expr)
    |   ^(INSTANCEOF expr type)
    |   ^(LESS_OR_EQUAL expr expr)
    |   ^(GREATER_OR_EQUAL expr expr)
    |   ^(BIT_SHIFT_RIGHT expr expr)
    |   ^(SHIFT_RIGHT expr expr)
    |   ^(GREATER_THAN expr expr)
    |   ^(SHIFT_LEFT expr expr)
    |   ^(LESS_THAN expr expr)
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    |   ^(STAR expr expr)
    |   ^(DIV expr expr)
    |   ^(MOD expr expr)
    |   ^(UNARY_PLUS expr)
    |   ^(UNARY_MINUS expr)
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   e=primaryExpression 
	{
            $ident = $e.ident;
            resistantGetValue(e.start, $e.ident);
	}
    ;
    
primaryExpression returns [String ident]
	scope {
		boolean shouldReturnValue;
	}
	@init {
		$primaryExpression::shouldReturnValue = false;		
	}
    :   ^(  DOT
            (   p=primaryExpression {$ident = ($p.ident==null?"":($p.ident+"."));}
                (   IDENT { $ident += $IDENT.text; }
                |   THIS { $ident += "this"; }
                |   SUPER { $ident += "super"; }
                |   innerNewExpression
                |   CLASS
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression
    |   IDENT { $ident = $IDENT.text; }	/* we are interested in simple ident */
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? {$primaryExpression::shouldReturnValue = true;} arguments) /* we want to return value of variables in arguments */
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS { $ident = "this"; }
    |   arrayTypeDeclarator
    |   SUPER { $ident = "super"; }
    ;

/**
 *	Whole class
 */
classDeclaration
	scope {
		// all variables in class
		Vector<Variable> variables;	
		// only global variables
		Map<String, Variable> globalVariables;
		// only variables, that should be transformed
		Map<VariableGroup, Set<Variable>> variablesByGroups;		
		// counter for methods in class
		int methodScopeCount;
	}
	@init {
		$classDeclaration::variables = new Vector<Variable>();		
		$classDeclaration::globalVariables = new HashMap<String, Variable>();
		$classDeclaration::variablesByGroups = new HashMap<VariableGroup, Set<Variable>>();
		
		$classDeclaration::methodScopeCount = 0;
	}
	:
		^(CLASS modifierList IDENT genericTypeParameterList? extendsClause? implementsClause? classTopLevelScope)
	;
    
/**
 *	We are counting methods, because local variables from different blocks
 *      are grouped together and use the same check arrays.
 *
 *      We also need to detect formal parameters, to be able to determine which
 *      variables are really unknown and user should be noticed.
 */
methodScopeDeclarations
        scope {
		Map<String, Variable> localVariables;
	}
	@init {
		if (!$classDeclaration.isEmpty()) $classDeclaration::methodScopeCount++;
                $methodScopeDeclarations::localVariables = new HashMap<String, Variable>();
	}
	:
		^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
	|	^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
	|	^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
	;

/**
 *	Global variables
 */
globalVariableDeclaration
	scope VariableDeclaration;
	@init {
		$VariableDeclaration::isGlobal = true;
	}
	:
		^(VAR_DECLARATION 
			modifierList 
			type {$VariableDeclaration::type=$type.text;}
			variableDeclaratorList
		)
	;
/**
 *	Local variables
 */
localVariableDeclaration
        scope VariableDeclaration;
	@init {
		
	}
	:
		^(VAR_DECLARATION 
			localModifierList 
			type {$VariableDeclaration::type=$type.text;}
			variableDeclaratorList
		)		
	;
/**
 *	Variable declaration
 */
variableDeclarator
	scope {
		Variable var;
	}
	@init {
		$variableDeclarator::var = new Variable();				
	}
	:   ^(VAR_DECLARATOR variableDeclaratorId 
			{if (!$classDeclaration.isEmpty() && !$VariableDeclaration.isEmpty()){	// if we are in class
				Variable var = $variableDeclarator::var;
				var.type = $VariableDeclaration::type;
				var.isStatic = $VariableDeclaration::isStatic;
				var.isGlobal = $VariableDeclaration::isGlobal;
				var.isFinal = $VariableDeclaration::isFinal;
				var.isPrivate = $VariableDeclaration::isPrivate;
				
				// in variablesByGroups are only supported variables
				if (var.isResistanceSupported()){
					if (!$classDeclaration::variablesByGroups.containsKey(var.getGroup()))
						$classDeclaration::variablesByGroups.put(var.getGroup(), new HashSet<Variable>());
						
					Set<Variable> groupVariables = $classDeclaration::variablesByGroups.get(var.getGroup());
					if (var.isGlobal || !getParamB("useMethodId")){
                                            var.id = groupVariables.size();
                                        } else {
                                                var.methodId = $classDeclaration::methodScopeCount;
						int count = 0;
						for (Variable v:groupVariables)
							if (v.methodId == var.methodId) count++;
						var.id = count;
					}
					groupVariables.add(var);
				}
				
				$classDeclaration::variables.add(var);
				
				// we are in block					
				if (!$block.isEmpty())
					$block::localVariables.put(var.name, var);
				
				// global variable
				if (var.isGlobal) {
					$classDeclaration::globalVariables.put(var.name, var);
                                        if (var.isResistanceSupported() && !var.isPrivate){
                                            getLogger().warning("Variable "+var.name+" is not private, encapsulation can be broken");
                                        }
				}
			}}
		variableResistantInitializer[(CommonTree)$variableDeclaratorId.start])
    ;
/**
 *	Adds fault resistant initializer
 */
variableResistantInitializer[CommonTree varDecl]
	:
		variableInitializer?
		
		{if (!$variableDeclarator.isEmpty() && $variableDeclarator::var.isResistanceSupported()){
			
			getLogger().finer("Initializer for "+$variableDeclarator::var.toString()+" with value \""+$variableInitializer.text+"\"");
			
                        if ($variableInitializer.text!=null) {
                            StringTemplate st = getTemplateLib().getInstanceOf("resistantSetValue");
                            st.setAttribute("variable", $variableDeclarator::var);
                            st.setAttribute("value", $variableInitializer.text);
                            tokens.replace(
                                    input.getTreeAdaptor().getTokenStartIndex($variableInitializer.start),
                                    input.getTreeAdaptor().getTokenStopIndex($variableInitializer.start),
                                    st
                            );
                        } else {
                            // we need to insert default initializer to initialize shadow array and variable
                            // to the same value
                            StringTemplate st = getTemplateLib().getInstanceOf("resistantInitValue");
                            st.setAttribute("variable", $variableDeclarator::var);
                            st.setAttribute("value", ANTLRJavaHelper.getTypeDefaultValue($variableDeclarator::var.type));
                            tokens.insertAfter(
                                    input.getTreeAdaptor().getTokenStopIndex($varDecl),
                                    st
                            );
                        }
		}}
	
	;
/**
 *	Will add declarations for helper arrays + get & set methods
 */
classAdditionalCode[CommonTree tree]
	:
		{if (!$classDeclaration.isEmpty()){
			for(VariableGroup group:$classDeclaration::variablesByGroups.keySet()){
				Set<Variable> variables = $classDeclaration::variablesByGroups.get(group);
				
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
		}}
	;


additionalImports[CommonTree tree]
	:
            {
                if (tree!=null){
                    getLogger().finer("Adding additional imports");
                    StringTemplate st = getTemplateLib().getInstanceOf("additionalImports");
                    tokens.insertBefore(tree.getTokenStartIndex(), st);
                }
            }
	;