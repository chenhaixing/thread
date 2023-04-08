package com.chenhaixing.mode.sigleton;

/**
 * 单例模式_饿汉式
 */
public class Test1 {

    private static final Test1 test=new Test1();

    public Test1() {
    }

    public static Test1 getInstance(){
        return test;
    }

    public static void main(String[] args) {
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
        System.out.println(Test1.getInstance());
    }
}
