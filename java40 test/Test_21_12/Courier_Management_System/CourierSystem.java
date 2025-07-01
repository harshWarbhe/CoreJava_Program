package com.java.Test_21_12.Courier_Management_System;

public class CourierSystem {
	public static void main(String[] args) {
		Courier domesticCourier = new Courier("domestic", 5.0);
		Courier internationalCourier = new Courier("international", 3.0);

		Customer customer1 = new Customer("Alice", "9876543210", domesticCourier);
		Customer customer2 = new Customer("Bob", "9123456780", internationalCourier);

		customer1.displayCustomerDetails();
		customer2.displayCustomerDetails();
	}
}
