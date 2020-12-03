package com.yedam.Arrays;

import java.util.Arrays; //복사

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2)); //tostring 은 객체가 가진 값을 문자열로 리턴해줌.
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); //copyOfrange (원본배열, 시작, 끝)
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);//arrycopy(원본, 시작위치, 타겟, 시작, 복사갯수)
		for(int i = 0; i < arr4.length; i ++) {
			System.out.println("arr4[" + i + "]=" + arr4[i]);
		}
	}

}
