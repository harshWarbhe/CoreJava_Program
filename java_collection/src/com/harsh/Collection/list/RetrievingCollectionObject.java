package com.harsh.Collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class RetrievingCollectionObject {
	public static void main(String[] args)
	{                   
       Vector<String> listOfCity = new Vector<>();	
       listOfCity.add("Hyderabad");
       listOfCity.add("Kolkata");
       listOfCity.add("Pune");
       listOfCity.add("Indore");
       listOfCity.add("Mumbai");
       
       System.out.println("1) By using toString() method :");
       System.out.println(listOfCity.toString());
		
       System.out.println(".................................");
       System.out.println("2) By using Ordinary for loop :");
       for(int i=0; i<listOfCity.size(); i++)
       {
    	   System.out.println(listOfCity.get(i));
       }
       
       System.out.println(".................................");
       System.out.println("3) By using for Each loop :");
       
       for(String city : listOfCity)
       {
    	   System.out.println(city);
       }
       
       System.out.println(".................................");
       System.out.println("4) By using Enumeration interface :");
       
       Enumeration<String> ele = listOfCity.elements();
       while(ele.hasMoreElements())
       {
    	   System.out.println(ele.nextElement());
       }
       
       System.out.println(".................................");
       System.out.println("5) By using Iteartor interface :");
       
       Iterator<String> itr = listOfCity.iterator();
       itr.forEachRemaining(city -> System.out.println(city));
       
       System.out.println(".................................");
       System.out.println("6) By using ListIteartor interface :");
       
       ListIterator<String> lstItr = listOfCity.listIterator();
           
       System.out.println("IN FORWARD DIRECTION ..");
       while(lstItr.hasNext())
       {
    	   System.out.println(lstItr.next());
       }
      
       System.out.println("IN BACKWARD DIRECTION ..");
       while(lstItr.hasPrevious())
       {
    	   System.out.println(lstItr.previous());
       }
       
       System.out.println(".................................");
       System.out.println("7) By using SplIterator interface :");
       
      Spliterator<String> splItr = listOfCity.spliterator();
      splItr.forEachRemaining(city -> System.out.println(city)); 
       
      System.out.println(".................................");
      System.out.println("8) By using forEach() Method :");
      listOfCity.forEach(city -> System.out.println(city));
       
      System.out.println(".................................");
      System.out.println("9) By using Method Reference :");
      listOfCity.forEach(System.out::println);
      
      
	}

}
