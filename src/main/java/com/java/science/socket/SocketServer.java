package com.java.science.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: aiying014
 * Created by 76409 on 9:59 2018/3/16.
 * @Description:
 */
public class SocketServer {
	public static void main(String[] args) throws Exception {
		//制定 server 端口
		int port = 55533;
		ServerSocket server = new ServerSocket(port);

		System.out.println("SocketServer等待你的到来");
		Socket accept = server.accept();

		InputStream inputStream = accept.getInputStream();
		byte[] bytes = new byte[1024];

		int len;
		StringBuilder builder = new StringBuilder();

		while ((len = inputStream.read(bytes)) != -1){
			builder.append(new String(bytes,0,len,"UTF-8"));
		}

		System.out.println("get message from client: " + builder);
		inputStream.close();
		accept.close();
		server.close();
	}
}
