package com.harsh.Collection.list;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo {

	public static void main(String[] args) {

//case1:
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Kolkata");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Mumbai");

		// Anonymous inner class for Consumer<T>
		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String city) {
				System.out.println(city.toUpperCase());
			}
		};

		listOfCity.forEach(cons);

		System.out.println("\n.................................\n");
		
//case 2:
		   Vector<String> listOfCity2 = new Vector<>();	
	       listOfCity2.add("Hyderabad");
	       listOfCity2.add("Kolkata");
	       listOfCity2.add("Pune");
	       listOfCity2.add("Indore");
	       listOfCity2.add("Mumbai");
	       
	       //Lambda Expression
	       Consumer<String> cons2 = city -> System.out.println(city.toUpperCase());
	       
	       listOfCity2.forEach(cons2);
	       
	       System.out.println("\n.................................\n");
	       
//case 3:
	       Vector<String> listOfCity3 = new Vector<>();	
	       listOfCity3.add("Kolkata");
	       listOfCity3.add("Pune");
	       listOfCity3.add("Hyderabad");
	       listOfCity3.add("Indore");
	       listOfCity3.add("Mumbai");	       
	       
	       //By using forEach() Method
	       listOfCity3.forEach(city -> System.out.println(city.toUpperCase()));

	       System.out.println("\n.................................\n");
	       
//case 4:	       
	       
	       Vector<String> listOfCity4 = new Vector<>();	
	       listOfCity4.add("Hyderabad");
	       listOfCity4.add("Kolkata");
	       listOfCity4.add("Pune");
	       listOfCity4.add("Indore");
	       listOfCity4.add("Mumbai");	       
	       
	       //Method Reference
	       listOfCity4.forEach(System.out::println);


	}

}
