package org.cesta.trans;

import java.util.List;
import java.util.Map;
import org.cesta.types.MappedFile;

/**
 * Interface for all transformations. Before the transformation
 * is executed, one or multiple file pairs (input and output file)
 * are specified. Optionally, an user can specify some parameters.
 * Main transformation's logic is executed after calling execute().
 *
 * The framework doesn't know how or if the files are transformed
 * and written to destination files. It only provides convinient
 * interface, which should fit to any general transformation on
 * set of files. The transformation itself can therefore contain many
 * phases (analysis, some computations) before destination files are
 * generated.
 *
 * The only problem with interface is, that it can't specify constructor.
 * Each transformation should have constructor without any parameters,
 * otherwise it won't be instanciated by framework. 
 *
 * Programmers can use ANTLR in their transformations, but this is not
 * forced.
 */
public interface Transformation {

    /**
     * Returns list of mapped files, which should be transformed
     * @return List of mapped files
     */
    public List<MappedFile> getMappedFiles();
    
    /**
     * Sets list of mapped files, which should be transformed
     * @param mappedFiles mapped files
     */
    public void setMappedFiles(List<MappedFile> mappedFiles);
    
    /**
     * Adds one mapped fileswhich should be transformed
     * @param mappedFile mapped file
     */
    public void addMappedFile(MappedFile mappedFile);

    /**
     * Returns map of parameters, which were passed to transformation
     * @return map of parameters
     */
    public Map<String, Object> getParams();
    
    /**
     * Sets set of parameters
     * @param params set of parameters
     */
    public void setParams(Map<String, Object> params);
    
    /**
     * Sets one single parameter
     * @param name name of parameter
     * @param value value of parameter
     */
    public void setParam(String name, Object value);
    
    /**
     * Gets one single parameter
     * @param name name of parameter
     * @return value of parameter or null if not found
     */
    public Object getParam(String name);

    /**
     * Gets one single parameter
     * @param name name of parameter
     * @param defaultValue default value
     * @return param value or default value if param not set
     */
    public Object getParam(String name, Object defaultValue);

    /**
     * Clears all parameters
     */
    public void clearParams();

    /**
     * Executes main logic of transformation
     * @throws TransformationException if transformation has failed
     */
    public void execute() throws TransformationException;
}
