package com.ydm.db2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.db.Department;
import com.yedam.db.EmpDAO;
import com.yedam.db.Employee;

public class EmpMain {
	public static void main(String[] args) {
		// 1.전체조회, 2.한건조회, 3.입력, 4.수정, 5.삭제
		Scanner scn = new Scanner(System.in);
		EmpService service = new EmpServiceImpl();

		while (true) {

			System.out.println("---------------------");
			System.out.println("1.전체조회 2.검색 3.입력 4.수정 5.삭제 6.종료 7.부서별 조회");
			System.out.println("---------------------");
			System.out.println("선택> ");
			int selectNO = scn.nextInt();
			scn.nextLine();

			if (selectNO == 1) {
//				service.getEmpList(); //메인기능. 리스트 조회. 구현하는 건 empserviceimpl 클래스임.
				List list = service.getEmpList();
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}

			} else if (selectNO == 2) {
				System.out.println("조회할 사원번호 입력: ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);
				vo.showEmpInfo();

//				service.getEmp(empId);

			} else if (selectNO == 3) {

				System.out.println("사원번호를 입력하세요.");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("성을 입력하세요.");
				String fristName = scn.nextLine();
				System.out.println("이름을 입력하세요.");
				String lastName = scn.nextLine();
				System.out.println("이메일을 입력하세요.");
				String email = scn.nextLine();
				System.out.println("입사일을 입력하세요.");
				String hireDate = scn.nextLine();
				System.out.println("직무를 입력하세요.");
				String jobId = scn.nextLine();

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setFirstName(fristName);
				vo.setLastName(lastName);
				vo.setEmail(email);
				vo.setHireDate(hireDate);
				vo.setJobId(jobId);

				service.inserEmp(vo);

			} else if (selectNO == 4) {
				System.out.println("수정할 사원번호: ");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 이메일: ");
				String email = scn.nextLine();
				System.out.println("수정할 전화번호: ");
				String phoneNum = scn.nextLine();
				System.out.println("수정할 급여: ");
				String salary = scn.nextLine();
				if (salary == null || salary.equals(""))
					salary = "0";
				int sal = Integer.parseInt(salary);

				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(empId);
				vo.setEmail(email);
				vo.setPhoneNumber(phoneNum);
				vo.setSalary(sal);

				service.updateEmp(vo);

			} else if (selectNO == 5) {
				System.out.println("삭제할 사원번호: ");
				int empId = scn.nextInt();
				EmployeeVO vo = service.getEmp(empId);

				vo.setEmployeeId(empId);
				service.deleteEmp(empId);
			} else if (selectNO == 6) {
				break;

			} else if (selectNO == 7) {
				scn.nextLine();
				System.out.println("조회할 부서이름: ");
				String dept = scn.nextLine();
				List<EmployeeVO> list = new ArrayList<EmployeeVO>();
				list = service.getDeptList(dept);
				for (Object vo : list) {
					EmployeeVO emp = (EmployeeVO) vo;
					emp.showEmpInfo();
				}
			}
		}
		//System.out.println("프로그램 종료");
	}
}
