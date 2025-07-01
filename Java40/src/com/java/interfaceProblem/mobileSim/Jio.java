package com.java.interfaceProblem.mobileSim;

public class Jio implements SIMCardInterface {
	private boolean isActive;
	private final long phoneNumber ;

	public Jio(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public long gettingPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network provider: Jio");
	}

	@Override
	public void activation() {
		if(isActive==true)
		System.out.println("Jio SIM Activated");
	}

	@Override
	public void deActivation() {
		if(isActive==false)
		System.out.println("Jio SIM Deavtivated");
	}
}
