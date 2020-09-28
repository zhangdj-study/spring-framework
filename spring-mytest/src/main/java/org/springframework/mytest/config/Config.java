package org.springframework.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mytest.model.User;

/**
 * @author zhangdj
 * @date 2020/09/14
 */
@ComponentScan(basePackages = {"org.springframework.mytest"})
public class Config {

	@Bean
	public User user() {
		User user = new User();
		user.setId(1L);
		user.setName("阿萨");
		return user;
	}
}
