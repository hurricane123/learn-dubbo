package com.hurricane.learn.dubbo.ui.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hurricane.learn.dubbo.service.demo.DemoService;

@Component
public class DemoInvoker {

	@Autowired
	private DemoService demoService;
	
	public void sayHello() {
		String sayHello = demoService.sayHello("hurricane");
		System.out.println(sayHello);
	}
	
	public void sayGoodBye() {
		String sayGoodBye = demoService.sayGoodBye("hurricane");
		System.out.println(sayGoodBye);
	}

}
