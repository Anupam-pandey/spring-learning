package com.anupam.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anupam.aopdemo.dao.AccountDAO;
import com.anupam.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDao = context.getBean("accountDAO",AccountDAO.class);
		MemberShipDAO memberShipDAO = context.getBean("memberShipDAO",MemberShipDAO.class);
		Account account = new Account();
		account.setLevel("high");
		account.setName("anupam");
		accountDao.addAccount(account);
		boolean t = memberShipDAO.addbaby();
		boolean tt = memberShipDAO.baby();
		
		accountDao.setServiceCode("high");
		accountDao.setName("anupam");
		
		accountDao.getServiceCode();
		accountDao.getName();
		System.out.println(t);
		context.close();

	}

}
