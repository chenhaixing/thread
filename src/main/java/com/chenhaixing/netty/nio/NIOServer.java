package com.chenhaixing.netty.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(new InetSocketAddress(6000));
        Selector selector = Selector.open();
        serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);
        while (true){
            if(selector.select(2000)==0){
                System.out.println("两秒之内无连接");
                continue;
            }
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()){
                SelectionKey next = iterator.next();
                if(next.isAcceptable()){
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    socketChannel.register(selector,SelectionKey.OP_READ,ByteBuffer.allocate(1024));
                    System.out.println("有连接进来了。。。");
                }
                if(next.isReadable()){
                    SocketChannel socketChannel = (SocketChannel) next.channel();
                    socketChannel.configureBlocking(false);
                    ByteBuffer byteBuffer=(ByteBuffer)next.attachment();
                    socketChannel.read(byteBuffer);
                    System.out.println(new String(byteBuffer.array()));
                    socketChannel.close();
                }
                iterator.remove();
            }
        }
    }
}
