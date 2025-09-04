package Lesson_7_testng;

import Lesson_7_Install.Arithmetic;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticTest {
    @Test
    public void testAdd() {
        assertEquals(Arithmetic.add(10, 10), 20);
    }

    @Test
    public void testSubtract() {
        assertEquals(Arithmetic.subtract(10, 9), 1);
    }

    @Test
    public void testMultiply() {
        assertEquals(Arithmetic.multiply(5, 5), 25);
    }

    @Test
    public void testDivide() {
        assertEquals(Arithmetic.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Arithmetic.divide(5, 0);
    }

    @Test
    public void testDivide_negativeNumbers() {
        assertEquals(Arithmetic.divide(-10, 2), -5.0);
    }
}