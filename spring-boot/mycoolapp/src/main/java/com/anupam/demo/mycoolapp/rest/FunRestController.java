package com.anupam.demo.mycoolapp.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayhello() {
		return "hello "+LocalDateTime.now();
	}

}
