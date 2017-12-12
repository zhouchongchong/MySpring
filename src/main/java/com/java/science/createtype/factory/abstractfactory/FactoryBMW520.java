package com.java.science.createtype.factory.abstractfactory;

/**
 * @Author: aiying014
 * Created by zcc on 16:40 2017/11/15.
 * @Description:
 */
public class FactoryBMW520 implements abstractFactory{
	public Engine createEngine() {
		return new EngineB();
	}

	public Aircondition createAirconditon() {
		return new AirconditionB();
	}
}
