package com.tmf.innerclasses.models;

public class CallingMethods {
	public static void main(String[] args) {
		OuterClass cls = new OuterClass();
		cls.showOuterMethod();
		cls.showX();
		//If Inner class object is non-static
		cls.ic.showInnerClassMethod();
		cls.ic.showXY();
		
		//If Inner class object is static.
		OuterClass.ic.showInnerClassMethod();
		OuterClass.ic.showXY();
	}
}
