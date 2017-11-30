package com.sjc.io;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * @author jiecheng
 * @create 2017-11-21 下午9:11
 */
public class Endians {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
        bb.asCharBuffer().put("abcdef");
        print(Arrays.toString(bb.array()));

        bb.rewind();
        bb.order(ByteOrder.BIG_ENDIAN);
        bb.asCharBuffer().put("abcdef");
        print(Arrays.toString(bb.array()));

        bb.rewind();
        bb.order(ByteOrder.LITTLE_ENDIAN);
        bb.asCharBuffer().put("abcdef");
        print(Arrays.toString(bb.array()));
    }
}
