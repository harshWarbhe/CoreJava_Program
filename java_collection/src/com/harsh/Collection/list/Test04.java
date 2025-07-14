//Q4.
//A digital library system allows users to search for books. Given a list of books
//currently in the library, write a program that checks if a particular book is
//available using the contains() method.

package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> libraryBooks = new ArrayList<String>();
		libraryBooks.add("Java Programming");
		libraryBooks.add("Data Structures");
		libraryBooks.add("Operating Systems");
		libraryBooks.add("Spring Boot Basics");
		libraryBooks.add("Database Management");

		System.out.print("Enter the book name you want to search: ");
		String bookToSearch = sc.nextLine();

		boolean found = false;

		for (String book : libraryBooks) {
			if (book.equalsIgnoreCase(bookToSearch)) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("✅ '" + bookToSearch + "' is available in the library.");
		} else {
			System.out.println("❌ Sorry, '" + bookToSearch + "' is not available.");
		}

		sc.close();

	}
}
