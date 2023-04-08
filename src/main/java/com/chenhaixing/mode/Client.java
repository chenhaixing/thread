package com.chenhaixing.mode;

import com.chenhaixing.mode.sigleton.Test4;
import com.chenhaixing.mode.sigleton.Test5;

public class Client {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
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
                System.out.println(Test5.INSTANCE.getInstance());
            }
        }.start();
    }
}
