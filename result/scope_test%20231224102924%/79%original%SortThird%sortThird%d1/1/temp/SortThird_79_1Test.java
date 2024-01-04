package original;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortThird_79_1Test {

    @Test(timeout = 8000)
    public void testSortThird() {
        List<Integer> input = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 8, 7, 6, 2, 4, 1, 5, 9));
        List<Integer> result = SortThird.sortThird(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortThirdWithEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = SortThird.sortThird(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortThirdWithSingleElementList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(5));
        List<Integer> result = SortThird.sortThird(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortThirdWithDuplicateElements() {
        List<Integer> input = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5));
        List<Integer> expected = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5));
        List<Integer> result = SortThird.sortThird(input);
        assertEquals(expected, result);
    }
}