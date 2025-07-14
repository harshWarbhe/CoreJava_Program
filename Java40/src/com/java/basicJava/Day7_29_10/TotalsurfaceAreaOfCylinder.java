package com.java.basicJava.Day7_29_10;

/*
Que 2 :
=======
Write a Java program to calculate the total surface area of a cylinder.
Formula : 2 * pi * r square + 2 * pi * r * h 

where:

r is the radius of the cylinder's base,
h is the height of the cylinder,
pi is approximately 3.14.

Sample Input : 
Enter the radius of the cylinder: 5
Enter the height of the cylinder: 10

Sample Output :
The total surface area of the cylinder is: 471.0

===========================
*/
import java.util.Scanner;
class  TotalsurfaceAreaOfCylinder
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder : ");
		float r = sc.nextFloat();
		System.out.print("Enter the hieght of the cylinder : ");
		float h = sc.nextFloat();

		final double pi = 3.14;
		double tsa = (2*pi*r*r) + (2*pi*r*h);
		System.out.println("The total surface of the cylinder : "+tsa);
	}
}
