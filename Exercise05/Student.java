package javacode;

public class Student {
	String name;
	static Integer rollno;
	Boolean isPass;
	Course[] courses;
	
	public Student() {
		name = "";
		rollno = 0;
		courses = new Course[3];
		
	}
	public Student(String name, Integer rollno) {
		this.name = name;
		this.rollno = rollno;
		courses = new Course[3];
		
	}

}
