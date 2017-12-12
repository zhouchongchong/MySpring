package com.java.science.createtype.factory.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: aiying014
 * Created by zcc on 16:46 2017/11/15.
 * @Description:
 */
public class FactoryBMW520Test {
	@Test
	public void testAbstractFactory(){
		FactoryBMW520 factoryBMW520 = new FactoryBMW520();
		factoryBMW520.createAirconditon();
		factoryBMW520.createEngine();

		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createAirconditon();
		factoryBMW320.createEngine();
	}

}