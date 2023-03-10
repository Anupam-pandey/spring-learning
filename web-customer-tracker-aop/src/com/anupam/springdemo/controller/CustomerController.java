package com.anupam.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anupam.springdemo.dao.CustomerDAO;
import com.anupam.springdemo.entity.Customer;
import com.anupam.springdemo.service.CustomerService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@GetMapping("/list")
	public String listCustomers(Model theModel)
	{
		List<Customer> theCustomers = customerService.getCustomer();
		
		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer); 
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int customerId,Model model)
	{
		Customer customer = customerService.getCustomer(customerId);
		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("customerId") int customerId)
	{
		customerService.deleteCustomer(customerId);
//		model.addAttribute("customer", customer);
		return "redirect:/customer/list";
	}
	
	
	
}
