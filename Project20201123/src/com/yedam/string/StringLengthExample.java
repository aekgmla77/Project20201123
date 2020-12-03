package com.yedam.string;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "9306241530123";
		int length = ssn.length(); // 자릿수 세는 거.
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
