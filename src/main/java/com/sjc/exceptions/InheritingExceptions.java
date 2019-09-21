package com.sjc.exceptions;

/**
 * @author jiecheng
 * @create 2019-09-21 上午10:20
 */
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
        }

    }
}

class SimpleException extends Exception{}
