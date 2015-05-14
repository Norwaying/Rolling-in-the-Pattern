package sch.p223;

/**
 * Created by Nov on 2015/5/14.
 */
public class ImplA implements Api {
    @Override
    public void operation(String s){
        System.out.println("ImplA is s=" + s);
    }
}
