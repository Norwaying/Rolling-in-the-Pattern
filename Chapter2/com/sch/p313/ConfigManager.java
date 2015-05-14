package sch.p313;

import java.awt.*;

/**
 * Created by Nov on 2015/5/14.
 */
public class ConfigManager {
    private static ConfigManager configManager = null;
    private static ConfigModel configModel = null;
    private ConfigManager(){

    }
    public static ConfigManager getInstance(){
        if(configManager == null){
            configManager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return configManager;
    }

    public ConfigModel getConfigData(){
        return configModel;
    }
}
