package com.harsh.Collection.Set;

import java.util.HashSet;

public class HashSetDemo_StringBuffer {
	public static void main(String[] args) 
	{
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add(new String("India"));
		hs1.add(new String("India"));
		System.out.println(hs1.size()); //1	
		
		//StringBuffer class has not overridden hashCode() and equals() 
		HashSet<StringBuffer> hs2 = new HashSet<StringBuffer>();
		hs2.add(new StringBuffer("Hyd"));
		hs2.add(new StringBuffer("Hyd"));
		System.out.println(hs2.size()); //2
		
		
		//reason for size mismatch
		
		String str = new String("Ameerpet");
		System.out.println(str.hashCode() +" : "+str.equals(null));
		
		
		StringBuffer sb = new StringBuffer("S R nagar");
		System.out.println(sb.hashCode() +" : "+sb.equals(null));		
		
	}

}
