package com.tmf.serialization.models;

import java.io.Serializable;

public class Product implements Serializable {
	private long productId;
	private String productName;
	private String category;
	private double cost;
	public long getProductId() {
		return productId;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + ", cost="
				+ cost + "]";
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
