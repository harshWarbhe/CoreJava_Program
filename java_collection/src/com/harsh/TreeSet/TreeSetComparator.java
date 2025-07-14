package com.harsh.TreeSet;

import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) {
		TreeSet<Prod> ts2 = new TreeSet<>((p1, p2) -> p1.name().compareTo(p2.name()));
		ts2.add(new Prod(333, "Mobile"));
		ts2.add(new Prod(222, "Camera"));
		ts2.add(new Prod(111, "Laptop"));

		ts2.forEach(System.out::println);

	}

}
