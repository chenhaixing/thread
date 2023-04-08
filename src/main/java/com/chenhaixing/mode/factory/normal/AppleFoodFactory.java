package com.chenhaixing.mode.factory.normal;

public class AppleFoodFactory implements FoodFactory {

    public Food create() {
        System.out.println("苹果工厂");
        return new AppleFood();
    }
}
