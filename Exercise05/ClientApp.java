package javacode;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Student s1,s2,s3,s4,s5; 
				s1=new Student("Prachi", 01);
				Course[] s1_courses = {new Course("cs106","Object Oriented Programmings",3,52.0), new Course("cs101","Data Structure & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s1.courses=s1_courses;
				
				s2=new Student("Akash", 02);
				Course[] s2_courses = {new Course("cs106","Object Oriented Programmings",3,52.0), new Course("cs101","Data Structure & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s2.courses=s2_courses;
				
				s3=new Student("Samir", 03);
				Course[] s3_courses = {new Course("cs106","Object Oriented Programmings",3,52.0), new Course("cs101","Data Structure & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s3.courses=s3_courses;
				
				s4=new Student("Meena", 04);
				Course[] s4_courses = {new Course("cs106","Object Oriented Programmings",3,52.0), new Course("cs101","Data Structure & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s4.courses=s4_courses;
				
				s5=new Student("Kanchal", 05);
				Course[] s5_courses = {new Course("cs106","Object Oriented Programmings",3,52.0), new Course("cs101","Data Structure & Algorithms",3,52.0), new Course("cs103","Operating System",3,52.0)};
				s5.courses=s5_courses;
				
				Student[] studentList = {s1,s2,s3,s4,s5};
				
				StudentBatch batch = new StudentBatch();
			    batch.students = studentList;
				
				RuleEngine.generateResult(batch);
				
				batch.printResult();


	}

}
