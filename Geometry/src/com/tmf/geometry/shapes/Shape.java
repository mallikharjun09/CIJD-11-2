package com.tmf.geometry.shapes;

abstract public class Shape {
	protected double x,y,area,perimeter;
	
	public Shape(double x) {
		this.x = x;
	}
	
	abstract public void getArea();
	abstract public void getPerimeter();
}
