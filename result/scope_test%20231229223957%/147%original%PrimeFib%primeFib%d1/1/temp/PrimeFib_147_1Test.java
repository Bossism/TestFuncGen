package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFib_147_1Test {

    @Test(timeout = 8000)
    public void testPrimeFib() {
        assertEquals(2, PrimeFib.primeFib(1));
        assertEquals(3, PrimeFib.primeFib(2));
        assertEquals(5, PrimeFib.primeFib(3));
        assertEquals(13, PrimeFib.primeFib(4));
        assertEquals(89, PrimeFib.primeFib(5));
        assertEquals(233, PrimeFib.primeFib(6));
        assertEquals(1597, PrimeFib.primeFib(7));
        assertEquals(28657, PrimeFib.primeFib(8));
        assertEquals(514229, PrimeFib.primeFib(9));
        assertEquals(433494437, PrimeFib.primeFib(10));
    }

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(PrimeFib.isPrime(2));
        assertTrue(PrimeFib.isPrime(3));
        assertTrue(PrimeFib.isPrime(5));
        assertTrue(PrimeFib.isPrime(13));
        assertTrue(PrimeFib.isPrime(89));
        assertFalse(PrimeFib.isPrime(4));
        assertFalse(PrimeFib.isPrime(6));
        assertFalse(PrimeFib.isPrime(10));
        assertFalse(PrimeFib.isPrime(15));
        assertFalse(PrimeFib.isPrime(100));
    }
}