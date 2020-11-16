package com.qyhy.circulardependency.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zhangdj
 * @date 2020/09/30
 */
//@Component
@Aspect
public class NotVeryUsefulAspect {

	/**
	 * execution(* com.qyhy.circulardependency.service.*.*(..))
	 *           任意返回值 com.qyhy.circulardependency.service 所有类 所有方法 任意参数
	 */
	@Pointcut("execution(* com.qyhy.circulardependency.service.*.*(..))")
	public void anyOldTransfer() {

	}

	@Before("anyOldTransfer()")
	public void doAccessCheck() {
		System.out.println("--------doAccessCheck----------");
	}
}
