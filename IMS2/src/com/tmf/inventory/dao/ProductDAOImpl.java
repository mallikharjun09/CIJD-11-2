package com.tmf.inventory.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.tmf.inventory.models.Product;

public class ProductDAOImpl implements ProductDAO{
	List<Product> products = new ArrayList<Product>();
	File productDetails = new File("d:/cijd-11/newProductsList.txt");
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		String data = ""+p.getProductId()+", ";
		data += p.getProductName()+", ";
		data += p.getProductCategory()+", ";
		data += p.getProductCost()+"\n";
		try {
			FileWriter writerObject = new FileWriter(productDetails,true);
			writerObject.write(data);
			writerObject.close();
			System.out.println("Product details has been added successfully...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unable to save data...");
		}
	}

	@Override
	public void deleteProduct(Product arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> displayProduct() {
		// TODO Auto-generated method stub
		products.clear();
		try {
			FileReader readerObject = new FileReader(productDetails);
			BufferedReader buffer = new BufferedReader(readerObject);
			String line = buffer.readLine();
			while(!line.equals(null)) {
				System.out.println("Available Products are...");
				Product p = new Product();
				String values[] = line.split(", ");
				p.setProductId(Long.parseLong(values[0]));
				p.setProductName(values[1]);
				p.setProductCategory(values[2]);
				p.setProductCost(Double.parseDouble(values[3]));
				products.add(p);
				line = buffer.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return products;
	}

	@Override
	public void displayProduct(Product product) {
		// TODO Auto-generated method stub
		int flag = 0;
		Product p=null;
		for(Product pro : products) {
			if(pro.getProductId() == product.getProductId()) {
				flag++;
				p = pro;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Product has not found");
		}
		else {
			System.out.println(p);
		}
	}

	@Override
	public List<Product> displayProduct(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product displayProduct(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
