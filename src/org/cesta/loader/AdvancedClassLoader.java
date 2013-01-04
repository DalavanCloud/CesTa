package org.cesta.loader;

import java.lang.reflect.Field;
import java.security.SecureClassLoader;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Type safe class loader for specified class.
 * 
 * @author Tobias Smolka
 */
public class AdvancedClassLoader<C> extends SecureClassLoader {
    protected ServiceLoader<C> serviceLoader;
    protected Class<C> innerClass;

    protected AdvancedClassLoader(Class<C> innerClass, ClassLoader parent){
        super(parent);
        this.innerClass = innerClass;
        setServiceLoader(ServiceLoader.load(innerClass));
        reload();
    }
    public AdvancedClassLoader(Class<C> innerClass){
        // TODO: consider Thread.currentThread().getContextClassLoader()
        // instead of default getSystemClassLoader()
        super();
        this.innerClass = innerClass;
        setServiceLoader(ServiceLoader.load(innerClass));
        reload();
    }

    public void reload(){
        getServiceLoader().reload();
    }

    /**
     * @return the serviceLoader
     */
    public ServiceLoader<C> getServiceLoader() {
        return serviceLoader;
    }

    /**
     * @param serviceLoader the serviceLoader to set
     */
    public void setServiceLoader(ServiceLoader<C> serviceLoader) {
        this.serviceLoader = serviceLoader;
    }

    /**
     * Returns class with given name or null, if not found.
     * The name can be full class name (with package) or name of class from
     * default package.
     *
     * @param name Name of transformation class
     * @return transformation class
     */
    public Class<C> loadInnerClass(String name){
        Class<C> ret = null;
        Class c = null;
        try {
            c = super.loadClass(name);
        } catch (ClassNotFoundException ex) {
            // TODO: catch ClassNotFoundException exception
        }

        try {
            if (c == null) {
                c = super.loadClass(
                        innerClass.getPackage().getName() + "." + name);
            }
        } catch (ClassNotFoundException ex) {
            // TODO: catch ClassNotFoundException exception
        }

        if (c != null) {
            try {
                ret = (Class<C>) c;
            } catch (ClassCastException ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.WARNING,
                        "Inner class doesn't have proper type", ex);
            }
        }

        return ret;
    }

    public C getInstance(String name) throws InstantiationException,
            IllegalAccessException {
        /*
        // service loader is not working very well
        ServiceLoader<C> sl = getServiceLoader();
        for (C obj : sl){
            if (obj.getClass().getName().equals(name) ||
                    obj.getClass().getName().equals(
                    innerClass.getPackage().getName() + "." + name)) {
                return obj;
            }
        }
        */
        
        Class<C> cl = loadInnerClass(name);
        if (cl == null) {
            return null;
        }

        C obj = cl.newInstance();

        return obj;
    }

    /**
     *  Return static field object with given name from given class.
     *
     *  @param className name of class
     *  @param fieldName name of field
     *  @return object or null if not found
     */
    public Object getStaticField(String className, String fieldName)  {
        return getStaticField(loadInnerClass(className), fieldName);
    }

    /**
     *  Returns static field object with given name from given class.
     *
     *  @param cl class
     *  @param fieldName name of field
     *  @return object or null if not found
     */
    public Object getStaticField(Class<C> cl, String fieldName) {
        Object obj = null;
        if (cl != null) {
            try {
                Field field = cl.getDeclaredField(fieldName);
                if (field != null) {
                    obj = field.get(cl);
                }
            } catch (NoSuchFieldException ex){
                // description field is not set
                // TODO: catch NoSuchFieldException exception
            } catch (IllegalAccessException ex){
                // access to description field is illegal
                // TODO: catch IllegalAccessException exception
            }
        }
        return obj;
    }
}
