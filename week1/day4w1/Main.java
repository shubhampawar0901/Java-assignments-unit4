package com.masai;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using zero argument constructor
		StudentBin student1 = new StudentBin();
		student1.setRoll(34);
		student1.setName("Shubham");
		student1.setAge(24);
		student1.setMarks(400);
		
		
		//using parameterized (getter,setter methods) constructors.
		StudentBin student2 = new StudentBin(4,"Sonali",24,450);
		
		
		System.out.println("Student1 details using zero argument constructor");
		student1.showDetails();
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
		
	}

}
