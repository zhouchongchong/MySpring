package com.java.science.Spring.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: aiying014
 * Created by zcc on 11:44 2017/12/8.
 * @Description:
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext appCtx  = new ClassPathXmlApplicationContext("spring.config/applicationContext.xml");
		Sleepable sleepable = (Sleepable) appCtx.getBean("human");
		sleepable.sleep();
	}
}
