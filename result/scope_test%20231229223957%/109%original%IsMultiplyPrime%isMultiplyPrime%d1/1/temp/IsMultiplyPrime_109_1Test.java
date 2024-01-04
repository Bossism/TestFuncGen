package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsMultiplyPrime_109_1Test {

    @Test(timeout = 8000)
    public void testIsMultiplyPrime() {
        // Test cases from the example
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(5));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(30));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(8));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(10));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(125));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(105));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(126));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(729));
        assertFalse(IsMultiplyPrime.isMultiplyPrime(891));
        assertTrue(IsMultiplyPrime.isMultiplyPrime(1001));
    }
}