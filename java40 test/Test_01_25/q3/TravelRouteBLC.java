package com.java.Test_01_25.q3;

public class TravelRouteBLC implements TravelRoute {

	private String routeName;
	private int totalSeats;
	private int availableSeats;

	public TravelRouteBLC(String routeName, int totalSeats) {
		this.routeName = routeName;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats;
	}

	@Override
	public void bookTicket(int seats) throws InvalidRouteException, SeatsNotAvailableException {
		if(seats < 0 )
		{
            throw new InvalidRouteException("Invalid number of seats. Must be greater than zero.");
		}
		if(seats > availableSeats)
		{
            throw new SeatsNotAvailableException("Not enough seats available.");
		}
		availableSeats -= seats;
        System.out.println(seats + " tickets successfully booked for route: " + routeName);

	}

	@Override
	public String getRouteDetails() {
		return "routeName=" + routeName + ", totalSeats=" + totalSeats + ", availableSeats="
				+ availableSeats + "";
	}

	@Override
	public int getAvailableSeats() {
		return availableSeats;
	}


}
