package com.java.interfaceProblem.mobileSim;

public interface MobilePhone {
	
	void insertinge(SIMCardInterface sim); //Loosely coupled Runtime Polymorphism
	void removeSim(SIMCardInterface sim);
	void makingCall(SIMCardInterface sim);
	void sendText(SIMCardInterface sim);

}
