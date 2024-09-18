package com.tns.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("autowire.xml");
		Human hum=c.getBean("human", Human.class);
		hum.startPumping();
		
	}
}
