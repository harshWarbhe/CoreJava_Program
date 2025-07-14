package com.java.oops.Day2_1_11;

class Fan
{
	String name;
	String coil;
	int wings;
	
	public void switchOn(){
		System.out.println(name+" is  on!");
	}
	
	public void switchOff(){
		System.out.println(name+" is  off!");
	}

	public void getFanInformation(){
		System.out.println("\nFan Information");
		System.out.println("Fan name: "+name);
		System.out.println("Fan coil: "+coil);
		System.out.println("Fan wings: "+wings);
	}

}

public class FanTest
{
	public static void main(String[] args) 
	{
		Fan fan = new Fan();
		
		fan.name="bajaj";
		fan.coil="copper";
		fan.wings=5;

		fan.getFanInformation();

		fan.switchOn();
		fan.switchOff();
	}
}
