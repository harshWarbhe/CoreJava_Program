package com.java.test_12_28.q2;

public abstract class Student {

	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;

	public Student() {
		super();
	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

	public abstract double getPercentage();

	public static int getTotalNoOfStudents() {
		return totalNoOfStudents;
	}

}
