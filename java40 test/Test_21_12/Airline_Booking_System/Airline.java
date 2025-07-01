package com.java.Test_21_12.Airline_Booking_System;

public class Airline {
	protected String airlineName;
	protected double baseFare;

	public Airline(String airlineName, double baseFare) {
		super();
		this.airlineName = airlineName;
		this.baseFare = baseFare;
	}

	public double calculateFare(int seats) {
		return seats;

	}

	public void displayDetails() {
		System.out.println("Airline name: "+airlineName);
		System.out.println("Base fare: "+baseFare);
	}
}
