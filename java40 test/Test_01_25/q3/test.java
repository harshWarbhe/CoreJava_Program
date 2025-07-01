package com.java.Test_01_25.q3;

public class test {

	public test() {
		// Custom Exception: InvalidRouteException
/*		class InvalidRouteException extends RuntimeException {
		    public InvalidRouteException(String message) {
		        super(message);
		    }
		}

		// Custom Exception: SeatsNotAvailableException
		class SeatsNotAvailableException extends Exception {
		    public SeatsNotAvailableException(String message) {
		        super(message);
		    }
		}

		// TravelRoute Interface
		interface TravelRoute {
		    void bookTicket(int seats) throws InvalidRouteException, SeatsNotAvailableException;
		    String getRouteDetails();
		    int getAvailableSeats();
		}

		// TravelRoute Class (BLC)
		class TravelRouteImpl implements TravelRoute {
		    private String routeName;
		    private int totalSeats;
		    private int availableSeats;

		    // Constructor
		    public TravelRouteImpl(String routeName, int totalSeats) {
		        this.routeName = routeName;
		        this.totalSeats = totalSeats;
		        this.availableSeats = totalSeats;
		    }

		    // Book tickets
		    @Override
		    public void bookTicket(int seats) throws InvalidRouteException, SeatsNotAvailableException {
		        if (seats <= 0) {
		            throw new InvalidRouteException("Invalid number of seats. Must be greater than zero.");
		        }
		        if (seats > availableSeats) {
		            throw new SeatsNotAvailableException("Not enough seats available.");
		        }
		        availableSeats -= seats;
		        System.out.println(seats + " tickets successfully booked for route: " + routeName);
		    }

		    // Get route details
		    @Override
		    public String getRouteDetails() {
		        return "Route: " + routeName + ", Total Seats: " + totalSeats + ", Available Seats: " + availableSeats;
		    }

		    // Get available seats
		    @Override
		    public int getAvailableSeats() {
		        return availableSeats;
		    }
		}

		// Customer Class (BLC)
		class Customer {
		    private String name;
		    private TravelRoute bookedRoute;

		    // Constructor
		    public Customer(String name) {
		        this.name = name;
		    }

		    // Book a route
		    public void bookRoute(TravelRoute route, int seats) {
		        try {
		            route.bookTicket(seats);
		            this.bookedRoute = route;
		        } catch (InvalidRouteException | SeatsNotAvailableException e) {
		            System.out.println(e.getMessage());
		        }
		    }

		    // Get booked route
		    public TravelRoute getBookedRoute() {
		        return bookedRoute;
		    }
		}

		// BookingSystem Class (ELC)
		import java.util.*;

		public class BookingSystem {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        List<TravelRoute> routes = new ArrayList<>();
		        routes.add(new TravelRouteImpl("Chennai to Madurai", 10));
		        routes.add(new TravelRouteImpl("Delhi to Agra", 20));
		        routes.add(new TravelRouteImpl("Mumbai to Pune", 15));

		        System.out.println("Enter your name:");
		        String customerName = scanner.nextLine();
		        Customer customer = new Customer(customerName);

		        while (true) {
		            System.out.println("\nMenu:");
		            System.out.println("1. Book Tickets");
		            System.out.println("2. Check Route Details");
		            System.out.println("3. Check Available Seats");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");

		            int choice;
		            try {
		                choice = Integer.parseInt(scanner.nextLine());
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a valid menu option.");
		                continue;
		            }

		            switch (choice) {
		                case 1 -> {
		                    System.out.println("Available Routes:");
		                    for (int i = 0; i < routes.size(); i++) {
		                        System.out.println((i + 1) + ". " + routes.get(i).getRouteDetails());
		                    }
		                    System.out.print("Select a route (1-" + routes.size() + "): ");
		                    int routeChoice;
		                    try {
		                        routeChoice = Integer.parseInt(scanner.nextLine());
		                        if (routeChoice < 1 || routeChoice > routes.size()) {
		                            throw new InvalidRouteException("Invalid route selection.");
		                        }
		                        TravelRoute selectedRoute = routes.get(routeChoice - 1);
		                        System.out.print("Enter the number of tickets to book: ");
		                        int seats = Integer.parseInt(scanner.nextLine());
		                        customer.bookRoute(selectedRoute, seats);
		                    } catch (InvalidRouteException | NumberFormatException e) {
		                        System.out.println(e.getMessage());
		                    }
		                }
		                case 2 -> {
		                    System.out.println("Available Routes:");
		                    for (TravelRoute route : routes) {
		                        System.out.println(route.getRouteDetails());
		                    }
		                }
		                case 3 -> {
		                    System.out.println("Available Seats by Route:");
		                    for (TravelRoute route : routes) {
		                        System.out.println(route.getRouteDetails());
		                    }
		                }
		                case 4 -> {
		                    System.out.println("Exiting the booking system. Thank you!");
		                    scanner.close();
		                    return;
		                }
		                default -> System.out.println("Invalid option. Please select a valid menu option.");
		            }
		        }
		    }
		}
*/
	}

}
