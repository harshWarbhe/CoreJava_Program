package com.java.interfaceProblem.mobileSim;

public class Airtel implements SIMCardInterface {
	private boolean isActive;
	private final long phoneNumber;

	public Airtel(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public long gettingPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network provider: Airtel");
	}

	@Override
	public void activation() {
		if(isActive==true)
		System.out.println("Airtel SIM Activated");
	}

	@Override
	public void deActivation() {
		if(isActive==false)
		System.out.println("Airtel SIM Deavtivated");
	}

}
