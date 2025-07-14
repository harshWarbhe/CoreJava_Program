package com.java.basicJava.Day4_24_10;

/*
Program 01:
-----------
Write a  program in Java that will generate and print the bill at Dominos for four chicken rolls (@ Rs 60 per chicken rolls) and three 
vegetable puffs (@ Rs 25 per vegetable puffs). There is a special discount of Rs 50 on the final bill amount. Calculate and print final bill as 
well as all item bill.*/
class  DominosBill
{
	public static void main(String[] args) 
	{
		//int a = Integer.parse.Int(args[0]);
		//int b = Integer.parse.Int(args[1]);

		int totalcost = (60*4) + (25*3);
		
		System.out.println("final fill after special discount of Rs 50 : "+(totalcost-50));
	}
}