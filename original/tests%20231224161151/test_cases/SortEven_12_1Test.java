package original;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortEven_12_1Test {

    @Test(timeout = 8000)
    public void testSortEven() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 9, 4, 7, 6));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 6, 6));

        List<Integer> actualOutput = SortEven.sortEven(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testSortEvenWithEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expectedOutput = new ArrayList<>();

        List<Integer> actualOutput = SortEven.sortEven(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testSortEvenWithSingleElement() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5));

        List<Integer> actualOutput = SortEven.sortEven(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test(timeout = 8000)
    public void testSortEvenWithOddSizeList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 9, 4, 7));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 7));

        List<Integer> actualOutput = SortEven.sortEven(input);

        assertEquals(expectedOutput, actualOutput);
    }
}