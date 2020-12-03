package com.yedam.string;

public class StringTrimExample {
	public static void main(String[] args) {
		String tel1 = " 02";
		String tel2 = "123 ";
		String tel3 = " 1234 ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim(); //trim은 공백 제거 후 반환해주는 함수.
		System.out.println(tel);
	}
}
