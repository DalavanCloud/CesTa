package org.cesta.loader;

import org.cesta.trans.Transformation;

/**
 * Transformation dynamic loader
 *
 * @author Tobias Smolka
 */
public class TransformationLoader extends AdvancedClassLoader<Transformation> {
    public TransformationLoader() {
        super(Transformation.class);
    }
    public TransformationLoader(ClassLoader parent) {
        super(Transformation.class, parent);
    }
}
