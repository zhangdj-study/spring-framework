package com.qyhy.circulardependency.main;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.util.Arrays;

/**
 * @author zhangdj
 * @date 2020/11/25
 */
public class BeanDefinitionMain {

	public static void main(String[] args) {
		// 注册中心
		BeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
		// 读取器
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
		// 资源读取器
		DefaultResourceLoader loader = new DefaultResourceLoader();
		Resource resource = loader.getResource("spring.xml");
		// 装载构建bean的定义
		reader.loadBeanDefinitions(resource);
		System.out.println(Arrays.toString(registry.getBeanDefinitionNames()));
	}
}
