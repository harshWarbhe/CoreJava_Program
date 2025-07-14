package com.java.basicJava.Day5_25_10;

/*
Program-2
----------
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and added new accessories worth Rs. 500. 
Rohan wants to make a profit of Rs. 1500 on selling the cycle. Find the selling price of the cycle. Write a java program to store all values 
and calculate and display the selling price.


*/
class  rohancyclebusiness
{
	public static void main(String[] args) 
	{
		int cy = Integer.parseInt(args [0]);
		int repair = 250 ;
		int coloring = 350;
		int acc =500;

		System.out.println("selling price of cycle after Rs. 1500 is : Rs "+(cy + repair + coloring + acc+ 1500));
			
	}
}
