package com.java.basicJava.Day7_29_10;

/*Que 4 :
=======
Write Java Program Convert Fahrenheit To Celsius | Vice Versa
Formula :
Celsius=(Fahrenheit-32)*5/9;
Fahrenheit=((9*Celsius)/5)+32;
Note [ Write two seprate program for converting celsius into Fahrenheit and Fahrenheit into celsius ]

Example 1 :
Sample Input  : Enter temperature in Fahrenheit: 98.6
Sample Output : Temperature in Celsius: 37.0

Example 2 :
Sample Input  : Enter temperature in Celsius: 37
Sample Output : Temperature in Fahrenheit: 98.6

===========================
*/

import java.util.Scanner;
class celsiusintoFahrenheit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius : ");
		double c = sc.nextDouble();

		double f = ((9*c)/5)+32;
		System.out.print("Temperature in Fahrenheit : "+f);
	}
}

