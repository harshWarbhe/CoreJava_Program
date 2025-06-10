package com.java.Abstraction.assign_12_26;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nutrition calculator");
		System.out.println("--------------------");
		
		System.out.println("1) Egg");
		System.out.println("2) Bread");
		
		System.out.print("choice one option: ");
		int n = sc.nextInt();
		System.out.println();
		
		switch(n)
		{case 1: 
			Egg egg = new Egg(6.3,5.2,0.7);
			System.out.println("Egg is "+egg.getType());
			egg.getMacroNutrients();
			System.out.println("Taste: "+egg.getTastyScore());
			break;
		
		
		case 2:
			Bread bread = new Bread(2,1,13);
			System.out.println("Egg is "+bread.getType());
			bread.getMacroNutrients();
			System.out.println("Taste: "+bread.getTastyScore());
			break;
		
		default :
			System.out.println("invalid input...");
		
		}
		
		sc.close();
	}

}
