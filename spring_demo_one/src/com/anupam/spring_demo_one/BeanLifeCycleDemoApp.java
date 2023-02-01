package com.anupam.spring_demo_one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		if(theCoach==alphaCoach)
		{
			System.out.println("yup");
		}
		else
		{
			System.out.println("no");
		}
		
		System.out.println(theCoach.getDailyWorkout());
		context.close();
		
		
		
				

	}

}
