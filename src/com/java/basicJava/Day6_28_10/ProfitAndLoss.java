package com.java.basicJava.Day6_28_10;

/*
Que 3 :
=======

Write a java program to find the profit and loss by following the formula
Profit and loss Formulas   
Profit = SP - CP
Loss = CP - SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/
class  ProfitAndLoss
{
	public static void main(String[] args) 
	{
		float sp = Float.parseFloat(args[0]);
		float cp = Float.parseFloat(args[1]);

		if (sp>cp)
		{
			float profit = sp - cp;
			System.out.println("Profit Percentage : "+((profit /cp) * 100));
		}
		else {
			float loss = cp - sp;
			System.out.println("Profit Percentage : "+((loss/cp) * 100));
		}
	}
}
