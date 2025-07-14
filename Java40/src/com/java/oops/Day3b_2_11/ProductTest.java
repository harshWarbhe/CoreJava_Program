package com.java.oops.Day3b_2_11;

import java.util.Scanner;
class Product
{
	int productId;
	String productName;
	double productPrice;

	public void setProductData(int productId, String productName, double productPrice){
		 this.productId =productId;
		 this.productName =productName;
		 this.productPrice =productPrice;
		
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
		//Initialize these properties with the help of Method parameter using Scanner class in ELC class.

		Product prod = new Product();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Product Id: ");
		int productId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
		String productName = sc.nextLine();

		System.out.print("Enter Product Price: ");
		double productPrice = sc.nextDouble();

		sc.close();

		prod.setProductData(productId,productName,productPrice);
		prod.getProductInfo();
	}
}
