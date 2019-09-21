package com.sjc.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 下午4:21
 */
public class Rethrowing {
    static void f() throws Exception {
        System.out.println("throw from f()");
        throw new Exception();
    }

    static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("throw from g()");
            throw e;
        }
    }

    static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("throw from h()");
            throw (Exception) e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            h();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
}
