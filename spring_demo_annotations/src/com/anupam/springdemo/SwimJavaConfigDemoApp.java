package com.anupam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
//		Coach theCoach = context.getBean("theSillyCoach",Coach.class);
		SwimCoach theCoach = (SwimCoach) context.getBean("swimCoach",Coach.class);
//		Coach myCoach = context.getBean("cricketCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(myCo ach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}
