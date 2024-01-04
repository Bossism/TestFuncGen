package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderByPoints_34_1Test {

    @Test(timeout = 8000)
    public void testOrderByPoints() {
        List<Object> nums = new ArrayList<>(Arrays.asList(123, -456, 789, -101112));
        List<Object> expected = new ArrayList<>(Arrays.asList(-101112, -456, 123, 789));

        List<Object> result = OrderByPoints.orderByPoints(nums);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test(timeout = 8000)
    public void testOrderByPointsWithEmptyList() {
        List<Object> nums = new ArrayList<>();
        List<Object> expected = new ArrayList<>();

        List<Object> result = OrderByPoints.orderByPoints(nums);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test(timeout = 8000)
    public void testOrderByPointsWithSingleElement() {
        List<Object> nums = new ArrayList<>(Arrays.asList(5));
        List<Object> expected = new ArrayList<>(Arrays.asList(5));

        List<Object> result = OrderByPoints.orderByPoints(nums);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test(timeout = 8000)
    public void testOrderByPointsWithDuplicateElements() {
        List<Object> nums = new ArrayList<>(Arrays.asList(123, 456, 123, 789));
        List<Object> expected = new ArrayList<>(Arrays.asList(123, 123, 456, 789));

        List<Object> result = OrderByPoints.orderByPoints(nums);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}