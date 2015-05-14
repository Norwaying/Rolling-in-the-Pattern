package sch.p213;

/**
 * Created by Nov on 2015/5/14.
 * Main Client
 */
public class Client {
    public static void main(String[] args){
        Api api = new Impl();
        api.test1("hahah");
    }
}
