package com.java.science.observer;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: aiying014
 * Created by zcc on 19:27 2017/11/16.
 * @Description:
 */
public class ChildClass extends ParentClass implements TestInterfaceA {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put( null, 1);
		map.put("数学", 2);
		map.put("英语", 3);
		map.put("历史", 4);
		map.put("政治", 5);
		map.put("地理", 6);
		map.put("生物", 7);
		map.put("化学", 8);
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("fsdfsf".length());
	}
	@Test
	public void test(){
		System.out.println( 5 & 7);
	}
	@Test
	public void testException() {
		try{
			throw new Exception("参数越界");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("behind catch");
		}
		System.out.println("异常后");//可以执行
	}

}
