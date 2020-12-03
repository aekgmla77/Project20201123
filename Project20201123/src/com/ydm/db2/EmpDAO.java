package com.ydm.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.ydm.common.DAO;

public class EmpDAO {
	private static final int EmployeeVO = 0;
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 전체조회
	public List getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				vo.setEmail(rs.getString("email"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1  where employee_id = ?";
		EmployeeVO vo = new EmployeeVO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;
	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		String sql = "insert into emp1(employee_id, first_name, last_name, email, hire_date, job_id) values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getEmployeeId());
			pstmt.setString(2, vo.getFirstName());
			pstmt.setString(3, vo.getLastName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getHireDate());
			pstmt.setString(6, vo.getJobId());
			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		if (vo.getSalary() != 0) { // 0은 임의의 값.
			sql = "update emp1 " //
					+ "set email = nvl('" + vo.getEmail() + "', email)" // string 타입이라 '" 붙여줌.
					+ ",phone_number = nvl('" + vo.getPhoneNumber() + "', phone_number)" + ",salary = nvl("
					+ vo.getSalary() + ", salary)" + "where employee_id = " + vo.getEmployeeId();
		} else {
			sql = "update emp1 " //
					+ "set email = nvl('" + vo.getEmail() + "', email)" // string 타입이라 '" 붙여줌.
					+ ",phone_number = nvl('" + vo.getPhoneNumber() + "', phone_number)" + ",salary = nvl("
					+ vo.getSalary() + ", salary)" + "where employee_id = " + vo.getEmployeeId();
		}
		System.out.println(sql);
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql); // sql 구문을 실행해달라고 뭘 만들어 달라는 명령문.

			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 예외가 있어도 실행한다.
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 한건삭제
	public void deleteEmp(int empId) {
		conn = DAO.getConnection();
		String sql = "delete from emp1 where employee_id = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 부서 한 건 조회
	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "select e.* from emp1 e, departments d where e.department_id = d.department_id and d.department_name = ?";
		List<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
}
