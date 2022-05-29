package com.student;

public class Hosteller extends Student {
	double hostelFee;
	
	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double payFee(double fee) {
		// TODO Auto-generated method stub
		double rem =  this.hostelFee + this.examFee -fee;
		if(rem<=0 ) {
			return 0;
		}
		else {
			return rem;
		}
	}
	
	@Override
	public void displayDetails() {
		System.out.println("Name :"+studName);
		System.out.println("Student ID:"+studId);
		System.out.println("Exam fee Rs.:"+examFee);
		System.out.println("Transport fee Rs.:" +hostelFee);
		System.out.println("Total fees to be paid Rs.:"+(examFee+hostelFee));
	}

}
