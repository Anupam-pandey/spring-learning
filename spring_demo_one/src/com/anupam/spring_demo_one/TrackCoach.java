package com.anupam.spring_demo_one;

public class TrackCoach implements Coach {

	FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {};

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "do track workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff()
	{
		System.out.println("start");
	}

	public void doMyCleanUpStuff()
	{
		System.out.println("end");
	}

}
