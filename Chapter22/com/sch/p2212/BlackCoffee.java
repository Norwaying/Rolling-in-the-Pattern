package com.sch.p2212;

/**
 * Created by Nov on 2015/5/15.
 */
public class BlackCoffee extends Coffee {
    @Override
    public double costs() {
        return 1;
    }

    @Override
    public String contains() {
        return "Black Coffee";
    }
}
