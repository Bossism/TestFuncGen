package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Median_24_1Test {

    @Test(timeout = 8000)
    public void testMedian() {
        // Test case 1: odd number of elements
        List<Integer> list1 = Arrays.asList(3, 1, 2, 4, 5);
        Number result1 = Median.median(list1);
        assertEquals(3, result1);

        // Test case 2: even number of elements
        List<Integer> list2 = Arrays.asList(-10, 4, 6, 1000, 10, 20);
        Number result2 = Median.median(list2);
        assertEquals(8.0, result2);

        // Test case 3: single element
        List<Integer> list3 = Arrays.asList(5);
        Number result3 = Median.median(list3);
        assertEquals(5, result3);

        // Test case 4: two elements
        List<Integer> list4 = Arrays.asList(6, 5);
        Number result4 = Median.median(list4);
        assertEquals(5.5, result4);

        // Test case 5: duplicate elements
        List<Integer> list5 = Arrays.asList(8, 1, 3, 9, 9, 2, 7);
        Number result5 = Median.median(list5);
        assertEquals(7, result5);
    }
}