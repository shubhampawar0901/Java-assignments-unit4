package com.q2;
import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.Matcher;
public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean nameValidation = Pattern.matches("[a-z]{3,8}", name);
		boolean mobileValidation = Pattern.matches("[6789][0-9]{9}",mobileNum);
		boolean aadharCardValidation = Pattern.matches("[0-9]{12}",aadharCard);
		
		if(nameValidation==true && mobileValidation==true && aadharCardValidation==true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");

		String name = sc.next();
		
		System.out.println("Enter Mobile :");
		
		String mobile = sc.next();
		
		System.out.println("Enter Aadhar :");

		String aadhar = sc.next();
		
		Demo d = new Demo();
		
		boolean result = d.validate(name,mobile,aadhar);
		
		if(result==true) {
			Citizen c = new Citizen();
			
			c.setAadharNumber("123412341234");
			c.setMobileNumber("9999900990");
			c.setName("Shubham");
			
			System.out.println("Name :"+ c.getName());
			System.out.println("Aadhar :"+ c.getAadharNumber());
			System.err.println("Mobile :"+ c.getMobileNumber());
		}else {
			System.out.println("Error");
		}
	}

}
