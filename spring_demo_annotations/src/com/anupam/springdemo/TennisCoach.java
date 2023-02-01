package com.anupam.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//bean id 
//@Component("theSillyCoach")
@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	//	@Autowired
//	public TennisCoach(FortuneService fortuneService)
//	{
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "tennis play";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void pre_int()
	{
		System.out.println("start");
	}
	
	@PreDestroy
	public void pre_destroy() {
		System.out.println("end");
	}
	
	

}
