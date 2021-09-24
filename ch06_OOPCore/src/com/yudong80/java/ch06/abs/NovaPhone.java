package com.yudong80.java.ch06.abs;

public class NovaPhone extends Phone{

	private static final String NOVA_PREFIX = "NOVA:";
	private static final String[] REGION_CODES = {
			"010",
			"011",
			"012",
			"016,"
	};
	
	public NovaPhone(String phoneNo, String modelNo) {
		super(phoneNo, modelNo);
		System.out.println(modelNo + "(" + phoneNo + ") 가 생성되었습니다 [미개통]");
	}

	@Override
	boolean validate(String serialNo) {
		if (serialNo == null) {
			System.out.println("일련 번호가 비어 있습니다. 개통 실패!");
			return false;
		}
		
		if (serialNo.startsWith(NOVA_PREFIX)) {
			super.isValid = true;
			System.out.println(serialNo + "가 개통 되었습니다.");
			return true;
		}
		
		System.out.println("개통이 실패하였습니다.");
		return false;
	}

	@Override
	boolean call(String phoneNo) {
		if (phoneNo == null) {
			System.out.println("전화 번호가 비어 있습니다. 통화 실패!");
			return false;
		}
		
		for (String code : REGION_CODES) {
			if(phoneNo.startsWith(code)) {
				System.out.println(phoneNo + "로 통화 성공하였습니다.");
				return true;
			}
		}
		
		System.out.println("지역 코드가 맞지 않습니다.");
		return false;
	}
}



