package org.springframework.mytest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.config.Config;
import org.springframework.mytest.model.User;

/**
 * @author zhangdj
 * @date 2020/09/15
 */
public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}
}
