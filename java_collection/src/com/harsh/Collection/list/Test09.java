//Q13.
//A travel website stores a list of popular tourist cities. The list needs to be
//converted to an array for display in a carousel. Write a program to convert
//this list to an array using the toArray() method.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class Test09 {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("New York");
        cities.add("London");
        cities.add("Dubai");

        // Step 2: Convert the list to an array using toArray()
        String[] cityArray = cities.toArray(new String[0]);


        System.out.println("🌍 Tourist City Carousel Display:");
        for (String city : cityArray) {
            System.out.println("📍 " + city);
        }	}
}
