package com.anupam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyApiAnalyticsAspect {
	

	@Before("com.anupam.aopdemo.aspect.AopExpressions.noGettSett()")
	public void performApiAnalytics()
	{
		System.out.println("analytics advice");
	}
	
}
