package com.tmf.serialization.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductDAO {
	File fileObject = new File("d:/cijd-11/pros.dat");
	public void writeObject(Product pro) {
		try {
			FileOutputStream fos = new FileOutputStream(fileObject,true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pro);
			System.out.println("Object has been stored successfully.");
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readObject() {
		try {
			FileInputStream fis = new FileInputStream(fileObject);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Product pro = (Product)ois.readObject();
			System.out.println(pro);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
