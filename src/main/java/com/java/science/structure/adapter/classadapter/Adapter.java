package com.java.science.structure.adapter.classadapter;

/**
 * @Author: aiying014
 * Created by zcc on 16:45 2017/11/16.
 * @Description:
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		super.specificRequest();
	}
}
