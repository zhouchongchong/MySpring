package com.java.science.Spring.thread;

/**
 * @Author: aiying014
 * Created by zcc on 10:53 2017/12/18.
 * @Description:
 */
public class BeTestA {
	public BeTestA() {
	}
	public static synchronized void A (String name){
		int count = 0;
		for (int i = 0;i < 10; i++){
			System.out.println(name+"==>MethodA==>"+count++);
		}
	}

	public static synchronized void B (String name){
		int count = 0;
		for (int i = 0;i < 10; i++){
			System.out.println(name+"==>MethodB==>" +count++);
		}
	}
}
