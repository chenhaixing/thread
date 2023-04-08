package com.chenhaixing.mode.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public Student build(){
        builder.setName();
        builder.setAge();
        builder.setSex();
        return  builder.getResult();
    }
}
