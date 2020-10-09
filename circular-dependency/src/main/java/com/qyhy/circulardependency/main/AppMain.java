package com.qyhy.circulardependency.main;

import com.qyhy.circulardependency.config.AppConfig;
import com.qyhy.circulardependency.service.UserCollectionService;
import com.qyhy.circulardependency.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangdj
 * @date 2020/09/25
 */
public class AppMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.getUserCollectionService();
	}
}
