package com.java.basicJava.Day3_24_10;

class SumAndAverageOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		System.out.println("The sum of three number : "+(a+b+c));
		System.out.println("The average of three number : "+((a+b+c)/3));
	}

}
