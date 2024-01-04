package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsSimplePower_60_1Test {

    @Test(timeout = 8000)
    public void testIsSimplePower() {
        // Test case 1: x = 1, n = 2
        assertFalse(IsSimplePower.isSimplePower(1, 2));

        // Test case 2: x = 2, n = 1
        assertFalse(IsSimplePower.isSimplePower(2, 1));

        // Test case 3: x = 2, n = 2
        assertTrue(IsSimplePower.isSimplePower(2, 2));

        // Test case 4: x = 4, n = 2
        assertTrue(IsSimplePower.isSimplePower(4, 2));

        // Test case 5: x = 8, n = 2
        assertTrue(IsSimplePower.isSimplePower(8, 2));

        // Test case 6: x = 9, n = 2
        assertFalse(IsSimplePower.isSimplePower(9, 2));

        // Test case 7: x = 16, n = 2
        assertTrue(IsSimplePower.isSimplePower(16, 2));

        // Test case 8: x = 25, n = 2
        assertFalse(IsSimplePower.isSimplePower(25, 2));

        // Test case 9: x = 27, n = 3
        assertTrue(IsSimplePower.isSimplePower(27, 3));
    }
}