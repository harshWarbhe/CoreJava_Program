package com.java.basicJava.Day3_24_10;

class CalculateTax
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args [0]);
		double tax = a*4.9/100;
		
		System.out.println("taxable income of Rs. "+a+" if the tax rate is fixed at 4.9% is : "+tax);
	}
}
