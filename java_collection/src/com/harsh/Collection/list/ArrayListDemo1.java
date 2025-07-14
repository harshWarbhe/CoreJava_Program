package com.harsh.Collection.list;

import java.util.ArrayList;

record Customer(int customerId,String customerName, Double customerSal)
{
	
}

public class ArrayListDemo1 {
	public static void main(String[] args) 
	{
		ArrayList<Customer> listOfCustomer = new ArrayList<>();
		listOfCustomer.add(new Customer(111, "Scott", 800D));
		listOfCustomer.add(new Customer(222, "Smith", 1200D));
		listOfCustomer.add(new Customer(333, "Alen", 1800D));
		listOfCustomer.add(new Customer(444, "Martin", 1500D));
		listOfCustomer.add(new Customer(555, "John", 1300D));
		
		
		listOfCustomer.forEach(System.out::println);
		
   }

}
