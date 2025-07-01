package com.java.test_12_28.q2;

public class ArtsStudent extends Student {

	private int historyMarks;
	private int civicsMarks;
	private int english;
	private int socialScience;

	public ArtsStudent(String studentName, String studentClass, int historyMarks, int civicsMarks, int english,
			int socialScience) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
		this.english = english;
		this.socialScience = socialScience;
	}

	@Override
	public double getPercentage() {
		return ((this.historyMarks + this.civicsMarks + this.english + this.socialScience) / 4.0);
	}


	public boolean isPromoted() {
		int failsubjects = 0;
		if (historyMarks < 40)
			failsubjects++;
		if (civicsMarks < 40)
			failsubjects++;
		if (english < 40)
			failsubjects++;
		if (socialScience < 40)
			failsubjects++;

		return failsubjects < 2 && getPercentage() >= 60;
	}

}
