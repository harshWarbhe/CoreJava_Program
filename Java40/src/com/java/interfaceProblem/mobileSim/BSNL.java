package com.java.interfaceProblem.mobileSim;

public abstract class BSNL implements SIMCardInterface{
	private boolean isActive;
	private final long phoneNumber;

	public BSNL(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public long gettingPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public void networkProvider() {
		System.out.println("Network provider: BSNL");
	}

	@Override
	public void activation() {
		if(isActive==true)
		System.out.println("BSNL SIM Activated");
	}

	@Override
	public void deActivation() {
		if(isActive==false)
		System.out.println("BSNL SIM Deavtivated");
	}
	
	
	
}
