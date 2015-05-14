package com.sch.p313;

/**
 * Created by Nov on 2015/5/14.
 */
public class Facade {
    public void generate(){
        new Presentation().generate();
        new Business().generate();
    }
}
