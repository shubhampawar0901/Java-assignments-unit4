package com.q1;
import java.util.Scanner;
public class Demo {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======== Enter Student1 details=======");
		Student student1 = new Student();
		
		System.out.println("Enter Name:");
		student1.setName(sc.next());
		
		System.out.println("Enter Roll :");
		student1.setRoll(sc.nextInt());
		
		System.out.println("Enter Marks :");
		student1.setMarks(sc.nextInt());
		
		
		System.out.println("======== Enter Student2 details=======");
		Student student2 = new Student();
		
		System.out.println("Enter Name:");
		student2.setName(sc.next());
		
		System.out.println("Enter Roll :");
		student2.setRoll(sc.nextInt());
		
		System.out.println("Enter Marks :");
		student2.setMarks(sc.nextInt());
		
		
		System.out.println("========Student1 details=======");
		student1.displayDetails();
		System.out.println("========Student2 details=======");
		student2.displayDetails();
	}

}
