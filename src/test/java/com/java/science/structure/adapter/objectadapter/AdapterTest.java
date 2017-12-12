package com.java.science.structure.adapter.objectadapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 16:56 2017/11/16.
 * @Description:
 */
public class AdapterTest {
	@Test
	public void testAdapter(){
		Target target = new Adapter();
		target.request();

		com.java.science.structure.adapter.classadapter.Target target1 = new com.java.science.structure.adapter.classadapter.Adapter();
		target1.request();
	}

}