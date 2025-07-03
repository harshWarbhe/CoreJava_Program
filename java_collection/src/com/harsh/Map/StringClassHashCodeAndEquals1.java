package com.harsh.Map;

public class StringClassHashCodeAndEquals1 {
	public static void main(String[] args) 
	{
	   String s1 = "india";	   
	   String s2 = new String("india");
	   
	   System.out.println(s1==s2);
	   System.out.println(s1.equals(s2));
	   System.out.println(s1.hashCode());
	   System.out.println(s2.hashCode());
	 
	   

	}

}
