package com.java.Test_02_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ReverseListELC
Create a program in java which will to reverse a list

Enter the size of the list: 5
Enter elements of the list:
4
5
6
7
8
Reversed list: [8, 7, 6, 5, 4]
Sample Input
5
5
4
3
2
1
Sample Output
Reversed list: [1, 2, 3, 4, 5]
*/

public class ReverseListELC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        System.out.println("Enter elements of the list: ");
        for(int i = 0; i < size ; i++)
        {
            Integer n = sc.nextInt();
            list.add(n);
        }

        for(int i = size - 1 ; i >=0 ;i--)
        {
        	
            System.out.print(list.get(i));
        }
		
	}

}
