package com.masai;

public class StudentBin {

	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	//zero argument constructor
	public StudentBin() {
		// TODO Auto-generated constructor stub
	}

	public StudentBin(int roll , String name, int age, int marks) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>18 && age <60) {
			this.age = age;
		}
		else {
			System.out.println("Enter valid age between 16-60");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMarks(int marks) {
		if(marks>0 && marks <500) {
			this.marks = marks;
		}
		else {
			System.out.println("Enter valid age between 16-60");
		}
	}
	public int getMarks() {
		return marks;
	}
	
	public void showDetails() {
		System.out.println("Roll  :"+roll);
		System.out.println("Name  :"+name);
		System.out.println("Age   :"+age);
		System.out.println("Marks :"+marks);
	}

}
