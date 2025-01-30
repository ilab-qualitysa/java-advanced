import org.junit.jupiter.api.*;

public class AnnotationTest {
    @Test
    void justNormalTestMethod(){
        System.out.println("@Test - Just a normal tes method");
    }

    @BeforeAll
    static void beforeEverythingElse(){
        System.out.println("@BeforeAll - before any test method can be executed");
    }

    @BeforeEach
    void beforeEachMethod() {
        System.out.println("@BeforeEach - executed before each test method");
    }

    @AfterEach
    void afterEachMethod() {
        System.out.println("@AfterEach - executed after each test method");
    }

    @AfterAll
    static void afterAllMethod() {
        System.out.println("@AfterAll - executed after all the test methods");
    }

    @Test
    void anotherTestMethod() {
        System.out.println("@Test - Another normal test method");
    }

    @Test
    void lastNormalTestMethod() {
        System.out.println("@Test - one last test method (normal)");
    }
}
