package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialFactorial_123_1Test {

    @Test(timeout = 8000)
    public void testSpecialFactorial() {
        // Test case 1: n = 0
        assertEquals(1, SpecialFactorial.specialFactorial(0));

        // Test case 2: n = 1
        assertEquals(1, SpecialFactorial.specialFactorial(1));

        // Test case 3: n = 5
        assertEquals(120, SpecialFactorial.specialFactorial(5));

        // Test case 4: n = 10
        assertEquals(3628800, SpecialFactorial.specialFactorial(10));
    }

    private static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}