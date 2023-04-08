package com.chenhaixing.netty.nio;

import java.nio.IntBuffer;

public class Test {
    public static void main(String[] args) {
       IntBuffer intBuffer=IntBuffer.allocate(5);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i*10);
        }
        String str="";
        intBuffer.flip();
        while (intBuffer.hasRemaining()){
            System.out.println(intBuffer.get());
        }
    }
}
