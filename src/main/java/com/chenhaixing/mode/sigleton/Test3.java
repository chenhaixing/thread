package com.chenhaixing.mode.sigleton;

/**
 * 单例模式_双重检查锁
 */
public class Test3 {
    public static volatile Test3 test;

    public Test3() {
    }

    public static Test3 getInstance(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(test==null){
            synchronized (Test3.class){
                if(test==null){
                    test=new Test3();
                }
            }
        }
        System.out.println(test);
        return test;
    }

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                Test3.getInstance();
            }
        }.start();
    }
}
