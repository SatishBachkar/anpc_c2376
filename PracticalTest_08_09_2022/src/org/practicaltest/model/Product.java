package org.practicaltest.model;

public class Product {

	private int productId;
	private String productName;
	
	public void setId(int productId) {
		this.productId=productId;
	}
	public int getId() {
		return productId;
		
	}
	public void setName(String productName) {
		this.productName=productName;
	}
	public String getName() {
		return productName;
	}
	public Product(){
		
	}
	public Product(int productId, String productName){
	 this.productId=productId;
	 this.productName=productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	

	
	

}
