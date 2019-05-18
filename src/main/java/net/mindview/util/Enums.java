package net.mindview.util;

import java.util.Random;

/**
 * @author jiecheng
 * @create 2017-12-07 下午11:24
 */
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> ec) {
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }
}
