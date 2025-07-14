
/*
	Using this Keyword to Initialize Parameters

	Create a Rectangle class with the following specifications:

	Attributes:

	length (double)
	width (double)

	Methods:

	void setDimensions(double length, double width): Uses the this keyword to set the length and width of the rectangle.
	double calculateArea(): Returns the area of the rectangle (length � width).

	double calculatePerimeter(): Returns the perimeter of the rectangle (2 � (length + width)).

	Task:

	Create a main method to:
	Initialize a Rectangle object with specific dimensions.
	Use setDimensions to set the dimensions.
	Display the area and perimeter .
*/
package com.java.oops.Day5_6_11;

import java.util.Scanner;
class  rectangle
{
	double length;
	double width;

	void setDimentions(double length, double width)
	{
		this.length=length;
		this.width=width;
	}

	public double calculateArea()
	{
		double a = this.length * this.width;
		return a;
	}

	public double calculatePerimeter()
	{
		double p = (2 * (this.length + this.width));
		return p;
	}

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		double l = sc.nextDouble();

		System.out.println("Enter the width : ");
		double w = sc.nextDouble();

		rectangle rect = new rectangle();

		rect.setDimentions(l,w);

		System.out.println("Area of rectangle : "+rect.calculateArea());
		System.out.println("perimeter of rectangle : "+rect.calculatePerimeter());

		sc.close();
	}
}
