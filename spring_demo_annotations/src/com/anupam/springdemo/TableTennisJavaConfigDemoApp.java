package com.anupam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TableTennisJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TableTennisSportConfig.class);
//		Coach theCoach = context.getBean("theSillyCoach",Coach.class);
		Coach theCoach =  context.getBean("tableTennisCoach",Coach.class);
//		Coach myCoach = context.getBean("cricketCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(myCo ach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		context.close();

	}

}
