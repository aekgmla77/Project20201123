package com.yedam;

public class Car { //속성 = field, car = 객체
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//Constructor
	public Car(){ // 생성자 여러개 가능. 동일한 패키지 안에서 허용. 생성자는 값을 초기화 한다.
		
	}
	public Car(String company){
		this.company = company;
	}
	public Car(String company, String model){
		this.company = company;
		this.model = model;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//Method(get, set) > 기능을 담당.
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
