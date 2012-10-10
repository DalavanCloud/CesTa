package org.cesta.trans;

/**
 * Default exception, which is thrown in case that transformation
 * has failed.
 *
 * @author tobias
 */
public class TransformationException extends Exception {
    public TransformationException(){
        super();
    }
    public TransformationException(String message){
        super(message);
    }
    public TransformationException(Throwable caused){
        super(caused);
    }
    public TransformationException(String message, Throwable caused){
        super(message, caused);
    }
}
