package com.qyhy.circulardependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author zhangdj
 * @date 2020/09/25
 */
@Service
public class UserCollectionService {

	@Autowired
	private UserService userService;

	@Autowired
	private TestService testService;

	public UserCollectionService() {
		System.out.println("UserCollectionService Constructor");
	}

	public void method() {
		System.out.println("collection method");
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
