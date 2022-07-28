package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name is Padma");
	}
	public void studentDept() {
		System.out.println("Student dept is IT");
	}
	public void studentID() {
		System.out.println("Student ID is 11208205063");
	}
	

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collgeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentID();

	}

}
