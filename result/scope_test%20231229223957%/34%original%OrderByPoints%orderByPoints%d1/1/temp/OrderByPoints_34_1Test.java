package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class OrderByPoints_34_1Test {

    @Test(timeout = 8000)
    public void testOrderByPoints() {
        List<Object> nums = Arrays.asList(1, 11, -1, -11, -12);
        List<Object> expected = Arrays.asList(-1, -11, 1, -12, 11);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testOrderByPointsEmptyList() {
        List<Object> nums = Arrays.asList();
        List<Object> expected = Arrays.asList();
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testOrderByPointsLongList() {
        List<Object> nums = Arrays.asList(1234, 423, 463, 145, 2, 423, 423, 53, 6, 37, 3457, 3, 56, 0, 46);
        List<Object> expected = Arrays.asList(0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testOrderByPointsNegativeNumbers() {
        List<Object> nums = Arrays.asList(1, -11, -32, 43, 54, -98, 2, -3);
        List<Object> expected = Arrays.asList(-3, -32, -98, -11, 1, 2, 43, 54);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testOrderByPointsDuplicateNumbers() {
        List<Object> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Object> expected = Arrays.asList(1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testOrderByPointsZeroNumber() {
        List<Object> nums = Arrays.asList(0, 6, 6, -76, -21, 23, 4);
        List<Object> expected = Arrays.asList(-76, -21, 0, 4, 23, 6, 6);
        List<Object> result = OrderByPoints.orderByPoints(nums);
        assertEquals(expected, result);
    }
}