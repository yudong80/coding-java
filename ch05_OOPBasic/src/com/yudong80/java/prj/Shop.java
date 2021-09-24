package com.yudong80.java.prj;

public class Shop {
	private static final int FOOD_MAX = 10;
	private static final String EMPTY_FOOD = "";
	private static final int EMPTY_PRICE = 0;
	
	private String shopName;
	private String[] foodNames;
	private int[] prices;
	
	public Shop(String shopName) {
		this.shopName = shopName;
		initValues();
	}
	
	private void initValues() {
		foodNames = new String[FOOD_MAX];
		prices = new int[FOOD_MAX];
		for (int i=0; i < FOOD_MAX; ++i) {
			foodNames[i] = EMPTY_FOOD;
			prices[i] = EMPTY_PRICE;
		}
	}
	
	/** 
	 * 가맹점의 음식을 추가
	 * @param idx 인덱스
	 * @param name 배달 음식 이름
	 * @param price 배달 음식 가격
	 */
	public void addFood(int idx, String name, int price) {
		System.out.println(shopName + "에 음식(" + name + ", " + price + ") 추가되었습니다.");
		foodNames[idx] = name;
		prices[idx] = price;
	}
}
