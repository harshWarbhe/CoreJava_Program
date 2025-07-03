package com.harsh.Collection.Set;

class Student {

}

public class HashCodeDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
