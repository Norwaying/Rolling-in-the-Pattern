package com.sch.p2212;

/**
 * Created by Nov on 2015/5/15.
 * 此抽象类的目的是为了拓展，如果就一个装饰者，可以直接实现类。
 */
public class CoffeeDecorator extends Coffee {
    protected final Coffee coffee;  //采用组合方式使用功能

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double costs() { //为了计算具体被装饰对象的
        return coffee.costs();
    }

    @Override
    public String contains() {  //为了计算具体被装饰对象的
        return coffee.contains();
    }
}
