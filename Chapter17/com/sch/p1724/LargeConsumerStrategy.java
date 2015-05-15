package com.sch.p1724;

/**
 * Created by Nov on 2015/5/15.
 */
public class LargeConsumerStrategy implements Strategy {
    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("大客户统一10%");
        return goodsPrice;
    }
}
