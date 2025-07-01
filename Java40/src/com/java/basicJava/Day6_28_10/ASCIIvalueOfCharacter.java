package com.java.basicJava.Day6_28_10;

/*
Que 2 :
=======

Write a java program to find the ASCII value of a character
For Example
Output sholud be in below formart
The ASCII value of a is : 97
=================================================
*/
public class  ASCIIvalueOfCharacter
{
	public static void main(String[] args) 
	{
		 if (args.length == 0) {
	            System.out.println("Please provide a character as a command-line argument.");
	            return; // Exit the program if no argument is provided
	        }

	        char inputChar = args[0].charAt(0); // Take the first character of the first argument
	        int asciiValue = (int) inputChar;

	        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);
	}
}

