package com.anupam.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		Student s1 = new Student("a","b");
		Student s2 = new Student("c","e");
		Student s3 = new Student("d","g");
		
		List<Student> ss = new ArrayList<>();
		ss.add(s3);
		ss.add(s2);
		ss.add(s1);
		return ss;
	}

}
