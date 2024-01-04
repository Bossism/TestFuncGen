package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class ByLength_132_1Test {

    @Test(timeout = 8000)
    public void testByLength() {
        // Test case 1: arr = [2, 1, 1, 4, 5, 8, 2, 3]
        List<Object> arr1 = Arrays.asList(2, 1, 1, 4, 5, 8, 2, 3);
        List<Object> expected1 = Arrays.asList("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
        List<Object> result1 = ByLength.byLength(arr1);
        assertEquals(expected1, result1);

        // Test case 2: arr = []
        List<Object> arr2 = Arrays.asList();
        List<Object> expected2 = Arrays.asList();
        List<Object> result2 = ByLength.byLength(arr2);
        assertEquals(expected2, result2);

        // Test case 3: arr = [1, -1, 55]
        List<Object> arr3 = Arrays.asList(1, -1, 55);
        List<Object> expected3 = Arrays.asList("One");
        List<Object> result3 = ByLength.byLength(arr3);
        assertEquals(expected3, result3);

        // Test case 4: arr = [1, -1, 3, 2]
        List<Object> arr4 = Arrays.asList(1, -1, 3, 2);
        List<Object> expected4 = Arrays.asList("Three", "Two", "One");
        List<Object> result4 = ByLength.byLength(arr4);
        assertEquals(expected4, result4);

        // Test case 5: arr = [9, 4, 8]
        List<Object> arr5 = Arrays.asList(9, 4, 8);
        List<Object> expected5 = Arrays.asList("Nine", "Eight", "Four");
        List<Object> result5 = ByLength.byLength(arr5);
        assertEquals(expected5, result5);
    }
}