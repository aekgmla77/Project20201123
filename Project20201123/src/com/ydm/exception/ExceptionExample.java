package com.ydm.exception;

import java.sql.Connection;
import java.sql.SQLException;

import com.ydm.common.DAO;

public class ExceptionExample {
	public static void main(String[] args) {
		int num = 20;
		
		try {
			int [] numbers = new int[3];
			numbers[3] = 10;
		} catch (Exception e) {
			System.out.println("에러발생.");
			e.printStackTrace();
		}
		try {
		String str = null;
		System.out.println(str.toString());
		} catch (Exception e) {
			System.out.println("출력값이 없습니다.");
		}
		Connection conn = DAO.getConnection();
		
		try {
			conn.close(); //예외처리 필수.
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}

}
