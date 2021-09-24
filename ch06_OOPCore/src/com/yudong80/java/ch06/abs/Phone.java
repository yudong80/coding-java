package com.yudong80.java.ch06.abs;

abstract public class Phone {

	private String phoneNo;
	private String modelNo;
	protected boolean isValid;
	
	public Phone(String phoneNo, String modelNo) {
		this.phoneNo = phoneNo;
		this.modelNo = modelNo;
	}
	
	/** 
	 * 폰을 개통하려면 통신사 고유의 일련 번호를 넣어야 합니다.
	 * @param serialNo 고유 일련 번호
	 * @return 개통 여부 
	 */
	abstract boolean validate(String serialNo);
	
	/** 
	 * 전화를 겁니다 
	 * @param phoneNo
	 * @return 통화 성공 여부
	 */
	abstract boolean call(String phoneNo);
	
	public String getPhoneNumber() {
		return phoneNo;
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
	public boolean isValid() {
		return isValid;
	}
}