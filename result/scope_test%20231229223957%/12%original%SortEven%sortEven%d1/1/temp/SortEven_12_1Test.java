package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEven_12_1Test {

    @Test(timeout = 8000)
    public void testSortEven() {
        // Test case 1: [1, 2, 3]
        List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result1 = SortEven.sortEven(input1);
        assertEquals(expected1, result1);

        // Test case 2: [5, 6, 3, 4]
        List<Integer> input2 = new ArrayList<>(Arrays.asList(5, 6, 3, 4));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(3, 6, 5, 4));
        List<Integer> result2 = SortEven.sortEven(input2);
        assertEquals(expected2, result2);

        // Test case 3: [5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]
        List<Integer> input3 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123));
        List<Integer> result3 = SortEven.sortEven(input3);
        assertEquals(expected3, result3);

        // Test case 4: [5, 8, -12, 4, 23, 2, 3, 11, 12, -10]
        List<Integer> input4 = new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10));
        List<Integer> result4 = SortEven.sortEven(input4);
        assertEquals(expected4, result4);
    }
}