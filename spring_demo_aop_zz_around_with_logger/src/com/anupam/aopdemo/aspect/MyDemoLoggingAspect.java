package com.anupam.aopdemo.aspect;

import java.util.List;

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
	
//	@Before("execution(public void com.anupam.aopdemo.dao.AccountDAO.addAccound())")
//	@Before("execution(public void add*())")
//	@Before("execution(public * add*(com.anupam.aopdemo.Account))")
//	@Before("execution(public * add*(..))")
	@Before("com.anupam.aopdemo.aspect.AopExpressions.noGettSett()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint)
	{
		System.out.println("advice given ");
		
		MethodSignature ms = (MethodSignature)joinPoint.getSignature();
		System.out.println("method "+ms);
		Object[] args  = joinPoint.getArgs();
		for(Object arg: args)
		{
			System.out.println(arg);
			if(arg instanceof Account)
			{
				Account acc = (Account) arg;
				System.out.println("account "+acc.toString());
			}
		}
		
	}
	
	@AfterReturning(pointcut = "execution(* com.anupam.aopdemo.dao.AccountDAO.findAccount(..))",returning = "results")
	public void afterReturningFindAccountAdvice(JoinPoint jp,List<Account> results)
	{
		String method = jp.getSignature().toShortString();
		System.out.println(method+" getting executed ");
		
		
		System.out.println(results+" getting results ");
		
		makeToUpperCase(results);
		
		System.out.println(results+" getting results ");
		
		
		
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
		System.out.println(method+" exception getting executed ");
		
		System.out.println(" exception "+results);
		
	}
	
	@After("execution(* com.anupam.aopdemo.dao.AccountDAO.findAccount(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint jp)
	{
		String method = jp.getSignature().toShortString();
		System.out.println(method+" after finally getting executed ");
	
		
	}
	
	
	@Around("execution(* com.anupam.aopdemo.service.*.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint pjp) throws Throwable
	{
		String method = pjp.getSignature().toShortString();
		System.out.println(method+" around getting executed ");
		
		long begin = System.currentTimeMillis();
		
		Object res = pjp.proceed();
		
		long end = System.currentTimeMillis();
		System.out.println(" duration is "+(end-begin)/1000);
		
		return res;
	
	}
	
}
