package com.anupam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anupam.aopdemo.dao.AccountDAO;
import com.anupam.aopdemo.dao.MemberShipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDao = context.getBean("accountDAO",AccountDAO.class);
		List<Account> myAccount = accountDao.findAccount(false);
		
		System.out.println(myAccount);
		context.close();

	}

}
