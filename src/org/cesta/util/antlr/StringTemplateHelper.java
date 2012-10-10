package org.cesta.util.antlr;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.stringtemplate.CommonGroupLoader;
import org.antlr.stringtemplate.StringTemplateErrorListener;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplateGroupLoader;

/**
 * Helper class with few useful functions, which can help to work with
 * StringTemplate easier.
 *
 * @author Tobias Smolka
 */
public class StringTemplateHelper {

    /**
     * Registers template group loader, that will load group template files from
     * provided directories with simple default listener. Group loader uses
     * Thread's context classloader to load from directories, therefore
     * directories can be anywhere on class path. 
     *
     * @param templateDirs list of directories divided by ":"
     */
    public static void registerGroupLoader(String templateDirs){
        StringTemplateGroupLoader groupLoader =
            new CommonGroupLoader(templateDirs, new StringTemplateErrorListener() {
                @Override
                public void error(String message, Throwable cause) {
                    Logger.getLogger(StringTemplateHelper.class.getName()).log(Level.SEVERE, "Error in templates: "+message, cause);
                }
                @Override
                public void warning(String message) {
                    Logger.getLogger(StringTemplateHelper.class.getName()).log(Level.WARNING, message);
                }
            });

        StringTemplateGroup.registerGroupLoader(groupLoader);
    }
}
