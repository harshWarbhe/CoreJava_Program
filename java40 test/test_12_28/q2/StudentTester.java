package com.java.test_12_28.q2;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("For a ScienceStudent:");
		System.out.println();
//		System.out.print("name: ");
//		String studentName = sc.next();
//
//		System.out.print("class: ");
//		String studentClass = sc.next();
//		System.out.println("marks: ");
		
		ScienceStudent s1 = new ScienceStudent("harsh","11th",85,40,95);
		System.out.println("percentage: "+s1.getPercentage());
		s1.isPromoted();
		
		System.out.println("For a ArtsStudent:");
		System.out.println();
//		System.out.print("name: ");
//		String studentName1 = sc.next();
//
//		System.out.print("class: ");
//		String studentClass1 = sc.next();
//		System.out.println("marks: ");
	 
		ArtsStudent a1 = new ArtsStudent("harsh","12th",75,35,60,35);
		System.out.println("percentage: "+a1.getPercentage());
		a1.isPromoted();
		
	}

}
