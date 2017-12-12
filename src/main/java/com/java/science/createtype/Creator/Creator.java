package com.java.science.createtype.Creator;

/**
 * @Author: aiying014
 * Created by zcc on 18:49 2017/11/10.
 * @Description:
 */
public class Creator {
	Persion createPersion(PersionBulider bulider){
		bulider.setHead();
		bulider.setHand();
		bulider.setFoot();
		return bulider.creatPersion();
	}
}
