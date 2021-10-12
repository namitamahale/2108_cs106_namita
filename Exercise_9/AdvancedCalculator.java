package exercise_9;

class Calculator {
    int add(int num1 , int num2)
    {
        return num1 + num2;
    }
    
    int sub(int num1 , int num2)
    {
        return num1 - num2;
    }
}

public class AdvancedCalculator extends Calculator {
    int mult(int num1 , int num2)
    {
        return num1 * num2;
    }
    
    int div(int num1 , int num2)
    {
        return num1 / num2;
    }

    
}