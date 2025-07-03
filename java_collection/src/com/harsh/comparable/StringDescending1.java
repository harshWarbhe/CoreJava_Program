package com.harsh.comparable;

import java.util.ArrayList;

public class StringDescending1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Hyderabad");
		al.add("Indore");
		al.add("Ahmadabad");
		al.add("Bombay");

		// List interface sort(Comparator<T> cmp) :
		al.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println(al);

	}

}
