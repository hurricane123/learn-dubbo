package com.hurricane.learn.dubbo.biz;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath:/spring-dubbo.xml"});
		context.start();
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
