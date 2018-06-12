package com.hurricane.learn.dubbo.ui.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hurricane.learn.dubbo.service.entity.User;
import com.hurricane.learn.dubbo.service.user.UserService;

@Component
public class UserInvoker {

	private static Logger logger = LoggerFactory.getLogger(UserInvoker.class);
	
	@Autowired
	private UserService userService;
	
	public void getUser() {
		User user = userService.getUser("hurricane");
		logger.info("返回值为：{}",user);
	}
	
	
}
