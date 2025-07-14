package com.harsh.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StringDescending {
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Hyderabad");
		al.add("Indore");
		al.add("Ahmadabad");
		al.add("Bombay");
		
		//How to sort String data in descending order :
		Collections.sort(al, (p1,p2) -> p2.compareTo(p1));
		System.out.println(al);
	}

}
