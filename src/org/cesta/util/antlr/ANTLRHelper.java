package org.cesta.util.antlr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.TokenStream;

/**
 * Helper functions for ANTLR.
 * @author Tobias Smolka
 */
public class ANTLRHelper {
    /**
     * Write tokens to output file
     * @param tokens Tokens to be written
     * @param file Output file
     * @throws IOException in case that output file couldn't be written
     */
    public static void writeTokens(TokenStream tokens, File file) throws IOException {
        FileOutputStream fos = null;
        try {
            file.getParentFile().mkdirs();
            Logger.getLogger(ANTLRHelper.class.getName()).log(
                    Level.FINE, "Writing tokens to {0}", file.getPath());
            fos = new FileOutputStream(file);
            fos.write(tokens.toString().getBytes());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    // TODO: catch IOException
                }
            }
        }
    }
}
