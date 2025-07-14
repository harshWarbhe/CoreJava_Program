package com.harsh.Collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Employee1(Integer employeeId, String employeeName) implements Serializable
{	
}

public class ArrayListSerialization {
	public static void main(String[] args) throws IOException 
	{
		ArrayList<Employee1> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee1(111, "A"));
		listOfEmployees.add(new Employee1(222, "B"));
		listOfEmployees.add(new Employee1(333, "C"));
		listOfEmployees.add(new Employee1(444, "D"));
		listOfEmployees.add(new Employee1(555, "E"));
		
		String filePath = "D:\\NIT problems\\java problem\\java_collection\\src\\text file\\Employee";
		//Serialization
		var fos = new FileOutputStream(filePath);
		var oos = new ObjectOutputStream(fos);
		
		try(fos; oos)
		{
			oos.writeObject(listOfEmployees);
			System.out.println("Object data stored successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//De-Serialization
		
		var fin = new FileInputStream(filePath);
		var ois = new ObjectInputStream(fin);
		
		try(fin; ois)
		{
			
			@SuppressWarnings("unchecked")
			ArrayList<Employee1> empList = (ArrayList<Employee1>) ois.readObject();
			empList.forEach(System.out::println);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}


}
