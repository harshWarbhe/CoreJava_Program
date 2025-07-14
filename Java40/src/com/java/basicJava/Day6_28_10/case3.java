package com.java.basicJava.Day6_28_10;

/*
Que 3 :
=======

What is the output of the below Java code snippet?

float a = 8.2/2;
System.out.println(a);

A) 4.1
B) 8.1
C) 4
D) Compiler error*  // error: incompatible types: possible lossy conversion from double to float
=================================================
*/
class case3
{
	public static void main(String[] args) 
	{
		float a = (float) (8.2/2);
		System.out.println(a);
	}
}
