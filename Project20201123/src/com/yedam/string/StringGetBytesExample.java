package com.yedam.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕히가세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String" + str1);

		try {

			byte[] bytes2 = str.getBytes("EUC-KR"); // 한글을 3바이트로 만들어준다.
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes -> String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8"); // 한글을 2바이트로 만들어준다.
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes -> String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
