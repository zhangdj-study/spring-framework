package com.qyhy.circulardependency.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhangdj
 * @date 2020/09/16
 */
@ComponentScan(basePackages = {"com.qyhy.circulardependency"})
@EnableAspectJAutoProxy
public class AppConfig {
}
