package com.yedam;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setShcool("예담3");
		s1.setSnumber("15-4567");
		s1.setSname("홍길동이");
		s1.setMajor("history");

		Student s2 = new Student("예담", "15-1234");
		s2.setSname("김김이");

		Student s3 = new Student("예담2", "홍길동", "15-4678", "English");
		s3.showStudentInfo();

		System.out.println("---------------");
		Student[] Students = { s1, s2, s3 };
		for (Student student : Students) {
			if ("예담".equals(student.getShcool())) {
				System.out.println(student.getShcool());
				System.out.println(student.getSname());
			}
		}
	}
}
