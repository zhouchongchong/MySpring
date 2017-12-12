package com.java.science.structure.adapter.objectadapter;

/**
 * @Author: aiying014
 * Created by zcc on 16:50 2017/11/16.
 * @Description:
 */
public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter() {
		this.adaptee = new Adaptee();
	}

	public void request() {
		adaptee.specificRequest();
	}
}
