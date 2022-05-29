package com.member;

public class Member {
	String name;
	int age;
	String phone;
	String address;
	double salary;
	public Member() {
		
	}
	public void printSalary() {
		System.out.println(salary);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Employee extends Member{
	String Specialisation;
	String Department;
}

class Manager extends Member{
	String Specialisation;
	String Department;
}