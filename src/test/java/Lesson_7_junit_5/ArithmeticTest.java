package Lesson_7_junit_5;

import Lesson_7_Install.Arithmetic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticTest {

    @Test
    void testAdd() {
        assertEquals(10, Arithmetic.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(10, Arithmetic.subtract(100, 90));
    }

    @Test
    void testMultiply() {
        assertEquals(10, Arithmetic.multiply(5, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2.5, Arithmetic.divide(5, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Arithmetic.divide(5, 0));
    }
}
