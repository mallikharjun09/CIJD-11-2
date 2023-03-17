package com.tmf.inventory.app;

import com.tmf.inventory.services.ProductServices;
import com.tmf.inventory.services.ProductServicesImpl;

public class IMSAppV2 {
	public static void main(String[] args) {
		ProductServices service = new ProductServicesImpl();
		service.menu();
	}
}
