package com.masai;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city = "Pune";
		
		switch(city) {
		case "Mumbai":
			System.out.println("Financial city");
			break;
		case "Kolkata":
			System.out.println("City of joy");
			break;
		case "Delhi":
			System.out.println("Capital of country");
			break;
		case "Banglore":
			System.out.println("Cyber city");
			break;
		default:
			System.out.println("May be other Indian city");
		}
	}

}
