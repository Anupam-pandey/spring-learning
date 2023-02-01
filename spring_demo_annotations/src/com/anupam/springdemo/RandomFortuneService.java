package com.anupam.springdemo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("happy");
		a.add("awesome");
		a.add("nice");
		Random rand = new Random();
		return a.get(rand.nextInt(3));
	}

}
