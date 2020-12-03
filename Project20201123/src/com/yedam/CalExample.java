package com.yedam;

public class CalExample {
	public static void main(String[] args) {
//		Calculator c1 = new Calculator();
//		c1.setColor("white");
//		c1.plus(3,5);
		
		int result = Calculator.plus(3, 5);//static이 붙어서 인스턴스 안 만들고 클래스명 뒤에 붙어서 사용 가능.
		System.out.println(Calculator.pi); //static으로 만들어서 바로 사용.
		System.out.println(result);
		result = Calculator.minus(10, 5); 
		System.out.println(result);
//		CalExample ce1 = new CalExample();
//   	result = ce1.sum(3, 5);
		result = CalExample.sum(8, 5);
		System.out.println(result);
	}
	public static int sum(int a, int b) {
		return a + b;
	}
	
}
