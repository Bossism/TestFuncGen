package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class XOrY_105_1Test {

    @Test(timeout = 8000)
    public void testXOrY() {
        // Test case 1: n is a prime number
        assertEquals(34, XOrY.xOrY(7, 34, 12));

        // Test case 2: n is not a prime number
        assertEquals(5, XOrY.xOrY(15, 8, 5));

        // Test case 3: n is 1
        assertEquals(12, XOrY.xOrY(1, 12, 34));

        // Test case 4: n is a prime number greater than 2
        assertEquals(33, XOrY.xOrY(3, 33, 5212));

        // Test case 5: n is a prime number greater than 2
        assertEquals(3, XOrY.xOrY(1259, 3, 52));

        // Test case 6: n is a prime number greater than 2
        assertEquals(-1, XOrY.xOrY(7919, -1, 12));

        // Test case 7: n is not a prime number
        assertEquals(583, XOrY.xOrY(3609, 1245, 583));

        // Test case 8: n is not a prime number
        assertEquals(129, XOrY.xOrY(91, 56, 129));

        // Test case 9: n is not a prime number
        assertEquals(1234, XOrY.xOrY(6, 34, 1234));

        // Test case 10: n is not a prime number
        assertEquals(0, XOrY.xOrY(1, 2, 0));

        // Test case 11: n is not a prime number
        assertEquals(2, XOrY.xOrY(2, 2, 2));
    }
}