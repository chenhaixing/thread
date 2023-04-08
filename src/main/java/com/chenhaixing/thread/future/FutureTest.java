package com.chenhaixing.thread.future;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class FutureTest {

    public static class ChildrenTask implements  Callable<String>{

        @Override
        public String call() throws Exception {
            return "hello："+Thread.currentThread().getName();
        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<String>> list=new ArrayList<Future<String>>();
//        ExecutorService executorService=Executors.newFixedThreadPool(3);
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(3, 8, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(60));
        for(int i=0;i<20;i++){
            list.add(executorService.submit(new ChildrenTask()));
        }
        executorService.shutdown();
        for(Future<String> item:list){
            System.out.println(item.get());
        }
    }
}
