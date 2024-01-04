package original;
import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CountUpTo_154_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(CountUpTo.isPrime(2));
        assertTrue(CountUpTo.isPrime(3));
        assertTrue(CountUpTo.isPrime(5));
        assertTrue(CountUpTo.isPrime(7));
        assertTrue(CountUpTo.isPrime(11));
        assertTrue(CountUpTo.isPrime(13));
        assertTrue(CountUpTo.isPrime(17));
        assertTrue(CountUpTo.isPrime(19));
        assertFalse(CountUpTo.isPrime(4));
        assertFalse(CountUpTo.isPrime(6));
        assertFalse(CountUpTo.isPrime(8));
        assertFalse(CountUpTo.isPrime(9));
        assertFalse(CountUpTo.isPrime(10));
        assertFalse(CountUpTo.isPrime(12));
        assertFalse(CountUpTo.isPrime(14));
        assertFalse(CountUpTo.isPrime(15));
        assertFalse(CountUpTo.isPrime(16));
        assertFalse(CountUpTo.isPrime(18));
        assertFalse(CountUpTo.isPrime(20));
    }
}