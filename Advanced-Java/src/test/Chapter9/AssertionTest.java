package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {
    @Test
    void testCalculation() {
        //Assign
        int num1 = 4, num2 = 1;
        int expected = 5;
        String name1 = "Dave";
        String name2 = "dave";
        int[] numbers = {5,4,3,2,1};
        int[] numbers2 = {1,2,3,4,5};

        //Actual
        int actual = num1 + num2;

        //Assert
        //assertEquals(expected, actual, "The result should be 5");
        assertTrue(expected == actual);
        //check if two names are equal
        assertEquals(name1,name2);
        //cehck two arrays are equal
        assertEquals(numbers, numbers2);
        //check if two arrays are of the same type
        assertSame(numbers, numbers2);
    }

    @Test
    void multipleAssertions() {
        //Assign
        int num1 = 4, num2 = 1;
        int expected = 5;
        String name1 = "Dave";
        String name2 = "dave";
        int[] numbers = {5,4,3,2,1};
        int[] numbers2 = {1,2,3,4,5};

        //Actual
        int actual = num1 + num2;

        //Assert
        Assertions.assertAll(() -> assertTrue(expected == actual),
                () -> assertEquals(name1,name2),
                () -> assertEquals(numbers, numbers2),
                () -> assertSame(numbers, numbers2)
        );
    }
}
