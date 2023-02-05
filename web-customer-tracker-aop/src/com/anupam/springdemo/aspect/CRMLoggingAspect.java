package com.anupam.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect 
public class CRMLoggingAspect {

	private Logger mylogger = Logger.getLogger(CRMLoggingAspect.class.getName());
	
	@Pointcut("execution(* com.anupam.springdemo.controller.*.*(..))")
	private void forControllerPackage()
	{
		
	}
	
	@Pointcut("execution(* com.anupam.springdemo.service.*.*(..))")
	private void forServicePackage()
	{
		
	}
	
	@Pointcut("execution(* com.anupam.springdemo.dao.*.*(..))")
	private void forDAOPackage()
	{
		
	}
	
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow()
	{
		
	}
	
	@Before("forAppFlow()")
	public void before(JoinPoint jp)
	{
		String method = jp.getSignature().toShortString();
		mylogger.info("method --> "+method);
		
		Object[] args = jp.getArgs();
		
		for(Object o: args)
		{
			mylogger.info("args--> "+o.toString());
		}
		
	}
	
	
	@AfterReturning(pointcut = "forAppFlow()", returning = "results")
	public void afterReturning(JoinPoint jp , Object results)
	{
		String method = jp.getSignature().toShortString();
		mylogger.info("returning method --> "+method);
		
		mylogger.info("results--> "+results.toString());
		
		
	}
	
	
	
	
	
	
}
