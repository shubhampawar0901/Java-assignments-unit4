package com.q2;

final class Child extends Parent {
	
	Child(int x){
		super(x);
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method 1 of child class");
		if(number>=1  && number<=10) {
			System.out.println("The number is :"+number);
		}else {
			System.out.println("Invalid number");
		}
	}
	
	@Override
	public void method3() {
		System.out.println("Inside method 3 of child class");
	}
	
	void method4() {
		System.out.println("Inside method 4 of child class");
	}
}
