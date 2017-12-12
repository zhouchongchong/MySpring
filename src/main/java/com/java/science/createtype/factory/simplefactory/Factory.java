package com.java.science.createtype.factory.simplefactory;

/**
 * @Author: aiying014
 * Created by zcc on 15:38 2017/11/15.
 * @Description:
 */
public class Factory {
	public BMW createBMW(int type) {
		switch (type){
			case 320:
				return new BMW320();
			case 520:
				return new BMW520();
			default:
				break;
		}
		return null;
	}
}
