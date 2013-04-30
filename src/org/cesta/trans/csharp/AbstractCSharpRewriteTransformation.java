package org.cesta.trans.csharp;

import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenRewriteStream;
import org.cesta.trans.TransformationException;
import org.cesta.trans.java.AbstractRewriteTransformation;
import org.cesta.util.antlr.csharp.ANTLRCSharpHelper;

/**
 *
 * @author David Formanek
 */
abstract class AbstractCSharpRewriteTransformation extends AbstractRewriteTransformation {
    
    @Override
    public Map<String, Object> getDefaultParams(){
        Map<String, Object> p = super.getDefaultParams();
        p.put("dotNetCard", true);
        p.put("generateComments", true);
        p.put("templatePath", "templates");
        p.put("nestedRewrite", true);
        return p;
    }

    @Override
    protected void createTokens(CharStream charStream) throws TransformationException {
        tokens = new TokenRewriteStream(ANTLRCSharpHelper.tokenizeStream(charStream));
    }
    
    @Override
    protected void createTree() throws TransformationException {
        tree = ANTLRCSharpHelper.parseStream(tokens);
    }
    
    @Override
    protected void checkSyntax() throws TransformationException {
        ANTLRCSharpHelper.checkSyntax(tokens);
    }
}
