package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fib_35_1Test {

    @Test(timeout = 8000)
    public void testFib() {
        assertEquals(0, Fib.fib(0));
        assertEquals(1, Fib.fib(1));
        assertEquals(1, Fib.fib(2));
        assertEquals(2, Fib.fib(3));
        assertEquals(3, Fib.fib(4));
        assertEquals(5, Fib.fib(5));
        assertEquals(8, Fib.fib(6));
        assertEquals(13, Fib.fib(7));
        assertEquals(21, Fib.fib(8));
        assertEquals(34, Fib.fib(9));
        assertEquals(55, Fib.fib(10));
        assertEquals(89, Fib.fib(11));
        assertEquals(144, Fib.fib(12));
        assertEquals(233, Fib.fib(13));
    }
}