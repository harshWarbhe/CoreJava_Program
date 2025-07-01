package com.java.Constructor.Day2_13_11;

import java.util.Scanner;

class Employee
{
	private String name;
	private int age;
	private String department;
	private double salary;
	private String performance;

	Employee(String name, int age, String department,double salary,String performance)
	{
		this.name=name;
		this.age=age;
		this.department=department;
		this.salary = salary;
		this.performance =performance;
	}


	public void setEmployeDetail()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee name: ");
		this.name = sc.nextLine();

		System.out.print("Enter age: ");
		this.age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter department: ");
		this.department = sc.nextLine();

		System.out.print("Enter salary: ");
		this.salary = sc.nextDouble();
		sc.nextLine();

		System.out.print("Enter Performance \"good\" , \"average\" or \"null\":  ");
		this.performance = sc.nextLine();

		sc.close();
	}

	public void getDisplay()
	{
		System.out.println("name: "+this.name);
		System.out.println("age: "+this.age);
		System.out.println("department: "+this.department);
		System.out.println("salary: "+updateSalary());
		System.out.println("performance: "+this.performance);

	}

	public double updateSalary()
	{
		if(this.performance.equals("null"))
		{
			return salary+=0;
		}
		else if(this.performance.equals("good"))
		{
			return salary +=10000;
		}
		else if(this.performance.equals("average"))
		{
			return salary +=5000;
		}
		else 
			return salary;
	}
}


public class EmployeeTester
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("name",0,"IT",30000,"null");
		System.out.println("Employee Detail")	;

		//e1.getDisplay();
		e1.setEmployeDetail();
		//e1.updateSalary();
		e1.getDisplay();

	}
}

