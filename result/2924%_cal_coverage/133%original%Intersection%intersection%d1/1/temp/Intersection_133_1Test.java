package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Intersection_133_1Test {

    @Test(timeout = 8000)
    public void testIntersectionWithValidIntervals() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(5, 10);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithInvalidIntervals() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(8, 10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithSameIntervals() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(2, 7);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithNegativeIntervals() {
        List<Integer> interval1 = Arrays.asList(-5, -2);
        List<Integer> interval2 = Arrays.asList(-3, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithNoIntersection() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(8, 10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithPrimeDifference() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(4, 11);
        assertEquals("YES", Intersection.intersection(interval1, interval2));
    }

    @Test(timeout = 8000)
    public void testIntersectionWithNonPrimeDifference() {
        List<Integer> interval1 = Arrays.asList(2, 7);
        List<Integer> interval2 = Arrays.asList(4, 10);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}