package com.chenhaixing.mode.factory.normal;

public class BananaFoodFactory implements FoodFactory {

    public Food create() {
        System.out.println("橘子工厂");
        return new BananaFood();
    }
}
