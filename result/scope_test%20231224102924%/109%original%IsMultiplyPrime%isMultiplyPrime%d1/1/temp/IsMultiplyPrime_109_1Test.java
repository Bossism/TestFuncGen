package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class IsMultiplyPrime_109_1Test {

    @Test(timeout = 8000)
    public void testIsMultiplyPrime() {
        // Test case 1: a = 12
        int a1 = 12;
        boolean expected1 = false;
        boolean result1 = IsMultiplyPrime.isMultiplyPrime(a1);
        assertEquals(expected1, result1);

        // Test case 2: a = 30
        int a2 = 30;
        boolean expected2 = true;
        boolean result2 = IsMultiplyPrime.isMultiplyPrime(a2);
        assertEquals(expected2, result2);

        // Test case 3: a = 7
        int a3 = 7;
        boolean expected3 = false; // Fix: Expected result should be false
        boolean result3 = IsMultiplyPrime.isMultiplyPrime(a3);
        assertEquals(expected3, result3);
    }
}