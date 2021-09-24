package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV2 {
	static String EMPTY = "없음";
	static int EMPTY_COUNT = 0;
	
	static void showMenu() { 
		System.out.println("MyStorage v2");
		System.out.println("--------------------------");
		System.out.println("1. 물건 정보 등록하기 "); 
		System.out.println("2. 물건 넣기(입고)"); 
		System.out.println("3. 물건 빼기(출고)");
		System.out.println("4. 재고 조회");
		System.out.println("5. 종료하기");		
		System.out.println("--------------------------");
	}
	
	static int selectMenu(Scanner s) { 
		System.out.print("원하는 메뉴를 선택하세요? ");
		int select = s.nextInt();
		return select;
	}
	
	static void register(Scanner s, String[] products) {
		System.out.println("새로운 물건을 등록합니다");
		System.out.println("물건 이름을 입력하세요? ");
		
		//1. 비어있는 슬롯 찾기 
		String input = s.next();
		int emptySlot = -1; //not empty
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (EMPTY.equals(product)) {
				emptySlot = i;
				break;
			}
		}
		
		//2. 비어있는 슬롯이 없다면 오류 발생 
		if (emptySlot < 0) {
			System.out.println("창고가 가득찼습니다. 등록이 불가합니다.");
			return;
		}
		
		//3. 등록 성공 
		products[emptySlot] = input;
		System.out.println("등록이 완료되었습니다. 제품 목록은: ");
		for (String product: products) {
			System.out.println(product);
		}
	}

	static void deposit(Scanner s, String[] products, int[] counts) {
		System.out.println("물건을 추가합니다(입고)");
		System.out.println("현재 등록된 물건 목록:");
		for (String product: products) {
			System.out.println("> " + product);
		}
		
		//1. 물건 슬롯  찾기
		System.out.println("추가할 물건 이름을 입력하세요? ");	
		String input = s.next();
		int foundIdx = -1; //not found
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (input.equals(product)) {
				foundIdx = i;
				break;
			}
		}
		
		//2. 비어있는 슬롯이 없다면 오류 발생 
		if (foundIdx < 0) {
			System.out.println("찾는 물건이 없습니다. 입고할 수 없습니다.");
			return;
		}
		
		//3. 추가 성공 
		System.out.println("추가할 갯수를 입력하세요? ");
		int cnt = s.nextInt();
		counts[foundIdx] += cnt;
		
		System.out.println("입고가 완료되었습니다. 제품 현황은: ");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "개");
		}
	}

	static void withdraw(Scanner s, String[] products, int[] counts) {
		System.out.println("물건을 꺼냅니다(출고)");
		System.out.println("현재 등록된 물건 목록:");
		for (String product: products) {
			System.out.println("> " + product);
		}
		
		//1. 물건 슬롯  찾기
		System.out.println("꺼낼 물건 이름을 입력하세요? ");	
		String input = s.next();
		int foundIdx = -1; //not found
		for (int i=0; i< products.length; ++i) {
			String product = products[i];
			if (input.equals(product)) {
				foundIdx = i;
				break;
			}
		}
		
		//2. 비어있는 슬롯이 없다면 오류 발생 
		if (foundIdx < 0) {
			System.out.println("찾는 물건이 없습니다. 출고할 수 없습니다.");
			return;
		}
		
		//3. 꺼내기 성공 
		System.out.println("꺼낼 갯수를 입력하세요? ");
		int cnt = s.nextInt();
		counts[foundIdx] -= cnt;
		
		System.out.println("출고가 완료되었습니다. 제품 현황은: ");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "개");
		}
	}
	
	static void search(String[] products, int[] counts) {
		System.out.println("현재 등록된 물건 목록:");
		for (int i=0; i< products.length; ++i) {
			System.out.println("> " + products[i] + ": " + counts[i] + "개");
		}
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		String[] products = { EMPTY, EMPTY, EMPTY, EMPTY, EMPTY };
		int[] counts = { 0, 0, 0, 0, 0 };
		
		while(true) {
			//1. 메뉴를 표시한다 
			showMenu();
			
			//2. 메뉴를 고른다 
			int menu = selectMenu(s);
			if (menu == 5) {
				System.out.println("프로그램을 종료합니다. 다음에 만나요.");
				break;
			}
			
			switch(menu) {
			case 1: //register
				register(s, products);
				break;
			case 2: //deposit 
				deposit(s, products, counts);
				break;
			case 3: //withdraw
				withdraw(s, products, counts);
				break;
			case 4:
				search(products, counts);
				break;
			}
		}
		s.close();
	}
}