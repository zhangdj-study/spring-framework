package com.qyhy.circulardependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangdj
 * @date 2020/09/30
 */
@Service
public class TestService {

	@Autowired
	private UserService userService;

	@Autowired
	private UserCollectionService userCollectionService;

	public TestService() {
		System.out.println("testService constructor");
	}
}
