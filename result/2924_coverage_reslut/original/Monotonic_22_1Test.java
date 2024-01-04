package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Monotonic_22_1Test {

    @Test(timeout = 8000)
    public void testMonotonic() {
        // Test case 1: List with single element
        List<Integer> list1 = Arrays.asList(5);
        assertTrue(Monotonic.monotonic(list1));

        // Test case 2: List with increasing elements
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Monotonic.monotonic(list2));

        // Test case 3: List with decreasing elements
        List<Integer> list3 = Arrays.asList(5, 4, 3, 2, 1);
        assertTrue(Monotonic.monotonic(list3));

        // Test case 4: List with non-monotonic elements
        List<Integer> list4 = Arrays.asList(1, 3, 2, 4, 5);
        assertFalse(Monotonic.monotonic(list4));

        // Test case 5: List with repeated elements
        List<Integer> list5 = Arrays.asList(1, 1, 1, 1, 1);
        assertTrue(Monotonic.monotonic(list5));
    }
}