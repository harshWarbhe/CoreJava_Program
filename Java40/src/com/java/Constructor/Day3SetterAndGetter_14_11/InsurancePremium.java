package com.java.Constructor.Day3SetterAndGetter_14_11;


public class InsurancePremium {

	private double premiumAmount;

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	
	public static InsurancePremium CalculatePremium(Vehicle vehicle, double vehicleValue) //vehicle == v1
	{
		InsurancePremium ip = new InsurancePremium();
		String vtype = vehicle.getVehicleType(); //car
		int age = vehicle.getVehicleAge();       //6
		
		
		if (vtype.equalsIgnoreCase("car"))
		{
			if (age <5) ip.premiumAmount= vehicleValue*0.05;
			else if (age >=5 && age <10) ip.premiumAmount=vehicleValue*0.07;
			else ip.premiumAmount=vehicleValue*0.10;
		}
		else if (vtype.equalsIgnoreCase("motercycle"))
		{
			if (age <3) ip.premiumAmount= vehicleValue*0.03;
			else if (age >3 && age <8) ip.premiumAmount=vehicleValue*0.05;
			else ip.premiumAmount=vehicleValue*0.08;
		}
		else if (vtype.equalsIgnoreCase("truck"))
		{
			if (age <5) ip.premiumAmount= vehicleValue*0.06;
			else if (age >=5 && age <10) ip.premiumAmount=vehicleValue*0.08;
			else ip.premiumAmount=vehicleValue*0.12;
		}
		else {
			System.out.println("Invalid vahicle type!");
			ip.premiumAmount=0;
		}
		return ip;
	}
	

}


