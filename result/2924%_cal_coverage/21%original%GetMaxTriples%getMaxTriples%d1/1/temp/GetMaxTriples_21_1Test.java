package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class GetMaxTriples_21_1Test {

    @Test(timeout = 8000)
    public void testGetMaxTriples() {
        // Test case 1: n = 3
        int result1 = GetMaxTriples.getMaxTriples(3);
        assertEquals(0, result1);

        // Test case 2: n = 5
        int result2 = GetMaxTriples.getMaxTriples(5);
        assertEquals(1, result2);

        // Test case 3: n = 10
        int result3 = GetMaxTriples.getMaxTriples(10);
        assertEquals(45, result3);
    }
}