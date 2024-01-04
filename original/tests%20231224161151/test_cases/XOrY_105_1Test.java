package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class XOrY_105_1Test {

    @Test(timeout = 8000)
    public void testXOrY() {
        // Test case 1: n = 1
        int result1 = XOrY.xOrY(1, 5, 10);
        assertEquals(10, result1);

        // Test case 2: n is prime
        int result2 = XOrY.xOrY(7, 5, 10);
        assertEquals(5, result2);

        // Test case 3: n is not prime
        int result3 = XOrY.xOrY(10, 5, 10);
        assertEquals(10, result3);

        // Test case 4: n is negative
        int result4 = XOrY.xOrY(-3, 5, 10);
        assertEquals(10, result4);

        // Test case 5: n is 0
        int result5 = XOrY.xOrY(0, 5, 10);
        assertEquals(10, result5);
    }
}