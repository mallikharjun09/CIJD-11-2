package com.tmf.hi.shapes;

public class GeometricalShape {
	protected double x,y;
	protected double area,perimeter;
	
	public GeometricalShape(double x) {
		this.x = x;
	}
	
	public GeometricalShape(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public void getArea() {
		System.out.println("The Area of a "+this.getClass().getSimpleName()+" is "+area);
	}
	
	public void getPerimeter() {
		System.out.println("The Perimeter of a "+this.getClass().getSimpleName()+" is "+perimeter);
	}
}
