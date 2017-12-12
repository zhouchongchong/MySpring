package com.java.science.test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @Author: aiying014
 * Created by zcc on 18:51 2017/12/6.
 * @Description:
 */
public class MyUtil {
	public MyUtil() {

	}

	public static void fileCopy(String source,String target) throws  Exception{
		try (InputStream in = new FileInputStream(source)){
			try (OutputStream out = new FileOutputStream(target)){
				byte[] buffer = new byte[4096];
				int bytesToRead;
				while ((bytesToRead = in.read(buffer))!= -1){
					out.write(buffer,0,bytesToRead);
				}
			}
		}
	}

	public static void fileCopyNIO(String source,String target) throws IOException{
		try (FileInputStream in = new FileInputStream(source)){
			try(FileOutputStream out = new FileOutputStream(target)){
				FileChannel inChannel = in.getChannel();
				FileChannel outChannel = out.getChannel();
				ByteBuffer buffer = ByteBuffer.allocate(4096);
				while (inChannel.read(buffer) != -1){
					buffer.flip();
					outChannel.write(buffer);
					buffer.clear();
				}
			}
		}
	}

	public static void main(String[] args) throws  Exception {
		String s = "bacda";
		System.out.println(s.indexOf("a"));
		MyUtil.class.getConstructor().newInstance();
	}
}
