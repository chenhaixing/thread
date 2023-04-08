package com.chenhaixing.thread;

public class Thread1{
    public static void main(String[] args) {
        System.out.println("线程ID："+Thread.currentThread().getId());
        System.out.println("线程名称："+Thread.currentThread().getName());
        System.out.println("线程优先级："+Thread.currentThread().getPriority());
        System.out.println("线程状态："+Thread.currentThread().getState());
    }
}
