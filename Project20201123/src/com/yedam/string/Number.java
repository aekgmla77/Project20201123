package com.yedam.string;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = 0;

		System.out.println("첫번째 숫자: ");
		int num = scn.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = scn.nextInt();
		System.out.println("세번째 숫자: ");
		int num3 = scn.nextInt();
		int numbers[] = { num, num2, num3 };
//		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if (num < num2) {
				if (num < num3) {
					System.out.println(number = num);
				} else {
					System.out.println(number = num3);
				}
				if (num2 < num) {
					if (num2 < num3) {
						System.out.println(number = num2);
					} else {
						System.out.println(number = num3);
					}
					if (num3 < num) {
						if (num3 < num2) {
							System.out.println(number = num3);
						} else {
							System.out.println(number = num2);
						}
					}
//					System.out.println("오름차순: " + num, num2, num3);
					
				}

			}//System.out.printf("%3d", number[i]); // s는 문자, d는 숫자.

		}
		
	}
}
