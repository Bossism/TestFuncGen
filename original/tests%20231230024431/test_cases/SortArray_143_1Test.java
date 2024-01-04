package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray_143_1Test {

    @Test(timeout = 8000)
    public void testSortArray() {
        // Test case 1
        List<Object> arr1 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 4));
        List<Object> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Object> result1 = SortArray.sortArray(arr1);
        assertEquals(expected1, result1);

        // Test case 2
        List<Object> arr2 = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 4));
        List<Object> expected2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Object> result2 = SortArray.sortArray(arr2);
        assertEquals(expected2, result2);

        // Test case 3
        List<Object> arr3 = new ArrayList<>();
        List<Object> expected3 = new ArrayList<>();
        List<Object> result3 = SortArray.sortArray(arr3);
        assertEquals(expected3, result3);

        // Test case 4
        List<Object> arr4 = new ArrayList<>(Arrays.asList(2, 5, 77, 4, 5, 3, 5, 7, 2, 3, 4));
        List<Object> expected4 = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 3, 3, 5, 5, 5, 7, 77));
        List<Object> result4 = SortArray.sortArray(arr4);
        assertEquals(expected4, result4);

        // Test case 5
        List<Object> arr5 = new ArrayList<>(Arrays.asList(3, 6, 44, 12, 32, 5));
        List<Object> expected5 = new ArrayList<>(Arrays.asList(32, 3, 5, 6, 12, 44));
        List<Object> result5 = SortArray.sortArray(arr5);
        assertEquals(expected5, result5);

        // Test case 6
        List<Object> arr6 = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        List<Object> expected6 = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        List<Object> result6 = SortArray.sortArray(arr6);
        assertEquals(expected6, result6);

        // Test case 7
        List<Object> arr7 = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        List<Object> expected7 = new ArrayList<>(Arrays.asList(2, 4, 8, 16, 32));
        List<Object> result7 = SortArray.sortArray(arr7);
        assertEquals(expected7, result7);
    }
}