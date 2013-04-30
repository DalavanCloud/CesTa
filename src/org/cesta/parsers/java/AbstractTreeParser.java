package org.cesta.parsers.java;

import antlr.RecognitionException;
import java.util.Map.Entry;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.cesta.trans.TransformationException;
import org.cesta.util.antlr.java.ANTLRJavaHelper;

/**
 * Abstract tree parser with some usefull utility functions.
 * Can be used as a parent for all tree parsers, that provide
 * rewrite and original source code should be commented out.
 *
 * Additionally, it support automatic passing of parameters to
 * templates created via getTemplateInstance().
 */
public abstract class AbstractTreeParser extends TreeParser  {

    /** Map of parameters, which were added to transformation */
    protected Map<String, Object> parameters = new HashMap<String, Object>();

    /**
     *  Counts initialized rewrites
     */
    protected int rewriteID = 0;

    /**
     *  Counts performed rewrites
     */
    private int rewritesCount = 0;

    /**
     *  Current token stream, on which is transformation working
     */
    protected TokenRewriteStream tokens;

    /**
     * Scope used to track execution of rewrites. It saves whole tree, on which
     * the rewrite is performed (we want to be able to get original source
     * code), rule which is executed and unique ID of rewrite operation.
     */
    protected static class runtimeRewriteParams_scope {
        public int id;
        public CommonTree tree;
    }
    
    /**
     * Stack of runtime parameters (each item represents one rewrite)
     */
    protected Stack runtimeRewriteParams_stack = new Stack();

    protected List<Token> getIndent(Token token) {
        return ANTLRJavaHelper.getIndent(tokens, token);
    }
    
    /**
     * Returns all set parameters for this transformation
     * @return collection of parameters
     */
    public Map<String, Object> getParams(){
        return Collections.unmodifiableMap(parameters);
    }
    
    /**
     * Returns previously set parameter with given name
     * @param name name of parameter
     * @return parameter or null
     */
    public Object getParam(String name){
        return parameters.get(name);
    }

    /**
     * Returns previously set parameter with given name
     * @param name name of parameter
     * @param defaultValue default value
     * @return previously set parameter or parameter default value
     */
    public Object getParam(String name, Object defaultValue){
        if (parameters.containsKey(name)) {
            return parameters.get(name);
        } else {
            return defaultValue;
        }
    }
    
    /**
     * Helper method for getting String parameters
     */
    public String getParamS(String name){
        return getParamS(name, null);
    }
    
    /**
     * Helper method for getting String parameters
     */
    public String getParamS(String name, String defaultValue){
        return String.valueOf(getParam(name, defaultValue));
    }
    
    /**
     * Helper method for getting Boolean parameters
     */
    public Boolean getParamB(String name){
        return getParamB(name, null);
    }
    
    /**
     * Helper method for getting Boolean parameters
     */
    public Boolean getParamB(String name, Boolean defaultValue){
        return Boolean.valueOf(String.valueOf(getParam(name, defaultValue)));
    }
    
    /**
     * Sets list of parameters. Previous list is not overriden.
     * You can call clearParams() before.
     * @param params list of parameters
     */
    public void setParams(Map<String, Object> params){
        for (Entry<String,Object> param : params.entrySet()) {
            setParam(param.getKey(), param.getValue());
        }
    }
    
    /**
     * Sets one single parameter
     * @param name name of parameter
     * @param value value of parameter, any Object
     */
    public void setParam(String name, Object value){
        parameters.put(name, value);
    }
    
    /**
     * Clears all parameters
     */
    public void clearParams(){
        parameters.clear();
    }

    /**
     * Returns highest rewrite ID used so far
     *
     * @return number of rewrites
     */
    public int getMaxRewriteID(){
        return rewriteID;
    }

    /**
     * Returns overall number of performed rewrites so far.
     *
     * @return number of rewrites
     */
    public int getRewritesCount(){
        return rewritesCount;
    }

    /**
     * Returns default logger, which should be used in parsers.
     * @return logger
     */
    public Logger getLogger(){
        return Logger.getLogger(this.getClass().getName());
    }
    
    /**
     * Public constructor
     * @param input
     */
    public AbstractTreeParser(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }

    /**
     * Public constructor
     * @param input
     * @param state
     */
    public AbstractTreeParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
        tokens = (TokenRewriteStream) input.getTokenStream();
        // TODO: init default parameters
    }

    public TokenRewriteStream getTokenRewriteStream() throws RecognitionException {
        TreeNodeStream stream = getTreeNodeStream();
        if (stream instanceof TokenRewriteStream) {
            return (TokenRewriteStream) stream;
        }
        throw new RecognitionException(
                "Current tree parser is not in rewrite mode,"
                + "no rewrite stream can be provided.");
    }

    /**
     * Current runtime params from top of the stack
     */
    public runtimeRewriteParams_scope getCurrentRewriteParams(){
        return (runtimeRewriteParams_scope) runtimeRewriteParams_stack.peek();
    }

    /**
     * Initializes rewrite (automatically sets runtime params like ID and
     * current tree). Should be called before every rewrite, for which we want
     * to automatically write original source code in comments.
     */
    public void initRewrite() {
        // increment number of transformations
        rewriteID++;
        
        runtimeRewriteParams_scope params = new runtimeRewriteParams_scope();
        params.id = rewriteID;
    	params.tree = (CommonTree)input.LT(1);

        // create new record on stack
        runtimeRewriteParams_stack.push(params);
    }

    /**
     * Should be called after every rewrite. It pops runtime parameters
     * from stack.
     */
    public void cleanupRewrite(){
        runtimeRewriteParams_stack.pop();
    }
    
    /**
     * Returns current token start index for tree, on which we are currently
     * working.
     */
    public int getCurrentStartIndex(){
        return input.getTreeAdaptor().getTokenStartIndex(getCurrentRewriteParams().tree);
    }
    
    /**
     * Returns current token stop index for tree, on which we are currently
     * working.
     */
    public int getCurrentStopIndex(){
        return input.getTreeAdaptor().getTokenStopIndex(getCurrentRewriteParams().tree);
    }
    
    /**
     * Performs unified rewrite, calls rule from initTransformation and passes
     * default parameters (id of rewrite, originalCode) + requested parameters
     * from provided map.
     * <p>Special parameter "enabled" set to false will disable the rewrite.
     *
     * @param ruleParams map of parameters that should be passed directly to template
     */
    public void performRewrite(Map ruleParams){
            if (ruleParams.containsKey("enabled") &&
                    !Boolean.valueOf(String.valueOf(ruleParams.get("enabled")))){
                return;
            }

            // check if we are allowing nested rewrites
            if (runtimeRewriteParams_stack.size() > 1 && !getParamB("nestedRewrite")){
                getLogger().fine("Ignoring nested rewrite");
                return;
            }

            final int startIndex = getCurrentStartIndex();
            final int stopIndex = getCurrentStopIndex();

            ruleParams.put("id", getCurrentRewriteParams().id);
            ruleParams.put("originalCode", getOriginalCode(getCurrentRewriteParams().tree));

            ruleParams.put("start", new Object(){
                    public int line = tokens.get(startIndex).getLine();
                    public int charPositionInLine = tokens.get(startIndex).getCharPositionInLine();
            });
            ruleParams.put("stop", new Object(){
                    public int line = tokens.get(stopIndex).getLine();
                    public int charPositionInLine = tokens.get(stopIndex).getCharPositionInLine();
            });

            ruleParams.put("text", input.getTokenStream().toString(startIndex, stopIndex));

            // allow also rewrite with empty rule => delete
            // if (!ruleParams.containsKey("rule")) {
            //    ruleParams.put("rule", this.getClass().getSimpleName());
            // }

            if (!ruleParams.containsKey("name")){
                if (ruleParams.containsKey("rule")) {
                    ruleParams.put("name", ruleParams.get("rule"));
                } else {
                    ruleParams.put("name", this.getClass().getSimpleName());
                }
            }

            rewritesCount++;
            StringTemplate st = getTemplateLib().getInstanceOf("rewrite");
            st.setAttribute("ruleParams", ruleParams);
            getLogger().log(Level.FINE, "Performing rewrite {0}_{1}",
                    new Object[]{ruleParams.get("name"), ruleParams.get("id")});
            tokens.replace(startIndex, stopIndex, st);
    }
    
    /**
     * Will return original code of the tree (before any rewrite)
     */
    protected String getOriginalCode(CommonTree tree) {
        String indent = removeIndent(tree.getToken());
        StringBuilder originalCode = new StringBuilder(indent);

        originalCode.append(tokens.toOriginalString(
                input.getTreeAdaptor().getTokenStartIndex(tree),
                input.getTreeAdaptor().getTokenStopIndex(tree)));

        String output = originalCode.toString();

        // remove multiline comments
        output = output.replaceAll("/\\*(?:.|[\\n\\r])*?\\*/","");

        return output;
    }

    /**
     * Returns current start index (index of first token) of provided tree.
     * @param tree tree
     * @return index of first token
     */
    protected int getStartIndex(Tree tree) {
        return input.getTreeAdaptor().getTokenStartIndex(tree);
    }

    /**
     * Returns current stop index (index of last token) of provided tree. 
     * @param tree tree
     * @return index of last token
     */
    protected int getStopIndex(Tree tree) {
        return input.getTreeAdaptor().getTokenStopIndex(tree);
    }
    
    /**
     * Will remove indent string before token
     */
    protected String removeIndent(Token token) {
        String indentStr = "";
        List<Token> indentTokens = getIndent(token);

        if (indentTokens.isEmpty()) {
            return indentStr;
        }
            
        for (Token t : indentTokens) {
            indentStr += t.getText();
        }

        int startIndex = indentTokens.get(0).getTokenIndex();
        int stopIndex = indentTokens.get(indentTokens.size() - 1).getTokenIndex();
        tokens.delete(startIndex, stopIndex);

        return indentStr;
    }

    /**
     * Current template library. 
     * @return current template library
     */
    public abstract StringTemplateGroup getTemplateLib();
    
    /**
     * Sets current template library. Should be called from transformation,
     * otherwise default StringTemplateGroup will be used.
     *
     * @param templateLib Template library to be used
     */
    public abstract void setTemplateLib(StringTemplateGroup templateLib);

    /**
     * Returns default template group, which will be used to load templates.
     * The default value is simple class name and can be overriden by parameter
     * templateGroup.
     *
     * @return default template group
     */
    public String getDefaultTemplateGroup(){
        return getParam("templateGroup", this.getClass().getSimpleName()).toString();
    }
    
    /**
     * Sets default template library - loads default template group and
     * defines map "params", which will hold all current parameters.
     * 
     * @throws TransformationException in case default template group couldn't be loaded
     */
    public void setDefaultTemplateLib() throws TransformationException {
        StringTemplateGroup tmpl = StringTemplateGroup.loadGroup(getDefaultTemplateGroup());
        if ((tmpl == null)) {
            throw new TransformationException("Could not load template group "
                    + getDefaultTemplateGroup());
        }
        // set global parameters
        tmpl.defineMap("params", parameters);
        setTemplateLib(tmpl);
    }
}
