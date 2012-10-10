package org.cesta.taskdefs;

import org.cesta.util.ant.TaskLogHandler;
import org.cesta.util.TaskLogFormatter;
import org.cesta.loader.TransformationLoader;
import org.cesta.trans.Transformation;
import org.cesta.trans.TransformationException;
import org.cesta.types.MappedFile;
import org.cesta.types.Parameter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tools.ant.AntClassLoader;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Mapper;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.apache.tools.ant.types.Resource;
import org.apache.tools.ant.types.ResourceCollection;
import org.apache.tools.ant.types.resources.FileResource;
import org.apache.tools.ant.util.FileNameMapper;
import org.apache.tools.ant.util.IdentityMapper;

/**
 * TransformationTask ANT task. It provides simple interface for executing
 * transformations. Core ANT types can be used (FileSet, Mapper, Path,
 * Parameter) to easily configure transformations.
 *
 * @author Tobias Smolka
 */
public class TransformationTask extends Task {
    /**
     * Resources (files) which should be transformed.
     */
    private List<ResourceCollection> resources = new Vector<ResourceCollection>();
    /**
     * Mapper element, which can be used to map filenames.
     */
    private Mapper mapperElement = null;
    /**
     * Output directory, where transformed files should be written.
     */
    private File destDir = null;
    /**
     * Output file, where transformed file should be written.
     */
    private File destFile = null;
    /**
     * Directory, from which source files should be read.
     */
    private File srcDir = null;
    /**
     * One single source file.
     */
    private File srcFile = null;
    /**
     * Classname of transformation to execute.
     * Simple classname can be used in case that transformation is from package
     * cz.muni.fi.codetrans.trans. Otherwise full classname has to specified.
     */
    private String classname = null;
    /** classpath, which can be used to load transformation or templates */
    private Path classpath = null;
    /** the parameters to pass to the new transformation */
    private Map<String, Object> parameters = new HashMap<String, Object>();
    /** whether failure to execute the task should throw a BuildException or just print an error */
    private boolean failOnError = true;
    /** list of files, that should be transformed */
    private List<MappedFile> mappedFiles = new LinkedList<MappedFile>();
    /** saved classpath, that was used before this task was loaded */
    private String savedClasspath = null;

    /**
     * Add a Parameter.
     *
     * @param param a <code>Parameter</code> value
     */
    public void addConfiguredParam(Parameter param) {
        parameters.put(param.getName(), param.getValue());
    }

    /**
     * Add resource collection
     * @param rc resource collection to add
     */
    public void add(ResourceCollection rc) {
        resources.add(rc);
    }

    /**
     * The classpath to use when looking up a resource.
     * @param classpath to add to any existing classpath
     */
    public void setClasspath(Path classpath) {
        if (this.classpath == null) {
            this.classpath = classpath;
        } else {
            this.classpath.append(classpath);
        }
    }

    /**
     * The classpath to use when looking up a resource.
     * @return a path to be configured
     */
    public Path createClasspath() {
        if (this.classpath == null) {
            this.classpath = new Path(getProject());
        }
        return this.classpath.createPath();
    }

    /**
     * the classpath to use when looking up a resource,
     * given as reference to a &lt;path&gt; defined elsewhere
     * @param r a reference to a classpath
     */
    public void setClasspathRef(Reference r) {
        createClasspath().setRefid(r);
    }

    /**
     * Get the classpath used when looking up a resource.
     * Default classpath is base dir from project
     * @return the classpath
     */
    public Path getClasspath() {
        if (classpath == null){
            classpath = new Path(getProject(), getProject().getBaseDir().getPath());
        }
        return classpath;
    }

    /**
     * Define the mapper to map source to destination files.
     * @return a mapper to be configured.
     * @exception BuildException if more than one mapper is defined.
     */
    public Mapper createMapper() throws BuildException {
        if (mapperElement != null) {
            throw new BuildException("Cannot define more than one mapper",
                                     getLocation());
        }
        mapperElement = new Mapper(getProject());
        return mapperElement;
    }

    /**
     * Returns the mapper to use based on nested elements or the
     * flatten attribute.
     */
    private FileNameMapper getMapper() {
        FileNameMapper mapper = null;
        if (mapperElement != null) {
            mapper = mapperElement.getImplementation();
        } else {
            mapper = new IdentityMapper();
        }
        return mapper;
    }

    /**
     * Add a nested filenamemapper.
     * @param fileNameMapper the mapper to add.
     */
    public void add(FileNameMapper fileNameMapper) {
        createMapper().add(fileNameMapper);
    }

    /**
     * Boolean to control whether failure to execute should throw a BuildException
     * or just print an error.
     *
     * @param failOnError
     */
    public void setFailonerror(boolean failOnError){
        this.failOnError = failOnError;
    }
    /**
     * Returns current value of failOnError flag.
     * @return failOnError flag
     */
    public boolean isFailonerror(){
        return failOnError;
    }

    /**
     * Returns destination directory
     * @return the destDir
     */
    public File getDestDir() {
        return destDir;
    }

    /**
     * Sets destination directory
     * @param destDir the destDir to set
     */
    public void setDestDir(File destDir) {
        this.destDir = destDir;
    }

    /**
     * Returns single destination file
     * @return the destFile
     */
    public File getDestFile() {
        return destFile;
    }

    /**
     * Sets destination file
     * @param destFile the destFile to set
     */
    public void setDestFile(File destFile) {
        this.destFile = destFile;
    }


    /**
     * Returns source directory
     * @return the srcDir
     */
    public File getSrcDir() {
        return srcDir;
    }

    /**
     * Sets source directory
     * @param srcDir the srcDir to set
     */
    public void setSrcDir(File srcDir) {
        this.srcDir = srcDir;
    }


    /**
     * Returns source file
     * @return the srcFile
     */
    public File getSrcFile() {
        return srcFile;
    }

    /**
     * Sets source file
     * @param srcFile the srcFile to set
     */
    public void setSrcFile(File srcFile) {
        this.srcFile = srcFile;
    }

    /**
     * Returns classname of transformation (simple or full classname)
     * @return the classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * Sets classname of transformation (simple or full classname)
     * @param classname the classname to set
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * Initializes default class loader. 
     * It inherits from classloader, which was used to load this task, therefore
     * build-in classes and resources are loaded automatically. 
     *
     * Notice: task's classpath has priority over default classpath,
     * therefore we are able to easily override resources (templates)
     */
    protected void initClassloader(){
        // NOTICE: we should use the same classloader, which was used to load this task
        // otherwise we won't be able to cast instances
        // (that were loaded via different class loaders)

        // we are introducting workaround,
        // that tries to add classpath for current task to original class loader
        // and stores original classpath
        // after the task is executed, classpath is restored

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader instanceof AntClassLoader){
            // add defined classpath 
            AntClassLoader antClassLoader = (AntClassLoader)classLoader;
            antClassLoader.setParentFirst(false);
            antClassLoader.setProject(getProject());
            savedClasspath = antClassLoader.getClasspath();

            Path cp = getClasspath();
            // add defined classpath to original path
            cp.add(new Path(getProject(), savedClasspath));
            antClassLoader.setClassPath(cp);
        } else {
            // create new class loader
            classLoader = new AntClassLoader(getClass().getClassLoader(), getProject(), getClasspath(), false);
        }

        // set this class loader as new class loader for whole thread
        // ContextClassLoader is used in StringTemplate's PathGroupLoader and other classes
        Thread.currentThread().setContextClassLoader(classLoader);
    }

    /**
     * Restores default class loader.
     */
    protected void restoreClassloader(){
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader instanceof AntClassLoader && savedClasspath!=null){
            AntClassLoader antClassLoader = (AntClassLoader)classLoader;
            antClassLoader.setClassPath(new Path(getProject(), savedClasspath));
            savedClasspath = null;
        }
    }

    /**
     * Protected method for simplyfied addinng of mapped files
     * @param file file to add
     * @param baseDir base directory for file
     */
    protected void addMappedFile(File file, File baseDir){
        if (file.isFile()){
            if (baseDir == null) baseDir = file.getParentFile();
            MappedFile mappedFile = new MappedFile();
            mappedFile.setFrom(file);
            String filename = file.getName();

            String[] names = getMapper().mapFileName(filename);
            // we don't use original filename if no mapping is available
            if (names == null || names.length==0) return;   

            File newFile = new File(file.getParent()+System.getProperty("file.separator")+names[0]);
            if (getDestDir()!=null){
                try {
                    newFile = new File(newFile.getCanonicalPath().replace(baseDir.getCanonicalPath(), getDestDir().getCanonicalPath()));
                } catch (IOException ex) {
                    log("Couldn't map file", ex, Project.MSG_WARN);
                    return;
                }
            }
            mappedFile.setTo(newFile);
            mappedFiles.add(mappedFile);
        } else if (file.isDirectory()){
            if (baseDir == null) baseDir = file;
            DirectoryScanner ds = new DirectoryScanner();
            ds.setBasedir(file);
            ds.scan();

            for (String fileName:ds.getIncludedFiles()){
                addMappedFile(new File(file+System.getProperty("file.separator")+fileName), baseDir);
            }
        }
    }
    /**
     * Simplyfied method for adding file without base directory
     * @param file file to add
     */
    protected void addMappedFile(File file){
        addMappedFile(file, null);
    }

    /**
     * Returns list of mapped files, that should be transformed. Files
     * can by specified via attributes (srcFile, srcDir) or resources
     * (FileSet, FileList, DirSet, etc). Mapped file
     * represents input and output file for transformation. 
     *
     * @return list of mapped files
     */
    public List<MappedFile> getMappedFiles(){
        mappedFiles.clear();

        // one src file
        if (getSrcFile()!=null)
            addMappedFile(getSrcFile());

        if (getSrcDir()!=null)
            addMappedFile(getSrcDir());

        Iterator element = resources.iterator();
        while (element.hasNext()) {
            ResourceCollection rc = (ResourceCollection) element.next();
            if (rc instanceof FileSet && rc.isFilesystemOnly()) {
                FileSet fs = (FileSet) rc;
                File fromDir = fs.getDir(getProject());
                DirectoryScanner ds = null;
                try {
                    ds = fs.getDirectoryScanner(getProject());
                } catch (BuildException ex) {
                    log("Could not scan directory "+fromDir, ex, Project.MSG_ERR);
                    continue;
                }
                for (String f:ds.getIncludedFiles())
                    addMappedFile(new File(fromDir+System.getProperty("file.separator")+f), fromDir);
            } else {
                if (!rc.isFilesystemOnly()){
                    log("Only filesystem resources are supported", Project.MSG_WARN);
                    continue;
                }
                Iterator rcIt = rc.iterator();
                while (rcIt.hasNext()) {
                    Resource r = (Resource) rcIt.next();
                    if (!r.isExists()) {
                        log("Could not find resource "
                            + r.toLongString(), Project.MSG_VERBOSE);
                        continue;
                    }

                    if (r instanceof FileResource) {
                        FileResource fr = (FileResource) r;
                        addMappedFile(fr.getFile(), fr.getBaseDir());
                    } else {
                        log("Only file resources are supported ("+r.getClass().getSimpleName()+" found)", Project.MSG_WARN);
                        continue;
                    }
               }
            }
        }

        return mappedFiles;
    }

    /**
     * Initialization of the task.
     *
     * @throws BuildException in case an error occured
     */
    @Override
    public void init() throws BuildException {
        Logger baselogger = Logger.getLogger("org.cesta");
        baselogger.setLevel(Level.ALL);

        // we want to disable other handlers and pass everything to Ant
        for(Handler h:baselogger.getHandlers())
            baselogger.removeHandler(h);
        
        // create TaskLogHandler, which forwards all messages to Ant logging subsystem
        Handler handler = new TaskLogHandler(this);
        handler.setFormatter(new TaskLogFormatter());
        handler.setLevel(Level.ALL);
        baselogger.addHandler(handler);
    }

    /**
     * Main entry point for this task. It creates transformation specified by 
     * classname attribute, passes all parameters and executes it.
     *
     * @throws BuildException if an error occured
     */
    @Override
    public void execute() throws BuildException {
        if (getClassname()==null)
            throw new BuildException("Classname of transformation is not set.");

        if (getSrcFile()!=null && getSrcDir()!=null)
            throw new BuildException("Both srcFile and srcDir were set.");

        if (getDestFile()!=null && getDestDir()!=null)
            throw new BuildException("Both destFile and destDir were set.");

        if (!resources.isEmpty() && (getSrcFile()!=null || getSrcDir()!=null ))
            throw new BuildException("Resources can't be combined with srcFile or srcDir.");
        
        initClassloader();

        try {
            TransformationLoader loader = new TransformationLoader(Thread.currentThread().getContextClassLoader());
            Transformation transObj = null;
            try {
                transObj = loader.getInstance(getClassname());
            } catch (InstantiationException ex){
                throw new BuildException("Transformation couldn't be instanciated", ex);
            } catch (IllegalAccessException ex) {
                throw new BuildException("Transformation couldn't be accessed", ex);
            }

            if (transObj==null)
                throw new BuildException("Transformation "+getClassname()+" couldn't be loaded");

            List<MappedFile> files = getMappedFiles();
            if (files.size()==0){
                log("No files specified, "+transObj.getClass().getSimpleName()+" skipped", Project.MSG_INFO);
                return;
            }
            for (MappedFile mf:files)
                log("Mapped file "+mf.getFrom()+" to "+mf.getTo(), Project.MSG_VERBOSE);

            transObj.setParam("baseDir", getProject().getBaseDir().getPath());
            transObj.setMappedFiles(files);
            transObj.setParams(parameters);

            for (String key:parameters.keySet())
                log("Parsed parameter "+key+" = "+parameters.get(key)+" ("+parameters.get(key).getClass().getName()+")", Project.MSG_VERBOSE);

            try {
                log("Executing transformation "+transObj.getClass().getSimpleName()+" on "+mappedFiles.size()+" files");
                transObj.execute();
            } catch (TransformationException ex){
                log("Transformation has failed", ex, Project.MSG_ERR);
                if (isFailonerror())
                    throw new BuildException("Transformation has failed.", ex);
            }
        } finally {
            restoreClassloader();
        }
    }
}
