package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsPrime_157_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        // Test case 1: n = 0
        assertFalse(IsPrime.isPrime(0));

        // Test case 2: n = 1
        assertFalse(IsPrime.isPrime(1));

        // Test case 3: n = 2
        assertTrue(IsPrime.isPrime(2));

        // Test case 4: n = 3
        assertTrue(IsPrime.isPrime(3));

        // Test case 5: n = 4
        assertFalse(IsPrime.isPrime(4));

        // Test case 6: n = 5
        assertTrue(IsPrime.isPrime(5));

        // Test case 7: n = 6
        assertFalse(IsPrime.isPrime(6));

        // Test case 8: n = 7
        assertTrue(IsPrime.isPrime(7));

        // Test case 9: n = 8
        assertFalse(IsPrime.isPrime(8));

        // Test case 10: n = 9
        assertFalse(IsPrime.isPrime(9));

        // Test case 11: n = 10
        assertFalse(IsPrime.isPrime(10));

        // Test case 12: n = 11
        assertTrue(IsPrime.isPrime(11));
    }
}