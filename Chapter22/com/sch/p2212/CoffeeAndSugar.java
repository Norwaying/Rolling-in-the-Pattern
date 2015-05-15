package com.sch.p2212;

/**
 * Created by Nov on 2015/5/15.
 */
public class CoffeeAndSugar extends CoffeeDecorator {
    public CoffeeAndSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double costs() {
        return super.costs()+1;
    }

    @Override
    public String contains() {
        return super.contains()+" sugar";
    }
}
