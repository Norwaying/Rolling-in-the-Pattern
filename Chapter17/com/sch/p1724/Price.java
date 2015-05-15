package com.sch.p1724;

/**
 * Created by Nov on 2015/5/15.
 */
public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    //报价
    public double quote(double goodsPrice){
        return strategy.calPrice(goodsPrice);
    }
}
