//Q2.
//Two college departments are hosting a joint cultural event. Each department
//maintains its own guest list. Create a program to merge these two guest lists
//into one unified list using the addAll() method.

package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		List<String> deptAGuest = new ArrayList<String>();
		List<String> deptBGuest = new ArrayList<String>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of guest from department A: ");
			int ACount = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= ACount; i++) {
				System.out.print("Enter name of guest " + i + " from dept A: ");
				deptAGuest.add(sc.nextLine());
			}

			System.out.print("Enter number of guest from department B: ");
			int BCount = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= BCount; i++) {
				System.out.print("Enter name of guest " + i + " from dept b: ");
				deptBGuest.add(sc.nextLine());
			}
		}

		List<String> unifiedGuestList = new ArrayList<String>();

		unifiedGuestList.addAll(deptAGuest);
		unifiedGuestList.addAll(deptBGuest);

		System.out.println("Unified Guest list: ");
		for (String guest : unifiedGuestList) {
			System.out.println("- " + guest);
		}
	}

}
