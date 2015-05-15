package com.sch.p1733;

/**
 * Created by Nov on 2015/5/15.
 */
public class DbLog implements LogStrategy {
    @Override
    public void log(String msg) {
        if(msg.trim().length()>5) {
            int a = 5 / 0;
        }
        System.out.println("把"+msg+"记录到数据库中");
    }
}
