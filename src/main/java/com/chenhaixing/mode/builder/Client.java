package com.chenhaixing.mode.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder=new StudentBuilder();
        Director director = new Director(builder);
        System.out.println(director.build().toString());
    }
}
