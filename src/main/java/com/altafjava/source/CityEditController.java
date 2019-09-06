package com.altafjava.source;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.altafjava.event.RefreshEvent;

@Component
public class CityEditController implements ApplicationEventPublisherAware {

	ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void update(String tableName, String cityName) {
		System.out.println("tableName=" + tableName + " with city=" + cityName);
		RefreshEvent refreshEvent = new RefreshEvent(this);
		refreshEvent.setTableName(tableName);
		applicationEventPublisher.publishEvent(refreshEvent);
		System.out.println("after tableName=" + tableName + " with city=" + cityName);
	}
}
