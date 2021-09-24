package com.yudong80.java.ch07.compare;

public class ComparableOrder extends Order implements Comparable<ComparableOrder>{

	public ComparableOrder(String cust, String shop, String food, long date) {
		super(cust, shop, food, date);
	}
	
	@Override
	public int compareTo(ComparableOrder o) {
		long myDate = super.orderDate;
		long yourDate = o.orderDate;
		
		if (myDate < yourDate) {
			return -1;
		} else if (myDate == yourDate) {
			return 0;
		}
		
		return +1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("주문: {");
		sb.append(super.customerName).append(", ");
		sb.append(super.shopName).append(", ");
		sb.append(super.foodName).append("} >> ");
		sb.append(super.orderDate);
		
		return sb.toString();
	}
}
