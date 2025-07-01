package com.setterAndGetter;

public class InsurancePremium {

	private double premiumAmount;

	public InsurancePremium(double premiumAmount) {
		super();
		this.premiumAmount = premiumAmount;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	
	public static InsurancePremium CalculatePremiumAmount(Vehicle vehicle) //vehicle == v1
	{
		String vtype = vehicle.getVehicleType(); //car
		int age = vehicle.getVehicleAge();       //6
		
		InsurancePremium ip = new InsurancePremium();
		if (vtype.equalsIgnoreCase("car"))
		{
			if (age <5) ip.premiumAmount= 5;
			else if (age >=5 && age <10) ip.premiumAmount=7;
			else ip.premiumAmount=10;
		}
		else if (vtype.equalsIgnoreCase("motercycle"))
		{
			if (age <3) ip.premiumAmount= 3;
			else if (age >3 && age <8) ip.premiumAmount=5;
			else ip.premiumAmount=8;
		}
		else if (vtype.equalsIgnoreCase("truck"))
		{
			if (age <5) ip.premiumAmount= 6;
			else if (age >=5 && age <10) ip.premiumAmount=8;
			else ip.premiumAmount=12;
		}s
		return ip;
	}
	

}
