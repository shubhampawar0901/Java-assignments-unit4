package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	public static void main(String[] args) {
		Student d1 = new Student();
		Student d2 = new Student();
		d1.roll = 32;
		d1.name = "Shubham";
		d1.marks = 90;
		d2.roll = 34;
		d2.name = "Sonali";
		d2.marks = 95;
		d1.displayStudentDetails(d1.roll,d1.name ,d1.marks );
		d1.displayStudentDetails(d2.roll,d2.name ,d2.marks );
		d1 = null;
		d2 = null;
	}
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is:"+" "+roll);
		System.out.println("Name is:"+" "+name);
		System.out.println("Marks is:"+" "+marks);
	}

}
