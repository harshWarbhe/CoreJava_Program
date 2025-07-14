//Q3.
//A customer adds several items to their shopping cart in an e-commerce application.
//Once the order is submitted, the cart should be emptied to allow for the next order.
//Write a program to clear all items from the cart using the clear() method.
package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> cart = new ArrayList<String>();
		String item;
		
		System.out.println("🛒 Welcome to the Shopping Cart!");
        System.out.println("Enter items to add to your cart. Type 'done' to submit your order.\n");

        while (true) {
			System.out.print("Enter item: ");
			item = sc.nextLine();
			
			if (item.equalsIgnoreCase("done")) {
				break;
			}
			cart.add(item);
		}
        
        System.out.println("\n✅ Items in your cart:");
        for (String itm : cart) {
			System.out.println("- "+itm);
		}
        
        System.out.println("📦 Order submitted successfully!");

        cart.clear();
        
        System.out.println("\n🛒 Item in card after order submission.");
        if (cart.isEmpty()) {
			System.out.println("cart is now empty. Ready for next order.");
		}
        
        sc.close();
        
	}

}
