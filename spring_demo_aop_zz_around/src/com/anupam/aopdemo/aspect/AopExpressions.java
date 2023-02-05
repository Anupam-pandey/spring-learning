package com.anupam.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

	

	@Pointcut("execution(* com.anupam.aopdemo.dao.*.*(..))")
	public void forDaoPackage()
	{
		
	}
	
	
	@Pointcut("execution(* com.anupam.aopdemo.dao.*.set*(..))")
	public void gett()
	{
		
	}
	
	@Pointcut("execution(* com.anupam.aopdemo.dao.*.get*(..))")
	public void sett()
	{
		
	}
	
	@Pointcut("forDaoPackage() && !(gett() || sett())")
	public void noGettSett()
	{
		
	}
	
	
}
