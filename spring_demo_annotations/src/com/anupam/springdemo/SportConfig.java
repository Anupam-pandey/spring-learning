package com.anupam.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:sport.properties")
@Configuration
//@ComponentScan("com.anupam.springdemo") //since we defined the bean manually
public class SportConfig {

	@Bean // bean id = method name 
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	@Bean //injecting bean for our swim coach  
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
