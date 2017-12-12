package com.java.science.createtype.Creator;

/**
 * @Author: aiying014
 * Created by zcc on 18:45 2017/11/10.
 * @Description:
 */
public class ManBulider implements PersionBulider {
	Persion persion;

	public ManBulider() {
		this.persion = new Man();
	}

	public void setHead() {
		persion.setHead("创建男人的头");
	}

	public void setHand() {
		persion.setHead("创建男人的手");
	}

	public void setFoot() {
		persion.setFoot("创建男人的脚");
	}

	public Persion creatPersion() {
		return persion;
	}
}
