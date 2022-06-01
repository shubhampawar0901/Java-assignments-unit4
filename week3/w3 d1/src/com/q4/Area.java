package com.q4;

public class Area extends Shape {

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		int area = length * breadth;
		return area;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		int area = side*side;
		return area;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int area =  (int)Math.PI * radius * radius;
		return area;
	}

}
