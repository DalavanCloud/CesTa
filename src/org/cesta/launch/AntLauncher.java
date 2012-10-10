package org.cesta.launch;

import org.apache.tools.ant.launch.Launcher;

/**
 * AntLauncher class, a wrapper around original launcher from Ant.
 * 
 * @author Tobias Smolka
 */
public class AntLauncher extends Launcher {
    /**
     * Entry point for starting Ant.
     *
     * @param  args commandline arguments
     */
    public static void main(String[] args) {
        // TODO: we could provide custom Ant Main class,
        // which is set by "-main" argument and implement own behaviour
        Launcher.main(args);
    }
}
