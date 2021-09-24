package com.yudong80.java.ch07.compare;

public class Order {
	protected String customerName;
	protected String shopName;
	protected String foodName;
	protected long orderDate;
	
	public Order(String cust, String shop, String food, long date) {
		customerName = cust;
		shopName = shop;
		foodName = food;
		orderDate = date;
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
	
	public long getOrderDate() {
		return orderDate;
	}
}
