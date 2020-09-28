package org.springframework.mytest.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.mytest.model.User;
import org.springframework.stereotype.Component;

/**
 * @author zhangdj
 * @date 2020/09/15
 */
@Component
public class UserBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof User) {
			User user = (User) bean;
			user.setName("李四");
		}
		return bean;
	}
}
