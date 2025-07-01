package com.java.Test_21_12.Courier_Management_System;

import java.util.Scanner;

public class Courier {

	protected String courierType;
	protected double weight;

	public Courier(String courierType, double weight) {
		super();
		this.courierType = courierType;
		this.weight = weight;
	}

	public double calculateCost() {
		return 0.0;
	}

	public void displayCourierDetails() {
		System.out.println("Type of courier: " + courierType);
		System.out.println("weight: " + weight + "kg");
	}

//	public String getCourierType() {
//		return courierType;
//	}
//
//	public void setCourierType(String courierType) {
//		this.courierType = courierType;
//	}
//
//	public double getWeight() {
//		return weight;
//	}
//
//	public void setWeight(double weight) {
//		this.weight = weight;
//	}
//	
//	public static Courier CourierDetails()
//	{	Scanner sc = new Scanner(System.in);
//	
//		System.out.println("courier type: ");
//		String courierType = sc.next();
//		System.out.println("weight: ");
//		double weight = sc.nextDouble();
//	
//	
//		return new Courier(courierType, weight);
//	}

}
