package com.q1;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Demo d1 = new Demo();
		
		System.out.println("Enter amount");
		Hotel h1 = d1.provideFood(sc.nextInt());
		
		if(h1==null) {
			System.out.println("Please enter a valid amount");
			
		}else {
			h1.chickenBiryani();
			h1.masalaDosa();
			
			if(h1 instanceof TajHotel) {
				TajHotel t1 = (TajHotel)h1;
				t1.welcomeDrink();
			}			
		}
		sc.close();
	}

	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			return new TajHotel();
			
		}else if(amount>200 && amount<1000) {
			return new RoadSideHotel();
			
		}else {
			
			return null;
		}
	}
}
