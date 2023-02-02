package com.anupam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyCloudLogAsyncAspect {

	@Before("com.anupam.aopdemo.aspect.AopExpressions.noGettSett()")
	public void logCloudSync()
	{
		System.out.println("cloud advice");
	}
}
