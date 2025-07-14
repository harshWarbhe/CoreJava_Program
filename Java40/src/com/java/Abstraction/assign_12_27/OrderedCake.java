package com.java.Abstraction.assign_12_27;

public class OrderedCake extends Cake {
	private static final String getQty = null;
	private String message;

	public OrderedCake() {
		super("round", "vanilla", 1);
		this.message = null;
	}

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
		this.message = null;
	}

	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}

	@Override
	public void showCake() {
		if (message != null && !message.isEmpty()) {
			System.out.println("A " + getShape() + " " + getFlavour() + " Cake Of " + getQty() + " Kg/Kg's Ready with message "+ message+" @ Rs." + getPrice() + "/-");
		}
		else 
			super.showCake();
	}

}
