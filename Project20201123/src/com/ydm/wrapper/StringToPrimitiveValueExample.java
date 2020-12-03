package com.ydm.wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); //parse + 기본타입 명으로 된 정적 메소드. 문자열을 매개값으로 받아 기본 타입으로 변환.
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	}

}
