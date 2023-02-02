package com.anupam.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Account> findAccount()
	{
		List<Account> myAccounts = new ArrayList<>();
		
		Account a = new Account("a","z");
		Account b = new Account("b","y");
		Account c = new Account("c","x");
		myAccounts.add(c);
		myAccounts.add(b);
		myAccounts.add(a);
		return myAccounts;
	}
}
