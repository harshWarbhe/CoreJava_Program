package com.java.basicJava.Day7_29_10;

/*
Que 3 :
=======
Write a Java program to calculate compound interest for 3 years? 
Formula: amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));

Sample Input :
Enter the principal amount: 1000
Enter the rate of interest: 5

Sample Output :
The amount after 3 years with compound interest is: 1157.625

===========================
*/
import java.util.Scanner;
class CompountInterset
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the principle amount for 3 year: ");
		float p= sc.nextFloat();
		System.out.print("Enter the rate of interest : ");
		float r = sc.nextFloat();
		float amt= p*((1+r/100)*(1+r/100)*(1+r/100));

		System.out.print("The amount after 3 year with compount interest : "+amt);
	}
}
