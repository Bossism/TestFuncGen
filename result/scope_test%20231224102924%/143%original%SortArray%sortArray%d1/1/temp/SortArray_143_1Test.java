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
        List<Object> input = new ArrayList<>(Arrays.asList(5, 3, 9, 2, 7));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 9));
        List<Object> result = SortArray.sortArray(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = SortArray.sortArray(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithNegativeNumbers() {
        List<Object> input = new ArrayList<>(Arrays.asList(-5, -3, -9, -2, -7));
        List<Object> expected = new ArrayList<>(Arrays.asList(-9, -7, -5, -3, -2));
        List<Object> result = SortArray.sortArray(input);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortArrayWithDuplicateNumbers() {
        List<Object> input = new ArrayList<>(Arrays.asList(5, 3, 9, 2, 7, 5, 3));
        List<Object> expected = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 5, 7, 9));
        List<Object> result = SortArray.sortArray(input);
        assertEquals(expected, result);
    }
}