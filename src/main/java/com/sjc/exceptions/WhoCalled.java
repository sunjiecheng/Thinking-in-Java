package com.sjc.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 下午4:13
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception("MyException");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println(element.getMethodName());
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }
}
