package com.harsh.Hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	 public static void main(String args[])
		{  
		  Hashtable<Integer,String> map=new Hashtable<>(); 
		  map.put(1, "Java");
		  map.put(2, "is");
		  map.put(3, "best");		
		  map.put(4,"language");
		  
		  //map.put(5,null);  

		  System.out.println(map);

		  System.out.println(".......................");

		    for(Map.Entry m : map.entrySet())
			 {  
				 System.out.println(m.getKey()+" = "+m.getValue());  
			} 
     }  

}
