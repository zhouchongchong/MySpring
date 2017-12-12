package com.java.science.Spring.AOP;

/**
 * @Author: aiying014
 * Created by zcc on 11:12 2017/12/8.
 * @Description:
 */
public class Human implements Sleepable {
	@Override
	public void sleep() {
		System.out.println("睡觉！梦中自有颜如玉！");
	}
}
