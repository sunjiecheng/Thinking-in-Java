package exercise.chapter12.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author jiecheng
 * @create 2019-09-21 下午12:07
 */
public class E06_LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw new LoggerException1();
        } catch (LoggerException1 e) {
//            System.out.println(e);
        }
        try {
            throw new LoggerException2();
        } catch (LoggerException2 e) {
//            System.out.println(e);
        }
    }
}

class LoggerException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggerException1");

    public LoggerException1() {
        StringWriter s = new StringWriter();
        printStackTrace(new PrintWriter(s));
        logger.severe(s.toString());
    }

}

class LoggerException2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggerException2");

    public LoggerException2() {
        StringWriter s = new StringWriter();
        printStackTrace(new PrintWriter(s));
        logger.severe(s.toString());
    }
}
