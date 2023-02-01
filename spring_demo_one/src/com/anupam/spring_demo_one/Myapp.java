package com.anupam.spring_demo_one;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Coach thecoach = new BaseBallCoach();
		Coach thetrackcoach = new TrackCoach();
//		Coach thecricketcoach = new CricketCoach();
//		System.out.print(thecoach.getDailyWorkout());
		System.out.print(thetrackcoach.getDailyWorkout());

	}

}
