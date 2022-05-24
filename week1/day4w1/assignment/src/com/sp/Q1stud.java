package com.sp;

public class Q1stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//zero argument constructor;
		Student s1 = new Student();
		s1.setName("Shubham");
		s1.setRoll(34);
		s1.setAge(24);
		s1.setMarks(450);
		
		System.out.println("Student 1 Name :"+ s1.getName());
		System.out.println("Student 1 ROll :"+ s1.getRoll());
		System.out.println("Student 1 Age  :"+ s1.getAge());
		System.out.println("Student 1 Marks:"+ s1.getMarks());
		
		//parameterized constructor;
		
		Student  s2 = new Student(27,"Rushikesh",24,480);
		
		System.out.println("Student 2 Name :"+ s2.getName());
		System.out.println("Student 2 ROll :"+ s2.getRoll());
		System.out.println("Student 2 Age  :"+ s2.getAge());
		System.out.println("Student 2 Marks:"+ s2.getMarks());
		
		
	}

}


class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	public Student(){
		
	}
	

	public Student(int roll, String name, int age, int marks) {
		// TODO Auto-generated constructor stub
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
