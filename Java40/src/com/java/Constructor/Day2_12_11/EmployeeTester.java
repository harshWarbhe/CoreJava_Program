package com.java.Constructor.Day2_12_11;

import java.util.Scanner;
public class EmployeeTester 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee("harsh","IT",30000,0);

		emp.getDisplay();

		System.out.print("\nEnter your performance score: ");
		int performanceScore = sc.nextInt();

		emp.setPerformanceScore(performanceScore);
		emp.getDisplay();
	}
}

class Employee
{
	private String employeeName;
	private String department;
	private double baseSalary;
	private int performanceScore;

	Employee(String employeeName,String department, double baseSalary, int performanceScore)
	{
		this.employeeName=employeeName;
		this.department=department;
		this.baseSalary=baseSalary;
		this.performanceScore= performanceScore;
	}

	public double calculateBonus()
	{
		if (performanceScore<11&& performanceScore>=0)
		{
			if (performanceScore<=10 && performanceScore>=8)
			{
				return ((baseSalary)+ (baseSalary*0.2 ));
			}
			else if (performanceScore<8 &&performanceScore>=5)
			{
				return ((baseSalary)+ (baseSalary*0.1 ));
			}
			else
					return baseSalary;
				
		}
		else
			{
			System.out.println("you have enter Invald performance score");
			return 0;
			}
	}

	public void setPerformanceScore(int performanceScore)
	{
		this.performanceScore=performanceScore;
	}

	public void getDisplay()
	{
		System.out.println("Employee detail: \n");	
		System.out.println("Employee name: "+this.employeeName);	
		System.out.println("Employee department: "+this.department);	
		System.out.println("Employee base Salary: "+calculateBonus());	
		System.out.println("Employee performance score:"+this.performanceScore);	
		
	}
	
	
}

