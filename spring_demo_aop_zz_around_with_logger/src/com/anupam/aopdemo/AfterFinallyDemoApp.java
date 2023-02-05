package com.anupam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anupam.aopdemo.dao.AccountDAO;
import com.anupam.aopdemo.dao.MemberShipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDao = context.getBean("accountDAO",AccountDAO.class);
		List<Account> myAccount = null;
		Boolean flag = false;
		
		try {
			myAccount = accountDao.findAccount(flag);
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println("done");

		}
		System.out.println(myAccount);
		context.close();

	}

}
