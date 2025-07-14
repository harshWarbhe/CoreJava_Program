package com.java.basicJava.Day5_25_10;
/*
Program-3
----------
Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.

Explanation:
Simple Interest formula: SI = P*R*T/100
Total Amount formula: A = P + SI

Sample Input :
Principal (P): 5000
Rate of Interest (R): 5
Simple Interest (SI): 750.0
Total Amount (A): 5750.0
*/
class  SimpleInterestAndAmount
{
	public static void main(String[] args) 
	{
		int p = Integer.parseInt(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);

		double si = (p*r*t)/100;
		double ta = p + si;

		System.out.println("Principal (P): "+p);
		System.out.println("Rate of Interest (R): "+r);
		System.out.println("Simple Interest (SI): "+si);
		System.out.println("Total Amount (A): "+ta);

	}
}
