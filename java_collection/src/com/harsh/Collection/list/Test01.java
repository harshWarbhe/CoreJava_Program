//Q1.
//You're organizing a seminar in your college and students register their
//names one by one. Write a Java program to maintain the list of attendees.
//Use the add() method of the Collection interface to add each student's
//name as they register.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		List<String> attendees = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student registering for the seminar: ");
		int count = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= count; i++) {
			System.out.print("Enter the name of student "+i+" : ");
			String name = sc.nextLine();
			attendees.add(name);
		}
		
		System.err.println("list of registered attendees: ");
		for (String attendee : attendees) {
			System.out.println("- "+attendee);
		}
		
		sc.close();
	}

}
