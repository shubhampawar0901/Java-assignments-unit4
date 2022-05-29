package com.student;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====DayScholar====");
		Scanner sc = new Scanner(System.in);
		
		DayScholar d1 = new DayScholar(123, "Shubham",1500,2000);
		System.out.println("Enter fee you are paying:");
		
		double payfee1 = sc.nextDouble();
		if(payfee1>3500) {
			payfee1 =3500;
		}
		double rem1 = d1.payFee(payfee1);
		
		d1.displayDetails();
		System.out.println("Fees paid Rs.:"+payfee1);
		System.out.println("Fee remaining Rs.:"+rem1);
		
		
		System.out.println("====Hosteller====");
		
		Hosteller student2 = new Hosteller(345,"Rushikesh",1500,4000);
		System.out.println("Enter fee you are paying:");
		double payfee2 = sc.nextDouble();
		if(payfee2>5500) {
			payfee2 =5500;
		}
		double rem2 = student2.payFee(payfee2);
		student2.displayDetails();
		System.out.println("Fees paid Rs.:"+payfee2);
		System.out.println("Fee remaining Rs.:"+rem2);
		
		sc.close();
		
	}

}
