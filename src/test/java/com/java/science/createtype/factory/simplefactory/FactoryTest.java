package com.java.science.createtype.factory.simplefactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 15:41 2017/11/15.
 * @Description:
 */
public class FactoryTest {
	@Test
	public void testSimpleFactory(){
		Factory factory = new Factory();
		BMW bmw320 = factory.createBMW(320);
		BMW bmw520 = factory.createBMW(520);

	}

}