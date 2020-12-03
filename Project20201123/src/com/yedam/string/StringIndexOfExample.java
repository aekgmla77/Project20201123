package com.yedam.string;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 프로그래밍 시작하는 단어 몇번째인지 출력.
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) { // subject에 자바가 포함되어 있어서 첫번째가 출력.
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}
	}

}
