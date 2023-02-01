package com.anupam.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
//@ComponentScan("com.anupam.springdemo") //since we defined the bean manually
public class TableTennisSportConfig {

	@Bean // bean id = method name 
	public FortuneService awesomeFortuneService()
	{
		return new AwesomeFortuneService();
	}
	
	@Bean //injecting bean for our swim coach  
	public Coach tableTennisCoach() {
		return new TableTennisCoach(awesomeFortuneService());
	}
}
