package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray1_51_1Test {

    @Test(timeout = 8000)
    public void testSortArray() {
        // Create a sample input array
        List<Object> array = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        // Call the sortArray method
        List<Object> sortedArray = SortArray1.sortArray(array);

        // Verify the sorted array
        assertEquals(Arrays.asList(1, 2, 5, 8, 9), sortedArray);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithEmptyArray() {
        // Create an empty input array
        List<Object> array = new ArrayList<>();

        // Call the sortArray method
        List<Object> sortedArray = SortArray1.sortArray(array);

        // Verify the sorted array is also empty
        assertTrue(sortedArray.isEmpty());
    }

    @Test(timeout = 8000)
    public void testSortArrayWithSingleElementArray() {
        // Create a single element input array
        List<Object> array = new ArrayList<>(Arrays.asList(5));

        // Call the sortArray method
        List<Object> sortedArray = SortArray1.sortArray(array);

        // Verify the sorted array is the same as the input array
        assertEquals(array, sortedArray);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithEvenSum() {
        // Create a sample input array with even sum
        List<Object> array = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        // Call the sortArray method
        List<Object> sortedArray = SortArray1.sortArray(array);

        // Verify the sorted array is reversed
        assertEquals(Arrays.asList(9, 8, 5, 2, 1), sortedArray);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithOddSum() {
        // Create a sample input array with odd sum
        List<Object> array = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3));

        // Call the sortArray method
        List<Object> sortedArray = SortArray1.sortArray(array);

        // Verify the sorted array is not reversed
        assertEquals(Arrays.asList(1, 2, 3, 5, 8, 9), sortedArray);
    }
}