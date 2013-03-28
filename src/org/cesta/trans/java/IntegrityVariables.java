package org.cesta.trans.java;

import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.parsers.java.generated.IntegrityVariablesParser;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;

/**
 * This transformation adds protection against memory fault induction. Each
 * variable is extended with an integrity information, which will be
 * automatically checked during read and updated during write.
 *
 * <p>Parameters:</p>
 * <table>
 *  <tr><th>Name</th><th>Type</th><th>Default</th><th>Description</th></tr>
 *  <tr>
 *   <td>replaceTypes</td>
 *   <td>String (regexp)</td>
 *   <td>"byte|boolean"</td>
 *   <td>Types, that should be transformed.</td>
 *  </tr>
 * </table>
 * <p>
 * Basic parameters are inherited from {@link AbstractRewriteTransformation}.
 * </p>
 *
 * @author David Formanek
 */
public class IntegrityVariables extends AbstractRewriteTransformation {

    @Override
    public void transform(MappedFile filePair) throws TransformationException {

        TreeNodeStream nodes = prepareTreeNodeStream(filePair);

        logger.fine("Calling IntegrityVariables tree parser");
        try {
            IntegrityVariablesParser parser = new IntegrityVariablesParser(nodes);
            parser.setParams(getParams());
            parser.setDefaultTemplateLib();
            parser.javaSource();
        } catch (RecognitionException ex) {
            throw new TransformationException("Parser could not process file.", ex);
        }

        writeTo(filePair);
    }

    @Override
    public Map<String, Object> getDefaultParams() {
        Map<String, Object> params = super.getDefaultParams();
        params.put("replaceTypes", "byte|boolean");
        return params;
    }
}
