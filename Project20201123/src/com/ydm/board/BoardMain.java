package com.ydm.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		//1.리스트 2.상세화면 3.등록 4.삭제 5.수정
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImpl();
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.리스트 2.상세화면 3.등록 4.삭제 5.수정 6.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				List list = service.getBarList();
				for(Object vi : list) {
					BoardVO bar = (BoardVO) vi;
					bar.showBorInfo();
				}
				
			} else if(selectNo == 2) {
				System.out.println("조회할 회원번호 입력: ");
				int barNo = scn.nextInt();
				BoardVO vi = service.getBar(barNo);
				vi.showBorInfo();
				
			} else if(selectNo == 3) {
				
				System.out.println("글 번호를 입력하세요.");
				int boardNo = scn.nextInt(); scn.nextLine();
				System.out.println("제목을 입력하세요.");
				String title = scn.nextLine();
				System.out.println("내용을 입력하세요.");
				String content = scn.nextLine();
				System.out.println("작성자 이름을 입력하세요.");
				String writer = scn.nextLine();
				
				BoardVO vi = new BoardVO();
				vi.setBoardNo(boardNo);
				vi.setTitle(title);
				vi.setContent(content);
				vi.setWriter(writer);
				
				service.inserBar(vi);
				
			} else if(selectNo == 4) {
				System.out.println("삭제할 글 번호: ");
				int barNo = scn.nextInt();
				BoardVO vi = service.getBar(barNo);
				
				vi.setBoardNo(barNo);
				service.deleteBar(barNo);
				
			} else if(selectNo == 5) {
				System.out.println("수정할 글 번호: ");
				int barNo = scn.nextInt();scn.nextLine();
				System.out.println("수정할 글 제목: ");
				String title = scn.nextLine();
				System.out.println("수정할 내용");
				String content = scn.nextLine();

				
				BoardVO vi = new BoardVO();
				vi.setTitle(title);
				vi.setContent(content);
				vi.setBoardNo(barNo);
				
				service.updateBar(vi);
				
			} else if(selectNo == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
