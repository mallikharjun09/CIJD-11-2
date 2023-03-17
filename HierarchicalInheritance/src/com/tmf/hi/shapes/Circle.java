package com.tmf.hi.shapes;

public class Circle extends GeometricalShape{
		
	public Circle(double x) {
		super(x);
	}
	
	public void getArea() {
		area = 3.14 * x * x;
		super.getArea();
	}
	
	public void getPerimeter() {
		perimeter = 2*3.14*x;
		super.getPerimeter();
	}
}
