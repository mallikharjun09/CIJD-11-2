package com.tmf.geometry.shapes;

public class Circle extends Shape{

	double PI=3.14;

	public Circle(double x) {
		super(x);
	}
	
	public void getArea() {
		area = PI * x * x;
		System.out.println("The area of the Circle is "+area);
	}
	
	public void getPerimeter() {
		perimeter = 2 * PI * x;
		System.out.println("The perimeter of the Circle is "+perimeter);
	}
}
