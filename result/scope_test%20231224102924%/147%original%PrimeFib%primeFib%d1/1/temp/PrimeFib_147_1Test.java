package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeFib_147_1Test {

    @Test(timeout = 8000)
    public void testPrimeFib() {
        assertEquals(2, PrimeFib.primeFib(1));
        assertEquals(3, PrimeFib.primeFib(2));
        assertEquals(5, PrimeFib.primeFib(3));
        assertEquals(8, PrimeFib.primeFib(4));
        assertEquals(13, PrimeFib.primeFib(5));
        assertEquals(89, PrimeFib.primeFib(10));
        assertEquals(233, PrimeFib.primeFib(11));
    }

    @Test(timeout = 8000)
    public void testPrimeFibWithZero() {
        assertEquals(0, PrimeFib.primeFib(0));
    }

    @Test(timeout = 8000)
    public void testPrimeFibWithNegativeNumber() {
        assertEquals(0, PrimeFib.primeFib(-5));
    }
}