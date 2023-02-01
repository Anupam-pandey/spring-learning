package com.anupam.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import javax.servlet.http;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	@RequestMapping("/processForm2")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		String name  = request.getParameter("studentName");
		String res = "yo! "+ name.toUpperCase();
		model.addAttribute("message",res);
		return "helloworld";
		
	}
	
	@RequestMapping("/processForm3")
	public String processFormVersion3(@RequestParam("studentName") String name, Model model)
	{
//		String name  = request.getParameter("studentName"); 
		String res = "yo! "+ name.toUpperCase();
		model.addAttribute("message",res);
		return "helloworld";
		
	}
	
	

}
