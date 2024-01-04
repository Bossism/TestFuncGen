package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class IsSorted_84_1Test {

    @Test(timeout = 8000)
    public void testIsSortedWithEmptyList() {
        List<Object> lst = Arrays.asList();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithSingleElement() {
        List<Object> lst = Arrays.asList(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithSortedElements() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithUnsortedElements() {
        List<Object> lst = Arrays.asList(1, 3, 2, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithDuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2, 2, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithMoreThanTwoDuplicates() {
        List<Object> lst = Arrays.asList(1, 2, 2, 2, 3, 3, 4);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSortedWithNegativeElements() {
        List<Object> lst = Arrays.asList(-5, -3, -2, 0, 1);
        assertTrue(IsSorted.isSorted(lst));
    }
}