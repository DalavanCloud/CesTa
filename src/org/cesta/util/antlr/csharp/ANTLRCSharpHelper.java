package org.cesta.util.antlr.csharp;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.cesta.parsers.csharp.generated.CSharp4AST;
import org.cesta.parsers.csharp.generated.CSharp4PreProcessor;
import org.cesta.parsers.java.generated.JavaParser;
import org.cesta.trans.TransformationException;

/**
 * ANTLRCSharpHelper provides some helper functions for simplified access to
 * CSharp4PreProcessor and CSharp4AST, which are part of the framework.
 * 
 * Created by copying ANTLRJavaHelper and editation.
 * 
 * @author David Formanek
 */
public class ANTLRCSharpHelper {
    
    private static final Logger logger = Logger.getLogger(ANTLRCSharpHelper.class.getName());
    
    /**
     * Instantiates {@link CSharp4PreProcessor} on provided stream - it will
     * try to tokenize the input.
     * @param stream string stream which should be tokenized
     * @return lexer
     * @throws TransformationException
     */
    public static CSharp4PreProcessor tokenizeStream(CharStream stream) throws TransformationException {
        if (stream == null) {
            throw new IllegalArgumentException("Stream is null");
        }

        CSharp4PreProcessor lexer = new CSharp4PreProcessor(stream);
        if (lexer.failed()) {
            throw new TransformationException(
                    "Lexer has failed, stream could not be tokenized.");
        }
        return lexer;
    }
    
    /**
     * Instantiates {@link JavaParser} on provided tokens, parses the code
     * and returns parsed abstract syntax tree (AST)
     * @param tokens
     * @return parsed AST
     * @throws TransformationException in case that source code could not be parsed
     */
    public static CommonTree parseStream(TokenStream tokens) throws TransformationException {
        CSharp4AST parser = new CSharp4AST(tokens);
        CSharp4AST.compilation_unit_return r = null;
        
        try {
            r = parser.compilation_unit();
        } catch (Exception ex) {
            throw new TransformationException("File could not be parsed.", ex);
        }

        //if (parser.hasErrors()) {
        //    throw new TransformationException("File could not be parsed and contains errors.");
        //}

        return (CommonTree) r.getTree();
    }
    
    /**
     * Try to parse source code and check for errors in transformations
     *
     * @param tokens Tokens to be parsed
     * @throws TransformationException in case that tokens couldn't be parsed
     */
    public static void checkSyntax(TokenStream tokens) throws TransformationException {
        logger.finer("Checking for syntax errors in modified code");
        CSharp4PreProcessor lexer = tokenizeStream(new ANTLRStringStream(tokens.toString()));
        parseStream(new CommonTokenStream(lexer));
    }
    
    /**
     * Returns indent tokens, which are before baseToken in tokenStream. 
     *
     * @return list of tokens
     */
    public static List<Token> getIndent(TokenRewriteStream tokenStream, Token baseToken) {
        if (baseToken == null) {
            throw new IllegalArgumentException("No token was provided");
        }
        if (tokenStream == null) {
            throw new IllegalArgumentException("Token stream is null");
        }

        Token t = null;
        int index = baseToken.getTokenIndex() - 1;
        while (index > 0
            && index < tokenStream.size()
            && (t = tokenStream.get(index)) != null
            && t.getType() == CSharp4PreProcessor.WHITESPACE // ???
            ) {
                index--;
        }

        if (index != baseToken.getTokenIndex() - 1) {
            return tokenStream.getTokens(
                    index, baseToken.getTokenIndex() - 1, CSharp4PreProcessor.WHITESPACE);
        } else {
            return new LinkedList<Token>();
        }
    }
    
    /**
     * Helper function, that returns default value for given type.     *
     * @param type type of return value
     * @return sample return value
     */
    public static String getTypeDefaultValue(String type){
        if (type.matches("void|char|string")) {
            return "";
        } else if (type.equals("boolean")) {
            return "false";
        } else if (type.matches("int|uint|short|ushort|byte|sbyte|long|ulong|float|double|decimal")) {
            return "0";
        } else {
            return "null";
        }
    }
}
