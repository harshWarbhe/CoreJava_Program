package com.java.test_12_28.q1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		CentralGovernment.message();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of your state: ");
		String  stateName = sc.next();
		
		CentralGovernment state = StateFactory.getStateInstance(stateName);
		state.educationLoanScheme();
		
		sc.close();
		
	}

}
