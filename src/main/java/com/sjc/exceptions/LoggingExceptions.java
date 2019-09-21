package com.sjc.exceptions;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author jiecheng
 * @create 2019-09-21 上午11:08
 */
public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {

        }
    }
}

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingExceptions");

    public LoggingException() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}
