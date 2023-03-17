package com.tmf.geometry.app;

import com.tmf.geometry.shapes.*;
import com.tmf.geometry.shapeservices.VirtualShape;

public class ShapesApp {
	public static void main(String[] args) {
		VirtualShape vs = new VirtualShape(new Square(10));
		vs.getArea();
		vs.getPerimeter();
	}
}
