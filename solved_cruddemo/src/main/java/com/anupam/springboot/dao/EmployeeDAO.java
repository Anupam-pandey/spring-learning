package com.anupam.springboot.dao;

import java.util.List;

import com.anupam.springboot.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();
}
