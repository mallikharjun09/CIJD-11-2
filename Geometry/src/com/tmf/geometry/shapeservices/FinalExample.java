package com.tmf.geometry.shapeservices;

class FinalParent{
	final int x;
	
	public FinalParent(int x) {
		this.x = x;
	}
	
	final public void showX() {
		//x = x + 5;
		System.out.println("X = "+x);
	}
}

public final class FinalExample extends FinalParent{
	public FinalExample(int x) {
		super(x);
	}
	
	//Overridden function
	/*public void showX() {
		//x = x + 15;
		System.out.println("X = "+x);
	}*/
	public static void main(String[] args) {
		FinalExample ex = new FinalExample(20);
		ex.showX();
	}
	
}
