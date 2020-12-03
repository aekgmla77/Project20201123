package com.yedam.interfaces;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");

			}
		};
		action.work(); // 인터페이스 action

		action = new Action() {

			@Override
			public void work() {
				System.out.println("운전을 합니다.");
			}
		};
		action.work();

		action = () -> {
			System.out.println("운전을 합니다.");

		};
		action.work(); // 운전
		
	}
}
