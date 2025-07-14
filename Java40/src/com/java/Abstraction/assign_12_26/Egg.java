package com.java.Abstraction.assign_12_26;

public class Egg extends Food {

	private int tastyScore = 7;
	private String type = "non-vegetarian";

	public Egg(double proteins, double fats, double carbs) {
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
		System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fats and "
				+ this.carbs + " gms of carbohydrates.");

	}

}
