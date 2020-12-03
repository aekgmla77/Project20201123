package com.yedam.abstracts;

public abstract class Phone { //추상 메소드 abstract
	public String owner;
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}
	public abstract void ring(); //상속받는 자식들은 무조건 구현해야 한다.
	public abstract void turnOff();

}
