package com.q2;

public class ScienceStudent extends Student {
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address= address;
	}
	
	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		double percentage = (double) (phisicsMarks+chemistryMarks+mathsMarks)/3;
		return percentage;
	}



}
