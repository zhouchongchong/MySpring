package com.java.science.createtype.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class WangwuListener implements SmartApplicationListener {
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("王五在孙刘之前收到新的内容：" + event.getSource());
	}

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		// TODO Auto-generated method stub
		return eventType == ContentEvent.class;
	}

	public boolean supportsSourceType(Class<?> sourceType) {
		// TODO Auto-generated method stub
		return sourceType == String.class;
	}

}
