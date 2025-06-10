package com.java.Array_logical.class_problem;

import java.util.Scanner;

public class MaxOfArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Element in an Array if present/not");

		try (sc) {
			System.out.print("enter the array size: ");
			int size = sc.nextInt();
			int[] arr = new int[size];

			int max = 0;

			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter " + (i+1) + " value: ");
				arr[i] = sc.nextInt();

				if (max < arr[i]) 
				{
					max = arr[i];
				}
			}
			System.out.println("max element: " + max);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
