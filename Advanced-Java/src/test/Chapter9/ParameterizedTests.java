package Chapter9;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ParameterizedTests {
    @ParameterizedTest(name = "Execution: {index} - Number: {arguments}")
    @ValueSource(ints = {15,18,26,41,38})
    void checkForEvenNumbers(int num) {
        assertEquals(0, (num % 2), "(" + num + ") is not an even number!");
        System.out.println("num = " + num);
    }

    @ParameterizedTest(name = "Execution: {index} - Word: {arguments}")
    @ValueSource(strings = {"mom", "dad", "moon", "civic","nine","level","madam","taco cat"})
    void checkForPalindrome(String words) {
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words, sb.toString());

    }

    @ParameterizedTest
    @CsvSource(value = {"Jessica,36,1.71,true","Roger,39,1.81,true","Boitumelo,25,1.69,false"})
    //name, age, height, isMarried
    void testMultipleDataTypes(String name, int age, double height, boolean isMarried) {
        assertTrue(isMarried,name + " is not married yet");
        //System.out.println("name = " + name + ", age = " + age + ", height = " + height + ", isMarried = " + isMarried);
    }

    @ParameterizedTest
    @CsvSource(value = {"200500,Think Like A Monk,75","300500,Java Fundamentals,25","400500,Agile Methology,25","500500,Rich dad poor dad,12"})
    void createMultipleBookObjects(String isbn, String title, int pages) {
        Book objBook = new Book(isbn,title,pages);
        System.out.println("isbn = " + isbn + ", title = " + title + ", pages = " + pages);
        System.out.println(objBook.determineType(pages));
    }

    @ParameterizedTest
    @MethodSource("palindromes")
    @DisplayName("Test for Palindromes")
    void testForPalindromeFromMethod(String words) {
        StringBuilder sb = new StringBuilder(words);
        sb.reverse();
        assertEquals(words, sb.toString());
    }

    List<Integer> numbers() {
        return new ArrayList<>(List.of(15,41,76,34,1));
    }

    List<String> palindromes() {
        return new ArrayList<>(List.of("mom", "dad", "moon", "civic","nine","level","madam","taco cat"));
    }

    @ParameterizedTest
    @MethodSource
    void numbers(int number) {
        System.out.println("number = " + number);
    }

    Stream<Arguments> streamOfMultipleTypes() {
        return Stream.of(Arguments.arguments("Jessica",36,1.17,true),
                Arguments.arguments("Mike",46,1.71,true),
                Arguments.arguments("Jenny",25,1.78,true),
                Arguments.arguments("James",27,1.81,true),
                Arguments.arguments("Refiloe", 37,1.88,false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void streamOfMultipleTypes(String name, int age, double height, boolean isMarried) {
        System.out.println("name = " + name + ", age = " + age + ", height = " + height + ", isMarried = " + isMarried);
    }

    @ParameterizedTest(name = "Execution [{index}] - Title: {arguments}")
    @MethodSource("Chapter9.BookBank#books")
    void testIfBookContainsMoney(String book) {
        assertTrue(book.contains("Money"),"[" + book + "] Does not contain the word 'Money'");
    }

    @ParameterizedTest(name = "[{index}] - {0} is a {2}")
    @CsvFileSource(files = "src/test/resource/SuperStars.csv",numLinesToSkip = 1)
    void testForMarriedPesonnel(String name, int age, String career, double height, String nationality, boolean isMarried) {
        assertTrue(isMarried, name + "is not married yet");
    }

    //9.3 page 39
}
