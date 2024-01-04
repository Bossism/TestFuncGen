package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestChange_37_1Test {

    @Test(timeout = 8000)
    public void testSmallestChange() {
        // Test case 1: arr = [1, 2, 3, 4, 5]
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int result1 = SmallestChange.smallestChange(arr1);
        assertEquals(0, result1);

        // Test case 2: arr = [1, 2, 3, 3, 2, 1]
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 2, 1));
        int result2 = SmallestChange.smallestChange(arr2);
        assertEquals(0, result2);

        // Test case 3: arr = [1, 2, 3, 4, 5, 6]
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int result3 = SmallestChange.smallestChange(arr3);
        assertEquals(1, result3);

        // Test case 4: arr = [1, 2, 3, 4, 5, 4, 3, 2, 1]
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1));
        int result4 = SmallestChange.smallestChange(arr4);
        assertEquals(4, result4);
    }
}