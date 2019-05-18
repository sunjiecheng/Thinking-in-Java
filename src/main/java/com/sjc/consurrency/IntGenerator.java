package com.sjc.consurrency;

/**
 * @author jiecheng
 * @create 2018-01-19 下午9:58
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
