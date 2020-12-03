package com.yedam.address;

public class Friend {
	private String name; //필드
	private String phone;
	
	public Friend(String name, String phone) { //생성자
		this.name = name;
		this.phone = phone;
	}
     //Getter, Setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void showFriendInfo() {
		System.out.println("이름: " +this.name + ", 연락처: " +this.phone);
	}
    
}
