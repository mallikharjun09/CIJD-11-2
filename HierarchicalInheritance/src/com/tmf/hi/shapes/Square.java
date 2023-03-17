package com.tmf.hi.shapes;

public class Square extends GeometricalShape{
	public Square(double x) {
		super(x);
	}
	
	public void getArea() {
		area = x * x;
		super.getArea();
	}
	
	public void getPerimeter() {
		perimeter = 4*x;
		super.getPerimeter();
	}
}
