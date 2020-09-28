package com.qyhy.circulardependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author zhangdj
 * @date 2020/09/25
 */
@Service
public class UserService {

	@Autowired
	@Qualifier("userCollectionService")
	UserCollectionService userCollectionService;

	public UserService() {
		System.out.println("UserService Constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("init userService");
	}

	public void invoke() {
		userCollectionService.method();
	}

	public UserCollectionService getUserCollectionService() {
		return userCollectionService;
	}

	public void setUserCollectionService(UserCollectionService userCollectionService) {
		this.userCollectionService = userCollectionService;
	}
}
