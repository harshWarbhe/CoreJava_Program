

/*
Employee Data, num of projects and increment salary based on number of projects
-------------------------------------------------------------------------------------------------------

Create a BLC class Employee :

Instance Variables :
private String firstName
private String lastName
private int employeeId
private double salary
private int noOfProject


Create seter method  to intialize the value for all instance variable.

Implement  calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.


NoOfProject is more than 5 and less that 10 then add 5000.

NoOfProject is more than 10 and less that 20 then add 10000.

NoOfProject is more than 20 then add 15000. 	


Take one more method to display the details of employe with the salary.

Method Name :displayEmployeeDetails()
Return Type: void

here we print the Employee class members to display employee details.


 Take an ELC class Tester to test your logic.

in this class take a main method and instantiate the Employee

Use the setter method to intialize the data members , and call the calculatesalary method to update the salary based on project.

call the displayEmployeeDetails() method and print all the details .
*/

package com.java.oops.Day6_7_11;
import java.util.Scanner;

class Employee
{
	//instance variable
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;

	public void setEmployeeDetail(String firstName, String lastName, int employeeId, double salary, int noOfProject)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.salary=salary;
		this.noOfProject=noOfProject;
	}

	public void calculateSalary()
	{
		if(noOfProject >5 && noOfProject <= 10)
		{
			salary += 5000;
		}
		else if(noOfProject >10 && noOfProject <= 20)
		{
			salary += 10000;
		}
		else if(noOfProject >20 )
			{
			salary += 15000;
		}
	}

	public void displayEmployeeDetails()
	{
		System.out.println("Employees detail ");
		System.out.println("First Name : "+ firstName);
		System.out.println("Last Name : "+ lastName);
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Salary : "+ salary);
		System.out.println("NO of project : "+ noOfProject);

	}


}

public class EmployeeSalary
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		System.out.println("Enter Employees detail ");
		System.out.println("First Name : ");
		String firstName= sc.nextLine();

		System.out.println("Last Name : ");
		String lastName= sc.nextLine();

		System.out.println("Employee Id : ");
		int employeeId =sc.nextInt();

		System.out.println("Salary : ");
		double salary = sc.nextDouble();

		System.out.println("NO of project : ");
		int noOfProject = sc.nextInt();

		emp.setEmployeeDetail(firstName, lastName, employeeId, salary, noOfProject);
		emp.calculateSalary();
		emp.displayEmployeeDetails();

		sc.close();
	}
}
