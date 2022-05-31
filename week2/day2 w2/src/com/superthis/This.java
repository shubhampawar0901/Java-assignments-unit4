package com.superthis;

//this is used to refer current-class’s instance as well as static members.
//this can be used 
//to refer instance variable of current class
//to invoke or initiate current class constructor
//can be passed as an argument in the method call
//can be passed as argument in the constructor call
//can be used to return the current class instance

public class This {
	   int a = 10;
	   
	    // static variable
	    static int b = 20;
	 
	    void demo()
	    {
	        // referring current class(i.e, class This)
	        // instance variable(i.e, a)
	        this.a = 100;
	 
	        System.out.println(a);
	 
	        // referring current class(i.e, class This)
	        // static variable(i.e, b)
	        this.b = 600;
	 
	        System.out.println(b);
	    }
	    
	    public static void main(String[] args)
	    {
	        // Compile Time Error since cannot use'this' in static context.
//	         this.a = 700;
	        new This().demo();
	    }
}
