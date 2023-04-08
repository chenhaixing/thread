package com.chenhaixing.thread;

public class Thread4 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("我是："+i);
                }
            }
        }).start();
        System.out.println("结束了。。。。。。。。");
    }
}
