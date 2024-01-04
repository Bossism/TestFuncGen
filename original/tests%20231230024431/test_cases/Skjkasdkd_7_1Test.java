package original;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Skjkasdkd_7_1Test {

    @Test(timeout = 8000)
    public void testIsPrime() {
        assertTrue(Skjkasdkd.isPrime(2));
        assertTrue(Skjkasdkd.isPrime(3));
        assertTrue(Skjkasdkd.isPrime(5));
        assertTrue(Skjkasdkd.isPrime(7));
        assertTrue(Skjkasdkd.isPrime(11));
        assertTrue(Skjkasdkd.isPrime(13));
        assertTrue(Skjkasdkd.isPrime(17));
        assertTrue(Skjkasdkd.isPrime(19));
        assertTrue(Skjkasdkd.isPrime(23));
        assertTrue(Skjkasdkd.isPrime(29));
        assertFalse(Skjkasdkd.isPrime(0));
        assertFalse(Skjkasdkd.isPrime(1));
        assertFalse(Skjkasdkd.isPrime(4));
        assertFalse(Skjkasdkd.isPrime(6));
        assertFalse(Skjkasdkd.isPrime(8));
        assertFalse(Skjkasdkd.isPrime(9));
        assertFalse(Skjkasdkd.isPrime(10));
        assertFalse(Skjkasdkd.isPrime(12));
        assertFalse(Skjkasdkd.isPrime(14));
        assertFalse(Skjkasdkd.isPrime(15));
        assertFalse(Skjkasdkd.isPrime(16));
        assertFalse(Skjkasdkd.isPrime(18));
        assertFalse(Skjkasdkd.isPrime(20));
        assertFalse(Skjkasdkd.isPrime(21));
        assertFalse(Skjkasdkd.isPrime(22));
        assertFalse(Skjkasdkd.isPrime(24));
        assertFalse(Skjkasdkd.isPrime(25));
        assertFalse(Skjkasdkd.isPrime(26));
        assertFalse(Skjkasdkd.isPrime(27));
        assertFalse(Skjkasdkd.isPrime(28));
        assertFalse(Skjkasdkd.isPrime(30));
    }

    @Test(timeout = 8000)
    public void testSkjkasdkd() {
        List<Integer> lst1 = Arrays.asList(0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3);
        assertEquals(10, Skjkasdkd.skjkasdkd(lst1));

        List<Integer> lst2 = Arrays.asList(1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1);
        assertEquals(25, Skjkasdkd.skjkasdkd(lst2));

        List<Integer> lst3 = Arrays.asList(1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3);
        assertEquals(13, Skjkasdkd.skjkasdkd(lst3));

        List<Integer> lst4 = Arrays.asList(0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6);
        assertEquals(11, Skjkasdkd.skjkasdkd(lst4));

        List<Integer> lst5 = Arrays.asList(0, 81, 12, 3, 1, 21);
        assertEquals(3, Skjkasdkd.skjkasdkd(lst5));

        List<Integer> lst6 = Arrays.asList(0, 8, 1, 2, 1, 7);
        assertEquals(7, Skjkasdkd.skjkasdkd(lst6));
    }
}