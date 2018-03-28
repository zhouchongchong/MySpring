package com.java.science.socket;


import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: aiying014
 * Created by 76409 on 13:33 2018/3/16.
 * @Description:
 */
public class SocketClient  {
	public static void main(String[] args) throws Exception {

		String ip = "127.0.0.1";
		int port = 55533;
		Socket socket = new Socket(ip, port);

		OutputStream outputStream = socket.getOutputStream();
		String message = "hello zhouchong compute";
		socket.getOutputStream().write(message.getBytes());
		outputStream.close();
		socket.close();
	}
}
