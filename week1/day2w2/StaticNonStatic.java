package com.masai;

public class StaticNonStatic {
	int x =100;
	//This is non static variable. It doesn't have keyword static. 
	//Initially after compilation it won't be available into ram for execution. 
	//It will be stored into hard disk in form of byte code in dot class file
	
	static int y =200;
	//static variable will be loaded by JVM into RAM after compiling
	// After that they will be available in CPU for execution.
	// They will be in context area of RAM.
	
	public static void main(String[] args) {

		//to access the non static variable we have to create object.
		//the new operator will reserve some memory inside hip area. 
		// address of that memory space will be given to that non static variable.
		
		//procedure for accessing non static variable 
		
		StaticNonStatic d1 = new StaticNonStatic();
		
		//accessing value of non static variable.
		System.out.println(d1.x);
		//accessing value of static variable.
		System.out.println(y);
	}

}

//While loading the non static variable if that variable is not initialized 
//then default initialization will be provided by the new operator.
//We can access static variable using object as well. 
