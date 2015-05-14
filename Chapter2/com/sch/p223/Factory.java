package sch.p223;

/**
 * Created by Nov on 2015/5/14.
 */
public class Factory {
    public static Api createApi(int condtion){
        Api api = null;
        if(condtion == 1)   //可使用配置文件，动态创建，无需再新增实现类时，修改工厂类。
            api = new ImplA();
        else
            api = new ImplB();
        return api;
    }
}
