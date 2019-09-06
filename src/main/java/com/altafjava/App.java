package com.altafjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.altafjava.source.CityEditController;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/altafjava/application-context.xml");
		CityEditController cityEditController = applicationContext.getBean(CityEditController.class);
		System.out.println(cityEditController);
		cityEditController.update("mytable", "mycity");
	}
}
