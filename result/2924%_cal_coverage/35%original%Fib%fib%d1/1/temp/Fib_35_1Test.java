package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fib_35_1Test {

    @Test(timeout = 8000)
    public void testFib() {
        // Test case 1: n = 0
        int result1 = Fib.fib(0);
        assertEquals(0, result1);

        // Test case 2: n = 1
        int result2 = Fib.fib(1);
        assertEquals(1, result2);

        // Test case 3: n = 2
        int result3 = Fib.fib(2);
        assertEquals(1, result3);

        // Test case 4: n = 5
        int result4 = Fib.fib(5);
        assertEquals(5, result4);

        // Test case 5: n = 10
        int result5 = Fib.fib(10);
        assertEquals(55, result5);
    }
}