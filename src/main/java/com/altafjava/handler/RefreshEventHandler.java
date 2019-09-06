package com.altafjava.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.altafjava.event.RefreshEvent;

@Component
public class RefreshEventHandler implements ApplicationListener<RefreshEvent> {

	@Override
	public void onApplicationEvent(RefreshEvent event) {
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("event happen=" + event.getTableName());
	}

}
