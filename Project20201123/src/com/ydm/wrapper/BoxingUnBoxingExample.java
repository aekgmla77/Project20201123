package com.ydm.wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100); //기본 타입의 값을 줄 경우
		Integer obj2 = new Integer("200"); //문자열을 줄 경우
		Integer obj3 = Integer.valueOf("300");//생성자 사용 안 하는 거.
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
