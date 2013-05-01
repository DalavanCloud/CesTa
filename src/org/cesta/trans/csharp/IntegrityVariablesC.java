package org.cesta.trans.csharp;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.parsers.csharp.generated.IntegrityVariablesParserC;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;

/**
 *
 * @author David Formanek
 */
public class IntegrityVariablesC extends AbstractRewriteTransformationC {
    
    @Override
    public void transform(MappedFile filePair) throws TransformationException {

        TreeNodeStream nodes = prepareTreeNodeStream(filePair);

        logger.fine("Calling IntegrityVariables tree parser for C#");
        try {
            IntegrityVariablesParserC parser = new IntegrityVariablesParserC(nodes);
            parser.setParams(getParams());
            parser.setDefaultTemplateLib();
            parser.compilation_unit();
        } catch (RecognitionException ex) {
            throw new TransformationException("Parser could not process file.", ex);
        }

        writeTo(filePair);
    }
    
}
