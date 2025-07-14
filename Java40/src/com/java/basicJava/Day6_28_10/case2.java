package com.java.basicJava.Day6_28_10;

/*Que 2 :
=======

What is the output of the below Java code snippet?

char ch = 'A';
int a = ch + 1;
ch = (char)a;
System.out.println(ch);

A) 66
B) A
C) B*
D) 65
=================================================
*/
class case2
{
	public static void main(String[] args) 
	{
		char ch = 'A';
		int a = ch + 1;
		ch = (char)a;
		System.out.println(ch);
	}
}
