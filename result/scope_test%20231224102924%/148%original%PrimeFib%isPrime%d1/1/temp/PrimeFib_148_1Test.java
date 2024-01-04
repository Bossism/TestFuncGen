package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFib_148_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertFalse(PrimeFib.isPrime(0));
        assertFalse(PrimeFib.isPrime(1));
        assertTrue(PrimeFib.isPrime(2));
        assertTrue(PrimeFib.isPrime(3));
        assertFalse(PrimeFib.isPrime(4));
        assertTrue(PrimeFib.isPrime(5));
        assertFalse(PrimeFib.isPrime(6));
        assertTrue(PrimeFib.isPrime(7));
        assertFalse(PrimeFib.isPrime(8));
        assertFalse(PrimeFib.isPrime(9));
        assertFalse(PrimeFib.isPrime(10));
        assertTrue(PrimeFib.isPrime(11));
    }
}