package com.yedam.string;

public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10); //기본 타입 값을 문자열로 변환. String 타입이라 숫자는 반환 x인데 
		String str2 = String.valueOf(10.5);//valueOf로 가능.
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
