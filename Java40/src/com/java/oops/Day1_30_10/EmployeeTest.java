package com.java.oops.Day1_30_10;

import java.util.Scanner;
class Employee
{
	 int employeeId;
	 String employeeName;
	 double employeeSalary;

	public void setEmployeeData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee ID: ");
		employeeId = sc.nextInt();
		sc.nextLine(); // Consume the newline character left by nextInt()

		System.out.print("Enter employee Name: ");
		employeeName = sc.nextLine();

		System.out.print("Enter employee Salary: ");
		employeeSalary = sc.nextDouble();

		sc.close();
	}
	
	public void getEmployeeData()
	{
		System.out.println("\nEnter employee Data ");
		System.out.println("Enter employee ID: "+employeeId );
		System.out.println("Enter employee Name: "+employeeName);
		System.out.println("Enter employee Salary: "+employeeSalary);
	}

}

public class EmployeeTest
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();

		emp.setEmployeeData();
		emp.getEmployeeData();
	}
}
