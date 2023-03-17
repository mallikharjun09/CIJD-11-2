package com.tmf.innerclasses.models;

public class OuterClass {
	private static int x = 15;
	public static InnerClass ic = new InnerClass();
	
	public void showOuterMethod() {
		System.out.println("This is an outer method");
	}
	public void showX() {
		System.out.println("X = "+x);
	}
	
	public static class InnerClass{
		private int y = 20;
		public void showInnerClassMethod() {
			System.out.println("This is an inner class method");
		}
		
		public void showXY() {
			System.out.println("X+Y = "+(x+y));
		}
	}
}
