package com.tmf.serialization.models;

import java.util.Scanner;

public class ProductServices {
	Scanner scan = new Scanner(System.in);
	int productId = 1000001;
	ProductDAO dao = new ProductDAO();
	public void addProduct() {
		System.out.println("Enter product Name ");
		String name = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter category of the product");
		String category = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter the product cost");
		double cost = scan.nextDouble();
		
		Product p = new Product();
		p.setCategory(category);
		p.setCost(cost);
		p.setProductId(productId);
		p.setProductName(name);
		
		dao.writeObject(p);
	}
	
	public void menu() {
		while(true) {
			System.out.println("Press 1 for Add new product  ");
			System.out.println("Press 2 for display all products  ");
			System.out.println("Press 3 for exit..");
			System.out.println("Please enter your choice....");
			int choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1 : addProduct();break;
			case 2 :displayProduct();break;
			case 3 : System.exit(choice);
			default : System.out.println("You have entered a wrong choice..");
			}
		}
	}

	private void displayProduct() {
		// TODO Auto-generated method stub
		dao.readObject();
	}
}
