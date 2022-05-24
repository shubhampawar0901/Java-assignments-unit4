package com.sp;

import java.util.Scanner;

//import javax.print.attribute.standard.PrinterName;

public class WholeNumber {
	
	public void printNum(int num) {
		if(num%2==1) {
			System.out.println(num);
		}
		else if(num<0) {
			System.out.println("Error");
		}
		else {
			int even = num-(num%10)+10;
			System.out.println(even);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a whole number:");
		int num = scan.nextInt();
		WholeNumber w1 = new WholeNumber();
		
		w1.printNum(num);
		scan.close();
		
	}

}
