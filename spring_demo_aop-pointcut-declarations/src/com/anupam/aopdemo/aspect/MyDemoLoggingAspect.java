package com.anupam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.anupam.aopdemo.dao.*.*(..))")
	public void forDaoPackage()
	{
		
	}
	
	
//	@Before("execution(public void com.anupam.aopdemo.dao.AccountDAO.addAccound())")
//	@Before("execution(public void add*())")
//	@Before("execution(public * add*(com.anupam.aopdemo.Account))")
//	@Before("execution(public * add*(..))")
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice()
	{
		System.out.println("advice given ");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics()
	{
		System.out.println("analytics advice");
	}
}
