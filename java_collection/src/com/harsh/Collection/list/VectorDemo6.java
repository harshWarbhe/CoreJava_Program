package com.harsh.Collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorDemo6 {
	public static void main(String[] args) {
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("Vanaras");

		Collections.sort(listOfCity);

		listOfCity.forEach(System.out::println);

		System.out.println(".............");

		Vector<Integer> listOfNumbers = new Vector<>();
		listOfNumbers.add(500);
		listOfNumbers.add(900);
		listOfNumbers.add(400);
		listOfNumbers.add(300);
		listOfNumbers.add(800);
		listOfNumbers.add(200);
		listOfNumbers.add(100);

		System.out.println("\nOriginal Data...");
		System.out.println(listOfNumbers);

		System.out.println("\nAscending Order...");
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
		
		System.out.println("\nDescending Order...");

		//Collections.sort(listOfNumbers, Collections.reverseOrder());
		Collections.reverse(listOfNumbers);  
		System.out.println(listOfNumbers);

		// Converting Our Vector(Collection Object) into Array
		Vector<String> listOfFruits = new Vector<>();
		listOfFruits.add("Orange");
		listOfFruits.add("Apple");
		listOfFruits.add("Mango");

		System.out.println("\nConverting Our Vector(Collection Object) into Array");
		Object[] fruits = listOfFruits.toArray();
		System.out.println(Arrays.toString(fruits));
	}
}
