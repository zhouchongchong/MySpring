package com.java.science.activeMQ;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 18:36 2017/11/30.
 * @Description:
 */
public class MyStackTest {
	@Test
	public void testMq(){
		MyStack<String> stack = new MyStack<String>();
		for (String s : "the prefect code".split(" ")){
			stack.push(s);
		}

		while (!stack.empty()){
			System.out.println(stack.peek()+"");
			stack.pop();
		}

		System.out.println();
		for (char s: "写了有一个倒起来说的程序".toCharArray()){
			stack.push(String.valueOf(s));
		}

		while (!stack.empty()){
			System.out.println(stack.peek());
			stack.pop();
		}
	}

	public static void main(String[] args) {
		int a = 3;
		int b = a;

	}

}