package com.java.Test_21_12.Courier_Management_System;

public class DomesticCourier extends Courier {

	public DomesticCourier( double weight) {
		super("domestic", weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateCost() {
		//double weight = Courier.getWeight();
		return weight * 50;
	}



}
