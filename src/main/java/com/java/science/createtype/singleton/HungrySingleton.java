package com.java.science.createtype.singleton;

/**
 * @Author: aiying014
 * Created by zcc on 14:53 2017/11/9.
 * @Description: hungry singleton
 */
public class HungrySingleton {
	private static final HungrySingleton SINGLETON = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return SINGLETON;
	}
}
