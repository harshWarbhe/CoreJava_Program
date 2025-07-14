package com.harsh.identityHashCode;

class Student {
	private Integer studentId;
}

public class SystemHashcode {
	public static void main(String[] args) {
		String str = "india";
		System.out.println("String class hashcode :" + str.hashCode());

		int systemHashCode = System.identityHashCode(str);
		System.out.println("System hash Code :" + systemHashCode);

		System.out.println("========================");

		Student s1 = new Student();
		System.out.println("Object class hashCode :" + s1.hashCode());

		int identityHashCode = System.identityHashCode(s1);
		System.out.println("System hash Code :" + identityHashCode);

	}

}
