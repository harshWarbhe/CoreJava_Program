package com.java.polymorphism.assign_20_12;

public class Customer {

	protected String name;

	public Customer(String name) {
		super();
		if (name == null || name == "") {
			System.out.println("Customer name cannot be empty.");
		} else
			this.name = name;
	}

	public void calculateBill(double... prices) {
		double totalCost = 0;
		for (double price : prices) {
			if (price < 0) {
				System.err.println("Item price cannot be nagative. ");
				break;
			} else
				totalCost += price;
		}
		System.out.println("Customer detail:");
		System.out.println("customer name" + name);
		System.out.println("total cost" + totalCost);
		System.out.println("Discount: No discount for regular customers.");

	}

}
