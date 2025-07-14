package com.java.Array_logical.assign_11_02.q2InsertInMiddle;

import java.util.Arrays;

class InsertAtMiddle {
	public static int[] insertMiddle(int[] arr, int element) {
		int[] newArray = new int[arr.length + 1];

		int middle = arr.length / 2;

		for (int i = 0; i < middle; i++) {
			newArray[i] = arr[i];
		}

		newArray[middle] = element;

		for (int i = middle; i < arr.length; i++) {
			newArray[i + 1] = arr[i];
		}

		return newArray;
	}

}

public class InsertInMiddle {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6 };

		System.out.println("original array : " + Arrays.toString(arr));
		int[] InsertMiddle = InsertAtMiddle.insertMiddle(arr, 4);

		
		System.out.println("after inseertion in middle"+Arrays.toString(InsertMiddle));
	}
}
