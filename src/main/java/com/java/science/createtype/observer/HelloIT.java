package com.java.science.createtype.observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml"})
public class HelloIT {
	@Autowired
	private ApplicationContext application;

	@Test
	public void testPublishEvent(){
		application.publishEvent(new ContentEvent(""));

	}

	
}
