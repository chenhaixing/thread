package com.chenhaixing.mode.factory.normal;

public class Test {
    public static void main(String[] args) {
        FoodFactory foodFactory=new OrangeFoodFactory();
        Food food=foodFactory.create();
        food.eat();
    }
}
