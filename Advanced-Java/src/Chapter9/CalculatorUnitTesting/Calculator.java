package Chapter9.CalculatorUnitTesting;

/**
 * The Class contains methods for calculations
 */
public class Calculator {

    /**
     * Method Calculates the sum of the two integers
     * @param a The first parameter received by the method
     * @param b The second parameter received by the method
     * @return The sum of the two Integers received
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Method Calculates the product of the two integers
     * @param a The first parameter received by the method
     * @param b The second parameter received by the method
     * @return The product of the two Integers received
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Method Calculates the difference of the two integers
     * @param a The first Integer parameter received by the method
     * @param b The second Integer parameter received by the method
     * @return The difference of the two Integers received
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Method Calculates the division of two integers
     * Throws an IllegalArgumentException for divide by zero
     * @param a The first Integer parameter received by the method
     * @param b The second Integer parameter received by the method
     * @return The quotient of the two Integers received
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
