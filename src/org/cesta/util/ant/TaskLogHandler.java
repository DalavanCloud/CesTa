package org.cesta.util.ant;

import java.util.logging.ErrorManager;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;

/**
 * Log handler, which forwards all log messages to task's default
 * handler. This way we are able to use Java Logging API in tasks
 * and still be able to deal with logging listeners via Ant.
 *
 * @author Tobias Smolka
 */
public class TaskLogHandler extends Handler {
    private Task task = null;

    /**
     * Default constructor.
     * @param task Task which will handle the logging
     */
    public TaskLogHandler(Task task){
        setTask(task);
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) {
	    return;
	}
	String msg;
	try {
 	    msg = getFormatter().format(record);
	} catch (Exception ex) {
	    // We don't want to throw an exception here, but we
	    // report the exception to any registered ErrorManager.
	    reportError(null, ex, ErrorManager.FORMAT_FAILURE);
	    return;
	}

	try {
            int msgLevel = Project.MSG_INFO;
            if (record.getLevel()==Level.SEVERE) msgLevel=Project.MSG_ERR;
            else if (record.getLevel()==Level.WARNING) msgLevel=Project.MSG_WARN;
            else if (record.getLevel()==Level.FINEST) msgLevel=Project.MSG_DEBUG;
            else if (record.getLevel()==Level.FINER) msgLevel=Project.MSG_VERBOSE;  // or debug?
            else if (record.getLevel()==Level.CONFIG) msgLevel=Project.MSG_VERBOSE;
            else if (record.getLevel()==Level.FINE) msgLevel=Project.MSG_VERBOSE;
            
            if (record.getThrown()!=null) getTask().log(msg, record.getThrown(), msgLevel);
            else getTask().log(msg, msgLevel);
	} catch (Exception ex) {
	    // We don't want to throw an exception here, but we
	    // report the exception to any registered ErrorManager.
	    reportError(null, ex, ErrorManager.WRITE_FAILURE);
	}
    }

    @Override
    public void flush() {
        
    }

    @Override
    public void close() throws SecurityException {
        
    }

    @Override
    public boolean isLoggable(LogRecord record) {
	if (getTask() == null) {
	    return false;
	}
	return super.isLoggable(record);
    }

    /**
     * @return the task
     */
    public Task getTask() {
        return task;
    }

    /**
     * @param task the task to set
     */
    public void setTask(Task task) {
        this.task = task;
    }

    

}
