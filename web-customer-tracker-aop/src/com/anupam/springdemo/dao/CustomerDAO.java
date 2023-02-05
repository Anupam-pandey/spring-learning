package com.anupam.springdemo.dao;

import java.util.List;

import com.anupam.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomer();
	
	public void saveCustomer(Customer customer);

	public  Customer getCustomer(int customerId);

	public void deleteCustomer(int customerId);

}
