package com.chenhaixing.thread;

import java.util.concurrent.*;

public class Thread7 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("你好啊");
        return "你好";
    }

    public static void main(String[] args) throws Exception {
        Thread7 thread7 = new Thread7();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> submit = executorService.submit(thread7);
        System.out.println(submit.get());
    }
}
