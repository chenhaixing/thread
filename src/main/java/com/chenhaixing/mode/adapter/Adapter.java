package com.chenhaixing.mode.adapter;

public class Adapter extends Dog implements Robot {
    public void cry() {
        System.out.println("机器人叫");
        super.wang();
    }

    public void move() {
        System.out.println("机器人移动");
        super.zou();
    }
}
