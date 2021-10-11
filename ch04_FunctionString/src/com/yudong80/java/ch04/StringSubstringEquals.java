package com.yudong80.java.ch04;

public class StringSubstringEquals {
	public static void main(String[] args) {
		//1. substring() 예제
		String poem = 
		"Two roads diverged in a yellow wood,\n" + 
		"And sorry I could not travel both"; 
		
		String samePoem = poem.substring(0);
		String firstWord = poem.substring(0, 3);
		String secondLine = poem.substring(37);
		System.out.println("시의 내용은:\n" + samePoem);
		System.out.println("시의 첫번째 단어는: " + firstWord);
		System.out.println("시의 두번째 줄은: " + secondLine);
		
		//2. equals() 와 equalsIgnoreCase() 예제  
		String apple = "apple";
		String macintosh = "macintosh";
		String mac = "Macintosh";
		
		boolean isSame = apple.equals(mac);
		boolean isSameWord = macintosh.equalsIgnoreCase(mac);
		System.out.println(apple + "과 " + mac + "은 같은가요? " + isSame);
		System.out.println(macintosh + "와 " + mac + "은 같은 단어인가요(대소문자 무관)? " + isSameWord);
	}
}
