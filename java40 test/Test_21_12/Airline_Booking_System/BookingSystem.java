package com.java.Test_21_12.Airline_Booking_System;

public class BookingSystem {
	
	public void bookTicket(DomesticAirline airline, int seats)
	{
		System.out.println("Booking Domestic Airline Ticket: ");
		System.out.println("-------------------------------");
		airline.displayDetails();
		double totalFare = airline.calculateFare(seats);
		System.out.println("Total Fare (after discount): "+totalFare);
		System.out.println();
	}
	
	public void bookTicket(InternationalAirline airline, int seats) 	{
		System.out.println("Booking International Airline Ticket: ");
		System.out.println("-------------------------------");
		airline.displayDetails();
		double totalFare = airline.calculateFare(seats);
		System.out.println("Total Fare (including tax): "+totalFare);
		System.out.println();
		
	}
}
