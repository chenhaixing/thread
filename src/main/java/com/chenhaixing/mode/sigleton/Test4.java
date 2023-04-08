package com.chenhaixing.mode.sigleton;

import com.chenhaixing.mode.Student;
/**
 * 单例模式_静态内部类
 */
public class Test4 {

    private static class HoldClass{
        private static final Test4 instance=new Test4();
    }
    public static Test4 getInstance(){
        System.out.println(HoldClass.instance);
        return HoldClass.instance;
    }

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Test4.getInstance();
            }
        }.start();
    }
}
