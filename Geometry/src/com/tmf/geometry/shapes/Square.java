package com.tmf.geometry.shapes;

public class Square extends Shape{

	public Square(double x) {
		super(x);
	}
	
	public void getArea() {
		area = x * x;
		System.out.println("The area of the Square is "+area);
	}
	
	public void getPerimeter() {
		perimeter = 4 * x;
		System.out.println("The perimeter of the Square is "+perimeter);
	}
}
