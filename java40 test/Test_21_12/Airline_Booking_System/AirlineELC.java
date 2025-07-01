package com.java.Test_21_12.Airline_Booking_System;

public class AirlineELC {

	public static void main(String[] args) {
		
		DomesticAirline domesticAirline = new DomesticAirline("FlyHigh Airways", 2000, 15, 10);
		
		InternationalAirline internationAirline = new InternationalAirline("GlobalJet", 5000, 25, 20);
		
		BookingSystem bookingSystem = new BookingSystem();
		
		bookingSystem.bookTicket(domesticAirline, 3);
		bookingSystem.bookTicket(internationAirline, 3);

	}

}
