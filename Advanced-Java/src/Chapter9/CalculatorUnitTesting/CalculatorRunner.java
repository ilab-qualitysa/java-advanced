package Chapter9.CalculatorUnitTesting;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator objCalculator = new Calculator();
        int a = 10, b = 5;

        System.out.println("Sum: " + objCalculator.sum(a, b));
        System.out.println("Product: " + objCalculator.multiply(a, b));
        System.out.println("Difference: " + objCalculator.subtract(a, b));

        try {
            System.out.println("Quotient: " + objCalculator.divide(a, b));
            System.out.println("Division by zero test:");
            System.out.println(objCalculator.divide(a, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
