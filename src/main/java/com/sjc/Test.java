package com.sjc;

import java.util.concurrent.TimeUnit;

/**
 * @author jiecheng
 * @create 2018-01-23 下午10:58
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        long before = System.nanoTime();
        TimeUnit.SECONDS.sleep(1);
        long after = System.nanoTime();
        System.out.println(after - before);
    }
}
