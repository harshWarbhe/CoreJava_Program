package com.java.Test_01_25.q2;

import java.util.Scanner;

public class PasswordTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your password:");
		String password = scanner.nextLine();

		try {
			PasswordValidator.validatePassword(password);
			//System.out.println("Password is valid.");
		} catch (InvalidPasswordException e) {
			System.out.println("Invalid password: " + e.getMessage());
		}

		scanner.close();
	}

}
