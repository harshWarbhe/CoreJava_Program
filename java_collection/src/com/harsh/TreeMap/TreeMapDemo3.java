package com.harsh.TreeMap;

import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args)
	{
		TreeMap<Product,String> tm1 = new TreeMap<>((p1, p2)-> p1.pid().compareTo(p2.pid()));
		tm1.put(new Product(333, "Laptop"), "Hyderabad");
		tm1.put(new Product(444, "Mobile"), "Pune");
		tm1.put(new Product(111, "HeadPhone"), "Indore");
		tm1.put(new Product(222, "Camera"), "Mumbai");

		System.out.println("Sorting based on the Product Id in Ascending Order");
		tm1.forEach((k,v)-> System.out.println(k+" : "+v));
		
		TreeMap<Product,String> tm2 = new TreeMap<>((p1, p2)-> p2.pid().compareTo(p1.pid()));
		tm2.put(new Product(333, "Laptop"), "Hyderabad");
		tm2.put(new Product(444, "Mobile"), "Pune");
		tm2.put(new Product(111, "HeadPhone"), "Indore");
		tm2.put(new Product(222, "Camera"), "Mumbai");

		System.out.println("Sorting based on the Product Id in Descending Order");
		tm2.forEach((k,v)-> System.out.println(k+" : "+v));
	}

}
