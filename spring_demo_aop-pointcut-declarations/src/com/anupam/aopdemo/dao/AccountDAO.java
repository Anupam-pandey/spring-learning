package com.anupam.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.anupam.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account)
	{
		System.out.println(getClass() + " addition ");
		account.setLevel(null);
		account.setName(null);
	}
}
