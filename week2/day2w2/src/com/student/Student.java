package com.student;

public class Student {
	int studId ;
	String studName ;
	double examFee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	
	public void displayDetails() {
		System.out.println("Name :"+studName);
		System.out.println("Student ID:"+studId);
		System.out.println("Exam fee :"+examFee);
	}
	public double payFee(double fee) {
		double rem = fee - this.examFee ;
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
