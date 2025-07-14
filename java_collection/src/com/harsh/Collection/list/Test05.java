//Q5.
//A university student selects a list of optional subjects. The system must verify
//that all the subjects selected are actually available in the semester’s subject
//offerings. Use the containsAll() method to perform this validation.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<String> offeredSubjects = Arrays.asList("Java Development", "Data Science", "Artificial Intelligence",
					"Cyber Security", "Cloud Computing", "Machine Learning");

			System.out.println("All offered subject: ");
			for (String string : offeredSubjects) {
				System.out.println(string);
			}

			List<String> selectedSubjects = new ArrayList<String>();

			System.out.print("\nEnter number of subjects selected by the student: ");
			int selectedCount = Integer.parseInt(sc.nextLine());

			System.out.println("Enter the selected subjects:");
			for (int i = 0; i < selectedCount; i++) {
				selectedSubjects.add(sc.nextLine());
			}

			if (offeredSubjects.containsAll(selectedSubjects)) {
				System.out.println("\n✅ All selected subjects are available for this semester.");
			} else {
				System.err.println("\n❌ Some selected subjects are not available.");

				for (String subject : selectedSubjects) {
					if (!offeredSubjects.contains(subject)) {
						System.err.println("❌ Not offered: " + subject);
					}
				}

			}
		} catch (NumberFormatException e) {

			e.printStackTrace();
		}

	}

}
