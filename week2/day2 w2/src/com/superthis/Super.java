package com.superthis;

//The super keyword in Java is a reference variable that is used to refer to immediate
//parent class object.
//Whenever you create the instance of a subclass, an instance of parent class is created
//1. super can be used to refer to the immediate parent class instance variable.
//2. super can be used to invoke the immediate parent class method.
//3. super() can be used to invoke immediate parent class constructor.


public class Super{
	String color="white";
	
	void eat(){
	System.out.println("eating...");
	}
}
class Dog extends Super{
	
	String color="black";
	
	void printColor(){
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
	}
	void eat(){
		System.out.println("eating bread...");
	}
	void bark(){
		System.out.println("barking...");
	}
	void work(){
		super.eat();
		bark();
	}
}	
class Main{
	public static void main(String args[]){
		Dog d=new Dog();
		d.work();
		d.printColor();
	}
}
