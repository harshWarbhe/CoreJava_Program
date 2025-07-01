package com.java.test_12_28.q2;

public class ScienceStudent extends Student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	


//	public ScienceStudent(String studentName, String studentClass) {
//		super(studentName, studentClass);
//		// TODO Auto-generated constructor stub
//	}

	public ScienceStudent(String studentName, String studentClass,int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}


	@Override
	public double getPercentage() {
		return (this.physicsMarks + this.chemistryMarks + this.mathsMarks) / 3.0;
	}

	public boolean isPromoted()
	{
		int failsubjects=0;
		if(physicsMarks<40)failsubjects++;
		if(chemistryMarks<40)failsubjects++;
		if(mathsMarks<40)failsubjects++;
		
		return failsubjects <2 && getPercentage()>=60;
	}
}
