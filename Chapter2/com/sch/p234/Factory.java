package sch.p234;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Nov on 2015/5/14.
 * 利用反射和配置文件实现工厂
 * 简单工厂的本质：选择实现
 * 抽象工厂里有多个创建对象的方法
 * 工厂方法是把"选择具体实现"的方法延迟到子类中去实现
 */
public class Factory {
    public static Api createApi_1(){    //抽象工厂
        return  null;
    }
    public static Api createApi(){
        Properties properties = new Properties();
        InputStream inputStream = null;
        inputStream = Factory.class.getResourceAsStream("FactoryTest.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api = null;
        try {
            api = (Api)Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
