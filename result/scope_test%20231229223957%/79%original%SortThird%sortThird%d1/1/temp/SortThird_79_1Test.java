package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortThird_79_1Test {

    @Test(timeout = 8000)
    public void testSortThird() {
        // Test case 1
        List<Integer> input1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result1 = SortThird.sortThird(input1);
        assertEquals(expected1, result1);

        // Test case 2
        List<Integer> input2 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        List<Integer> result2 = SortThird.sortThird(input2);
        assertEquals(expected2, result2);

        // Test case 3
        List<Integer> input3 = new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected3 = new ArrayList<>(Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10));
        List<Integer> result3 = SortThird.sortThird(input3);
        assertEquals(expected3, result3);

        // Test case 4
        List<Integer> input4 = new ArrayList<>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5));
        List<Integer> result4 = SortThird.sortThird(input4);
        assertEquals(expected4, result4);

        // Test case 5
        List<Integer> input5 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2));
        List<Integer> expected5 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5));
        List<Integer> result5 = SortThird.sortThird(input5);
        assertEquals(expected5, result5);

        // Test case 6
        List<Integer> input6 = new ArrayList<>(Arrays.asList(5, 8, 3, 4, 6, 9, 2));
        List<Integer> expected6 = new ArrayList<>(Arrays.asList(2, 8, 3, 4, 6, 9, 5));
        List<Integer> result6 = SortThird.sortThird(input6);
        assertEquals(expected6, result6);

        // Test case 7
        List<Integer> input7 = new ArrayList<>(Arrays.asList(5, 6, 9, 4, 8, 3, 2));
        List<Integer> expected7 = new ArrayList<>(Arrays.asList(2, 6, 9, 4, 8, 3, 5));
        List<Integer> result7 = SortThird.sortThird(input7);
        assertEquals(expected7, result7);

        // Test case 8
        List<Integer> input8 = new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1));
        List<Integer> expected8 = new ArrayList<>(Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1));
        List<Integer> result8 = SortThird.sortThird(input8);
        assertEquals(expected8, result8);
    }
}