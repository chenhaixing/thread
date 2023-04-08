package com.chenhaixing.netty.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
    public static void main(String[] args) throws Exception {
        transTo();
    }
    public static void write() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\text.txt");
        FileChannel channel = fileOutputStream.getChannel();

        ByteBuffer allocate = ByteBuffer.allocate(1024);
        String str="我是陈海星";
        allocate.put(str.getBytes());
        allocate.flip();
        channel.write(allocate);
        fileOutputStream.close();
    }
    public static void read() throws Exception {
        FileInputStream fileOutputStream = new FileInputStream("d:\\text.txt");
        FileChannel channel = fileOutputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        channel.read(allocate);
//        allocate.flip();
        System.out.println(new String(allocate.array()));
        fileOutputStream.close();
    }
    public static void readTo() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("d:\\text.txt");
        FileChannel channel = fileInputStream.getChannel();
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\text2.txt");
        FileChannel channel1 = fileOutputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(50);
        while (true){
            allocate.clear();
            int read = channel.read(allocate);
            if(read==-1){
                break;
            }
            allocate.flip();
            channel1.write(allocate);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
    public static void transTo() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("d:\\text.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\text4.txt");
        FileChannel channel = fileInputStream.getChannel();
        FileChannel channel1 = fileOutputStream.getChannel();
        channel.transferTo(0,channel.size(),channel1);
        channel.close();;
        channel1.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
