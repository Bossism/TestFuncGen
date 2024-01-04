package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fib4_54_1Test {

    @Test(timeout = 8000)
    public void testFib4() {
        // Test case 1: n = 0
        assertEquals(0, Fib4.fib4(0));

        // Test case 2: n = 1
        assertEquals(0, Fib4.fib4(1));

        // Test case 3: n = 2
        assertEquals(2, Fib4.fib4(2));

        // Test case 4: n = 3
        assertEquals(2, Fib4.fib4(3));

        // Test case 5: n = 4
        assertEquals(4, Fib4.fib4(4));

        // Test case 6: n = 5
        assertEquals(8, Fib4.fib4(5));

        // Test case 7: n = 6
        assertEquals(14, Fib4.fib4(6));

        // Test case 8: n = 7
        assertEquals(26, Fib4.fib4(7));

        // Test case 9: n = 8
        assertEquals(48, Fib4.fib4(8));

        // Test case 10: n = 9
        assertEquals(88, Fib4.fib4(9));
    }
}