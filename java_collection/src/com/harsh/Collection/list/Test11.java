//Q15. 
//Create a complete system for managing a to-do list:
//- Add tasks
//- Check if tasks exist
//- Remove completed tasks
//- Display tasks using iterator
//- Clear all tasks at the end of the day
//- Use at least 8 Collection methods in this.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        List<String> toDoList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Check if Task Exists");
            System.out.println("3. Remove Completed Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Show Task Count");
            System.out.println("6. Clear All Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: // add()
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    toDoList.add(task);
                    System.out.println("✅ Task added.");
                    break;

                case 2: // contains()
                    System.out.print("Enter task to check: ");
                    String checkTask = sc.nextLine();
                    if (toDoList.contains(checkTask)) {
                        System.out.println("🔎 Task exists in your list.");
                    } else {
                        System.out.println("❌ Task not found.");
                    }
                    break;

                case 3: // remove()
                    System.out.print("Enter completed task to remove: ");
                    String doneTask = sc.nextLine();
                    if (toDoList.remove(doneTask)) {
                        System.out.println("🗑️ Task removed.");
                    } else {
                        System.out.println("❗ Task not found.");
                    }
                    break;

                case 4: // iterator()
                    if (toDoList.isEmpty()) {
                        System.out.println("📭 No tasks available.");
                    } else {
                        System.out.println("📋 Current To-Do List:");
                        Iterator<String> it = toDoList.iterator();
                        while (it.hasNext()) {
                            System.out.println("• " + it.next());
                        }
                    }
                    break;

                case 5: // size(), toArray()
                    System.out.println("📊 Total Tasks: " + toDoList.size());
                    System.out.println("🧾 Task Summary:");
                    String[] tasks = toDoList.toArray(new String[0]);
                    for (String t : tasks) {
                        System.out.println("• " + t);
                    }
                    break;

                case 6: // clear()
                    toDoList.clear();
                    System.out.println("🧹 All tasks cleared.");
                    break;

                case 0:
                    System.out.println("👋 Exiting To-Do List App. Goodbye!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }

        } while (choice != 0);

        sc.close();
	}
}
