package com.harsh.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) 
	{
		TreeSet<Object> ts1 = new TreeSet<>();
		ts1.add(45); 
		ts1.add(23);
		ts1.add(9);
		ts1.add(99);
		//ts1.add("NIT");  //Invalid
		//ts1.add(null);   //Invalid		
		System.out.println(ts1);		
	}

}
