package org.springframework.mytest.tests;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mytest.config.Config;
import org.springframework.mytest.model.User;

/**
 * @author zhangdj
 * @date 2020/09/14
 */
public class MyTests {

	@Test
	public void testSpring() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		User user = applicationContext.getBean("user", User.class);
		System.out.println(user);
	}
}
