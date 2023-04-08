package com.chenhaixing.mode.factory.type;

public class Client {
    public static void main(String[] args) {
        BrandFactory brandFactory=new AmdFactory();
        brandFactory.getCpu().getCpu();
        brandFactory.getMainboard().getMainboard();
    }
}
