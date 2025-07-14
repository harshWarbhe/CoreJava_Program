package com.java.basicJava.Day5_25_10;

/*
Program-4
----------
Write a program in java to input number of days. Find and display number of years, months and days.

=========================================

Time (T in years): 3

Sample Output :
Program-5
-----------
A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as
follows:

     Net Bill in Rupees			    Discount %
	<5000									5
	>=5000 and <10000				10
	>=10000								15

Display Discount %, Discount Amount and Amount Payable
*/
class DiscountAmount
{
	public static void main(String[] args) 
	{
		int amt = Integer.parseInt(args[0]);

		if (amt < 5000)
		{
			System.out.println("Discount % "+5);
			System.out.println("Discount Amount "+(amt*5/100));
			System.out.println("Amount Payable "+(amt- amt*5/100));
		}
		else if (amt >=5000 && amt<10000)
		{
			System.out.println("Discount % "+10);
			System.out.println("Discount Amount "+(amt*10/100));
			System.out.println("Amount Payable "+(amt- amt*10/100));
		}
		else
		{
			System.out.println("Discount % "+15);
			System.out.println("Discount Amount "+(amt*15/100));
			System.out.println("Amount Payable "+(amt- amt*15/100));
		}
	}
}
