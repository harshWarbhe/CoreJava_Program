package com.setterAndGetter;

public class Vehicle {
	private String vehicleType;
	private int vehicleAge;
	
	
	public Vehicle(String vehicleType, int vehicleAge) {
		this.vehicleType = vehicleType;
		this.vehicleAge = vehicleAge;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public int getVehicleAge() {
		return vehicleAge;
	}


	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}


	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleAge=" + vehicleAge + "]";
	}
	
	
	
	

}
