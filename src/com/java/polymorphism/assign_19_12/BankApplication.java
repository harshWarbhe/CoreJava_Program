/*Assignment :
---------------------
Create a Bank Application project by using Method Overriding Concept to display
different kinds of account details and calculate interest rate on each different types
of account like saving account, Current account and Fixed deposit account.
Validate all the inputs properly and generate error message, if any input is not appropriate.

Create a BLC class called BankAccount
Fields :
accountHolderName String protected
accountNumber String protected
   balance double protected
   IFSC_CODE public static final String (Initialize the IFSC CODE at the time of declaration,
   will be common for all the Objects)
   
   Use a parameterized constructor to initialize all the fields, In this constructor provide
   error message, if inputs are not in valid format like (see test cases for more details)
a)Account holder name cannot be empty.
b)Account number cannot be empty.
c)Balance cannot be negative.

Methods :

1) Method Name     : calculateInterest()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method write a generic message regarding Bank interest Calculation.

2) Method Name     : displayAccountDetails()
Argument           : No Argument
Return Type        : void
Access modifier    : public
In this method display customer records [See the Test cases for more details in the below
of this question]

Create another BLC class SavingsAccount which is sub class of BankAccount

Field :
protected double interestRate = 4.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name        : calculateInterest()
Argument        : No Argument
Return Type        : void
Access modifier    : public
In this method write a logic to calculate interest rate on Saving Account.

Create another BLC class CurrentAccount which is sub class of BankAccount

Field :
protected double overdraftLimit = 5000.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name        : calculateInterest()
Argument        : No Argument
Return Type        : void
Access modifier    : public
In this method write a statement that Current accounts do not earn interest.

2) Method Name        : checkOverdraftLimit()
Argument        : No Argument
Return Type        : void
Access modifier    : public
In this method print overdraftLimit amount.

Create another BLC class FixedDepositAccount which is sub class of BankAccount

Field :
protected double interestRate = 4.0;

Take a parameterized constructor to initialize super class properties.

Method :

1) Method Name        : calculateInterest()
Argument        : No Argument
Return Type        : void
Access modifier    : public
In this method write a logic to calculate interest rate on Saving Account.

Field :
protected double interestRate = 6.5;
    depositTerm int protected;
   
    Take a parameterized constructor to initialize super class and current class properties.
    Validate the input deposit term with error message, depositTerm can't be negative.

Method :

1) Method Name        : calculateInterest()
Argument        : No Argument
Return Type        : void
Access modifier    : public
In this method write the logic to calculate the interest amount on FixedDeposit account.

Create an ELC class BankApplication with main method to test this application. Write
Switch case with Scanner class to Test as shown in the below Test Cases.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   1
   Enter account Holder Name :RaviShankar
   Enter account Number :975645786545
   Enter the Amount :4000000
   Account Holder: RaviShankar
   Account Number: 975645786545
   Balance RS :4000000.0
   IFSC CODE :SBIHYD151285
   Savings Account Interest RS :160000.0
   
   Test Case 2 :
-------------
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   2
   Enter account Holder Name :Scott
   Enter account Number :675456789765
   Enter the Amount :12000
   Account Holder: Scott
   Account Number: 675456789765
   Balance RS :12000.0
   IFSC CODE :SBIHYD151285
   Current accounts do not earn interest.
   Overdraft limit RS :5000.0

Test Case 3 :
-------------
   Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   3
   Enter account Holder Name :Martin
   Enter account Number :456787654345
   Enter the Amount :230000
   Enter the deposit term [For How many years you want to deposit] :5
   Account Holder: Martin
   Account Number: 456787654345
   Balance RS :230000.0
   IFSC CODE :SBIHYD151285
   Fixed Deposit Interest for 5 years RS :74750.0

   Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   1
   Enter account Holder Name :
   Enter account Number :4567876543
   Enter the Amount :128907
   Account holder name cannot be empty.

Test Cases 2:
-------------
   Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   1
   Enter account Holder Name :Ravi
   Enter account Number :
   Enter the Amount :50000
   Account number cannot be empty.

Test Cases 3:
-------------
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   1
   Enter account Holder Name :Ravi
   Enter account Number :567876543456
   Enter the Amount :-9000
   Balance cannot be negative.
   
   Test Cases 4:
-------------
Please select the Account Type :
        1) Saving Account
        2) Current Account
        3) Fixed Deposit Account
   Please enter the type of account you want to open : [1/2/3]
   3
   Enter account Holder Name :Ravi
   Enter account Number :567865434567
   Enter the Amount :90876
   Enter the deposit term [For How many years you want to deposit] :-2
   Deposit term must be positive.
 */
package com.java.polymorphism.assign_19_12;

import java.util.Scanner;

public class BankApplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the account Type: ");
		System.out.println("1) Saving Account");
		System.out.println("2) Current Account");
		System.out.println("3) Fixed Deposit Account");
		System.out.print("Please enter the type of account you want to open: [1/2/3]: ");
		int choice = sc.nextInt();
		
		switch(choice)
		{ 
		case 1:
			System.out.print("Enter account Holder Name: ");
			sc.nextLine();
			String savingName = sc.nextLine();
			System.out.print("Enter account number: ");
			String savingNumber = sc.nextLine();
			System.out.print("Enter the Amount: ");
			double savingBalance = sc.nextDouble();	
			
			SavingsAccount sa = new SavingsAccount(savingName, savingNumber, savingBalance);
			
			sa.displayAccountDetails();
			sa.calculateInterest();
			break;
			
		case 2:
			System.out.print("Enter account Holder Name: ");
			sc.nextLine();
			String currentName = sc.nextLine();
			System.out.print("Enter account number: ");
			String currentNumber = sc.nextLine();
			System.out.print("Enter the Amount: ");
			double currentBalance = sc.nextDouble();	
			
			CurrentAccount ca = new CurrentAccount(currentName, currentNumber, currentBalance);
			
			ca.displayAccountDetails();
			ca.calculateInterest();
			ca.checkOverdraftLimit();
			break;
			
		case 3:
			System.out.print("Enter account Holder Name: ");
			sc.nextLine();
			String FixedName = sc.nextLine();
			System.out.print("Enter account number: ");
			String FixedNumber = sc.nextLine();
			System.out.print("Enter the Amount: ");
			double FixedBalance = sc.nextDouble();
			System.out.println(" Enter the deposit term [For How many years you want to deposit]: ");
			int depositTerm = sc.nextInt();
			
			FixedDepositAccount fd = new FixedDepositAccount(FixedName, FixedNumber, FixedBalance, depositTerm );
			
			fd.displayAccountDetails();
			fd.calculateInterest();
			
		default:
			System.out.println("Invalid choice. Please select a valid account type.");
			
			sc.close();
		}
		
	}

}





























