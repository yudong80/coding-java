package com.yudong80.java.ch07.compare;

public class OrderCompareExample {
	public static void main(String[] args) {
		long orderDate = System.currentTimeMillis(); //기준 시간 
		
		ComparableOrder[] orders = {
			new ComparableOrder("홍길동", "김밥천국", "참지김밥", orderDate),
			new ComparableOrder("금나나", "중국집", "쟁반짜장", orderDate + 100),
			new ComparableOrder("박상욱", "일식집", "방어회", orderDate + 200)	
		};
		
		//1. 주문 정보 출력 
		for (Order order : orders) {
			System.out.println(order);
		}
		
		//2. 대소 비교 
		boolean chk1 = orders[0].compareTo(orders[1]) < 0;
		System.out.println("order[0] < order[1] ? " + chk1);

		boolean chk2 = orders[0].compareTo(orders[2]) > 0;
		System.out.println("order[0] > order[2] ? " + chk2);
		
		//3. 동등 비교 
		boolean cmp = orders[1].compareTo(orders[1]) == 0;
		boolean equals = orders[1].equals(orders[1]);
		System.out.println("order[1] == order[1] ? " + cmp);
		System.out.println("order[1].equals(order[1]) ? " + equals);
		
		//4. 가장 최근 주문 출력하기 
		ComparableOrder lastOrder = orders[0]; //default
		for (ComparableOrder order : orders) {
			if (order.compareTo(lastOrder) > 0) {
				lastOrder = order;
			}
		}
		
		System.out.println("마지막 주문: " + lastOrder);
	}
}
