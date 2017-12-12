package com.java.science.createtype.factory.abstractfactory;

/**
 * @Author: aiying014
 * Created by zcc on 16:26 2017/11/15.
 * @Description:
 */
public class FactoryBMW320 implements abstractFactory {
	public Engine createEngine() {
		return new EngineA();
	}

	public Aircondition createAirconditon() {
		return new AirconditionA();
	}
}
