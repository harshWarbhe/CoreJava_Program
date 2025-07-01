package com.java.Constructor.Day3SetterAndGetter_14_11;

public class Vehicle 
{
	private String vehicleType;
	private int vehicleAge;
	
	
//	public Vehicle(String vehicleType, int vehicleAge) {
//		this.vehicleType = vehicleType;
//		this.vehicleAge = vehicleAge;
//	}


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


	public void displayDetails() 
	{
        System.out.println("Vehicle Details:");
        System.out.println("Type: " + vehicleType);
        System.out.println("Age: " + vehicleAge + " years");
    }
	
	
	
	

}
