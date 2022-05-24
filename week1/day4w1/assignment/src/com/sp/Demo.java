package com.sp;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("Inside no arg constructor.");
	}
	
	public Demo(String s) {
		this(10.12f);
		System.out.println("Inside string arg constructor.");
	}

	public Demo(int i) {
		this("Raj");
		System.out.println("Inside int arg constructor.");
	}
	
	public Demo(float f) {
		System.out.println("Inside float arg constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo d1 = new Demo(); OR
		new Demo();
	}

}
