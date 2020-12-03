package com.ydm.wrapper;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 선택번호

		int[] selectNumber = new int[6]; //선택 번호 6개가 저장될 배열 생성
		Random random = new Random(3);
		System.out.println("선택 번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1; //선택 번호 배열에 저장.
			System.out.println(selectNumber[i] + " ");
		}
		System.out.println();

		// 당첨번호
		int[] WinningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨 번호: ");
		for (int i = 0; i < 6; i++) {
			WinningNumber[i] = random.nextInt(45) + 1;
			System.out.println(WinningNumber[i] + " ");
		}
		System.out.println();

		// 당첨여부

		Arrays.sort(selectNumber);
		Arrays.sort(WinningNumber);
		boolean result = Arrays.equals(selectNumber, WinningNumber);
		System.out.println("당첨 여부: ");
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
