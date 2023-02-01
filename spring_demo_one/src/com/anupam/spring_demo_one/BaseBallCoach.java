package com.anupam.spring_demo_one;

public class BaseBallCoach implements Coach {
	
	private FortuneService fortuneService; 
	public BaseBallCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "do workout bb";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
