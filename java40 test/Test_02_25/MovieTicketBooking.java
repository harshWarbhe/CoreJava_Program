package com.java.Test_02_25;

import java.util.Scanner;

public class 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the first list: ");
        int size1 = sc.nextInt();
        
        int[] list1 = new int[size1];

        System.out.println("Enter elements");
        for(int i = 0 ; i < size1 ; i++)
        {
            list1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second list: ");
        int size2 = sc.nextInt();

        int[] list2 = new int[size2];
        System.out.println("Enter elements");
        for(int i = 0 ; i < size2 ; i++)
        {
            list2[i] = sc.nextInt();
        }

        int size3 = list1.length() + list2.length();

        int[] list3 = new int[size3];

        for(int i = 0 ; i< list1.length() ; i++)
        {
            list3[i] = list1[i];
        }

        for(int i = 0 ; i < list2.length(); i++)
        {
            for(int j = 0 ; i < size3; i++)
            {
                if(list2[i] != list3[j])
                

            }
        }

    }
}