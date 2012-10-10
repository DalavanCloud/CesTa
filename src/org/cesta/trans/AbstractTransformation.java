package org.cesta.trans;

import org.cesta.types.MappedFile;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Abstract transformation, which can be base of any transformation.
 * It implements part of the Transformation interface.
 *
 */
abstract public class AbstractTransformation implements Transformation {
    /** Default logger for transformation */
    protected Logger logger = null;
    /** List of file pairs, which should be transformed */
    private List<MappedFile> filePairs = new Vector<MappedFile>();
    /** Map of parameters, which were set */
    private Map<String, Object> parameters = new HashMap<String, Object>();

    /**
     * @return the files
     */
    @Override
    public List<MappedFile> getMappedFiles() {
        return Collections.unmodifiableList(filePairs);
    }

    /**
     * @param filePairs the file pairs to set
     */
    @Override
    public void setMappedFiles(List<MappedFile> filePairs) {
        this.filePairs = filePairs;
    }

    /**
     * @param filePair the file pair to add
     */
    @Override
    public void addMappedFile(MappedFile filePair) {
        filePairs.add(filePair);
    }
    /**
     * Returns all set parameters for this transformation
     * @return collection of parameters
     */
    @Override
    public Map<String, Object> getParams(){
        return Collections.unmodifiableMap(parameters);
    }
    /**
     * Returns previously set parameter with given name
     * @param name name of parameter
     * @return parameter or null
     */
    @Override
    public Object getParam(String name){
        return getParam(name, null);
    }

    /**
     * Returns previously set parameter with given name
     * @param name name of parameter
     * @param defaultValue default value
     * @return previously set parameter or parameter default value
     */
    @Override
    public Object getParam(String name, Object defaultValue){
        if (parameters.containsKey(name)) return parameters.get(name);
        else return defaultValue;
    }
    /**
     * Helper method for getting String parameters
     */
    public String getParamS(String name){
        return getParamS(name, null);
    }
    /**
     * Helper method for getting String parameters
     */
    public String getParamS(String name, String defaultValue){
        return String.valueOf(getParam(name, defaultValue));
    }
    /**
     * Helper method for getting Boolean parameters
     */
    public Boolean getParamB(String name){
        return getParamB(name, null);
    }
    /**
     * Helper method for getting Boolean parameters
     */
    public Boolean getParamB(String name, Boolean defaultValue){
        return Boolean.valueOf(String.valueOf(getParam(name, defaultValue)));
    }

    /**
     * Sets list of parameters. Previous parameters
     * are not cleared, you can call clearParams() before. 
     * @param params list of parameters
     */
    @Override
    public void setParams(Map<String, Object> params){
        for (Iterator i=params.entrySet().iterator();i.hasNext();){
            Entry<String,Object> param = (Entry<String, Object>) i.next();
            setParam(param.getKey(), param.getValue());
        }
    }
    /**
     * Sets one single parameter
     * @param name name of parameter
     * @param value value of parameter
     */
    @Override
    public void setParam(String name, Object value){
        parameters.put(name, value);
    }
    /**
     * Clears all parameters
     */
    @Override
    public void clearParams(){
        parameters.clear();
    }
    /**
     * Returns default parameters
     * @return map of parameters
     */
     public Map<String, Object> getDefaultParams(){
         return new HashMap<String, Object>();
     }

    /**
     * Main logic of transformation. Has to be implemented in child class.
     * @throws TransformationException
     */
    @Override
    public abstract void execute() throws TransformationException;

    /**
     * Default constructor, which initializes logger and default parameters.
     */
    public AbstractTransformation(){
        logger = Logger.getLogger(this.getClass().getName());
        try {
            parameters.putAll(getDefaultParams());
        } catch (NullPointerException ex){
            logger.log(Level.WARNING, "Default params are null", ex);
        }
    }
}
