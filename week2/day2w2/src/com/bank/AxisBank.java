package com.bank;

public class AxisBank extends Bank {
	double rateOfInterest;
	
	public AxisBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Branch Name :"+ this.branchName);
		System.out.println("IFSC code :"+this.IfscCode);
		System.out.println("Rate of Intrest:" +this.rateOfInterest);
	}
	
	public void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}


}
