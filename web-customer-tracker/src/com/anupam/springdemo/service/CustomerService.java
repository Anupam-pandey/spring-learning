package com.anupam.springdemo.service;

import java.util.List;

import com.anupam.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();
	
	public void saveCustomer(Customer customer);

	public Customer getCustomer(int customerId);

	public void deleteCustomer(int customerId);

}
