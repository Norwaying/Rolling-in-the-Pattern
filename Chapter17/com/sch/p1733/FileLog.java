package com.sch.p1733;

/**
 * Created by Nov on 2015/5/15.
 */
public class FileLog implements LogStrategy {
    @Override
    public void log(String msg) {
        System.out.println("把"+msg+"记录到文件中");
    }
}
