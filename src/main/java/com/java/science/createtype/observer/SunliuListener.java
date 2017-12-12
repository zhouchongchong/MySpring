package com.java.science.createtype.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SunliuListener implements SmartApplicationListener {
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("孙刘在王武之后收到新的消息：" + arg0.getSource());

	}
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	public boolean supportsEventType(Class<? extends ApplicationEvent> arg0) {
		// TODO Auto-generated method stub
		return arg0 == ContentEvent.class;
	}

	public boolean supportsSourceType(Class<?> arg0) {
		// TODO Auto-generated method stub
		return arg0 == String.class;
	}

}
