package Chapter9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest
{

    @Test
    @DisplayName("Determine book type")
    void testDetermineBookType() {
        //Assign
        int pages = 12;
        String expected = "Article";

        //Actual
        Book objBook = new Book();
        String actual = objBook.determineType(pages);

        //Assert
        Assertions.assertAll(() -> assertEquals("No type", objBook.determineType(0)),
                () -> assertEquals("Article", objBook.determineType(1)),
                () -> assertEquals("Article", objBook.determineType(12)),
                () -> assertEquals("Article", objBook.determineType(15)),
                () -> assertEquals("Research Paper", objBook.determineType(16)),
                () -> assertEquals("Research Paper", objBook.determineType(25)),
                () -> assertEquals("Research Paper", objBook.determineType(50)),
                () -> assertEquals("Book", objBook.determineType(51)),
                () -> assertEquals("Book", objBook.determineType(75))
        );
        //assertEquals(expected, actual, "The expected book type is: " + expected);
    }

    @Test
    @DisplayName("Should not create a book with zero pages")
    void shouldNotCreateABookWithZeroPages(){
        int pages = 0;

        assertThrows(IllegalArgumentException.class,
                () -> new Book("200500", "Think Like A Monk", pages));
    }
}