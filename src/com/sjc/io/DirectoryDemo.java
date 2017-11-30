package com.sjc.io;

import net.mindview.util.Directory;
import net.mindview.util.PPrint;

import java.io.File;

import static net.mindview.util.Print.print;

/**
 * @author jiecheng
 * @create 2017-11-12 下午6:44
 */
public class DirectoryDemo {
    public static void main(String[] args) {
        // All directories:
        PPrint.pprint(Directory.walk(".").dirs);
        // All files beginning with 'T'
        for (File file : Directory.local(".", "T.*")) {
            print(file);
        }
        print("----------------------");
        // All Java files beginning with 'T':
        for (File file : Directory.walk(".", "T.*\\.java")) {
            print(file);
        }
        print("======================");
        // Class files containing "Z" or "z":
        for (File file : Directory.walk(".", ".*[Zz].*\\.class")) {
            print(file);
        }
    }

}
