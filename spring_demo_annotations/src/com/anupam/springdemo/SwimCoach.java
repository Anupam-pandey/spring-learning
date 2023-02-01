package com.anupam.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "swimming ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
