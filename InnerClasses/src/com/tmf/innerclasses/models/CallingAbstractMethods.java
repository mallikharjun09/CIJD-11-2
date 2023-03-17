package com.tmf.innerclasses.models;


//Anonymous Class.
public class CallingAbstractMethods {
	public static void main(String[] args) {
		Arithmetics add = new Arithmetics() {
			public void perform(int a,int b) {
				System.out.println(a+" + "+b+" = "+(a+b));
			}
		};
		Arithmetics diff = new Arithmetics() {
			public void perform(int a,int b) {
				System.out.println(a+" - "+b+" = "+(a-b));
			}
		};
		add.perform(10, 30);
		diff.perform(30, 10);
	}
}
