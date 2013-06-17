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
abstract class AbstractRewriteTransformationC extends AbstractRewriteTransformation {
    
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
        System.out.println("tokens:\n" + tokens.toString());
    }
    
    @Override
    protected void createTree() throws TransformationException {
        tree = ANTLRCSharpHelper.parseStream(tokens);
        System.out.println("tree:\n" + tree.toStringTree());
    }
    
    @Override
    protected void checkSyntax() throws TransformationException {
        //System.out.println("tokens:\n" + tokens.toDebugString());
        ANTLRCSharpHelper.checkSyntax(tokens);
    }
}
