package com.anupam.spring_demo_one;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		ArrayList<String> fortune = new ArrayList<>();
		fortune.add("good");
		fortune.add("bad");
		fortune.add("ugly");
		Random random  =new Random();
		int ind = random.nextInt(3);
		return fortune.get(ind);
		
		
		
	}

}
