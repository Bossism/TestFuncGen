package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsSorted_84_1Test {

    @Test(timeout = 8000)
    public void testIsSorted_EmptyList() {
        List<Object> lst = new ArrayList<>();
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSorted_SingleElementList() {
        List<Object> lst = Arrays.asList(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSorted_SortedList() {
        List<Object> lst = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSorted_UnsortedList() {
        List<Object> lst = Arrays.asList(5, 4, 3, 2, 1);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSorted_DuplicateElements() {
        List<Object> lst = Arrays.asList(1, 2, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test(timeout = 8000)
    public void testIsSorted_DuplicateElementsExceedingLimit() {
        List<Object> lst = Arrays.asList(1, 2, 2, 2, 3, 4, 5);
        assertFalse(IsSorted.isSorted(lst));
    }
}