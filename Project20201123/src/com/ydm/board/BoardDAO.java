package com.ydm.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ydm.common.DAO;

public class BoardDAO {
	private static final int BoardVO = 0;
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 리스트
	public List getBarList() {
		conn = DAO.getConnection();
		sql = "select * from board order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vi = new BoardVO();
				vi.setBoardNo(rs.getInt("board_no"));
				vi.setTitle(rs.getString("title"));
				vi.setContent(rs.getString("content"));
				vi.setWriter(rs.getString("writer"));
				vi.setCreation_date(rs.getString("creation_date"));
				list.add(vi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 상세화면
	public BoardVO getBar(int barNo) {
		conn = DAO.getConnection();
		sql = "select * from board where board_no = ?";
		BoardVO vi = new BoardVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, barNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vi.setBoardNo(rs.getInt("board_no"));
				vi.setTitle(rs.getString("title"));
				vi.setContent(rs.getString("content"));
				vi.setWriter(rs.getString("writer"));
				vi.setCreation_date(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vi;

	}

	// 등록
	public void insertBar(BoardVO vi) {
		conn = DAO.getConnection();
		String sql = "insert into board(board_no, title, content, writer, creation_date) values(?,?,?,?, sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vi.getBoardNo());
			pstmt.setString(2, vi.getTitle());
			pstmt.setString(3, vi.getContent());
			pstmt.setString(4, vi.getWriter());
//			pstmt.setString(5, vi.getCreationDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 삭제
	public void deleteBar(int barNo) {
		conn = DAO.getConnection();
		String sql = "delete from board where board_no = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, barNo);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 수정
	public void updateBar(BoardVO vi) {
			sql = "update board " + "set title = ?" + ",content = ?" +  " where board_no = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vi.getTitle());
			pstmt.setString(2, vi.getContent());
			pstmt.setInt(3, vi.getBoardNo());
			
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
