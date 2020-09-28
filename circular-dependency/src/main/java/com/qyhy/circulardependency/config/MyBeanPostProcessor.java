package com.qyhy.circulardependency.config;

import com.qyhy.circulardependency.service.UserCollectionService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @author zhangdj
 * @date 2020/09/25
 */
//@Component
public class MyBeanPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 获取userService的BeanDefinition
		GenericBeanDefinition definition = (GenericBeanDefinition) beanFactory.getBeanDefinition("userService");
		// 修改BeanDefinition 实例化的时候会实例化UserCollectionService
		definition.setBeanClass(UserCollectionService.class);
	}
}
