package com.java.Abstraction.assign_12_27;

public class CakeMain {

	public static void main(String[] args) {

		OrderedCake defaultCake = new OrderedCake();
		defaultCake.showCake();
		
		OrderedCake customerCake = new OrderedCake("round", "butterscotch", 2);
		customerCake.showCake();
		
		OrderedCake customerCakeWitMessage = new OrderedCake("heart", "Red Velvet", 3, "Happy Birthday day" );
		customerCakeWitMessage.showCake();
		
		
	}

}
