package exercise_9;

public class ClientApp {

	public static void main(String args[])
    {
        AdvancedCalculator cal = new AdvancedCalculator();
        
        System.out.println( cal.add(5, 2) );
        System.out.println( cal.sub(5, 2) );
        System.out.println( cal.mult(5, 2) );
        System.out.println( cal.div(5, 2) );
    }
}
