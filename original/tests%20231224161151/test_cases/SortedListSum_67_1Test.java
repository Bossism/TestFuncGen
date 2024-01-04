package original;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedListSum_67_1Test {

    @Test(timeout = 8000)
    public void testSortedListSum() {
        List<String> lst = new ArrayList<>(Arrays.asList("abc", "defg", "hijkl", "mnopqr", "stuvwx", "yz"));
        List<Object> expected = new ArrayList<>(Arrays.asList("abc", "yz", "defg", "hijkl"));
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortedListSum_EmptyList() {
        List<String> lst = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortedListSum_AllOddLength() {
        List<String> lst = new ArrayList<>(Arrays.asList("a", "abc", "def", "ghij"));
        List<Object> expected = new ArrayList<>(Arrays.asList("a", "abc", "def"));
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testSortedListSum_AllEvenLength() {
        List<String> lst = new ArrayList<>(Arrays.asList("ab", "cd", "ef", "gh"));
        List<Object> expected = new ArrayList<>(Arrays.asList("ab", "cd", "ef", "gh"));
        List<Object> result = SortedListSum.sortedListSum(lst);
        assertEquals(expected, result);
    }
}