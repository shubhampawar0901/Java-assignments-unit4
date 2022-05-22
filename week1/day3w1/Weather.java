package com.masai;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 40.89;
		
		if(isSnowing == true || isRaining == true) {
			System.out.println("Let’s stay home.");
			
		}
		else if(temperature<=(double)50) {
			System.out.println("Let’s go out!");
		}
	}

}
