package com.yedam;

import java.util.Scanner;

public class ObjectExample {
	public static void main(String[] args) {
		System.out.println("Hello"); //java.lang 밑에 있는 패키지는 import 안 해도 됨.
//		Scanner scn; // lang 외에 있는 건 import 해줘야 됨.
	    
		Object o1 = new Object();
		boolean sameOrDiff = o1.equals("Hello");
		System.out.println(sameOrDiff);
		
		System.out.println(o1.toString()); //주소가 출력됨. 객체가 가진 정보나 값을 문자열로 만들어 리턴하는 메소드.
	}
}
