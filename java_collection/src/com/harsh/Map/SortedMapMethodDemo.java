package com.harsh.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethodDemo {
	public static void main(String args[]) {
		SortedMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Amit");
		map.put(101, "Ravi");

		map.put(102, "Vijay");
		map.put(103, "Rahul");

//		  1) firstKey()  //first key
//
//		  2) lastKey()  //last key
//
//		  3) headMap(int keyRange) //less than the specified range
//
//		  4) tailMap(int keyRange)  //equal or greater than the specified range
//
//		  5) subMap(int startKeyRange, int endKeyRange) //the range of key where startKey will be inclusive and endKey will be exclusive.
//
//		  return type of headMap(), tailMap() and subMap() return type would be SortedMap(I)

		System.out.println("First Key: " + map.firstKey()); // 100
		System.out.println("Last Key " + map.lastKey()); // 103

		System.out.println("headMap: " + map.headMap(102)); // 100 101
		System.out.println("tailMap: " + map.tailMap(102)); // 102 103
		System.out.println("subMap: " + map.subMap(100, 102)); // 100 101

	}

}
