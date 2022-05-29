package com.bank;

public class ICICIBank extends Bank {
	double rateOfInterest;
	
	public ICICIBank() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
//		// TODO Auto-generated method stub
//		super.displayDetails();
		System.out.println("Branch Name :"+ this.branchName);
		System.out.println("IFSC code :"+this.IfscCode);
		System.out.println("Rate of Intrest:" +this.rateOfInterest);
	}

}
