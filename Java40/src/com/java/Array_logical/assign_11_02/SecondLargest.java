package com.java.Array_logical.assign_11_02;

//Q3) Find the second largest element in the array.

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Find the second largest element in the array.");
		
		System.out.print("enter the size of array: ");
		int size =  sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.print("enter "+size+" elements: ");
		for(int i = 0; i< size; i++)
		{
		  arr[i] = sc.nextInt();
		}
		
		int index = 0;
		for(int i = 0; i<arr.length; i++ )
		{
			for(int j = 1; j < arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Second largest element: " + secondLargest);

        sc.close();
		
	}
}
