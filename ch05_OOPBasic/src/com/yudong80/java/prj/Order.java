package com.yudong80.java.prj;

public class Order {
	private String customerName;
	private String shopName;
	private String foodName;
	
	public Order(String cust, String shop, String food) {
		customerName = cust;
		shopName = shop;
		foodName = food;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getShopName() {
		return shopName;
	}
	
	public String getFoodName() {
		return foodName;
	}
}
