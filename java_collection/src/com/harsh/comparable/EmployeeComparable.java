package com.harsh.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparable {
	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		
		listOfEmployees.add(new Employee(333, "Scott"));
		listOfEmployees.add(new Employee(222, "Alen"));
		listOfEmployees.add(new Employee(111, "Smith"));
		listOfEmployees.add(new Employee(444, "Zuber"));

		System.out.println("Original data:");
		listOfEmployees.forEach(System.out::println);

		Collections.sort(listOfEmployees);
		System.out.println("\nAfter Sorting based on the ID:");
		listOfEmployees.forEach(System.out::println);
	}
}
