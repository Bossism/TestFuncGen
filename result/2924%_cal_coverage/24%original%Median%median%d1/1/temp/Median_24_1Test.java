package original;
import java.util.Collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Median_24_1Test {

    @Test(timeout = 8000)
    public void testMedianOddSizeList() {
        List<Integer> list = Arrays.asList(1, 3, 2);
        Number result = Median.median(list);
        assertEquals(2, result);
    }

    @Test(timeout = 8000)
    public void testMedianEvenSizeList() {
        List<Integer> list = Arrays.asList(1, 3, 2, 4);
        Number result = Median.median(list);
        assertEquals(2.5, result);
    }

    @Test(timeout = 8000)
    public void testMedianEmptyList() {
        List<Integer> list = Arrays.asList();
        Number result = Median.median(list);
        assertNull(result);
    }

    @Test(timeout = 8000)
    public void testMedianSingleElementList() {
        List<Integer> list = Arrays.asList(5);
        Number result = Median.median(list);
        assertEquals(5, result);
    }

    @Test(timeout = 8000)
    public void testMedianDuplicateElements() {
        List<Integer> list = Arrays.asList(2, 2, 2, 2);
        Number result = Median.median(list);
        assertEquals(2.0, result);
    }
}