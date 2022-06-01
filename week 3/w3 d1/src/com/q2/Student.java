package com.q2;

public abstract class Student {

	String name;
	String address ;
	
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	abstract double getPercentage( );
	
}
