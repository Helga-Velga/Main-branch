package Lesson_7_junit_5;

import Lesson_7_Install.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    @Test
    void testCalculateArea_positiveValues() {
        assertEquals(10, Triangle.calculateArea(4, 5));
    }

    @Test
    void testCalculateArea_zeroBase() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(0, 5));
    }

    @Test
    void testCalculateArea_negativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.calculateArea(4, -5));
    }
    @Test
    void testCalculateArea_negative() { //проверка, что тест упадет и покажет сообщение с ошибкой
        assertEquals(10, Triangle.calculateArea(4, -5));
    }
}