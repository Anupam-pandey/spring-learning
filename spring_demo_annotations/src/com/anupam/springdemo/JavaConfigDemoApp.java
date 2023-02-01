package com.anupam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//		Coach theCoach = context.getBean("theSillyCoach",Coach.class);
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach myCoach = context.getBean("cricketCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		context.close();

	}

}
