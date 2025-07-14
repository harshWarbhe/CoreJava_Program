package com.java.oops.Day1_30_10;

import java.util.Scanner;

class Product
{
	//public access
	int productId;
	String productName;
	double productPrice;

	//method to set
	public void setProductData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the product ID: ");
		productId = sc.nextInt();
		sc.nextLine();          // Consume the newline character left by nextInt()

		System.out.print("Enter the product name: ");
		productName = sc.nextLine();

		System.out.print("Enter the product price: ");
		productPrice = sc.nextDouble();

		sc.close();
	}

	public void getProductInfo()
	{
		System.out.println("\nProduct Information");
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price : "+productPrice);
	}
}

public class ProductTest
{
	public static void main(String[] args) 
	{
		Product prod = new Product();
		
		// set method
		prod.setProductData();
		prod.getProductInfo();
	}
}
