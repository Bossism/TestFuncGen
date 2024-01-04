package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Simplify_45_1Test {

    @Test(timeout = 8000)
    public void testSimplify() {
        // Test case 1: numerator is divisible by denominator
        String x1 = "10/2";
        String n1 = "5/1";
        assertTrue(Simplify.simplify(x1, n1));

        // Test case 2: numerator is not divisible by denominator
        String x2 = "7/3";
        String n2 = "4/5";
        assertFalse(Simplify.simplify(x2, n2));

        // Test case 3: numerator is zero
        String x3 = "0/1";
        String n3 = "2/3";
        assertFalse(Simplify.simplify(x3, n3));

        // Test case 4: denominator is zero
        String x4 = "1/2";
        String n4 = "0/1";
        assertFalse(Simplify.simplify(x4, n4));

        // Test case 5: both numerator and denominator are zero
        String x5 = "0/1";
        String n5 = "0/1";
        assertTrue(Simplify.simplify(x5, n5));
    }
}