package Chapter9;
// JUnit test class for Calculator
import Chapter9.CalculatorUnitTesting.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator objCalculator = new Calculator();
    int a = 10, b = 5;
    int expectedSum = 15;
    int expectedDifference = 5;
    int expectedProduct = 50;
    int expectedQuotient = 2;
    @Test
    @DisplayName("The Sum of the two numbers")
    void testSum() {
        assertEquals(expectedSum, objCalculator.sum(a, b), "The sum of " + a + " + " + b + " = " + expectedSum);
        assertEquals(0, objCalculator.sum(-5, 5));
    }

    @Test
    @DisplayName("The Product of the two numbers")
    void testMultiply() {
        assertEquals(expectedProduct, objCalculator.multiply(a, b), "The product of " + a + " * " + b + " = " + expectedProduct);
        assertEquals(0, objCalculator.multiply(0, 5));
    }

    @Test
    @DisplayName("The Difference of the two numbers")
    void testSubtract() {
        assertEquals(expectedDifference, objCalculator.subtract(a, b),"The difference of " + a + " - " + b + " = " + expectedDifference);
        assertEquals(-10, objCalculator.subtract(5, 15));
    }

    @Test
    @DisplayName("The Quotient of the two numbers")
    void testDivide() {
        assertEquals(expectedQuotient, objCalculator.divide(a, b),"The quotient of " + a + " / " + b + " = " + expectedQuotient);
        assertThrows(IllegalArgumentException.class, () -> objCalculator.divide(10, 0));
    }
}
