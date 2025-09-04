package Lesson_7_junit_5;

import Lesson_7_Install.Comparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparatorTest {
    @Test
    void testCompareNumbers_aLessThanB() {
        assertEquals(-1, Comparator.compareNumbers(100, 200));
    }

    @Test
    void testCompareNumbers_aGreaterThanB() {
        assertEquals(1, Comparator.compareNumbers(200, 100));
    }

    @Test
    void testCompareNumbers_aEqualsB() {
        assertEquals(0, Comparator.compareNumbers(100, 100));
        }
}