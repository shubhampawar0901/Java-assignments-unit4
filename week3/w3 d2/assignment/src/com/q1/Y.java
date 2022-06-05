package com.q1;

public interface Y {
	public abstract void methodAbsY();
	public default void methodDefY() {
		System.out.println("Default method of intf Y");
	}
	public static void methodStaticY() {
		System.out.println("Static method of intf Y");
	}
	
}
