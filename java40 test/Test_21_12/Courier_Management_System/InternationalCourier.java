package com.java.Test_21_12.Courier_Management_System;

public class InternationalCourier extends Courier {

	public InternationalCourier(double weight) {
		super("International", weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCost() {
		//double weight = Courier.getWeight();
		return weight * 150;
	}

}
