package com.chenhaixing.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

import static com.chenhaixing.thread.Thread2.getCurThreadName;

public class Thread6 implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("你好啊");
        return "你好";
    }

    public static void main(String[] args) throws Exception {
        Thread6 thread6 = new Thread6();
        FutureTask<String> futureTask = new FutureTask<String>(thread6);
        Thread thread = new Thread(futureTask);
        thread.start();
        Thread.sleep(3000);
        System.out.println(futureTask.get());
        System.out.println(futureTask.isDone());
    }
}
