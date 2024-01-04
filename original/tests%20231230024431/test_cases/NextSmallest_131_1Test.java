package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class NextSmallest_131_1Test {

    @Test(timeout = 8000)
    public void testNextSmallest() {
        // Test case 1: List with elements [1, 2, 3, 4, 5]
        List<Object> lst1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer result1 = NextSmallest.nextSmallest(lst1);
        assertEquals(Integer.valueOf(2), result1);

        // Test case 2: List with elements [5, 1, 4, 3, 2]
        List<Object> lst2 = Arrays.asList(5, 1, 4, 3, 2);
        Integer result2 = NextSmallest.nextSmallest(lst2);
        assertEquals(Integer.valueOf(2), result2);

        // Test case 3: Empty list
        List<Object> lst3 = Arrays.asList();
        Integer result3 = NextSmallest.nextSmallest(lst3);
        assertNull(result3);

        // Test case 4: List with elements [1, 1]
        List<Object> lst4 = Arrays.asList(1, 1);
        Integer result4 = NextSmallest.nextSmallest(lst4);
        assertNull(result4);

        // Test case 5: List with elements [1, 1, 1, 1, 0]
        List<Object> lst5 = Arrays.asList(1, 1, 1, 1, 0);
        Integer result5 = NextSmallest.nextSmallest(lst5);
        assertEquals(Integer.valueOf(1), result5);

        // Test case 6: List with elements [-35, 34, 12, -45]
        List<Object> lst6 = Arrays.asList(-35, 34, 12, -45);
        Integer result6 = NextSmallest.nextSmallest(lst6);
        assertEquals(Integer.valueOf(-35), result6);
    }
}