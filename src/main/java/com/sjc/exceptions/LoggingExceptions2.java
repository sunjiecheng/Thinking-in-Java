package com.sjc.exceptions;

import sun.rmi.runtime.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author jiecheng
 * @create 2019-09-21 下午12:00
 */
public class LoggingExceptions2 {
    public static Logger logger = Logger.getLogger("LoggingExceptions");

    static void logException(Exception e) {
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }

    }
}
