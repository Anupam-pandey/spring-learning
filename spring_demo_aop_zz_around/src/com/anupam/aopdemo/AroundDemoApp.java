package com.anupam.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anupam.aopdemo.dao.AccountDAO;
import com.anupam.aopdemo.dao.MemberShipDAO;
import com.anupam.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println(trafficFortuneService.getFortune());
		 
		context.close();

	}

}
