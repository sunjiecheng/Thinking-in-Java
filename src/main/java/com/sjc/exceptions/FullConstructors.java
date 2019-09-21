package com.sjc.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午10:31
 */
public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throw MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException {
        System.out.println("Throw MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }

}

class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
