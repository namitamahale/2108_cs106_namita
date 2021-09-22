package javacode;


public class Course {
	String code;
	Integer credits;
	double marks;
	String courseName;
	
	public Course() {
		
	}
	public Course(String code, String courseName,  Integer credits, double marks) {
		this.code = code;
		this.credits =  credits;
		this.marks = marks;
		this.courseName = courseName;
	}


}
