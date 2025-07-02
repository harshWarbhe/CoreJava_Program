//to work with Custom Object 
package com.harsh.Collection.list;

import java.util.Vector;

record Employee(Integer id, String name, Double salary) {

}

public class VectorDemo4 {
	
	public static void main(String[] args) 
	{
	  Vector<Employee> listOfEmployees = new Vector<>();
	  listOfEmployees.add(new Employee(333, "Scott", 800D));
	  listOfEmployees.add(new Employee(555, "Smith", 1200D));
	  listOfEmployees.add(new Employee(111, "Alen", 1500D));
	  listOfEmployees.add(new Employee(222, "John", 1800D));
	  listOfEmployees.add(new Employee(444, "Martin", 900D));
	  	
	  listOfEmployees.forEach(System.out::println);	
	  
	}

	
}
