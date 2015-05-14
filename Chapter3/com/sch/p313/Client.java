package com.sch.p313;

/**
 * Created by Nov on 2015/5/14.
 * 外观模式的本质：封装交互、简化调用。
 */
public class Client {
    public static void main(String[] args){
        new Presentation().generate();
        new Business().generate();
//        使用外观模式
        new Facade().generate();
    }
}
