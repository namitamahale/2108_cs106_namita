package exercise_9;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
    
		double a, b;
		
        String op;
    
    Scanner c = new Scanner(System.in);
    
    System.out.println(" --SIMPLE CALCULATOR-- "+"\n");
    
    System.out.println("Enter first number");
    a = c.nextDouble();
    
    System.out.println("Enter second number");
    b = c.nextDouble();
    
    System.out.println("Enter your choice operation (add,sub,multi,div) ");
    op = c.next();
    
    switch (op)  {
    
    case "add":
    	System.out.println("Addition of " + a +" and "+ b +"\n");
        System.out.println("Your sum is = " + (a + b));
        break;
    
    case "sub":
    	System.out.println("Subtraction of " + a +" and "+ b +"\n");
        System.out.println("Your difference is = " + (a - b));
        break;
    
    case "multi":
    	System.out.println("Multiplication of " + a +" and "+ b+"\n");
        System.out.println("Your product is = " + (a * b));
        break;
    
    case "div":
    	System.out.println("Division of " + a +" and "+ b +"\n");
        System.out.println("Your Quotient is = " + (a/ b));
        break;
    
    default:
        System.out.println("Sorry This Operation Can't Be Performed.");

    }
}
}