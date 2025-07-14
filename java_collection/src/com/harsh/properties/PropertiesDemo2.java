package com.harsh.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//Methods :
//----------
//1) public void load(InputStream stream): Reads a property list (key    and value pair) from the input byte stream.
//
//2) public void load(Reader reader):Reads a property list (key and       value pair) from the Character Oriented stream.
//
//3) Object setProperty(String key, String value) : It Calls the Hashtable method put internally. 
//
//4) public String getProperty(String key) :Searches for the property     with the specified key in this property list.
//
//5) public void	store(OutputStream out, String comments) : It
//   Writes this property list (key and element pairs) in this Properties table to the output stream.
//
//6) public void	store(Writer writer, String comments) : It
//   Writes this property list (key and element pairs) in this Properties table to the character stream.


public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException 
	{     
		
		Properties properties = new Properties();
		
		
		String filePath = "D:\\new\\data.properties";
		
		var writer = new FileWriter(filePath);
		try(writer)
		{
			properties.setProperty("book", "Java");
			properties.setProperty("author", "James");
			properties.setProperty("price", "1200");
			
			properties.store(writer, "Book Properties set");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//Reading the data from Properties file 
		
		var reader = new FileReader(filePath);
		
		try(reader)
		{
			properties.load(reader);
			System.out.println("Book Name is "+properties.getProperty("book"));
			System.out.println("Author Name is "+properties.getProperty("author"));
			System.out.println("Price Name is "+properties.getProperty("price"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
