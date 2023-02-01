package com.anupam.spring_demo_one;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice cricket";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
