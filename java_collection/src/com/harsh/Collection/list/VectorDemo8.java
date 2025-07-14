package com.harsh.Collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(int productId, String productName) {
}

public class VectorDemo8 {
	public static void main(String[] args) {
		Vector<Product> listOfProduct = new Vector<>();
		listOfProduct.add(new Product(111, "Laptop"));
		listOfProduct.add(new Product(222, "Mobile"));
		listOfProduct.add(new Product(333, "Camera"));
		listOfProduct.add(new Product(444, "Bag"));
		listOfProduct.add(new Product(555, "Watch"));

		Enumeration<Product> ele = listOfProduct.elements();

		Iterator<Product> asIterator = ele.asIterator();
		asIterator.forEachRemaining(System.out::println);

	}

}
