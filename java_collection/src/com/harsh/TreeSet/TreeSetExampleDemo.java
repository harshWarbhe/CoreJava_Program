package com.harsh.TreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExampleDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("B.Tech");
		list.add("M.Tech");
		list.add("BCA");
		list.add("MCA");
		list.add("BA");
		list.add("MA");

		// ArrayList to TreeSet
		TreeSet<String> ts1 = new TreeSet<>(list);
		System.out.println(ts1);

		System.out.println("........................");

		TreeSet<Integer> ts2 = new TreeSet<>();
		ts2.add(34);
		ts2.add(45);
		ts2.add(98);
		ts2.add(12);

		// TreeSet to ArrayList
		ArrayList<Integer> listOfNum = new ArrayList<>(ts2);
		System.out.println(listOfNum);

		// TreeSet to TreeSet(SortedSet)
		TreeSet<Integer> ts3 = new TreeSet<>(ts2);
		System.out.println(ts3);

	}

}
