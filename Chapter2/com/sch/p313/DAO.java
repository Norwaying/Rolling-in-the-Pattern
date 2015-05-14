package sch.p313;

/**
 * Created by Nov on 2015/5/14.
 */
public class DAO {
    public void generate(){
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenDAO()){
            System.out.println("生成数据层");
        }
    }
}
