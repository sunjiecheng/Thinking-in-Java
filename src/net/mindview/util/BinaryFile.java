package net.mindview.util;

import java.io.*;

/**
 * @author jiecheng
 * @create 2017-11-16 下午11:40
 */
public class BinaryFile {
    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(
                new FileInputStream(bFile)
        );

        byte[] data = new byte[bf.available()];
        bf.read(data);
        return data;
    }
}
