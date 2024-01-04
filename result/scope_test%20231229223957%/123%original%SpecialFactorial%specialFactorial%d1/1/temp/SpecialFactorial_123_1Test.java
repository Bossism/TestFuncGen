package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialFactorial_123_1Test {

    @Test(timeout = 8000)
    public void testSpecialFactorial() {
        assertEquals(288, SpecialFactorial.specialFactorial(4));
        assertEquals(34560, SpecialFactorial.specialFactorial(5));
        assertEquals(125411328000L, SpecialFactorial.specialFactorial(7));
        assertEquals(1, SpecialFactorial.specialFactorial(1));
    }

    @Test(timeout = 8000)
    public void testSpecialFactorialWithZero() {
        assertEquals(1, SpecialFactorial.specialFactorial(0));
    }

    @Test(timeout = 8000, expected = IllegalArgumentException.class)
    public void testSpecialFactorialWithNegativeNumber() {
        SpecialFactorial.specialFactorial(-1);
    }

    @Test(timeout = 8000)
    public void testSpecialFactorialWithLargeNumber() {
        assertEquals(0, SpecialFactorial.specialFactorial(20));
    }
}