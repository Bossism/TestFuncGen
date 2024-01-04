package original;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class CountNums_3_1Test {

    @Test(timeout = 8000)
    public void testCountNums_emptyList() {
        List<Object> arr = Arrays.asList();
        int result = CountNums.countNums(arr);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_negativeNumber() {
        List<Object> arr = Arrays.asList(-1, 11, -11);
        int result = CountNums.countNums(arr);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_positiveNumber() {
        List<Object> arr = Arrays.asList(1, 1, 2);
        int result = CountNums.countNums(arr);
        assertEquals(3, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_mixedNumbers() {
        List<Object> arr = Arrays.asList(-1, -2, 0);
        int result = CountNums.countNums(arr);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_multipleDigits() {
        List<Object> arr = Arrays.asList(1, 1, 2, -2, 3, 4, 5);
        int result = CountNums.countNums(arr);
        assertEquals(6, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_zeroSum() {
        List<Object> arr = Arrays.asList(1, 6, 9, -6, 0, 1, 5);
        int result = CountNums.countNums(arr);
        assertEquals(5, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_negativeSum() {
        List<Object> arr = Arrays.asList(1, 100, 98, -7, 1, -1);
        int result = CountNums.countNums(arr);
        assertEquals(4, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_mixedSum() {
        List<Object> arr = Arrays.asList(12, 23, 34, -45, -56, 0);
        int result = CountNums.countNums(arr);
        assertEquals(5, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_singleElement() {
        List<Object> arr = Arrays.asList(0, 1);
        int result = CountNums.countNums(arr);
        assertEquals(1, result);
    }

    @Test(timeout = 8000)
    public void testCountNums_singleDigit() {
        List<Object> arr = Arrays.asList(1);
        int result = CountNums.countNums(arr);
        assertEquals(1, result);
    }
}