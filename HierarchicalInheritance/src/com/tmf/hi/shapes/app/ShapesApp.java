package com.tmf.hi.shapes.app;

import java.util.Scanner;

import com.tmf.hi.shapes.services.ShapeServices;

public class ShapesApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.err.println("Please Enter the shape name (circle/rectange/square");
		String shape = scan.nextLine();
		ShapeServices service = new ShapeServices();
		service.getShape(shape);
		service.getArea();
		service.getPerimeter();
	}
}
