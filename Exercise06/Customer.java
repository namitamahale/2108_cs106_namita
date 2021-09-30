package exercise_6;

public class Customer extends User {

	Integer loyaltyNumber;
	
	public Customer() {
	
	}

	public Customer(String name, Integer loyaltyNumber) {
		super(name);
		this.loyaltyNumber = loyaltyNumber;
	}
}
