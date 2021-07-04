package guru.qa.additional;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before 2");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after");
    }

    @Test
    void firstTest() {
        System.out.println("test 1");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("test 2");
        Assertions.assertTrue(true);
    }
}
