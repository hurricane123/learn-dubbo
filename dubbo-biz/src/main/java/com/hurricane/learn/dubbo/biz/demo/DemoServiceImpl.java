package com.hurricane.learn.dubbo.biz.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hurricane.learn.dubbo.service.demo.DemoService;


public class DemoServiceImpl implements DemoService{
	private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	
	public DemoServiceImpl() {
		logger.info("{} 初始化",DemoServiceImpl.class.getName());
	}

	@Override
	public String sayHello(String name) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String string = "Hello " + name;
		return string;
	}

	@Override
	public String sayGoodBye(String name) {
		String string = "goodbye " + name;
		return string;
	}

}
