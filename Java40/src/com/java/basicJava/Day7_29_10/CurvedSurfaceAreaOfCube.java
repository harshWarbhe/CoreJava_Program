package com.java.basicJava.Day7_29_10;

/*
Que 1:
======
Write a Java program to calculate the curved surface area of a cube.

Formula : 6*side Square.

Sample Input  : Enter the side length of the cube: 4
Sample Output : The curved surface area of the cube is: 96.0

===========================
*/
import java.util.Scanner;
class CurvedSurfaceAreaOfCube
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side length of the cube : ");
		float a = sc.nextFloat();

		System.out.println("The curved surface area of the cube is: "+(6*a));
	}
}
