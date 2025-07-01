package com.java.Constructor.Day2_12_11;

import java.util.Scanner;
public class CarRentalCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		CarRental cr = new CarRental("curve",1,1000);

		cr.getDisplay();

		System.out.print("How many days you want to rental the car:");
		int rentalDays = sc.nextInt();

		cr.setRentalDays(rentalDays);
		cr.getDisplay();
	}
}

class CarRental
{
	private String carModel;
	private int rentalDays;
	private double dailyRate;

	CarRental(String carModel, int rentalDays, double dailyRate)
	{
		this.carModel=carModel;
		this.rentalDays=rentalDays;
		this.dailyRate= dailyRate;
	}

	public double calculateTotalCost()
	{
		if (rentalDays>0)
		{
			if (rentalDays>7)
			{
				return ((rentalDays*dailyRate)-((rentalDays*dailyRate)*0.1));
			}
			else 
				return (rentalDays*dailyRate);
		}
		else
		   {
			System.out.println("Rental Days less than 0");
			return 0;
		   }
	}

	public void setCarModel(String carModel)
	{
		this.carModel=carModel;
	}

	public void setRentalDays(int rentalDays)
	{
		this.rentalDays=rentalDays;
	}

	public void setDailyRate(int dailyRate)
	{
		this.dailyRate=dailyRate;
	}

	public void getDisplay()
	{
		System.out.println("car rental calculator: ");
		System.out.println("---------------------------");
		System.out.println("car model: "+this.carModel);
		System.out.println("Rental Days: "+this.rentalDays);
		System.out.println("Daily Rate: "+this.dailyRate);
		System.out.println("Total cost: "+calculateTotalCost());
	}
}

