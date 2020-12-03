package com.ydm.db2;

import java.util.List;

public interface EmpService {
	public List getEmpList();
	public EmployeeVO getEmp(int empId); //empId는 변수. 임의로 지정 가능. 한 건 조회.
	public void inserEmp(EmployeeVO empVO); //한 건 입력
	public void updateEmp(EmployeeVO empVO); //수정
	public void deleteEmp(int empId); //삭제
	public List<EmployeeVO> getDeptList(String dept);
	//IT, Purchasing, Shipping

}
