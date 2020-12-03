package com.yedam.address;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	public UnivFriend(String name, String phone) {
		super(name, phone);
		//source - constructor from superclass
		
	}
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void showFriendInfo() {
//		super.showFriendInfo();
	
	//source - override
	System.out.println("이름: " + super.getName() + ", 연락처: " 
	                  +super.getPhone() + ", 학교: " + 
			          this.univ + ", 전공: " + this.major);
	
	}
}
