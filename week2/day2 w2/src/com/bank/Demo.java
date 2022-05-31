package com.bank;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Bank Name");
		String bank = input.nextLine();
		Bank b1 = getBank(bank);
		if(b1 instanceof AxisBank) {
			b1.displayDetails();
			((AxisBank) b1).getCreditCard();
		}
		else if(b1 instanceof ICICIBank) {
			b1.displayDetails();
		}

		
	}
	
	public static Bank getBank(String bank) {
		Scanner input = new Scanner(System.in);
		if(bank.equals("Axis Bank")) {
			AxisBank axis = new AxisBank();
			System.out.println("Enter Branch Name :");
			String brancName = input.next();
			System.out.println("Enter IFSC code :");
			String ifsc = input.next();
			System.out.println("Enter Rate of intrest :");
			double roi = input.nextDouble();
			
			axis.branchName = brancName;
			axis.IfscCode = ifsc;
			axis.rateOfInterest = roi;
			
			return axis;
		}
		else if(bank.equals("ICICI Bank")) {
			ICICIBank icici = new ICICIBank();
			System.out.println("Enter Branch Name :");
			String brancName = input.next();
			System.out.println("Enter IFSC code :");
			String ifsc = input.next();
			System.out.println("Enter Rate of intrest :");
			double roi = input.nextDouble();
			
			icici.branchName = brancName;
			icici.IfscCode = ifsc;
			icici.rateOfInterest = roi;
			
			return icici;
		}
		else {
			System.out.println("Enter valid bank name");
			Bank b = null;
			return b;
		}
	}


}
