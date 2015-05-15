package com.sch.p1724;

/**
 * Created by Nov on 2015/5/15.
 */
public class OldConsumerStrategy implements Strategy {
    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("老客户统一折扣5%");
        return goodsPrice;
    }
}
