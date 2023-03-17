package com.tmf.geometry.shapeservices;

import com.tmf.geometry.shapes.Shape;

public class VirtualShape {
	private Shape shape;
	
	public VirtualShape(Shape shape) {
		this.shape = shape;
	}
	
	public void getArea() {
		shape.getArea();
	}
	public void getPerimeter() {
		shape.getPerimeter();
	}
}
