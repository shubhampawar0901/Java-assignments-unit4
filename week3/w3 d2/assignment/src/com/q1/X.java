package com.q1;

public interface X {
	public abstract void methodAbsX();
	public default void methodDefX() {
		System.out.println("Default method of intf X");
	}
	public static void methodStaticX() {
		System.out.println("Static method of intf X");
	}
	
}

