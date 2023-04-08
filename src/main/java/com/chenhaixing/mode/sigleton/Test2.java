package com.chenhaixing.mode.sigleton;

/**
 * 单例模式_懒汉式
 */
public class Test2 {
    private static Test2 test;

    public Test2() {
    }

    public static synchronized Test2 getInstance(){
        if(test==null){
            test=new Test2();
        }
        return test;
    }

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test2.getInstance());
            }
        }.start();
    }
}
