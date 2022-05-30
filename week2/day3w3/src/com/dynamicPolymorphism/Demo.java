package com.dynamicPolymorphism;
//Dynamic polymorphism is a process or mechanism in which 
//a call to an overridden method is to resolve at runtime 
//rather than compile-time. 
//It is also known as runtime polymorphism or dynamic method dispatch.
//We can achieve dynamic polymorphism by using the method overriding.

//parent class  
public class Demo   {  
	public static void main(String args[])   {  
		//assigning a child class object to a parent class reference   
		Fruits fruits = new Mango();   
		//invoking the method  
		fruits.color();                
	}  
}  
//parent class  
class Fruits   {  
	public void color()   {  
		System.out.println("Parent class method is invoked.");  
	}  
}  

class Mango extends Fruits  {  
//overrides the color() method of the parent class  
	@Override  
	public void color()   {  
	System.out.println("The child class method is invoked.");  
	}  
}  
