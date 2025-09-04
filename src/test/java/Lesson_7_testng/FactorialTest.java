package Lesson_7_testng;

import Lesson_7_Install.Factorial;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testCalculateFactorial_positiveNumber() {
        assertEquals(Factorial.calculateFactorial(5), 120);
    }

    @Test
    public void testCalculateFactorial_zero() {
        assertEquals(Factorial.calculateFactorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorial_negativeNumber() {
        Factorial.calculateFactorial(-1);
    }

    @Test
    public void testCalculateFactorial_largeNumber() {
        assertEquals(Factorial.calculateFactorial(12), 479001600);
    }
}