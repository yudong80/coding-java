package com.yudong80.java.ch06;

final class LastWarrior {
	public void attack(String castle) { 
		System.out.println("마지막 전사가 " + castle + " 성을 공격합니다.");
	}	
}

//final 클래스는 상속할 수 없습니다. 
class NewWarrior /*extends LastWarrior*/ {
	
}

class BasicWarrior  {
	public final void attackNormal(String enemy) {
		System.out.println("전사가 " + enemy + "에게 일반 공격을 합니다.");
	}		
}

class AdvancedWarrior extends BasicWarrior {
	public void attackCritical(String enemy) {
		System.out.println("전사가 " + enemy + "에게 치명적인 공격을 합니다.");
	}
}

public class InheritanceFinalExample {
	public static void main(String[] args) {
		//1. final 클래스는 상속 불가 
		LastWarrior warrior = new LastWarrior();
		warrior.attack("런던");
		
		//2. final 메서드는 메서드 오버라이드 불가 
		BasicWarrior basic = new BasicWarrior();
		basic.attackNormal("박쥐");
		
		AdvancedWarrior advanced = new AdvancedWarrior();
		advanced.attackNormal("오크");
		advanced.attackCritical("용");
	}
}