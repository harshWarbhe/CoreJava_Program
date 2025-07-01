package com.java.basicJava.Day4_24_10;

/*
Program 02:
-----------
Write a Java program to check if a given number is a palindrome. A number is a palindrome if it remains the same when its digits are 
reversed.
*/

class  palindromeOrNot
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int temp =a;
		int rev=0;
		while(temp!=0)
		{
			rev = rev*10 + temp%10;
			temp= temp/10;
		}

		if (a==rev)
		{
			System.out.println(a+"is palindrome");
		}
		else
		{
			System.out.println(a+" is not palindrome");
		}
	}
}
