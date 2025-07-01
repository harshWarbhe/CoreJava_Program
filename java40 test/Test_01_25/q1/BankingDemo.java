/*
Simple Banking System
Scenario:
You are developing a simple banking system where the user enters an amount to withdraw from their account. If the user enters invalid input, an InputMismatchException should be thrown and caught.

Requirements:
Create a class BankingDemo with a main method.
The program should read an amount to withdraw from the console using the Scanner class.
If the user enters anything other than a valid number, an InputMismatchException should be caught.
After catching the exception, use the following methods to print the information about the error:
getMessage()
printStackTrace()
println()
toString()

Sample Input/Output:

Input:
Enter withdrawal amount: 500
Output:

You entered withdrawal amount: 500*/
package com.java.Test_01_25.q1;

import java.util.Scanner;

public class BankingDemo {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter withdrawal amount: ");
			int amount = sc.nextInt();
			if (amount < 0) {
				throw new InputMismatchException("Input Mismatch Exception");
			}
			System.out.println("You entered withdrawal amount:"+amount);

		} 
		catch (InputMismatchException e) {
			System.out.println(e);
		}

	}

}
