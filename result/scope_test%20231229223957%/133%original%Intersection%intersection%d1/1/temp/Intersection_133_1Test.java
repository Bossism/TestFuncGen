package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Intersection_133_1Test {

    @Test(timeout = 8000)
    public void testIntersection() {
        // Test case 1: No intersection
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(2, 3);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        // Test case 2: No intersection
        interval1 = Arrays.asList(-1, 1);
        interval2 = Arrays.asList(0, 4);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        // Test case 3: Intersection is a prime number
        interval1 = Arrays.asList(-3, -1);
        interval2 = Arrays.asList(-5, 5);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        // Test case 4: Intersection is a prime number
        interval1 = Arrays.asList(-2, 2);
        interval2 = Arrays.asList(-4, 0);
        assertEquals("YES", Intersection.intersection(interval1, interval2));

        // Test case 5: Intersection is not a prime number
        interval1 = Arrays.asList(-11, 2);
        interval2 = Arrays.asList(-1, -1);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        // Test case 6: No intersection
        interval1 = Arrays.asList(1, 2);
        interval2 = Arrays.asList(3, 5);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        // Test case 7: No intersection
        interval1 = Arrays.asList(1, 2);
        interval2 = Arrays.asList(1, 2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));

        // Test case 8: No intersection
        interval1 = Arrays.asList(-2, -2);
        interval2 = Arrays.asList(-3, -2);
        assertEquals("NO", Intersection.intersection(interval1, interval2));
    }
}