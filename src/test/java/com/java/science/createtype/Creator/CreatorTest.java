package com.java.science.createtype.Creator;

import org.junit.Test;

/**
 * @Author: aiying014
 * Created by zcc on 18:52 2017/11/10.
 * @Description:
 */
public class CreatorTest {
	@Test
	public void testCreator(){
		Creator creator = new Creator();
		Persion woman = creator.createPersion(new Womanbuilder());
		Persion man = creator.createPersion(new ManBulider());

	}

	public static void main(String[] args) {
		String str = "wo";
		int a = 7;
		StringBuffer buffer = new StringBuffer(str);
		System.out.println(9 >> 1);
		System.out.println(Byte.MAX_VALUE);
		buffer.reverse();
		System.out.println(buffer);
	}
}