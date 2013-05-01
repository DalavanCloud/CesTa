package org.cesta.parsers.csharp;

import java.util.List;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.TreeNodeStream;
import org.cesta.parsers.java.AbstractTreeParser;
import org.cesta.util.antlr.csharp.ANTLRCSharpHelper;

/**
 * {@link AbstractTreeParser} adapted to use C# parsers.
 * 
 * @author David Formanek
 */
public abstract class AbstractTreeParserC extends AbstractTreeParser {
    
    public AbstractTreeParserC(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    
    public AbstractTreeParserC(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }
    
    @Override
    protected List<Token> getIndent(Token token) {
        return ANTLRCSharpHelper.getIndent(tokens, token);
    }
}
