package com.yudong80.java.prj;

import java.util.Scanner;

public class KDeliveryMainV1 {
	private static int SHOP_MAX = 10;
	private static int ORDER_MAX = 20;
	private static int FEEDBACK_MAX = ORDER_MAX;
	
	private Shop[] shops;
	private Order[] orders;
	private Feedback[] feedbacks;
	
	private int shopIdx = 0;
	private int orderIdx = 0;
	private int feedbackIdx = 0;
		
	private Scanner s;
	
	public KDeliveryMainV1() {
		s = new Scanner(System.in);
		initValues();
	}
	
	private void initValues() {
		shops = new Shop[SHOP_MAX];
		orders = new Order[ORDER_MAX];
		feedbacks = new Feedback[FEEDBACK_MAX];
	}
	
	public void close() {
		if (s != null) {
			s.close();
		}
	}
	
	public int selectMainMenu() {
		System.out.println("  KDelivery V1");
		System.out.println("-------------------------------");
		System.out.println("1) 음식점 등록하기");
		System.out.println("2) 음식점 평점 조회하기");
		System.out.println("3) 음식 주문하기");
		System.out.println("4) 평점 등록하기");
		System.out.println("5) 종료하기");
		System.out.println("> 무엇을 도와드릴까요? ");
		
		int select = s.nextInt();
		return select;
	}
	
	public void selectAddShopMenu() { 
		final String shopName;
		final String foodName;
		final int price;
		
		System.out.println("반갑습니다. 가맹주님!");
		System.out.println("음식점 상호는 무엇인가요?");
		shopName = s.next();
		
		System.out.println("음식 이름은 무엇인가요?");
		foodName = s.next();

		System.out.println("음식 가격은 얼마인가요?");
		price = s.nextInt();

		Shop s = new Shop(shopName);
		s.addFood(0, foodName, price);
		shops[shopIdx++] = s;
		
		System.out.println(">> 정상 처리되었습니다.");
	}
	
	public void selectDashboardMenu() { 
		for (Feedback feedback : feedbacks) {
			if (feedback == null) {
				break;
			}
			feedback.printInfo();
		}
	}
	
	public void selectOrderMenu() {
		final String customerName;		
		final String shopName;
		final String foodName;
		
		System.out.println("반갑습니다. 고객님!");
		System.out.println("주문자 이름은 무엇인가요?");
		customerName = s.next();

		System.out.println("음식점 상호는 무엇인가요?");
		shopName = s.next();
		
		System.out.println("음식 이름은 무엇인가요?");
		foodName = s.next();

		Order s = new Order(customerName, shopName, foodName);
		orders[orderIdx++] = s;
		
		System.out.println(">> 정상 처리되었습니다.");
	}
	
	public void selectFeedbackMenu() {
		final String customerName;		
		final String shopName;
		final String foodName;
		final int grade;
		
		System.out.println("반갑습니다. 고객님!");
		System.out.println("주문자 이름은 무엇인가요?");
		customerName = s.next();

		System.out.println("음식점 상호는 무엇인가요?");
		shopName = s.next();
		
		System.out.println("음식 이름은 무엇인가요?");
		foodName = s.next();

		System.out.println("음식맛은 어땟나요? (1~ 5별점)?");
		grade = s.nextInt();
		
		Feedback f = new Feedback(customerName, shopName, foodName, grade);
		feedbacks[feedbackIdx++] = f;
		
		System.out.println(">> 정상 처리되었습니다.");
	
	}
	public static void main(String[] args) {
		KDeliveryMainV1 kd = new KDeliveryMainV1();
		int menu = 5; //default
		do {
			menu = kd.selectMainMenu();
			
			switch(menu) {
			case 1: kd.selectAddShopMenu(); break;
			case 2: kd.selectDashboardMenu(); break;
			case 3: kd.selectOrderMenu(); break;
			case 4: kd.selectFeedbackMenu(); break;			
			}
			
		} while (menu != 5);
		
		System.out.println("이용해주셔서 감사합니다.");
		kd.close();
	}
}