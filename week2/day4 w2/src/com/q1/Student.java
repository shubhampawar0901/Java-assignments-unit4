package com.q1;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	public void displayDetails() {
		System.out.println("Name :"+name);
		System.out.println("Roll :"+roll);
		System.out.println("Marks :"+marks);
		char grade = calculateGrade();
		System.out.println("Grade :"+grade);
	}
	private char calculateGrade() {
		if(marks>500) {
			return 'A';
		}
		else if(marks< 500 && marks>= 400) {
			return 'B';
		}
		else{
			return 'C';
		}
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
}