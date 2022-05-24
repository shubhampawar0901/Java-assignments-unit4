package com.sp;

public class DemoQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stud1 = Student1.getStudent(true);
		
		System.out.println("======Student with getStudent(true)=======");
		System.out.println("Name :"+stud1.getName());
		System.out.println("Roll :"+stud1.getRoll());
		System.out.println("Address :"+stud1.getAddress());
		System.out.println("Collage :"+stud1.getCollageName());
		

		Student1 stud2 = Student1.getStudent(false);
		
		System.out.println("======Student with getStudent(false)=======");;
		System.out.println("Name :"+stud2.getName());
		System.out.println("Roll :"+stud2.getRoll());
		System.out.println("Address :"+stud2.getAddress());
		System.out.println("Collage :"+stud2.getCollageName());
	}

}

class Student1{
	private int roll;
	private String name;
	private String address;
	private String collageName;
	
	public Student1() {
		
	}
	
	public Student1(int roll, String address, String name) {
		this.roll = roll;
		this.address = address;
		this.name = name;
	}
	
	public Student1(int roll, String name, String address, String collageName ) {
		this.roll = roll;
		this.address = address;
		this.name = name;
		this.collageName = collageName;
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
	
	public String getCollageName() {
		return collageName;
	}
	
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public static Student1 getStudent(boolean isFromNIT) {
		if(isFromNIT == true) {
			Student1 s1 = new Student1(27,"Rushikesh","Maharashtra","IISC Banglore");
			return s1;
		}
		else {
			Student1 s2 = new Student1(52,"Shubham","Maharashtra");
			return s2;
		}
	}
}
