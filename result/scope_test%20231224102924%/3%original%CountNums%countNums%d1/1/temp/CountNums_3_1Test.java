package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CountNums_3_1Test {

    @Test(timeout = 8000)
    public void testCountNums() {
        List<Object> arr = new ArrayList<>();
        arr.add(123);
        arr.add(-456);
        arr.add(789);
        arr.add(-10);

        int result = CountNums.countNums(arr);

        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_EmptyList() {
        List<Object> arr = new ArrayList<>();

        int result = CountNums.countNums(arr);

        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_AllNegativeNumbers() {
        List<Object> arr = new ArrayList<>();
        arr.add(-123);
        arr.add(-456);
        arr.add(-789);

        int result = CountNums.countNums(arr);

        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_AllPositiveNumbers() {
        List<Object> arr = new ArrayList<>();
        arr.add(123);
        arr.add(456);
        arr.add(789);

        int result = CountNums.countNums(arr);

        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_MixedPositiveAndNegativeNumbers() {
        List<Object> arr = new ArrayList<>();
        arr.add(123);
        arr.add(-456);
        arr.add(789);
        arr.add(-10);
        arr.add(0);

        int result = CountNums.countNums(arr);

        assertEquals(5, result);
    }
}