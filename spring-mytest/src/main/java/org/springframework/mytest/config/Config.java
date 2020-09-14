package org.springframework.mytest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mytest.model.User;

/**
 * @author zhangdj
 * @date 2020/09/14
 */
@Configuration
public class Config {

	@Bean
	public User user() {
		User user = new User();
		user.setId(1L);
		user.setName("张三");
		return user;
	}
}
