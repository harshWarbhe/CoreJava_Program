package com.java.Test_21_12.Airline_Booking_System;

public class DomesticAirline extends Airline {
	private int domesticRoutes;
	private double discountRate;

	public DomesticAirline(String airlineName, double baseFare, int domesticRoutes, double discountRate) {
		super(airlineName, baseFare);
		this.domesticRoutes = domesticRoutes;
		this.discountRate = discountRate;
	}

	@Override
	public double calculateFare(int seats) {
		double totalFare = super.calculateFare(seats);
		// double totalFare = 0;
		return totalFare - (totalFare * (discountRate / 100));
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Domestic Routes: " + domesticRoutes);
		System.out.println("Discount Rate: " + discountRate);
	}
}
