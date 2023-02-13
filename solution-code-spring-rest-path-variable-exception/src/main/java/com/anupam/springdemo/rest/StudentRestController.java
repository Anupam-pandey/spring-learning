package com.anupam.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anupam.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> ss;
	
	@PostConstruct
	public void loadData()
	{
		Student s1 = new Student("a","b");
		Student s2 = new Student("c","e");
		Student s3 = new Student("d","g");
		
		ss = new ArrayList<>();
		ss.add(s3);
		ss.add(s2);
		ss.add(s1);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
	
		return ss;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudents(@PathVariable int studentId)
	{
		if(studentId>ss.size() || studentId<0)
			throw new StudentNotFoundException("this id "+studentId+" doesnt exists");
		return ss.get(studentId);
	}	

}
