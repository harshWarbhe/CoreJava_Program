package com.harsh.Collection.list;

import java.util.ArrayList;
import java.util.List;

public class Test07 {

	public static void main(String[] args) {
		
		List<String> itemList = new ArrayList<String>();
		
		itemList.add("laptop");
		itemList.add("mobile");
		
		int initialHash = itemList.hashCode();
		System.out.println("initial list:: "+itemList);
		System.err.println("intial hashcode:: "+initialHash);
		
		System.out.println("HashCode of Item1: " + itemList.get(0).hashCode());
		System.out.println("HashCode of Item2: " + itemList.get(1).hashCode());
		
		itemList.add("TV");
		
		int updatedHash = itemList.hashCode();
		System.out.println("initial list:: "+itemList);
		System.err.println("intial hashcode:: "+updatedHash);
		
		if (initialHash != updatedHash) {
			System.out.println("✅ Hash code changed after adding a new item.");
        } else {
            System.out.println("⚠️ Hash code did not change (this is rare with changed contents).");
        }

	}

}
