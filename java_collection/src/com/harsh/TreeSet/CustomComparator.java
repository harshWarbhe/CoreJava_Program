package com.harsh.TreeSet;

import java.util.TreeSet;



public class CustomComparator {
	public static void main(String[] args) 
	{
		TreeSet<Employee> ts1 = new TreeSet<>((e1,e2)-> Integer.compare(e1.id(), e2.id()));
		ts1.add(new Employee(201, "Zaheer", 24));
		ts1.add(new Employee(101, "Aryan", 27));
		ts1.add(new Employee(301, "Pooja", 26));	
		System.out.println("Sorted Based on the ID :");
		ts1.forEach(i -> System.out.println(i));

		
		
		TreeSet<Employee> ts2 = new TreeSet<>((e1, e2)-> e1.name().compareTo(e2.name()));
		ts2.add(new Employee(201, "Zaheer", 24));
		ts2.add(new Employee(101, "Aryan", 27));
		ts2.add(new Employee(301, "Pooja", 26));	
		System.out.println("Sorted Based on the Name :");
		ts2.forEach(i -> System.out.println(i));
	}


}
