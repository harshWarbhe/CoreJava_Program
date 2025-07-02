package com.harsh.Collection.list;

import java.util.ArrayList;

public class ArrayListDemo8 {
	public static void main(String[] args) 
    {
        ArrayList<String> original = new ArrayList<>();
        original.add("BCA");
        original.add("MCA");
        original.add("BBA");
        
        System.out.println("By using clone Method");
        @SuppressWarnings("unchecked")
		ArrayList<String> clonedAL = (ArrayList<String>) original.clone();
        System.out.println(clonedAL);
        
      System.out.println("By using Copy Constructor");
      ArrayList<String> copyConstr = new ArrayList<String>(original);
      System.out.println(copyConstr);      
       
    }

}
