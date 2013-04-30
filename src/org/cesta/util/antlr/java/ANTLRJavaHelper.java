package org.cesta.util.antlr.java;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.cesta.parsers.java.generated.JavaLexer;
import org.cesta.parsers.java.generated.JavaParser;
import org.cesta.trans.TransformationException;

/**
 * ANTLRJavaHelper provides some helper functions for simplified
 * access to JavaLexer and JavaParser, which are part of the framework.
 * @author Tobias Smolka
 */
public class ANTLRJavaHelper {
    private static final Logger logger = Logger.getLogger(ANTLRJavaHelper.class.getName());

    /**
     * Instantiates {@link JavaLexer} on provided stream - it will
     * try to tokenize the input.
     * @param stream string stream which should be tokenized
     * @return lexer
     * @throws TransformationException
     */
    public static JavaLexer tokenizeStream(CharStream stream) throws TransformationException {
        if (stream == null) {
            throw new IllegalArgumentException("Stream is null");
        }

        JavaLexer lexer = new JavaLexer(stream);
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
        JavaParser parser = new JavaParser(tokens);
        JavaParser.javaSource_return r = null;

        try {
            r = parser.javaSource();
        } catch (Exception ex) {
            throw new TransformationException("File could not be parsed.", ex);
        }

        if (parser.hasErrors()) {
            throw new TransformationException("File could not be parsed and contains errors.");
        }

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
        JavaLexer lexer = tokenizeStream(new ANTLRStringStream(tokens.toString()));
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
            && t.getType() == JavaLexer.WS
            ) {
                index--;
        }

        if (index != baseToken.getTokenIndex() - 1) {
            return tokenStream.getTokens(
                    index, baseToken.getTokenIndex() - 1, JavaLexer.WS);
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
        if (type.equals("void")) {
            return "";
        } else if (type.equals("boolean")) {
            return "false";
        } else if (type.matches("int|short|byte")) {
            return "0";
        } else {
            return "null";
        }
    }
}
