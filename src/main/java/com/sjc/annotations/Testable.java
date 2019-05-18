package com.sjc.annotations;

import net.mindview.atunit.Test;

/**
 * @author jiecheng
 * @create 2017-12-19 下午8:36
 */
public class Testable {
    public void execute() {
        System.out.println("Executing");
    }

    @Test
    void testExecute() {
        execute();
    }
}
