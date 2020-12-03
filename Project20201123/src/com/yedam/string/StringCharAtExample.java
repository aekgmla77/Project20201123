package com.yedam.string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-4230123";
		char sex = ssn.charAt(7); // String ssn 숫자 중에서 8번째 숫자를 출력할 때 나오는 값이 남자인지 여자인지.
		switch (sex) { //char은 정수형 타입.
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}

}
