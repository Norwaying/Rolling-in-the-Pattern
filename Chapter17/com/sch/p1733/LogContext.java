package com.sch.p1733;

/**
 * Created by Nov on 2015/5/15.
 */
public class LogContext {
    public void log(String msg){
        LogStrategy strategy = new DbLog();
        try{
            strategy.log(msg);
        }
        catch (Exception e){
            strategy = new FileLog();
            strategy.log(msg);
        }


    }
}
