package com.java.polymorphism.assign_19_12;

public class BankAccount {
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance ;
	public static final String IFSC_CODE = "SBINOOOOO501";
	
	
	
	
	public BankAccount(String accountHolderName, String accountNumber, double balance) {
		if(accountHolderName == null)
		{
			System.err.println("Account holder name cannot be empty");
		}
		else
		{
			this.accountHolderName = accountHolderName;
		}
		if(accountNumber == null)
		{
			System.err.println("Account number cannot be empty.");
		}
		else
		{
			this.accountNumber = accountNumber;
		}
		if(balance < 0)
		{
			System.err.println("Balance cannot be negative.");
		}
		else
		{
			this.balance = balance;
		}
	}
	
	
	
	public void calculateInterest()
	{
		System.out.println("generic message regarding Bank interest Calculation");
		
	}
	public void displayAccountDetails()
	{
		System.out.println("Account details : ");
		System.out.println("account Holder Name: "+this.accountHolderName);
		System.out.println("accountNumber: "+this.accountNumber);
		System.out.println("balance: "+this.balance);
		System.out.println("IFSC_CODE: "+IFSC_CODE);
		
	}
	
}
