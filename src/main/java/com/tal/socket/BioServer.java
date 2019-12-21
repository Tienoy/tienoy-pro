package com.tal.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * BIO instance
 *
 * @Author: Tal
 * @Date: 2019/12/21 14:41
 */
public class BioServer {

    public static void startBioServer() throws IOException {

        //创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        //创建server socket
        ServerSocket serverSocket = new ServerSocket(890);

        //监听事件
        while (true) {
            Socket socket = serverSocket.accept();
            BioHandler(socket);
        }

    }

    private static void BioHandler(Socket socket) throws IOException {
        while (true) {
            byte[] bytes = new byte[1024];
            InputStream inputStream = socket.getInputStream();
            int readLength = inputStream.read(bytes);
            if (readLength == -1) {
                break;
            }
            System.out.println(new String(bytes, 0, bytes.length));
        }
    }


}
