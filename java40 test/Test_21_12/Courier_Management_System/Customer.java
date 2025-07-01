package com.java.Test_21_12.Courier_Management_System;

import java.util.Scanner;

public class Customer {
	private String name;
	private String contactNumber;
	private Courier courier;

	public Customer(String name, String contactNumber, Courier courier) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.courier = courier;
	}

	public void displayCustomerDetails() {
		System.out.println("Customer Name: " + name);
		System.out.println("Customer contact number: " + contactNumber);

		courier.displayCourierDetails();
//		System.out.println(courier);

		if (courier instanceof DomesticCourier) {
			System.out.println("Service: Within the country");
		} else {
			System.out.println("Service: Across countries");
		}

		System.out.println("Total Cost: " + courier.calculateCost() + "Rs");
		System.out.println();
	}

}
