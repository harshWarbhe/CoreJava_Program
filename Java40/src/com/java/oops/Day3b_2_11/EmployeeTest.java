package com.java.oops.Day3b_2_11;

import java.util.Scanner;

class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;

	public void setEmployeeData(int employeeId, String employeeName, double employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public void getEmployeeData(){
		
		System.out.println("Employee detail");
		System.out.println("Employee Id: "+employeeId );
		System.out.println("Employee Name: "+employeeName );
		System.out.println("Employee Salary: "+employeeSalary );
	}
}
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter employee Id: ");
		int employeeId = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter employee Name: ");
		String employeeName = sc.nextLine();

		System.out.print("Enter employee Salary: ");
		double employeeSalary = sc.nextDouble();

		sc.close();
			
		emp.setEmployeeData(employeeId,employeeName,employeeSalary);
		emp.getEmployeeData();

	}
}
