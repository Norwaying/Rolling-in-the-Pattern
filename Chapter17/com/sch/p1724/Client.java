package com.sch.p1724;

/**
 * Created by Nov on 2015/5/15.
 */
public class Client {
    public static void main(String[] args){
        Strategy strategy = new LargeConsumerStrategy();
        Price price = new Price(strategy);
        System.out.println("向客户报价 "+price.quote(2000));
    }
}
