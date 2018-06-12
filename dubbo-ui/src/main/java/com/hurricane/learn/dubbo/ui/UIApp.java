package com.hurricane.learn.dubbo.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hurricane.learn.dubbo.service.demo.DemoService;
import com.hurricane.learn.dubbo.service.user.UserService;
import com.hurricane.learn.dubbo.ui.demo.DemoInvoker;
import com.hurricane.learn.dubbo.ui.user.UserInvoker;

/**
 * 测试方法、接口的可见性
 * 服务提供者的bean的延迟加载
 * 调用服务超时配置，及优先顺序
 * @author Administrator
 *
 */
public class UIApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"classpath:/spring-dubbo.xml"});
		context.start();
//		DemoService demoService = (DemoService) context.getBean("demoService");
//		String hello = demoService.sayHello("world");
		DemoInvoker demoInvoker = (DemoInvoker) context.getBean("demoInvoker");
		demoInvoker.sayHello();
		demoInvoker.sayGoodBye();
		UserInvoker bean = context.getBean(UserInvoker.class);
		bean.getUser();
		context.close();
	}

}
