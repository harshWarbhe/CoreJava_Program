package com.java.ExceptionHandling.assign_01_22.q1;

public class Customer {
	private String name;
	private BankAccount account;

	public Customer(String name, BankAccount account) {
		this.name = name;
		this.account = account;
	}
	
	public BankAccount getAccount()
	{
		return account;
	}

}
