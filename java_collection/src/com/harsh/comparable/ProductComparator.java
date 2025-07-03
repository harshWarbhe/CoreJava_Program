package com.harsh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductComparator {
	public static void main(String[] args)
	{
		ArrayList<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(new Product(444, "Laptop", 84000D));
		listOfProduct.add(new Product(333, "Camera", 54000D));
		listOfProduct.add(new Product(111, "Mobile", 24000D));
		listOfProduct.add(new Product(222, "HeadPhone", 4000D));

		System.out.println("Original Data");
		listOfProduct.forEach(System.out::println);
		
		System.out.println("\nAfter Sorting based on the Price ");
		//Anonymous inner class
		Comparator<Product> cmpPrice = new Comparator<Product>()
		{			
			@Override
			public int compare(Product p1, Product p2) 
			{
				return Double.compare(p1.price(), p2.price());
			}
		};
		
		Collections.sort(listOfProduct, cmpPrice);
		
		listOfProduct.forEach(System.out::println);
		
		
		System.out.println("\nAfter Sorting based on the ID :");
		//Passing Functional interface as a parameter
		Comparator<Product> cmpId = (p1,p2)-> Integer.compare(p1.pid(), p2.pid());
		Collections.sort(listOfProduct , cmpId);
		listOfProduct.forEach(System.out::println);
		
		
		System.out.println("\nAfter Sorting based on the Name :");
		//Lambda
		Collections.sort(listOfProduct, (s1,s2)-> s1.pname().compareTo(s2.pname()));
		listOfProduct.forEach(System.out::println);
		
	}


}