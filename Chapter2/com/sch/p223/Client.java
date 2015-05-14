package sch.p223;

/**
 * Created by Nov on 2015/5/14.
 */
public class Client {
    public static void main(String[] args){
        Api api = Factory.createApi(1);
        api.operation("ddd");
    }
}
