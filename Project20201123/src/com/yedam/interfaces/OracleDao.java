package com.yedam.interfaces;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 입력");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}

	@Override
	public void delete() {
	System.out.println("Oracle DB에서 삭제");
	}

}
