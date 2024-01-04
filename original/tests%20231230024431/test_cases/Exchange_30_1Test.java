package original;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Exchange_30_1Test {

    @Test(timeout = 8000)
    public void testExchange() {
        // Test case 1
        List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> lst2 = Arrays.asList(1, 2, 3, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));

        // Test case 2
        lst1 = Arrays.asList(1, 2, 3, 4);
        lst2 = Arrays.asList(1, 5, 3, 4);
        assertEquals("NO", Exchange.exchange(lst1, lst2));

        // Test case 3
        lst1 = Arrays.asList(1, 2, 3, 4);
        lst2 = Arrays.asList(2, 1, 4, 3);
        assertEquals("YES", Exchange.exchange(lst1, lst2));

        // Test case 4
        lst1 = Arrays.asList(5, 7, 3);
        lst2 = Arrays.asList(2, 6, 4);
        assertEquals("YES", Exchange.exchange(lst1, lst2));

        // Test case 5
        lst1 = Arrays.asList(5, 7, 3);
        lst2 = Arrays.asList(2, 6, 3);
        assertEquals("NO", Exchange.exchange(lst1, lst2));

        // Test case 6
        lst1 = Arrays.asList(3, 2, 6, 1, 8, 9);
        lst2 = Arrays.asList(3, 5, 5, 1, 1, 1);
        assertEquals("NO", Exchange.exchange(lst1, lst2));

        // Test case 7
        lst1 = Arrays.asList(100, 200);
        lst2 = Arrays.asList(200, 200);
        assertEquals("YES", Exchange.exchange(lst1, lst2));
    }
}