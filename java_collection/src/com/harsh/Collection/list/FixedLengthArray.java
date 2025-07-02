//create Immutable List and Fixed length array 
package com.harsh.Collection.list;

import java.util.Arrays;
import java.util.List;

public class FixedLengthArray {
	public static void main(String[] args) 
	{
		//Fixed length Array
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        //list.add(9);   java.lang.UnsupportedOperationException
		//list.remove(0);  java.lang.UnsupportedOperationException
		  list.set(0, 100);
		  System.out.println(list);
	}


}
