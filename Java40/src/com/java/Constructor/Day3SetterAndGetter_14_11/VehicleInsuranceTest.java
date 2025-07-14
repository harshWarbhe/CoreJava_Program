package com.java.Constructor.Day3SetterAndGetter_14_11;

import java.util.Scanner;

public class VehicleInsuranceTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Vehicle v1 = new Vehicle();
		
		System.out.print("Enter vehicle type(car,motorcycle,truck): ");
		String type = sc.nextLine();
		v1.setVehicleType(type);
		
		System.out.println("Enter vehicle age(in year): ");
		int age = sc.nextInt();
		v1.setVehicleAge(age);
		
		System.out.println("Enter the vehicle value: ");
		double value = sc.nextDouble();
		
		v1.displayDetails();
		
		InsurancePremium ip = InsurancePremium.CalculatePremium(v1, value);
		
		if(ip.getPremiumAmount()>0)
		{
			System.out.println("premium amount: "+ip.getPremiumAmount());
		}
	sc.close();
	}
	

}
