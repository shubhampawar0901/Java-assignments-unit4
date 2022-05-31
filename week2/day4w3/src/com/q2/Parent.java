package com.q2;

public class Parent {
	final int number;
	
		Parent(int x){
			number = x;
		}
		
		public void method1(){
			System.out.println("Inside method 1 of parent class");
			if(number>=1  && number<=10) {
				System.out.println("The number is :"+number);
			}else {
				System.out.println("Invalid number");
			}
		}
		
		final void method2(){
			System.out.println("Inside method 2 of Parent class");	
		}
		
		void method3() {
			System.out.println("Inside method 3 of Parent class");	
		}
}
