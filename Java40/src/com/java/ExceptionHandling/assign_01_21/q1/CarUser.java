/**
  Ques - 1
----------------
Implement a Java program that simulates various car-related exceptions using custom exception classes (CarStopped, CarPuncture, CarHeat). The program should handle different scenarios and test cases using the CarTest class and demonstrate exception handling through static methods.


For CarStoppedException: extends Exception
Purpose: Represents an exception when the car stops for reasons other than puncture or overheating.


Instance Methods:
No Instance methods


Methods:
Parameterized Constructor with String as parameter


For CarPunctureException: extends Exception
This class is used for raise the exception if car is punctured.
Instance Methods:
No Instance methods


Methods:
Parameterized Constructor with String as parameter


For CarHeatException: extends Exception
This class is used for raise the exception if the car engine is more than 50 degrees Celsius


Instance Methods:
No Instance methods


Methods:
Parameterized Constructor with String as parameter


For CarTest class:
Contains static methods to simulate car operations and throw exceptions based on certain conditions.


Instance Variables:
No Instance Variables


Methods:
Stop(String): void: static


This class throws CarStoppedException. If the string is  stop  throw new exception and get the message or else message is Car not stall




Methods:
puncture(String): void: static: public


This class throws CarPunctureException. If the string is  puncture  throw new exception and get the message line  Car is punctured  or else message is Car not stall.


Methods:
carHeat(int): void: static : public


This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it throw new exception and get the message line  Car is heated more the 50 degrees  or else message is Car not stall.


ELC class CarUser :-
Invoke stop, puncture, and carHeat methods with appropriate messages or temperatures to test different scenarios.
Ensure that exceptions are properly thrown and caught where applicable.


Test Cases for Car Exceptions
----------------------------------
Car Stopped Exception Test:
Action: Invoke CarTest.stop("stop").
Expected Output: Should throw CarStoppedException with message "Car stopped for some reason."


Car Not Started Test:
Action: Invoke CarTest.stop("go").
Expected Output: Should print "Car not stalled."


Car Puncture Exception Test:
Action: Invoke CarTest.puncture("puncture").
Expected Output: Should throw CarPunctureException with message "Car is punctured."


Car Not Punctured Test:
Action: Invoke CarTest.puncture("move").
Expected Output: Should print "Car not punctured."


Car Overheating Exception Test:
Action: Invoke CarTest.carHeat(60).
Expected Output: Should throw CarHeatException with message "Car is heated more than 50 degrees Celsius."


Car Temperature Normal Test:
Action: Invoke CarTest.carHeat(40).
Expected Output: Should print "Car temperature normal."
*/

package com.java.ExceptionHandling.assign_01_21.q1;

public class CarUser {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("Car Stopped Exception Test: ");
			CarTest.stop("stop");
		}
		catch(CarStoppedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try
		{
			System.out.println("Car Not Started Test: ");
			CarTest.stop("go");
		}
		catch(CarStoppedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try
		{
			System.out.println("Car Stopped Exception Test: ");
			CarTest.puncture("puncture");
		}
		catch(CarPunctureException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();		
		try
		{
			System.out.println("Car Not Started Test: ");
			CarTest.puncture("go");
		}
		catch(CarPunctureException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try
		{
			System.out.println("Car Stopped Exception Test: ");
			CarTest.carHeat(51);
		}
		catch(CarHeatException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		try
		{
			System.out.println("Car Not Started Test: ");
			CarTest.carHeat(25);
		}
		catch(CarHeatException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
