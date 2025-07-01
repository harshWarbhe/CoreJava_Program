package com.java.Test_21_12.Airline_Booking_System;

public class InternationalAirline extends Airline {

	protected int internationalDestinations;
	protected double taxRate;

	public InternationalAirline(String airlineName, double baseFare, int internationalDestinations, double taxRate) {
		super(airlineName, baseFare);
		this.internationalDestinations = internationalDestinations;
		this.taxRate = taxRate;
	}

	@Override
	public double calculateFare(int seats)
	{
		double totalFare = super.calculateFare(seats);
		return totalFare + (totalFare * (taxRate / 100));
		
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
        System.out.println("International Destinations: " + internationalDestinations);
        System.out.println("Tax Rate: " + taxRate + "%");
	}
}
