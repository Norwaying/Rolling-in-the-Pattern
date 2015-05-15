package com.sch.p1733;

/**
 * Created by Nov on 2015/5/15.
 * 策略模式的本质：分离算法，选择实现。
 */
public class Client {
    public static void main(String[] args){
        LogContext logContext = new LogContext();
        logContext.log("啦啦啦啦");
        logContext.log("啦啦啦啦");
        logContext.log("啦啦啦啦啦啦啦啦");

    }
}
