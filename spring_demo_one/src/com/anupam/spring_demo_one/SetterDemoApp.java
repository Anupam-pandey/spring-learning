package com.anupam.spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		VolleyBallCoach theCoach = context.getBean("myVolleyBallCoach",VolleyBallCoach.class);
		System.out.println( theCoach.getDailyFortune());
		System.out.println( theCoach.getDailyWorkout());
		System.out.println(theCoach.getEmailAddress());
		context.close();
	}

}
