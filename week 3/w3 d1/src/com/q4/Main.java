package com.q4;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		int rect =area.rectangleArea(sc.nextInt(), sc.nextInt());
		
		System.out.println("Enter side length of square");
		int square = area.squareArea(sc.nextInt());
		
		System.out.println("Enter circle radius");
		int circle = area.circleArea(sc.nextInt());
		
		System.out.println("Area of rectangle : "+rect);
		System.out.println("Area of square :"+ square);
		System.out.println("Area of circle :"+circle);
		
		sc.close();
	}

}
