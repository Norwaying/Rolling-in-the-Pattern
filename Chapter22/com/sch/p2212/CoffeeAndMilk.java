package com.sch.p2212;

/**
 * Created by Nov on 2015/5/15.
 */
public class CoffeeAndMilk extends CoffeeDecorator {
    public CoffeeAndMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double costs() {
        return super.costs()+20;    //super.costs()计算具体被装饰对象的
    }

    @Override
    public String contains() {
        return super.contains()+" milk";
    }
}
