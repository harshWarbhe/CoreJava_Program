//Q6.
//Two teachers have prepared attendance lists for the same class. Write a Java program
//to compare the two lists and determine if both lists are logically equal using the
//equals() method of the Collection interface.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> teacher1List = new ArrayList<String>();
		List<String> teacher2List = new ArrayList<String>();

		System.out.println("Enter number of student mark by teacher 1 : ");
		int n1 = sc.nextInt();
		sc.nextLine(); 

		System.out.println("Enter names (in order) for Teacher 1's attendance:");
		for (int i = 1; i <= n1; i++) {
			teacher1List.add(sc.nextLine());
		}

		System.out.println("Enter number of student mark by teacher 2 : ");
		int n2 = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter names (in order) for Teacher 2's attendance:");
		for (int i = 1; i <= n2; i++) {
			teacher2List.add(sc.nextLine());
		}

		if (teacher1List.equals(teacher2List)) {
			System.out.println("\n✅ Both attendance lists are logically equal.");
		} else {
			System.out.println("\n❌ Attendance lists are not equal.");
		}
		
		sc.close();

	}

}
