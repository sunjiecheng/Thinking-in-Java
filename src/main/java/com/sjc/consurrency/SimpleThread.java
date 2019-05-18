package com.sjc.consurrency;

/**
 * @author jiecheng
 * @create 2018-01-09 下午11:23
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        // Store the thread name:
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + "), ";
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }*/
        Integer n = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(n));
    }
}
