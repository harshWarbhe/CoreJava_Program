package com.java.Constructor.Day1_11_11;

import java.util.Scanner;
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Employee detail: ");
		System.out.println("Employee First Name: ");
		String firstName = sc.nextLine();

		System.out.println("Employee Last Name: ");
		String lastName = sc.nextLine();

		System.out.println("Employee Employee Id: ");
		int employeeId = sc.nextInt();
		sc.nextLine();

		System.out.println("Employee Salary: ");
		double salary = sc.nextDouble();

		System.out.println("Employee no of Project: ");
		int  noOfProject = sc.nextInt();
		sc.nextLine();


		//Employee emp = new Employee("hasrh","warbhe",18,10000,18);
		Employee emp = new Employee(firstName,lastName,employeeId,salary,noOfProject);

		/* emp.firstName(hasrh);
		emp.lastName(warbhe);
		emp.employeeId(18);
		emp.salary(10000);
		emp.noOfProject(18); */

		emp.calculateSalary();
		emp.display();
		
	}
}

class Employee
{
	private String firstName ;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;

	Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.noOfProject=noOfProject;
	}

	public void calculateSalary()
	{
		if (noOfProject>5 && noOfProject<=10)
		{
			salary += 5000;
		}else if (noOfProject>10 && noOfProject<=20)
		{
			salary += 10000;
		}else if (noOfProject>20)
		{
			salary =+ 15000;
		}
		else
			salary+=0;
	}

	public void display()
	{
		if (noOfProject>0)
		{
			System.out.println("Employee detail: ");
			System.out.println("Employee First Name: "+firstName);
			System.out.println("Employee Last Name: "+lastName);
			System.out.println("Employee Employee Id: "+employeeId);
			System.out.println("Employee Salary: "+salary);
			System.out.println("Employee no of Project: "+noOfProject);
		}
		else 
		{
			System.out.println("No. Of Project can't be less then 0");
		}
		
	}
}
