package com.student;

public class DayScholar extends Student {
	double transportFee;
	
	public DayScholar() {
		super();
	}
	
	public DayScholar(int studId, String studName, double examFee,double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double payFee(double fee) {
		// TODO Auto-generated method stub
		double rem =  this.transportFee + this.examFee -fee;
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
		System.out.println("Transport fee Rs.:" +transportFee);
		System.out.println("Total fees to be paid Rs.:"+(examFee+transportFee));
	}

}
