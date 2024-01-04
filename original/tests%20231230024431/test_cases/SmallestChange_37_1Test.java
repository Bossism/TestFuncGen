package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class SmallestChange_37_1Test {

    @Test(timeout = 8000)
    public void testSmallestChange() {
        // Test case 1
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 5, 4, 7, 9, 6);
        int result1 = SmallestChange.smallestChange(arr1);
        assertEquals(4, result1);

        // Test case 2
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 4, 3, 2, 2);
        int result2 = SmallestChange.smallestChange(arr2);
        assertEquals(1, result2);

        // Test case 3
        List<Integer> arr3 = Arrays.asList(1, 2, 3, 2, 1);
        int result3 = SmallestChange.smallestChange(arr3);
        assertEquals(0, result3);

        // Additional test cases
        List<Integer> arr4 = Arrays.asList(1, 4, 2);
        int result4 = SmallestChange.smallestChange(arr4);
        assertEquals(1, result4);

        List<Integer> arr5 = Arrays.asList(1, 4, 4, 2);
        int result5 = SmallestChange.smallestChange(arr5);
        assertEquals(1, result5);

        List<Integer> arr6 = Arrays.asList(3, 1, 1, 3);
        int result6 = SmallestChange.smallestChange(arr6);
        assertEquals(0, result6);

        List<Integer> arr7 = Arrays.asList(1);
        int result7 = SmallestChange.smallestChange(arr7);
        assertEquals(0, result7);

        List<Integer> arr8 = Arrays.asList(0, 1);
        int result8 = SmallestChange.smallestChange(arr8);
        assertEquals(1, result8);
    }
}