package com.qyhy.circulardependency.main;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.util.Arrays;

/**
 * @author zhangdj
 * @date 2020/11/25
 */
public class BeanFactoryMain {

	public static void main(String[] args) {
		// 注册中心
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		// 读取器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		// 资源读取器
		DefaultResourceLoader loader = new DefaultResourceLoader();
		Resource resource = loader.getResource("spring.xml");
		// 装载构建bean的定义
		reader.loadBeanDefinitions(resource);
		Object userService = factory.getBean("userService");
		System.out.println(userService);
	}
}
