package com.tmf.hi.shapes;

public class Rectangle extends GeometricalShape{
	public Rectangle(double x,double y) {
		super(x,y);
	}
	
	public void getArea() {
		area = x * y;
		super.getArea();
	}
	
	public void getPerimeter() {
		perimeter = 2 * (x + y);
		super.getPerimeter();
	}
}
