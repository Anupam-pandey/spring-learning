package com.anupam.spring_demo_one;

public class VolleyBallCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	private String team;
	
	public  VolleyBallCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("yo volley ");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("yo se fortune ");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "smash";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
