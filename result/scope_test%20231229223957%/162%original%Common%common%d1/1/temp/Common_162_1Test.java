package original;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class Common_162_1Test {

    @Test(timeout = 8000)
    public void testCommon() {
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = Arrays.asList(1, 5, 653);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithDuplicates() {
        List<Integer> l1 = Arrays.asList(5, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2);
        List<Object> expected = Arrays.asList(2, 3);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithAllElements() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Arrays.asList(3, 2, 4);
        List<Object> expected = Arrays.asList(2, 3, 4);
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }

    @Test(timeout = 8000)
    public void testCommonWithEmptyList() {
        List<Integer> l1 = Arrays.asList(4, 3, 2, 8);
        List<Object> l2 = Collections.emptyList();
        List<Object> expected = Collections.emptyList();
        List<Object> result = Common.common(l1, l2);
        assertEquals(expected, result);
    }
}