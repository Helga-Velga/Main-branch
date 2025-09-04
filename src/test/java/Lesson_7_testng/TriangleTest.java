package Lesson_7_testng;

import Lesson_7_Install.Triangle;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void testCalculateArea_positiveValues() {
        assertEquals(Triangle.calculateArea(4, 5), 10.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateArea_zeroBase() {
        Triangle.calculateArea(0, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateArea_negativeHeight() {
        Triangle.calculateArea(4, -5);
    }

    @Test
    public void testCalculateArea_decimalValues() {
        assertEquals(Triangle.calculateArea(2.5, 3.0), 3.75, 0.001);
    }
}