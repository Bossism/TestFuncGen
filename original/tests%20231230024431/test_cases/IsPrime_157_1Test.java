package original;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsPrime_157_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertFalse(IsPrime.isPrime(6));
        assertTrue(IsPrime.isPrime(101));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(13441));
        assertTrue(IsPrime.isPrime(61));
        assertFalse(IsPrime.isPrime(4));
        assertFalse(IsPrime.isPrime(1));
        assertTrue(IsPrime.isPrime(5));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(17));
        assertFalse(IsPrime.isPrime(85));
        assertFalse(IsPrime.isPrime(77));
        assertFalse(IsPrime.isPrime(255379));
    }
}