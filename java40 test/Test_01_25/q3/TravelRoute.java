/*
 Ticket Booking System for Travel
Objective:
Create a Java program for a Ticket Booking System for travel that enables customers to book tickets for different travel routes. The system must validate inputs, handle errors, and use interfaces, classes, and exceptions effectively.

Requirements:
Custom Exceptions:
InvalidRouteException (Unchecked):

Methods: Parameterized Constructor with a String parameter.
Purpose: Thrown when a customer selects an invalid travel route.
SeatsNotAvailableException (Checked):

Methods: Parameterized Constructor with a String parameter.
Purpose: Thrown when there are not enough seats available for the requested travel route.

TravelRoute Interface:
Methods: bookTicket
Return Type: void
Parameters: (int seats)
Throws: InvalidRouteException, SeatsNotAvailableException.
Purpose: Books the specified number of tickets for a travel route.
getRouteDetails
Return Type: String
Purpose: Returns route details such as source, destination, and ticket availability.
getAvailableSeats
Return Type: int
Purpose: Returns the available number of seats.

TravelRoute Class (BLC):
Attributes:

routeName: String: private
totalSeats: int: private
availableSeats: int: private
Implements: TravelRoute Interface.

Methods:

bookTicket(int seats): Books tickets for a route if seats are available. Throws exceptions for invalid input or insufficient seats.
getRouteDetails(): Returns the travel route details, including the route name and available seats.
getAvailableSeats(): Returns the number of seats available for booking.
Constructor: Initializes the route name, total seats, and available seats.

Customer Class (BLC):
Attributes:

name: String: private
bookedRoute: TravelRoute: private (HAS-A relationship).
Methods:

Constructor: Initializes the customer's name.
getBookedRoute(): Returns the booked travel route.

BookingSystem Class (ELC):
Contains:

Main method to demonstrate ticket booking functionality.
Menu options using switch-case:

Book Tickets
Check Route Details
Check Available Seats
Exit

Uses:

Try-with-resources: For managing user input.
Multi-catch blocks: For error handling.
Input Validation: Ensures valid menu options and ticket booking.

Test Cases:
Ticket Booking Test Cases:
Valid Booking:

Action: Book 3 tickets for the Chennai to Madurai route (10 seats available).
Expected Output: Seats decrease to 7.
Invalid Route Selection:

Action: Select a non-existent travel route.
Expected Output: InvalidRouteException with an appropriate message.
Seats Not Available:

Action: Book 12 tickets for a route with 10 seats available.
Expected Output: SeatsNotAvailableException with an appropriate message.
Invalid Seat Number:

Action: Attempt to book -5 tickets.
Expected Output: InvalidRouteException with an appropriate message.

*/

package com.java.Test_01_25.q3;

public interface TravelRoute {

	public void bookTicket(int seats) throws InvalidRouteException, SeatsNotAvailableException;
	
	public String getRouteDetails();
	
	public int getAvailableSeats();
	

}
