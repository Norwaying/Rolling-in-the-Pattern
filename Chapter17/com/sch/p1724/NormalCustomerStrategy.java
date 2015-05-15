package com.sch.p1724;

/**
 * Created by Nov on 2015/5/15.
 */
public class NormalCustomerStrategy implements Strategy {
    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("普通客户没有折扣");
        return goodsPrice;
    }
}
