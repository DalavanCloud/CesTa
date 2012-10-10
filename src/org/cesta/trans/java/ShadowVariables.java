package org.cesta.trans.java;

import org.cesta.util.antlr.ANTLRHelper;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.cesta.parsers.java.ShadowVariablesParser;

/**
 * This transformation adds protection against memory fault induction.
 * Each variable will have its shadow copy (inversion of original value),
 * which will be automatically checked during read and updated during write.
 *
 * <p>Parameters:</p>
 * <table>
 *  <tr><th>Name</th><th>Type</th><th>Default</th><th>Description</th></tr>
 *  <tr>
 *      <td>replaceLocal</td>
 *      <td>Boolean</td>
 *      <td>false</td>
 *      <td>
 *         Replace not only global, but also local variables in methods.
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>replaceTypes</td>
 *      <td>String (regexp)</td>
 *      <td>"byte|short|boolean"</td>
 *      <td>
 *          Types, that should be transformed.
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>useMethodId</td>
 *      <td>Boolean</td>
 *      <td>false</td>
 *      <td>
 *          If set, local variables use local method id instead of global one.
 *          Id will be unique only in method, not globally. Can be used for methods,
 *          that are not calling any other transformed method.
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>includeVariables</td>
 *      <td>String (regexp)</td>
 *      <td>".*"</td>
 *      <td>
 *          Name of variables, that should be included in transformation.
 *      </td>
 *  </tr>
 * <tr>
 *      <td>excludeVariables</td>
 *      <td>String (regexp)</td>
 *      <td>""</td>
 *      <td>
 *          Name of variables, that should be excluded from transformation.
 *      </td>
 *  </tr>
 * </table>
 * <p>
 *  Basic parameters are inherited from {@link AbstractRewriteTransformation}.
 * </p>
 * @author Tobias Smolka
 */
public class ShadowVariables extends AbstractRewriteTransformation {

    /**
     * Transforms single file
     *
     * @param filePair File pair (input/output) to transform
     * @throws TransformationException In case transformation failed
     */
    @Override
    public void transform(MappedFile filePair) throws TransformationException {
        
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new FileInputStream(filePair.getFrom()));
        } catch (IOException ex) {
            throw new TransformationException("Could not open input file.", ex);
        }

        TreeNodeStream nodes = prepareTreeNodeStream(inputStream);

        logger.fine("Calling FaultResistant tree parser");
        try {
            ShadowVariablesParser parser = new ShadowVariablesParser(nodes);
            parser.setParams(getParams());
            parser.setDefaultTemplateLib();
            parser.javaSource();
        } catch (RecognitionException ex){
            throw new TransformationException("Parser could not process file.", ex);
        }

        try {
            ANTLRHelper.writeTokens(tokens, filePair.getTo());
        } catch (IOException ex) {
            throw new TransformationException("Could not save transformed file.", ex);
        }
        
        try {
            ANTLRJavaHelper.checkSyntax(tokens);
        } catch (TransformationException ex){
            throw new TransformationException("Transformation resulted in broken code and contains syntax errors.", ex);
        }
    }
    /**
     * Returns default parameters
     * @return map of parameters
     */
    @Override
     public Map<String, Object> getDefaultParams(){
        Map<String, Object> params = super.getDefaultParams();
        params.put("replaceLocal", false);
        params.put("replaceTypes", "byte|short|boolean");
        params.put("useMethodId", false);
        params.put("includeVariables", ".*");
        params.put("excludeVariables", "");
        return params;
     }
}
