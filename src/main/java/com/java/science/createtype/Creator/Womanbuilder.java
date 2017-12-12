package com.java.science.createtype.Creator;

/**
 * @Author: aiying014
 * Created by zcc on 18:33 2017/11/10.
 * @Description:
 */
public class Womanbuilder implements PersionBulider {
	Persion persion;

	public Womanbuilder() {
		persion = new Woman();
	}

	public void setHead() {
		persion.setHead("创建女人的头");
	}

	public void setHand() {
		persion.setHand("创建女人的手");
	}

	public void setFoot() {
		persion.setFoot("创建女人的脚");
	}

	public Persion creatPersion() {
		return persion;
	}
}
