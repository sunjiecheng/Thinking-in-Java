package net.mindview.util;

import java.util.concurrent.ThreadFactory;

/**
 * @author jiecheng
 * @create 2018-01-09 下午10:38
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
