package com.harsh.Map;

import java.util.HashMap;

public class HashMapDemo2 {
	public static void main(String[] args) 
    {
       HashMap<Integer, String> studentRecords = new HashMap<>();

        studentRecords.put(101, "Scott");
        studentRecords.put(102, "Smith");
        studentRecords.put(103, "Martin");
        studentRecords.put(104, "Aryan");

        System.out.println("\nStudent Records: " + studentRecords);

       
        
        int searchId = 103;
        String studentName = studentRecords.get(searchId);
        
        if (studentName != null)
        {
            System.out.println("\nStudent with ID " + searchId + " is " + studentName);
        } 
        else
        {
            System.out.println("\nStudent with ID " + searchId + " not found.");
        }
       
      
      
        System.out.println("\n"+studentRecords.put(103, "Rahul"));
        System.out.println("\nUpdated Records: " + studentRecords);
        
       
        
        studentRecords.remove(104);
        System.out.println("\nRecords after removal: " + studentRecords);

        
        int idToCheck = 101;
        System.out.println("Does ID " + idToCheck + " exist? " + studentRecords.containsKey(idToCheck));

            
        String nameToCheck = "Aryan";
        System.out.println("\nDoes name '" + nameToCheck + "' exist? " + studentRecords.containsValue(nameToCheck));

       
       
        System.out.println("\nIterating through records:");
        for(HashMap.Entry<Integer, String> entry : studentRecords.entrySet()) 
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        studentRecords.clear();
        System.out.println("\nAll records cleared: " + studentRecords); //{}
     
     
     
    }

}
