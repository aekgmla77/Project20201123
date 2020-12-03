package com.ydm.db2;

import java.util.List;

public class EmpServiceImpl implements EmpService {
	
	EmpDAO dao = new EmpDAO(); //이 변수를 통해 처리를 함.

	@Override
	public List getEmpList() {
		return dao.getEmpList();
	}

	@Override
	public EmployeeVO getEmp(int empId) {
		return dao.getEmp(empId);
	}

	@Override
	public void inserEmp(EmployeeVO empVO) {
		dao.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmployeeVO empVO) {
		dao.updateEmp(empVO);
	}

	@Override
	public void deleteEmp(int empId) {
		dao.deleteEmp(empId);
	}

	@Override
	public List<EmployeeVO> getDeptList(String dept) {
		return dao.getDeptList(dept);
	}
	

}
