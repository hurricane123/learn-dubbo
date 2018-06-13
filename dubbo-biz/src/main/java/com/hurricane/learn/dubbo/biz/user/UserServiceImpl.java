package com.hurricane.learn.dubbo.biz.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.hurricane.learn.dubbo.service.entity.User;
import com.hurricane.learn.dubbo.service.user.UserService;

@Service(interfaceClass=UserService.class,timeout=1000)
public class UserServiceImpl implements UserService{
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	public UserServiceImpl() {
		logger.info("{} 初始化",UserServiceImpl.class.getName());
	}

	@Override
	public User getUser(String name) {
		User user = new User();
		user.setId(0);
		user.setName(name);
		user.setPwd("123");
		return user;
	}

}
