package org.cesta.util;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * Custom formatter for logged records from tasks. It simply passes forward
 * the message from log record. 
 *
 * @author Tobias Smolka
 */
public class TaskLogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        String message = formatMessage(record);
	return message;
    }

}
