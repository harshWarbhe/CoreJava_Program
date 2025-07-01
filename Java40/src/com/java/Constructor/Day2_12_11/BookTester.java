package com.java.Constructor.Day2_12_11;

import java.util.Scanner;

public class BookTester 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Book b = new Book();

		System.out.print("Book title: ");
		String title = sc.nextLine();
		b.setTitle(title);

		System.out.print("Book author: ");
		String author = sc.nextLine();
		b.setAuthor(author);

		System.out.print("ISBN: ");
		String ISBN = sc.nextLine();
		b.setISBN(ISBN);

		System.out.print("price: ");
		double price = sc.nextDouble();
		b.setPrice(price);

		System.out.print("Discount Percentage: ");
		double discountPercentage = sc.nextDouble();
		b.setDiscountPercentage(discountPercentage);
		
		
		b.getDisplay();
	}
}

class Book
{
	private String title;
	private String author;
	private String ISBN;
	private double price;
	private double discountPercentage;
	

	/*Employee(String employeeName,String department, double baseSalary, int performanceScore)
	{
		this.employeeName=employeeName;
		this.department=department;
		this.baseSalary=baseSalary;
		this.performanceScore= performanceScore;
	}
	*/
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setDiscountPercentage(double discountPercentage)
	{
		this.discountPercentage=discountPercentage;
	}

	public double getFinalPrice()
	{
		double finalPrice = price - (price * discountPercentage / 100);
		return finalPrice;
	}

	
	public void getDisplay()
	{
		System.out.println("book detail: \n");	
		System.out.println("Book title: "+this.title);	
		System.out.println("Book author: "+this.author);	
		System.out.println("ISBN: "+this.ISBN);	
		System.out.println("Price: "+this.price);	
		System.out.println("discountPercentage:"+this.discountPercentage);
		System.out.println("Book Final Price:"+this.getFinalPrice());
	}
	
	
}
