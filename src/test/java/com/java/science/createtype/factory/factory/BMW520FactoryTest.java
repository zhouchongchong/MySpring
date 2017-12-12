package com.java.science.createtype.factory.factory;

import com.java.science.createtype.factory.simplefactory.BMW;
import com.java.science.createtype.factory.simplefactory.BMW320;
import com.java.science.createtype.factory.simplefactory.BMW520;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 16:01 2017/11/15.
 * @Description:
 */
public class BMW520FactoryTest {
	@Test
	public void testFactory(){
		BMW320Facory factor = new BMW320Facory();
		BMW320 bmw = factor.createBMW();

		BMW520Factory factor520 = new BMW520Factory();
		BMW520 bmw520 = factor520.createBMW();

	}
}