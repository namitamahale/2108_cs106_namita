package exercise_6;

public abstract class User {
	String name;

	public User() {	
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}

}
