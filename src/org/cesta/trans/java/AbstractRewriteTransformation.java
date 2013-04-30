package org.cesta.trans.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.trans.AbstractTransformation;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;
import org.cesta.util.antlr.ANTLRHelper;
import org.cesta.util.antlr.StringTemplateHelper;
import org.cesta.util.antlr.java.ANTLRJavaHelper;

/**
 * Abstract class for Java Card rewrite transformations.
 * So far, all Java Card transformations are similar - Java based tree rewrites with output to templates.
 * Abstract transformation contains common methods.
 * <p>Parameters:</p>
 * <table>
 *  <tr><th>Name</th><th>Type</th><th>Default</th><th>Description</th></tr>
 *  <tr>
 *      <td>generateComments</td>
 *      <td>Boolean</td>
 *      <td>true</td>
 *      <td>
 *          whether to generate comments in transformed file
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>templatePath</td>
 *      <td>String</td>
 *      <td>"templates"</td>
 *      <td>
 *          path to templates, multiple directories separated by ":",
 *          directories can be located anywhere on classpath
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>templateGroup</td>
 *      <td>String</td>
 *      <td>parser class simple name, e.g. ShadowVariablesParser</td>
 *      <td>
 *          name of template group, which should be used to load templates
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>javaCard</td>
 *      <td>Boolean</td>
 *      <td>true</td>
 *      <td>
 *          optimize transformation for Java Card, example usage is to
 *          handle differently runtime exceptions in templates.
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>nestedRewrite</td>
 *      <td>Boolean</td>
 *      <td>true</td>
 *      <td>
 *          allow nested rewrites (rewrite part of already rewritten code),
 *          with some transformations it can cause pretty big overhead
 *      </td>
 *  </tr>
 * </table>
 * 
 * @author Tobias Smolka
 */
public abstract class AbstractRewriteTransformation extends AbstractTransformation {
    protected TokenRewriteStream tokens = null;
    protected CommonTree tree = null;
    
    /**
     * Returns default parameters
     * @return map of parameters
     */
    @Override
    public Map<String, Object> getDefaultParams(){
        Map<String, Object> p = super.getDefaultParams();
        p.put("javaCard", true);
        p.put("generateComments", true);
        p.put("templatePath", "templates");
        p.put("nestedRewrite", true);
        return p;
    }

    protected void createTokens(CharStream charStream) throws TransformationException {
        tokens = new TokenRewriteStream(ANTLRJavaHelper.tokenizeStream(charStream));
    }
    
    protected void createTree() throws TransformationException {
        tree = ANTLRJavaHelper.parseStream(tokens);
    }
    
    protected void checkSyntax() throws TransformationException {
        ANTLRJavaHelper.checkSyntax(tokens);
    }
    
    /**
     * Prepares tree node stream from inputStream.
     * @param inputStream input stream
     * @return initialized tree node stream
     * @throws TransformationException in case input stream could not be read
     * or contains errors
     */
    protected TreeNodeStream prepareTreeNodeStream(CharStream inputStream)
            throws TransformationException {
        logger.finer("Tokenizing stream");
        createTokens(inputStream);
        logger.finer("Parsing tokens");
        createTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        nodes.setTokenStream(tokens);
        return nodes;
    }

    /**
     * Prepares tree node stream from filePair.
     * @param filePair pair of files (only "from" file is used to create stream)
     * @return initialized tree node stream
     * @throws TransformationException in case input stream could not be read
     * or contains errors
     */
    protected TreeNodeStream prepareTreeNodeStream(MappedFile filePair)
            throws TransformationException {
        return prepareTreeNodeStream(getInputStream(filePair));
    }
    
    /**
     * Prepares tree node stream from tokens for sending to another parser.
     * @return initialized tree node stream
     * @throws TransformationException in case input stream could not be read
     * or contains errors
     */
    protected TreeNodeStream prepareTreeNodeStream() throws TransformationException {
        return prepareTreeNodeStream(new ANTLRStringStream(tokens.toString()));
    }
    
    private ANTLRInputStream getInputStream(MappedFile filePair)
            throws TransformationException {
        try {
            return new ANTLRInputStream(new FileInputStream(filePair.getFrom()));
        } catch (IOException ex) {
            throw new TransformationException("Could not open input file.", ex);
        }
    }
    
    /**
     * Writes tokens to the output file and checks the syntax.
     * @param filePair pair of files (only "to" file is used for writing)
     * @throws TransformationException
     */
    protected void writeTo(MappedFile filePair) throws TransformationException {
        try {
            ANTLRHelper.writeTokens(tokens, filePair.getTo());
        } catch (IOException ex) {
            throw new TransformationException("Could not save transformed file.", ex);
        }
        
        try {
            checkSyntax();
        } catch (TransformationException ex){
            throw new TransformationException("Transformation resulted in "
                    + "broken code and contains syntax errors.", ex);
        }
    }
    
    /**
     * Transforms single file
     *
     * @param filePair File pair (input/output) to transform
     * @throws TransformationException In case transformation failed
     */
    public abstract void transform(MappedFile filePair) throws TransformationException;

    /**
     * Main entry point of the transformation
     * @throws TransformationException In case transformation failed
     */
    @Override
    public void execute() throws TransformationException {
        registerTemplateGroupLoader();
        for (MappedFile filePair:getMappedFiles()){
            try {
                logger.log(Level.INFO, "Transforming file {0}", filePair.getFrom());
                transform(filePair);
            } catch (TransformationException ex){
                logger.log(Level.SEVERE, ex.getMessage(), ex);
                throw ex;
            }
        }
    }
    
    /**
     * Registers default template group loader. 
     * Default path can be overriden by parameter "templatePath".
     */
    public void registerTemplateGroupLoader(){
        StringTemplateHelper.registerGroupLoader(getParam("templatePath", "templates").toString());
    }
}
