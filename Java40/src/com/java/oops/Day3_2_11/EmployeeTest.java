package com.java.oops.Day3_2_11;

import java.util.Scanner;
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
			
		emp.setEmployeeData();
		emp.getEmployeeData();

	}
}

class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;

	public void setEmployeeData(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee Id: ");
		employeeId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter employee Name: ");
		employeeName = sc.nextLine();

		System.out.print("Enter employee Salary: ");
		employeeSalary = sc.nextDouble();

		sc.close();
	}

	public void getEmployeeData(){
		
		System.out.println("Employee detail");
		System.out.println("Employee Id: "+employeeId );
		System.out.println("Employee Name: "+employeeName );
		System.out.println("Employee Salary: "+employeeSalary );
	}
}
