package com.sjc.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author jiecheng
 * @create 2018-09-30 下午10:59
 */
public class DirList {
    public static void main(String[] args) {
        File file = new File(".");
        String[] list = null;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }

    }
}

class DirFilter implements FilenameFilter {
    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    private Pattern pattern;

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
