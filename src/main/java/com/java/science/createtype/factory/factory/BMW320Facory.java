package com.java.science.createtype.factory.factory;

import com.java.science.createtype.factory.simplefactory.BMW;
import com.java.science.createtype.factory.simplefactory.BMW320;

/**
 * @Author: aiying014
 * Created by zcc on 15:52 2017/11/15.
 * @Description:
 */
public class BMW320Facory implements FactoryBMW{

	public BMW320 createBMW() {
		return new BMW320();
	}
}
