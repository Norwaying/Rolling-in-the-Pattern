package com.sch.p313;

/**
 * Created by Nov on 2015/5/14.
 */
public class Business {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenBussiness()){
            System.out.println("生成业务层");
        }
    }
}
