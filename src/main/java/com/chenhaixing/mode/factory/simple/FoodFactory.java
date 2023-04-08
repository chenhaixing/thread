package com.chenhaixing.mode.factory.simple;

import com.sun.org.apache.xpath.internal.operations.Or;

public class FoodFactory {

    public static Food eat(char name){
        Food food=null;
        switch(name){
            case '1':
                food=new BananaFood();
                break;
            case '2':
                food=new AppleFood();
                break;
            case '3':
                food=new OrangeFood();
                break;
            default:
                break;
        }
        return food;
    }
}
