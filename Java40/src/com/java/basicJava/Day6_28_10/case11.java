package com.java.basicJava.Day6_28_10;

/*
Que 11 :
========

public class Sample4{
public static void main(String[] argv)
{
char ch = 'c';
int num = 88;
ch = num;
}
}

ans:  error: incompatible types: possible lossy conversion from int to char
                ch = num;
=================================================

*/
class case11 
{
	public static void main(String[] args) 
	{
		char ch = 'c';
		int num = 88;
		ch = (char) num;
	}
}
