package com.java.science.Spring.AOP;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: aiying014
 * Created by zcc on 11:14 2017/12/8.
 * @Description:
 */
public class SleepHelper implements MethodBeforeAdvice,AfterReturningAdvice {
	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
		System.out.println("起床后要穿衣服！");
	}

	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("睡觉前要脱衣服！");
	}
}
