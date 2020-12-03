package com.yedam;

public class Student { //학교, 전공, 학생번호, 이름
	private String shcool;
	private String sname;
	private String snumber; //15-1234
	private String major;//history or ..
	
	public Student() {
	}
	
	public Student(String shcool, String snumber) {
		super();
		this.shcool = shcool;
		this.snumber = snumber;
		
	}
	public Student(String shcool, String sname, String snumber, String major) {
		super();
		this.shcool = shcool;
		this.sname = sname;
		this.snumber = snumber;
		this.major = major;
	}
	
	public void showStudentInfo() {
		System.out.println("학교: " + shcool + " " + "이름: " + sname + " " + "번호: " +snumber );
	}

	public String getShcool() {
		return shcool;
	}
	//method
	public void setShcool(String shcool) {
		this.shcool = shcool;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
