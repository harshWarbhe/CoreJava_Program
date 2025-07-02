//Q12.
//A user is viewing their shopping cart and the total number of items must be
//displayed. Write a program that prints the number of items in the cart using
//the size() method.

package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class test08 {

	public static void main(String[] args) {
		List<String> cart = new ArrayList<>();

		cart.add("Laptop");
		cart.add("Mouse");
		cart.add("Keyboard");
		cart.add("USB Cable");

		System.out.println("🛒 Items in your cart: " + cart);

		System.out.println("🔢 Total number of items: " + cart.size());

	}

}
