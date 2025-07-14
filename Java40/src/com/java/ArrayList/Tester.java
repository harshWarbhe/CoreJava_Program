package com.java.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ArrayToList
{
   public static List<String> convertToList(String[] inputArray) 
   {
      if(inputArray == null)
      {
         return null;
      }
      else if(inputArray.length == 0 )
      return Arrays.asList();

      return Arrays.asList(inputArray);
   }
}

public class Tester
{
     public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String [] arr = new String[size];

        System.out.println("enter element");
        for(int i = 0 ; i< size ; i++)
        {
            arr[i] = sc.nextLine();
        }

        List<String> resultString = ArrayToList.convertToList(arr);
        System.out.println(resultString);

        sc.close();
     }
}

