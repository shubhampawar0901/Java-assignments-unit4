package com.q2;
import java.util.Scanner;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number :");
		
		Parent p1 = new Child(sc.nextInt());
		
		p1.method1();
		p1.method2();
		p1.method3();
		
		Child c1 = (Child)p1;
		
		c1.method4();
	}

}
