package com.sjc.consurrency;

/**
 * @author jiecheng
 * @create 2017-12-23 下午3:15
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
