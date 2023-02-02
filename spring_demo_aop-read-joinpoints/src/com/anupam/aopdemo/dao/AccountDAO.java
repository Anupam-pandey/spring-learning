package com.anupam.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.anupam.aopdemo.Account;

@Component
public class AccountDAO {
	public String name;
	String serviceCode;
	
	
	public String getName() {
		System.out.println(getClass() + " addition getSet");
		return name;
	}


	public void setName(String name) {
		System.out.println(getClass() + " addition getSet");
		this.name = name;
	}


	public String getServiceCode() {
		System.out.println(getClass() + " addition getSet");
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + " addition getSet");
		this.serviceCode = serviceCode;
	}


	public void addAccount(Account account)
	{
		System.out.println(getClass() + " addition ");
		
	}
}
