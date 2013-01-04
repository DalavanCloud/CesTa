package org.cesta.trans.java;

import org.cesta.util.antlr.ANTLRHelper;
import org.cesta.util.antlr.java.ANTLRJavaHelper;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.cesta.parsers.java.IdentifyBlocksParser;
import org.cesta.parsers.java.IfSwitchReplacementParser;

/**
 * This transfromation replaces potentially vulnerable if constructions
 * to semantically equivalent switch with randomized execution.
 *
 * <p>Parameters:</p>
 * <table>
 *  <tr><th>Name</th><th>Type</th><th>Default</th><th>Description</th></tr>
 *  <tr>
 *      <td>includeMethods</td>
 *      <td>String (regexp)</td>
 *      <td>".*"</td>
 *      <td>
 *          method names, that should be included in transformation
 *      </td>
 *  </tr>
 *  <tr>
 *      <td>excludeMethods</td>
 *      <td>String (regexp)</td>
 *      <td>""</td>
 *      <td>
 *          method names, that should not be included in transformatio
 *      </td>
 *  </tr>
 * </table>
 * <p>
 *  Basic parameters are inherited from {@link AbstractRewriteTransformation}.
 * </p>
 * 
 * @author Tobias Smolka
 */
public class IfSwitchReplacement extends AbstractRewriteTransformation {

    /**
     * Transforms single file
     *
     * @param filePair File pair (input/output) to transform
     * @throws TransformationException In case transformation failed
     */
    @Override
    public void transform(MappedFile filePair) throws TransformationException {

        TreeNodeStream nodes = prepareTreeNodeStream(filePair);

        logger.fine("Calling IdentifyBlocks tree parser");
        try {
            IdentifyBlocksParser identifyBlocksGrammar = new IdentifyBlocksParser(nodes);
            identifyBlocksGrammar.setParams(getParams());
            identifyBlocksGrammar.setDefaultTemplateLib();
            identifyBlocksGrammar.javaSource();
        } catch (RecognitionException ex){
            throw new TransformationException("Parser could not process file.", ex);
        }
        
        nodes = prepareTreeNodeStream();

        logger.fine("Calling IfSwitch tree parser");
        try {
            IfSwitchReplacementParser ifSwitchParser = new IfSwitchReplacementParser(nodes);
            ifSwitchParser.setParams(getParams());
            ifSwitchParser.setDefaultTemplateLib();
            ifSwitchParser.javaSource();
        } catch (RecognitionException ex){
            throw new TransformationException("Parser could not process file.", ex);
        }

        writeTo(filePair);
    }

    /**
     * Returns default parameters
     * @return map of parameters
     */
    @Override
     public Map<String, Object> getDefaultParams(){
        Map<String, Object> params = super.getDefaultParams();
        params.put("includeMethods", ".*");
        params.put("excludeMethods", "");
        return params;
     }
}
