package com.yedam.address;

import java.util.Scanner;

public class FriendAddress {
	// 주소록 생성 프로그램
//	public static void main(String[] args) {
	static Scanner scn = new Scanner(System.in);
	static Friend[] friends = new Friend[100];

	public static void main(String[] args) {

		while (true) {
			System.out.println("--------------------");
			System.out.println("1.친구등록 2.학교친구 3.회사친구 4.전체리스트 5.번호검색 6.종료");
			System.out.println("--------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt(); scn.nextLine();

			if (selectNo == 1) {
				addFreind();

			} else if (selectNo == 2) {
				addUnivFriend();

			} else if (selectNo == 3) {
				addCompFriend();

			} else if (selectNo == 4) {
				showFriendList();

			} else if (selectNo == 5) {
				serchFriend();

			} else if (selectNo == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}// end of main

	// 1.친구등록. 메소드 분리.
	public static void addFreind() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		Friend frnd = new Friend(name, phone);
		insertFriend(frnd);
	}

	// 2.학교친구
	public static void addUnivFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("학교이름: ");
		String univ = scn.nextLine();
		System.out.println("전공정보: ");
		String major = scn.nextLine();
		UnivFriend frnd = new UnivFriend(name, phone);
		frnd.setUniv(univ);
		frnd.setMajor(major);
		insertFriend(frnd);
	}

	// 3.회사친구.
	public static void addCompFriend() {
		System.out.println("친구이름: ");
		String name = scn.nextLine();
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		System.out.println("회사이름: ");
		String company = scn.nextLine();
		System.out.println("부서정보: ");
		String department = scn.nextLine();
		CompFriend frnd = new CompFriend(name, phone);
		frnd.setCompany(company);
		frnd.setDepartment(department);
		insertFriend(frnd);
	}

	// 4.리스트
	public static void showFriendList() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].showFriendInfo();
			}
		}
	}

	// 5.번호조회
	public static void serchFriend() {
		System.out.println("전화번호: ");
		String phone = scn.nextLine();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && phone.equals(friends[i].getPhone())) {
				friends[i].showFriendInfo();
				break;
			}
		}
	}
	
	//7.한 건 입력
	public static void insertFriend(Friend ffd) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = ffd;
				break;
			}
		}
	}
}// end of class.
