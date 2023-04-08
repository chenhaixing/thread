package com.chenhaixing.netty.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioTest {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("服务启动了");
        while (true){
            System.out.println("accept....................................");
            final Socket socket=serverSocket.accept();
            System.out.println("进来一个线程："+Thread.currentThread().getId()+"；"+Thread.currentThread().getName());
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        while (true){
                            byte[] bytes=new byte[1024];
                            System.out.println("read..............................");
                            int read=  inputStream.read(bytes);
                            if(read!=-1){
                                System.out.println(Thread.currentThread().getId()+"；"+Thread.currentThread().getName());
                                System.out.println(new String(bytes,0,read));
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            });
        }
    }
}
