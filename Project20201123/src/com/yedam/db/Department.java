package com.yedam.db;

public class Department {
	private String departmentId;
	private String departmentName;
	private int managerId;
	private int lacationId;
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getLacationId() {
		return lacationId;
	}
	public void setLacationId(int lacationId) {
		this.lacationId = lacationId;
	}
	public void showDepInfo() {
		System.out.println("departmentId " + departmentId +", departementName: " +departmentName + ", managerId: " + managerId + ", locationId: " + lacationId);
	}
	

}
