package com.harsh.Collection.Set;

class Customer {
	private int customerId;
	private String customerName;

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
}

public class EqualsDemo1 {
	public static void main(String[] args) {
		Customer c1 = new Customer(111, "Scott");
		Customer c2 = new Customer(111, "Scott");

//		It will return false because equals(Object obj) method 
//		of Object class is used to compare two objects based on the 
//		memory reference/Memory address.

		System.out.println(c1.equals(c2));

	}

}
