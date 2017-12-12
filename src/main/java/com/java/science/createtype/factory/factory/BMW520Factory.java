package com.java.science.createtype.factory.factory;

import com.java.science.createtype.factory.simplefactory.BMW;
import com.java.science.createtype.factory.simplefactory.BMW520;

/**
 * @Author: aiying014
 * Created by zcc on 16:00 2017/11/15.
 * @Description:
 */
public class BMW520Factory implements FactoryBMW {

	public BMW520 createBMW() {
		return new BMW520();
	}
}
