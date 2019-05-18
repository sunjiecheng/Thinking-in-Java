package com.sjc.enumerated;

import net.mindview.util.Enums;

/**
 * @author jiecheng
 * @create 2017-12-07 下午11:31
 */
enum Activity {
    SITTING, LYING, STANDING, HOPPING,
    RUNNING, DODGING, JUMPING, FALLING, FLYING
}

public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }
}
