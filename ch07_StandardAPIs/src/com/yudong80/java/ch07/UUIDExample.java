package com.yudong80.java.ch07;

import java.util.UUID;

public class UUIDExample {
	public static void main(String[] args) {
		//1. UUID 생성하기 
		UUID[] uuids = {
			UUID.randomUUID(),
			UUID.randomUUID(),
			UUID.randomUUID()
		};
				
		for (UUID id : uuids) {
			System.out.println("고유식별자: " + id);
		}
	}
}
