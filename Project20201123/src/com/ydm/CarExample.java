package com.ydm;

import com.yedam.Car;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car(); // 다른 패키지에서는 불러올 수 없음. 접근 불가. ctrl+shift+o > import
		
		Car c2 = new Car("현대"); // 에러가 뜨면 클래스에 가서 public으로 바꿔줌.
		
		Car c3 = new Car("삼성", "SM5");//다른 패키지라도 public이면 생성자 가능.
	}
}
