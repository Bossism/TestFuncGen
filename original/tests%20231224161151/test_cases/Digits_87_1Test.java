package original;

import org.junit.Test;
import static org.junit.Assert.*;

public class Digits_87_1Test {

    @Test(timeout = 8000)
    public void testDigitsWithNoOddDigits() {
        int result = Digits.digits(2468);
        assertEquals(0, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithOneOddDigit() {
        int result = Digits.digits(13579);
        assertEquals(945, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithMultipleOddDigits() {
        int result = Digits.digits(123456789);
        assertEquals(945, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithNegativeNumber() {
        int result = Digits.digits(-13579);
        assertEquals(-945, result);
    }

    @Test(timeout = 8000)
    public void testDigitsWithZero() {
        int result = Digits.digits(0);
        assertEquals(0, result);
    }
}