package javacode;

public class StudentBatch {
	Student[] students;
	public StudentBatch() {
		students = new Student[5];
	}
	public void printResult() {
		for(Integer i = 0; i < (students.length); i++) {
		System.out.println("Roll no. : "+Student.rollno + "Pass");
		}
	
	}

}
