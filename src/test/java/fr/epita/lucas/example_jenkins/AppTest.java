package fr.epita.lucas.example_jenkins;

import org.junit.jupiter.api.*;

class AppTest {

    public Number n;

    @BeforeEach
    public void setUp() {
        n = new Number();
    }

    @DisplayName("Test with 1")
    @Test
    public void testPositive() {
        String Number = n.play(1);
        Assertions.assertEquals(Number, "Positive");
    }

    @DisplayName("Test with -1")
    @Test
    public void testNegative() {
        String Number = n.play(-1);
        Assertions.assertEquals(Number, "Negative");
    }


    @DisplayName("Don't Play Number with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> n.play(0));
    }

    @AfterEach
    public void tearDown() {
        n = null;
    }

}