package com.chenhaixing.thread;

public class Thread3 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread3());
        Thread thread2 = new Thread(new Thread3());
        Thread thread3 = new Thread(new Thread3());
        thread.setDaemon(true);
        thread.start();
        thread2.start();
        thread3.start();
        thread.join();
        thread2.join();
        thread3.join();
        System.out.println("game over");
    }
}
