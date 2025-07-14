//ArrayList is better than Vector in performance wise 
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo5 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Total Time taken by ArrayList class :" + (endTime - startTime) + " ms");

		startTime = System.currentTimeMillis();

		Vector<Integer> v1 = new Vector<Integer>();

		for (int i = 0; i < 1000000; i++) {
			v1.add(i);
		}

		endTime = System.currentTimeMillis();

		System.out.println("Total Time taken by Vector class :" + (endTime - startTime) + " ms");

	}

}
