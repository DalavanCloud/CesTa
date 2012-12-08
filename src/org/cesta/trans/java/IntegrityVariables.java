package org.cesta.trans.java;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.parsers.java.IntegrityVariablesParser;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;
import org.cesta.util.antlr.ANTLRHelper;
import org.cesta.util.antlr.java.ANTLRJavaHelper;

/**
 * This transformation adds protection against memory fault induction.
 * Each variable is extended with an integrity information,
 * which will be automatically checked during read and updated during write.
 
 * @author David Formanek
 */
public class IntegrityVariables extends AbstractRewriteTransformation {

    @Override
    public void transform(MappedFile filePair) throws TransformationException {
        
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new FileInputStream(filePair.getFrom()));
        } catch (IOException ex) {
            throw new TransformationException("Could not open input file.", ex);
        }

        TreeNodeStream nodes = prepareTreeNodeStream(inputStream);

        logger.fine("Calling IntegrityVariables tree parser");
        try {
            IntegrityVariablesParser parser = new IntegrityVariablesParser(nodes);
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
    
    /*@Override
     public Map<String, Object> getDefaultParams(){
        Map<String, Object> params = super.getDefaultParams();
        params.put("replaceLocal", false);
        params.put("replaceTypes", "byte|short|boolean");
        params.put("useMethodId", false);
        params.put("includeVariables", ".*");
        params.put("excludeVariables", "");
        return params;
     }*/
}

