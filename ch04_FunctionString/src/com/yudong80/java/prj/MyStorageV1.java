package com.yudong80.java.prj;

import java.util.Scanner;

public class MyStorageV1 {
	static void showMenu() { 
		System.out.println("MyStorage v1");
		System.out.println("--------------------------");
		System.out.println("1. 물건 정보 등록하기 "); 
		System.out.println("2. 물건 넣기(입고)"); 
		System.out.println("3. 물건 빼기(출고)");
		System.out.println("4. 재고 조회");
		System.out.println("5. 종료하기");		
		System.out.println("--------------------------");
	}
	
	static int selectMenu(Scanner s) { 
		System.out.print("원하는 메뉴를 선택하세요: ");
		int select = s.nextInt();
		return select;
	}
	
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
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
				System.out.println("물건을 등록합니다 <작업중>\n");
				break;
			case 2: //deposit 
				System.out.println("창고에 물건을 넣습니다 <작업중>\n");
				break;
			case 3: //withdraw
				System.out.println("창고에서 물건을 가져옵니다 <작업중>\n");
				break;
			case 4: //search 
				System.out.println("창고의 물건을 조회합니다 <작업중>\n");				
				break;
			}
		}
		s.close();
	}	
}