//: exceptions/E07_LoggedArrayIndexBounds.java
/****************** Exercise 7 ******************
 * Modify Exercise 3 so that the catch clause logs
 * the results.
 ***********************************************/
package exercise.chapter12.exceptions;

import java.util.logging.*;
import java.io.*;

public class E07_LoggedArrayIndexBounds {
    private static Logger logger =
            Logger.getLogger("E07_LoggedArrayIndexBounds");

    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String args[]) {
        char[] array = new char[10];
        try {
            array[10] = 'x';
        } catch (ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}