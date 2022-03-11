package org.college;


public class Student extends Department {
	public void studentName() {
		System.out.println("Logesh");
		}
	public void studentDept() {
		System.out.println("cse");
		}
	public void studentId() {
		System.out.println("347");
	}
public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();


	}

}
