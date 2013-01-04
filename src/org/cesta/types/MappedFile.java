package org.cesta.types;

import java.io.File;

/**
 * Simple class which holds mapped files. Mapped file has it's from
 * and to File object. It is used to tell transformations on which files
 * they should work and where to write the result.
 * @author Tobias Smolka
 */
public class MappedFile {
    
    /** Input file (read)*/
    protected File from;
    
    /** Output file (write)*/
    protected File to;

    /**
     * Default constructor without parameters
     */
    public MappedFile(){

    }

    /**
     * Overloaded constructor with filenames instead of Files
     * 
     * @param from Input filename
     * @param to Output filename
     */
    public MappedFile(String from, String to){
        this(new File(from), new File(to));
    }
    
    /**
     * Default constructor
     *
     * @param from Input file
     * @param to Output file
     */
    public MappedFile(File from, File to){
        this.from = from;
        this.to = to;
    }

    /**
     * @return the output file
     */
    public File getFrom() {
        return from;
    }

    /**
     * @param from the input file
     */
    public void setFrom(File from) {
        this.from = from;
    }

    /**
     * @return the output file
     */
    public File getTo() {
        return to;
    }

    /**
     * @param to output file
     */
    public void setTo(File to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MappedFile other = (MappedFile) obj;
        if (this.from != other.from && (this.from == null || !this.from.equals(other.from))) {
            return false;
        }
        if (this.to != other.to && (this.to == null || !this.to.equals(other.to))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.from != null ? this.from.hashCode() : 0);
        hash = 97 * hash + (this.to != null ? this.to.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString(){
        return getFrom()+" -> "+getTo();
    }
}
