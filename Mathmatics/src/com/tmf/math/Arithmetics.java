package com.tmf.math;

import com.tmf.utilityfunctions.io.StandardIOV2;

public class Arithmetics {
	public static void main(String[] args) {
		
		StandardIOV2 nio = new StandardIOV2();
		double x = nio.readDouble("Enter first number ");
		double y = nio.readDouble("Enter Second number ");
		nio.out(x+" + "+y+" = "+(x+y));
		nio.out(x/y);
	}
}
