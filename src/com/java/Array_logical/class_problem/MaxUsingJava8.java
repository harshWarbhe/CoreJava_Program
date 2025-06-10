package com.java.Array_logical.class_problem;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaxUsingJava8 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Element in an Array if present/not using stream API");
		int []arr = null;
		
		
		try (scanner)
		{
			System.out.print("Enter the size of array: ");
			int size = scanner.nextInt();
			
			if(size < 0)
			{
				throw new NegativeArraySizeException("negative size");
			}
			
			arr = new int[size];
			for(int i = 0; i<arr.length; i++)
			{
				System.out.print("Enter "+(i+1)+" value: ");
				arr[i] = scanner.nextInt();
			}
			
			OptionalInt max = Arrays.stream(arr).max();
			max.ifPresent(System.out::println);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
