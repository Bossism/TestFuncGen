package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialFactorial_124_1Test {

    @Test(timeout = 8000)
    public void testFactorial() {
        // Test case 1
        int n1 = 4;
        long expected1 = 24;
        long result1 = SpecialFactorial.factorial(n1);
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 5;
        long expected2 = 120;
        long result2 = SpecialFactorial.factorial(n2);
        assertEquals(expected2, result2);

        // Test case 3
        int n3 = 7;
        long expected3 = 5040;
        long result3 = SpecialFactorial.factorial(n3);
        assertEquals(expected3, result3);

        // Test case 4
        int n4 = 1;
        long expected4 = 1;
        long result4 = SpecialFactorial.factorial(n4);
        assertEquals(expected4, result4);
    }

    @Test(timeout = 8000)
    public void testSpecialFactorial() {
        // Test case 1
        int n1 = 4;
        long expected1 = 288;
        long result1 = SpecialFactorial.specialFactorial(n1);
        assertEquals(expected1, result1);

        // Test case 2
        int n2 = 5;
        long expected2 = 34560;
        long result2 = SpecialFactorial.specialFactorial(n2);
        assertEquals(expected2, result2);

        // Test case 3
        int n3 = 7;
        long expected3 = 125411328000L;
        long result3 = SpecialFactorial.specialFactorial(n3);
        assertEquals(expected3, result3);

        // Test case 4
        int n4 = 1;
        long expected4 = 1;
        long result4 = SpecialFactorial.specialFactorial(n4);
        assertEquals(expected4, result4);
    }
}