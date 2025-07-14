//Q14.
//An application collects ratings from users as Integer values. These values
//need to be processed in an array format for analytics. Write a program that
//converts the ratings from a Collection to an Integer[] using toArray(new Integer[0]).

package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ratings = new ArrayList<>();

		System.out.print("Enter number of user ratings: ");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " rating values (1-5):");
		for (int i = 0; i < n; i++) {
			int rating = sc.nextInt();
			ratings.add(rating);
		}

		// Convert List to Integer[] using toArray
		Integer[] ratingArray = ratings.toArray(new Integer[0]);

		System.out.println("\n📊 Ratings in array format:");
		for (Integer rate : ratingArray) {
			System.out.println("⭐ Rating: " + rate);
		}

		sc.close();
	}
}
