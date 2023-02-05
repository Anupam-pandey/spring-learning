package com.anupam.aopdemo.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.anupam.aopdemo.Account;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {
	private Logger myLogger = Logger.getLogger(MyDemoLoggingAspect.class.getName());
//	@Before("execution(public void com.anupam.aopdemo.dao.AccountDAO.addAccound())")
//	@Before("execution(public void add*())")
//	@Before("execution(public * add*(com.anupam.aopdemo.Account))")
//	@Before("execution(public * add*(..))")
	@Before("com.anupam.aopdemo.aspect.AopExpressions.noGettSett()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint)
	{
		myLogger.info("advice given ");
		
		MethodSignature ms = (MethodSignature)joinPoint.getSignature();
		myLogger.info("method "+ms);
		Object[] args  = joinPoint.getArgs();
		for(Object arg: args)
		{
			myLogger.info(arg.toString());
			if(arg instanceof Account)
			{
				Account acc = (Account) arg;
				myLogger.info("account "+acc.toString());
			}
		}
		
	}
	
	@AfterReturning(pointcut = "execution(* com.anupam.aopdemo.dao.AccountDAO.findAccount(..))",returning = "results")
	public void afterReturningFindAccountAdvice(JoinPoint jp,List<Account> results)
	{
		String method = jp.getSignature().toShortString();
		myLogger.info(method+" getting executed ");
		
		
		myLogger.info(results+" getting results ");
		
		makeToUpperCase(results);
		
		myLogger.info(results+" getting results ");
		
		
		
	}

	private void makeToUpperCase(List<Account> results) {
		// TODO Auto-generated method stub
		
		for(Account a: results)
		{
			String s = a.getName().toUpperCase();
			a.setName(s);
		}
	}
	
	@AfterThrowing(pointcut = "execution(* com.anupam.aopdemo.dao.AccountDAO.findAccount(..))",
			throwing = "results"
			)
	public void afterThrowingFindAccountsAdvice(JoinPoint jp, Throwable results)
	{
		String method = jp.getSignature().toShortString();
		myLogger.info(method+" exception getting executed ");
		
		myLogger.info(" exception "+results);
		
	}
	
	@After("execution(* com.anupam.aopdemo.dao.AccountDAO.findAccount(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint jp)
	{
		String method = jp.getSignature().toShortString();
		myLogger.info(method+" after finally getting executed ");
	
		
	}
	
	
	@Around("execution(* com.anupam.aopdemo.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint pjp) throws Throwable
	{
		String method = pjp.getSignature().toShortString();
		myLogger.info(method+" around getting executed ");
		
		long begin = System.currentTimeMillis();
		
		Object res = null;
		
		try {
		res = pjp.proceed();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			myLogger.warning(e.getMessage());
			
			throw e;
		}
		
		long end = System.currentTimeMillis();
		myLogger.info(" duration is "+(end-begin)/1000);
		
		return res;
	
	}
	
}
