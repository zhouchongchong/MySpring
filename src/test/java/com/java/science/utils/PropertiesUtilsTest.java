package com.java.science.utils;

import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 19:55 2017/11/23.
 * @Description:
 */
public class PropertiesUtilsTest {
	@Test
	public void testPropertisUtils(){
//		String url = PropertiesUtils.getInstance("reids").get("redis.url");
//		System.out.println(url);
//		Persion zhangsan  = new Persion("zhangsan");
//		changeName(zhangsan);
//		zhangsan.printNam();
		/*String  a = "12321321";
		StringBuffer sa = new StringBuffer(a);
		sa.reverse();
		System.out.println(String.valueOf(sa));
		String b = a.substring(1);
		System.out.println(reverse(a))*/;


		// Java 8

//		LocalDateTime dt = LocalDateTime.now();
//		System.out.println(dt.getYear());
//		System.out.println(dt.getMonthValue());     // 1 - 12
//		System.out.println(dt.getDayOfMonth());
//		System.out.println(dt.getHour());
//		System.out.println(dt.getMinute());
//		System.out.println(dt.getSecond());

		Map<String,String> map = new HashMap<String, String>();
		map.put("1","一");
		map.put("2","二");
		map.put("3","三");
		map.put("4","四");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		map.keySet();
		Collection<String> values = map.keySet();
		for (String entry: values){
			System.out.println(entry);
		}


	}

	public static String reverse(String originStr) {
		if(originStr == null || originStr.length() <= 1)
			return originStr;
		System.out.println(originStr+":"+originStr.length());
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}

	public void changeName(Persion persion){
		persion = new Persion("lisi");
	}
	 class Persion{
		private String name = "default";

		public Persion(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public void method(String a ,int b){

		}

		 public void method(int b,String a){

		 }
		void printNam(){
			System.out.println(this.name);
		}
	}
}