package com.harsh.Collection.list;

import java.util.List;

public class ImmutableList {
	public static void main(String[] args) 
	{
		List<Integer> immutable = List.of(1,2,3,4,5,6,7,8);
		//immutable.add(9);  java.lang.UnsupportedOperationException
        //immutable.remove(0); java.lang.UnsupportedOperationException
		//immutable.set(0, 90); java.lang.UnsupportedOperationException
        System.out.println(immutable);		

	}

}
