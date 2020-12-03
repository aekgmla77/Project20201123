package com.yedam.abstracts;

public class DmbPhone extends Phone {

	@Override
	public void ring() {
		System.out.println("DMB폰 벨...");	
	}

	@Override //부모가 가진 걸 재정의 해서 쓴다는 뜻.
	public void turnOff() {
		
	}
}
