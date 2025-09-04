package Lesson_7_testng;

import Lesson_7_Install.Comparator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ComparatorTest {
    @Test
    public void testCompareNumbers_aLessThanB() {
        assertEquals(Comparator.compareNumbers(10, 20), -1);
    }

    @Test
    public void testCompareNumbers_aGreaterThanB() {
        assertEquals(Comparator.compareNumbers(20, 10), 1);
    }

    @Test
    public void testCompareNumbers_aEqualsB() {
        assertEquals(Comparator.compareNumbers(10, 10), 0);
    }

    @Test
    public void testCompareNumbers_negativeNumbers() {
        assertEquals(Comparator.compareNumbers(-20, -10), -1);
    }
}