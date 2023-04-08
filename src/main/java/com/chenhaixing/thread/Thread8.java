package com.chenhaixing.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread8 implements Runnable {

    @Override
    public void run() {
        for(;;){
            System.out.println("我是守护线程。。。。。。。。");
        }
    }

    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Thread8());
        thread.setDaemon(true);
        thread.start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("用户线程："+i);
            }
        }).start();
    }
}
