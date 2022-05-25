package com.student;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students :");
		int noOfStudents = scan.nextInt();
		Student[] studArr = new Student[noOfStudents];
		
		for(int i =0; i<noOfStudents; i++) {
			Student s1 = new Student();
			Scanner scan2 = new Scanner(System.in);
			
			System.out.println("Enter Name :");
			String name = scan2.nextLine();
			scan2.next();
			System.out.println("Enter Roll :");
			int roll = scan2.nextInt();
			System.out.println("Enter Address:");
			String address = scan2.nextLine();
			scan2.next();
			System.out.println("Enter Marks :");
			int marks = scan2.nextInt();
			
			s1.setName(name);
			s1.setRoll(roll);
			s1.setAddress(address);
			s1.setMarks(marks);
			
			System.out.println("===Output===");
			System.out.println("Name :"+ s1.getName());
			System.out.println("Roll no.:"+ s1.getRoll());
			System.out.println("Marks :" + s1.getAddress());
			System.out.println("Address :"+ s1.getAddress());
		}
		System.out.println(studArr);
	
		scan.close();
	}

}

class Student{
	private int roll;
	private String name;
	private  String address;
	private int marks;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
