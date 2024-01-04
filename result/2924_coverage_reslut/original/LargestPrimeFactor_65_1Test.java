package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class LargestPrimeFactor_65_1Test {

    @Test(timeout = 8000)
    public void testLargestPrimeFactor() {
        // Test case 1: n = 10
        int result1 = LargestPrimeFactor.largestPrimeFactor(10);
        assertEquals(5, result1);

        // Test case 2: n = 13195
        int result2 = LargestPrimeFactor.largestPrimeFactor(13195);
        assertEquals(29, result2);

        // Test case 3: n = 600851475143
        long result3 = LargestPrimeFactor.largestPrimeFactor(600851475143L);
        assertEquals(6857L, result3);
    }
}