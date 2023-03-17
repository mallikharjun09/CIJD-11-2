package com.tmf.hi.shapes.services;

import java.util.Scanner;

import com.tmf.hi.shapes.Circle;
import com.tmf.hi.shapes.GeometricalShape;
import com.tmf.hi.shapes.Rectangle;
import com.tmf.hi.shapes.Square;

public class ShapeServices {
	private Scanner scan = new Scanner(System.in);
	private GeometricalShape shape;
	private double s1,s2;
	
	
	//call by reference
	public void getShape(String s) {
		switch(s.toLowerCase()) {
		case "circle" : System.out.println("Enter the radius of the circle");
		                s1 = scan.nextDouble();
		                scan.nextLine();
		                shape = new Circle(s1);
		                break;
		case "square" : System.out.println("Enter the side of the square");
        				s1 = scan.nextDouble();
        				scan.nextLine();
        				shape = new Square(s1);
        				break;
		case "rectangle" :System.out.println("Enter the length and breadth of the rectanble");
        				  s1 = scan.nextDouble();
        				  scan.nextLine();
        				  s2 = scan.nextDouble();
        				  scan.nextLine();
        				  shape = new Rectangle(s1,s2);
        				  break;
        default : System.out.println("Sorry!!! You've chosen an invalid shape.");
		}
	}
	
	public void getArea() {
		shape.getArea();
	}
	public void getPerimeter() {
		shape.getPerimeter();
	}
}
