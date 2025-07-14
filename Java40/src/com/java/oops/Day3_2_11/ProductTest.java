package com.java.oops.Day3_2_11;

import java.util.Scanner;
class Product
{
	int productId;
	String productName;
	double productPrice;

	public void setProductData(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product Id: ");
		productId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
		productName = sc.nextLine();

		System.out.print("Enter Product Price: ");
		productPrice = sc.nextDouble();

		sc.close();
	}
	
	public void getProductInfo(){
		
		System.out.println("Product detail ");
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Price: "+productPrice);
	}
}

public class ProductTest 
{
	public static void main(String[] args) 
	{
		Product prod = new Product();

		prod.setProductData();
		prod.getProductInfo();
	}
}
