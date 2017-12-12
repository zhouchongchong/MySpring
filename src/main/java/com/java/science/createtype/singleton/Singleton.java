package com.java.science.createtype.singleton;

/**
 * @Author: aiying014
 * Created by zcc on 14:22 2017/11/9.
 * @Description: 懒汉式单例模式 等待别人创建 静态 全局为 1
 */
public class Singleton {
	private Singleton() {
	}

	;

	private static Singleton singleton = null;

	/**
	 * simple singleton
	 *
	 * @return
	 */
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	/**
	 * synchronization
	 *
	 * @return
	 */
	public static synchronized Singleton getSingleton(){
		if (singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}



	/**
	 * singleton holder
	 */
	private static class lazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	}

	public static final Singleton getInstanceHoder(){
		return lazyHolder.INSTANCE;
	}
}
