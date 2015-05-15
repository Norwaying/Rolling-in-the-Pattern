package com.sch.p2212;

/**
 * Created by Nov on 2015/5/15.
 */
public class Client {
    public static void main(String[] args){
        Coffee coffee = new BlackCoffee();  //（具体）被装饰对象

        coffee = new CoffeeAndMilk(coffee); //(具体)装饰对象
        coffee = new CoffeeAndSugar(coffee);    //（具体）装饰对象

        System.out.println("the cost is "+coffee.costs());
        System.out.println("the contain is "+coffee.contains());
    }
}
