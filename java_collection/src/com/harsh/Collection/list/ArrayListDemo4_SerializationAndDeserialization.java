//Serialization and De-serialization on ArrayList Object
package com.harsh.Collection.list;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4_SerializationAndDeserialization {
	public static void main(String[] args) throws IOException 
	  {
		ArrayList<String> listOfIceCream = new ArrayList<>();
		listOfIceCream.add("Vanila");
		listOfIceCream.add("Strwbarry");
		listOfIceCream.add("Butter Scotch");
		
		//Serialization
		var fos = new FileOutputStream("D:\\NIT problems\\java problem\\java_collection\\src\\text file\\getFile");
		var oos = new ObjectOutputStream(fos);
		
		try(oos; fos)
		{
			oos.writeObject(listOfIceCream);
			System.out.println("Object Stored Successfully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//De-Serialization 
		var fin = new FileInputStream("D:\\NIT problems\\java problem\\java_collection\\src\\text file\\getFile");
		var ois = new ObjectInputStream(fin);
		
		try(ois; fin)
		{
	       ArrayList<String> list =	(ArrayList<String>)	ois.readObject();
	       System.out.println("List Data :"+list);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	  }       

}
