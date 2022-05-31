package com.reverse;
import java.util.Scanner;
public class Main { 
	public static String reversString(String input){
		//write the logic
		int len = input.length();
		char[] ch = new char[len]; 
		
		for(int i=len-1 ; i>=0; i--) {
			ch[len-1-i] = input.charAt(i);
		}
		return new String(ch);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		sc.close();
	}
}
