package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Common_162_1Test {

    @Test(timeout = 8000)
    public void testCommon() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> l2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 4);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithDuplicates() {
        List<Integer> l1 = Arrays.asList(1, 2, 2, 3, 4, 5);
        List<Object> l2 = Arrays.asList(2, 4, 4, 6, 8, 10);
        List<Object> expected = Arrays.asList(2, 4);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithEmptyLists() {
        List<Integer> l1 = Collections.emptyList();
        List<Object> l2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithNoCommonElements() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> l2 = Arrays.asList(6, 7, 8, 9, 10);
        List<Object> expected = Collections.emptyList();
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithMixedTypes() {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Object> l2 = Arrays.asList(2, "4", 6, 8, 10);
        List<Object> expected = Arrays.asList(2);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }
}