package com.java.science.createtype.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ZhangsanListenter implements ApplicationListener<ApplicationEvent> {

	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof ContentEvent){
			System.out.println("张三收到了新的内容：" + event.getSource());
		}
		
	}

}
