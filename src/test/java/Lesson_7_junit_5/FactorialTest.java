package Lesson_7_junit_5;

import Lesson_7_Install.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    void testCalculateFactorial_positiveNumber() {
        assertEquals(120, Factorial.calculateFactorial(5));
    }

    @Test
    void testCalculateFactorial_positiveNumber_fail() { //это проверка, что в консоль упадет текст ошибки
        assertEquals(120, Factorial.calculateFactorial(-1));
    }

    @Test
    void testCalculateFactorial_zero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    void testCalculateFactorial_negativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-1));
    }
}