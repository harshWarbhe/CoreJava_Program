package com.java.Abstraction.assign_12_26;

public class Bread extends Food {

	private int tastyScore = 8;
	private String type = "vegetarian";

	public Bread(double proteins, double fats, double carbs) {
		super(proteins, fats, carbs);	
	}

	public int getTastyScore() {
		return tastyScore;
	}

	public String getType() {
		return type;
	}

	@Override
	public void getMacroNutrients() {
		System.out.println("An slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and " + this.carbs + " gms of carbohydrates.");

	}

}
