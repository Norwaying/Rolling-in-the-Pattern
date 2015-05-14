package com.sch.p313;

/**
 * Created by Nov on 2015/5/14.
 */
public class Presentation {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenPresentation()){
            System.out.println("生成表示层");
        }
    }


}
