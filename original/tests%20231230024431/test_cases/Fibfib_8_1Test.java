package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fibfib_8_1Test {

    @Test(timeout = 8000)
    public void testFibfib() {
        // Test cases from the problem description
        assertEquals(0, Fibfib.fibfib(0));
        assertEquals(0, Fibfib.fibfib(1));
        assertEquals(1, Fibfib.fibfib(2));
        assertEquals(4, Fibfib.fibfib(5));
        assertEquals(24, Fibfib.fibfib(8));
        assertEquals(81, Fibfib.fibfib(10));
        assertEquals(274, Fibfib.fibfib(12));
        assertEquals(927, Fibfib.fibfib(14));

        // Additional test cases
        assertEquals(0, Fibfib.fibfib(3));
        assertEquals(1, Fibfib.fibfib(4));
        assertEquals(2, Fibfib.fibfib(6));
        assertEquals(7, Fibfib.fibfib(7));
        assertEquals(1597, Fibfib.fibfib(20));
    }
}