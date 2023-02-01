package com.anupam.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController {
	
	@RequestMapping("/showForm")
	public String shodisplayTheForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}

}
