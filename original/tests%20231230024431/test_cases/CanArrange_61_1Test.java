package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanArrange_61_1Test {

    @Test(timeout = 8000)
    public void testCanArrange() {
        // Test case 1: [1, 2, 4, 3, 5]
        List<Object> arr1 = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 5));
        int result1 = CanArrange.canArrange(arr1);
        assertEquals(3, result1);

        // Test case 2: [1, 2, 3]
        List<Object> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int result2 = CanArrange.canArrange(arr2);
        assertEquals(-1, result2);

        // Test case 3: [1, 2, 4, 5]
        List<Object> arr3 = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        int result3 = CanArrange.canArrange(arr3);
        assertEquals(-1, result3);

        // Test case 4: [1, 4, 2, 5, 6, 7, 8, 9, 10]
        List<Object> arr4 = new ArrayList<>(Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10));
        int result4 = CanArrange.canArrange(arr4);
        assertEquals(2, result4);

        // Test case 5: [4, 8, 5, 7, 3]
        List<Object> arr5 = new ArrayList<>(Arrays.asList(4, 8, 5, 7, 3));
        int result5 = CanArrange.canArrange(arr5);
        assertEquals(4, result5);

        // Test case 6: []
        List<Object> arr6 = new ArrayList<>();
        int result6 = CanArrange.canArrange(arr6);
        assertEquals(-1, result6);
    }
}